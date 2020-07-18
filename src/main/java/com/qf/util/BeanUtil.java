package com.qf.util;

import com.qf.note.BeanCopyFiled;

import java.lang.reflect.Field;

/**
 * @program: springboot-01
 * @description
 * @author:
 * @create: 2020-07-16 21:59
 **/
public class BeanUtil {

    public static <T> T copyDto( Class<T> clazz,Object dto ){
        try {
            //获得实例
            //T object = clazz.getDeclaredConstructor().newInstance();
            // jdk1.9已经不在用newInstance这个方法了
            T object = clazz.newInstance();
            //获得obj的所有属性
            Field [] fs = dto.getClass().getDeclaredFields();
            //遍历所有的属性
            for (Field f:fs
                 ) {
                String fn = f.getName();
                //获取注解
                BeanCopyFiled bcf=f.getAnnotation(BeanCopyFiled.class);
                if (bcf!=null){
                    fn = bcf.value();
                }
                //判断pojo中是否包含此字段
                Field field = object.getClass().getDeclaredField(fn);
                if (field!=null){
                    //设置访问权限，因为他们都是私有的方法
                    field.setAccessible(true);
                    f.setAccessible(true);
                    //设置dto的值到object
                    field.set(object,f.get(dto));
                }
            }
            return object;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
