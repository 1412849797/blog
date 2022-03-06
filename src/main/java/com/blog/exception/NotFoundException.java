package com.blog.exception;

/**
 * @Author 蔡梓阳
 * @Date 2022/3/4 19:18
 * 自定义NotFoundException异常,会跳转到404页面
 */

import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
@NoArgsConstructor
public class NotFoundException extends RuntimeException{
    public NotFoundException(String message){super(message);}
    public NotFoundException(String message,Throwable cause){
        super(message,cause);
    }
}
