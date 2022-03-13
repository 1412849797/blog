package com.blog.aspect;

import com.blog.entity.RequestLog;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author 蔡梓阳
 * @Date 2022/3/13 20:55
 * aop切面类
 * Spring5 单个切面类的执行顺序---> @Before-->目标方法-->@AfterReturning-->@After
 */
@Aspect
@Component
public class LogAspect {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 定义切入点
     * 任意返回值, 匹配该包及其任意子包下面的任意类的任意方法
     */
    @Pointcut("execution(* com.blog.controller..*.*(..))")
    public void log(){}

    /**
     * 前置增强
     * @param joinPoint
     * JoinPoint 表示连接点    通过上面的@Pointcut绑定执行方法,绑定的方法执行,JoinPoint就代表是该方法的连接点
     * 可以通过JoinPoint拿到类名方法名和方法参数等..
     */
    @Before("log()")
    public void doBefore(JoinPoint joinPoint){
        //Spring 提供的一个用来暴露 Request 对象的工具，利用 RequestContextHolder，可以在一个请求线程中获取到 Request，避免了 Request 从头传到尾的情况
        ServletRequestAttributes attributes=(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        //断言  关键字,判断结果是否和预期一样，true就是一样   |  assert true 直接过    |assert false 抛出异常
        assert attributes!=null;
        // 从threadLocal中获取当前的Request对象
        HttpServletRequest request = attributes.getRequest();
        String url = request.getRequestURL().toString();
        String ip = request.getRemoteAddr();

        //获得类名.方法名
        String classMethod = joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName();
        //获得方法参数
        Object[] args = joinPoint.getArgs();
        //构造请求
        RequestLog requestLog = new RequestLog(url, ip, classMethod, args);
        //打印请求信息
        logger.info("Request:{}",requestLog);


    }

    /**
     * 最后执行
     * 后置增强
     */
    @After("log()")
    public void doAfter(){
        logger.info("------------------------doAfter-----------------------");
    }

    /**
     * 切入点方法正常执行后就执行,在@After之前执行
     * 目标方法正常完成后被织入
     * AfterReturning增强处理可以访问到方法的返回值，但它不可以改变目标方法的返回值
     * @param result
     */
    @AfterReturning(returning = "result",pointcut = "log()")
    public void doAfterReturn(Object result){
        //打印返回值
        logger.info("Result:{}",result);

    }

}
