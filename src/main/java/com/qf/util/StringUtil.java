package com.qf.util;

/**
 * @program: springboot-01
 * @description:用于校验字符串是否为空
 * @author:
 * @create: 2020-07-15 21:29
 **/
public class StringUtil {
    public static boolean isEmpty(String str) {
        boolean flag = false;
        if ( str == null || str.length() <=0 ){
            flag = true;
        }
        return flag;
    }

    public static boolean isEmptys(String ... arg) {
        boolean flag = false;

        for (String s:arg
             ) {
            if (isEmpty(s)){
                return true;
            }
        }
        return flag;
    }

}
