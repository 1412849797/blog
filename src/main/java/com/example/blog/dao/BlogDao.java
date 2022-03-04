package com.example.blog.dao;

import com.example.blog.entity.Blog;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

/**
 * @Author 蔡梓阳
 * @Date 2022/3/4 19:20
 */
@Mapper
@Repository
public interface BlogDao {
    /**
     * 后台展示博客
     *
     * @param id 博客id
     * @return 博文
     */
    @Select("       select b.id, b.published, b.flag, b.title, b.content, b.type_id," +
            "         b.tag_ids, b.first_picture, b.description, b.recommend," +
            "         b.share_statement, b.appreciation, b.commentable" +
            "        from t_blog b  where  b.id = #{id} ")
    @Results(id = "blogDao",
            value = {@Result(property = "id", column = "id"),
                    @Result(property = "title", column = "title"),
                    @Result(property = "content", column = "content"),
                    @Result(property = "flag", column = "flag"),
                    @Result(property = "views", column = "views"),
                    @Result(property = "updateTime", column = "update_time"),
                    @Result(property = "typeId", column = "type_id"),
                    @Result(property = "firstPicture", column = "first_picture"),
                    @Result(property = "shareStatement", column = "share_statement"),
                    @Result(property = "published", column = "published"),
                    @Result(property = "appreciation", column = "appreciation"),
                    @Result(property = "commentable", column = "commentable"),
                    @Result(property = "description", column = "description"),
                    @Result(property = "recommend", column = "recommend"),
                    @Result(property = "createTime", column = "create_time"),
                    @Result(property = "typeId", column = "type_id"),
                    @Result(property = "userId", column = "user_id"),
                    @Result(property = "tagIds", column = "tag_ids"),
                    @Result(property = "type",column = "type_id", one = @One(select = "com.example.blog.dao.TagDao.getTag",fetchType = FetchType.EAGER))
//还没改完

            })
    Blog getBlog(@Param("id") Long id);
}
