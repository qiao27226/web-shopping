package com.qf.util;

import java.util.UUID;

/**
 * @program: springboot-01
 * @description  用于生成令牌
 * @author:
 * @create: 2020-07-15 15:12
 **/
public class TokenUtil {
    /**
     * 用于生成一个令牌，保证唯一性
     * @param uid
     * @return
     */
    public static String createToken(int uid){
        return UUID.randomUUID().toString().replaceAll("-","")+"_"+uid;
    }
}
