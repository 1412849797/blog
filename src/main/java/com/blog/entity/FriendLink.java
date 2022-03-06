package com.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author 蔡梓阳
 * @Date 2022/3/4 19:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FriendLink implements Serializable {
    private Integer id;
    private String blogName;
    private String blogAddress;
    private String pictureAddress;
    private Date createTime;
}
