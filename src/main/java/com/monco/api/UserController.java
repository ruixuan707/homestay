package com.monco.api;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.monco.entity.User;
import com.monco.mapper.UserMapper;
import com.monco.utils.ApiResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @ClassName UserController
 * @Description 用户 UserController
 * @Author monco
 * @Date 2019/3/9 1:07
 * @Version 1.0
 **/
@Api(description = "用户接口")
@RestController
@RequestMapping("user")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserMapper userMapper;

    @ApiOperation(value = "新增用户", notes = "新增注册")
    @PostMapping
    public ApiResult save(@RequestBody User user) {
        user.setDataStatus(1);
        user.setDataDelete(0);
        user.setCreateId(1L);
        user.setCreateDate(new Date());
        user.setCreateName("monco");
        user.setUpdateId(1L);
        user.setUpdateDate(new Date());
        user.setUpdateName("monco");
        userMapper.insert(user);
        return new ApiResult(null);
    }

    @ApiOperation(value = "查询用户", notes = "查询用户")
    @GetMapping
    public ApiResult getOne(@RequestParam Long id) {
        User user = userMapper.selectByPrimaryKey(id);
        return new ApiResult(user);
    }

    @ApiOperation(value = "修改用户", notes = "修改用户")
    @PutMapping
    public ApiResult update(@RequestBody User user) {
        user.setUpdateId(1L);
        user.setUpdateDate(new Date());
        user.setUpdateName("monco");
        userMapper.updateByPrimaryKeySelective(user);
        return new ApiResult(null);
    }

    @ApiOperation(value = "删除用户", notes = "删除用户")
    @DeleteMapping
    public ApiResult delete(@RequestParam Long id) {
        User user = userMapper.selectByPrimaryKey(id);
        user.setDataDelete(1);
        userMapper.updateByPrimaryKeySelective(user);
        return new ApiResult(null);
    }

    @ApiOperation(value = "分页查询用户", notes = "查询用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user", value = "用户信息", required = false, paramType = "query", dataType = "Object"),
            @ApiImplicitParam(name = "currentPage", value = "当前页", required = false, paramType = "query", dataType = "Integer"),
            @ApiImplicitParam(name = "pageSize", value = "当前页数量", required = false, paramType = "query", dataType = "Integer")
    })
    @GetMapping("list")
    public ApiResult list(@RequestParam(value = "currentPage", defaultValue = "1") Integer currentPage,
                          @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                          User user) {
        PageHelper.startPage(currentPage, pageSize);
        PageInfo<User> pageInfo = new PageInfo<>(userMapper.selectAll(user));
        return new ApiResult(pageInfo);
    }
}
