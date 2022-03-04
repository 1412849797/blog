package com.example.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author 蔡梓阳
 * @Date 2022/3/4 19:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message implements Serializable {
    private Long id;
    private String nickname;
    private String email;
    private String content;
    private String avatar;
    private Date createTime;
    private Long parentMessageId;
    private boolean adminMessage;

    /**
     * 回复评论
     */
    private List<Message> replyMessages = new ArrayList<>();
    private Message parentMessage;
    private String parentNickname;
}
