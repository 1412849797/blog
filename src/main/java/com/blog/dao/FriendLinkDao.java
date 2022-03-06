package com.blog.dao;

import com.blog.entity.FriendLink;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author 蔡梓阳
 * @Date 2022/3/4 20:26
 */
@Mapper
@Repository
public interface FriendLinkDao {
    /**
     * 列出友情链接
     * @return 友链列表
     */
    @Select("select * from t_friend order by t_friend.create_time desc")
    List<FriendLink> listFriendLink();

    /**
     * 保存友情链接
     * @param friendLink 友链
     * @return 状态值
     */
    @Insert("  insert into t_friend (blog_name,blog_address,picture_address,create_time)" +
            "        values (#{blogName},#{blogAddress},#{pictureAddress},#{createTime})")
    int saveFriendLink(FriendLink friendLink);

    /**
     * 得到数量
     * @return 数量
     */
    @Select("select count(id) from t_friend")
    int getCount();

    /**
     * 获取友情链接
     * @param id 友链id
     * @return 友链
     */
    @Select(" select * from t_friend f where f.id = #{id}")

    FriendLink getFriendLink(Integer id);

    /**
     * 通过地址得到友情链接
     * @param blogAddress 友链地址
     * @return 友链
     */
    @Select("select * from t_friend f where f.blog_address = #{blogAddress}")
    FriendLink getFriendLinkByBlogAddress(@Param("blogAddress") String blogAddress);

    /**
     * 更新友情链接
     * @param friendLink 友链
     * @return 状态值
     */
    @Update("update t_friend set blog_name = #{blogName}, blog_address = #{blogAddress}, picture_address = #{pictureAddress} where id = #{id};")
    int updateFriendLink(FriendLink friendLink);

    /**
     * 删除友情链接
     * @param id 友链id
     */
    @Delete("delete from t_friend where id = #{id}")
    void deleteFriendLink(Integer id);
}
