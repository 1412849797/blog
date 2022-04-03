package com.blog.util;

import lombok.Data;

/**
 * @Author 蔡梓阳
 * @Date 2022/4/3 20:51
 * 公共逻辑返回类
 */
@Data
public class CommonResult<T> {
    private Integer code;
    private String msg;
    private T data;

    public CommonResult(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> CommonResult<T> success(T t) {
        return new CommonResult<>(200, "操作成功", t);
    }

    public static <T> CommonResult<T> error(T t) {
        return new CommonResult<>(500, "操作失败", t);
    }



}
