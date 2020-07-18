package com.qf.util;

import java.util.Random;


public class FileUtil {
    public static String rename(String fn){
        if(!StringUtil.isEmpty(fn)){
            if(fn.length()>30){
                fn=fn.substring(fn.length()-30);
            }
            fn=System.currentTimeMillis()+"_"+new Random().nextInt(1000)+"_"+fn;
            return fn;
        }else {
            return null;
        }
    }
}
