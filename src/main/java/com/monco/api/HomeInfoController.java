package com.monco.api;

import com.github.pagehelper.PageHelper;
import com.monco.entity.HomeInfo;
import com.monco.mapper.HomeInfoMapper;
import com.monco.mapper.UserMapper;
import com.monco.utils.ApiResult;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName HomeInfoController
 * @Description TODO
 * @Author monco
 * @Date 2019/3/12 21:38
 * @Version 1.0
 **/
@RestController
@RequestMapping("home-info")
@Api(description = "房屋信息接口API")
public class HomeInfoController {

    @Autowired
    HomeInfoMapper homeInfoMapper;

    @Autowired
    UserMapper userMapper;

    @PostMapping
    public ApiResult save(@RequestBody HomeInfo homeInfo) {
        homeInfoMapper.insert(homeInfo);
        return new ApiResult(null);
    }

    @PutMapping
    public ApiResult update(@RequestBody HomeInfo homeInfo) {
        homeInfoMapper.updateByPrimaryKeySelective(homeInfo);
        return new ApiResult(null);
    }

    @DeleteMapping
    public ApiResult delete(@RequestParam Long id) {
        HomeInfo homeInfo = homeInfoMapper.selectByPrimaryKey(id);
        homeInfo.setDataDelete(1);
        homeInfoMapper.updateByPrimaryKeySelective(homeInfo);
        return new ApiResult(null);
    }

    @GetMapping
    public ApiResult getOne(@RequestParam Long id) {
        HomeInfo homeInfo = homeInfoMapper.selectByPrimaryKey(id);
        return new ApiResult(homeInfo);
    }

    @GetMapping("list")
    public ApiResult list(@RequestParam(value = "currentPage", defaultValue = "1") Integer currentPage,
                          @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                          HomeInfo homeInfo) {
        PageHelper.startPage(currentPage, pageSize);
        List<HomeInfo> homeInfoList = homeInfoMapper.selectAll(homeInfo);
        return new ApiResult(homeInfoList);
    }
}
