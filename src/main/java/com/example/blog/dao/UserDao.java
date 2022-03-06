package com.example.blog.dao;

import com.example.blog.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author 蔡梓阳
 * @Date 2022/3/4 20:24
 */
@Mapper
@Repository
public interface UserDao {
    /**
     * 查询用户登录
     * @param username 账号
     * @param password 密码
     * @return user
     */
    User queryByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    /**
     * 通过id查询用户信息
     * @param id 用户id
     * @return user
     */
    User getUserInfoById(@Param("id") Integer id);

    /**
     * 得到所有用户
     * @return 标签列表
     */
    List<User> getAllUser();

    /**
     * 修改用户信息
     * @param user 用户
     * @return boolean
     */
    int updateUser(User user);

    /**
     * 删除用户
     * @param id 用户id
     * @return 状态值
     */
    int deleteUser(Integer id);

    /**
     * 保存用户
     * @param user 用户
     * @return 状态值
     */
    int saveUser(User user);

    /**
     * 得到数量
     * @return 数量
     */
    int getCount();

    /**
     * 查询用户名数量
     * @param name 用户名
     * @return 数量
     */
    int getUserInfoByUsername(@Param("username") String name);
}
