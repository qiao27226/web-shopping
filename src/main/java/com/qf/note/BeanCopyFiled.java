package com.qf.note;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @program: springboot-01
 * @description：用于将dto和pojo的属性相对应
 * @author:
 * @create: 2020-07-16 22:16
 **/
@Target(value = ElementType.FIELD)//为属性添加的注解
@Retention(value = RetentionPolicy.RUNTIME)//配置运行时
public @interface BeanCopyFiled {
    String value();
}
