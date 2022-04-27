package com.blog.controller.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author 蔡梓阳
 * @Date 2022/4/24 22:08
 * @ControllerAdvice 负责全局故障转移的
 *  * 非状态码跳转到自定义的error页面
 *  * 状态码自动处理到相对应的状态码页面
 *  * 拦截所有controller抛出的异常，对异常进行统一的处理
 *
 */
@ControllerAdvice
public class ControllerExceptionHandler {
    private final Logger logger =  LoggerFactory.getLogger(this.getClass());


    @ExceptionHandler(Exception.class)
    public ModelAndView exceptionHandler(HttpServletRequest request, Exception e) throws Exception {
        logger.error("Request url: {}, Exception: {} ", request.getRequestURI(), e);
        //不处理带有ResponseStatus注解的异常
        if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null) {
            throw e;
        }
        //返回异常信息到自定义error页面
        ModelAndView mv = new ModelAndView();
        mv.addObject("url", request.getRequestURI());
        mv.addObject("exception",e);
        mv.setViewName("error/error");
        return mv;




    }

}
