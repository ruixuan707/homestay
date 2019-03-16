package com.monco.mapper;

import com.monco.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    /**
     * @mbg.generated 2019-03-09
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated 2019-03-09
     */
    int insert(User record);

    /**
     * @mbg.generated 2019-03-09
     */
    int insertSelective(User record);

    /**
     * @mbg.generated 2019-03-09
     */
    User selectByPrimaryKey(Long id);

    /**
     * @mbg.generated 2019-03-09
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * @mbg.generated 2019-03-09
     */
    int updateByPrimaryKey(User record);

    /**
     * 分页查找用户
     *
     * @param user
     * @return
     */
    List<User> selectAll(User user);

    /**
     * 用户登录
     *
     * @param username
     * @param password
     * @return
     */
    User login(@Param("username") String username, @Param("password") String password);
}