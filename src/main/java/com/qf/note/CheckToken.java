package com.qf.note;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @program: springboot-01
 * @description:用于校验令牌的注解
 * @author:
 * @create: 2020-07-16 22:16
 **/
@Target(value = ElementType.METHOD)//为属性添加的注解
@Retention(value = RetentionPolicy.RUNTIME)//配置运行时
public @interface CheckToken {
}
