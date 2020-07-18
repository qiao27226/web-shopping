package com.qf.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @program: springboot-01
 * @description:封装jedis中的一些常用的方法
 * @author:
 * @create: 2020-07-15 15:09
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JedisCore {

    private Jedis jedis;

    //构造方法
    public JedisCore(String host,int port,String pass){
        JedisPool pool=new JedisPool(host,port);
        jedis=pool.getResource();
        //jedis.auth(pass);
    }
    //新增
    public void set(String key,String val,int seconds){
        jedis.setex(key,seconds,val);
    }
    //删除
    public void del(String key){
        jedis.del(key);
    }
    //查询
    public String get(String key){
        return jedis.get(key);
    }

    //系统，判断key是否存在，用于登录校验，可以用于限制唯一登录
    public boolean checkKey(String key){
        return jedis.exists(key);
    }

    //查看剩余的时间：这里用它来向用户展示冻结账号还有多久可以重新登陆
    public long ttl(String key){
        return jedis.ttl(key);
    }
    //用于匹配相似键的多少，
    public int keys(String key){
        return jedis.keys(key).size();
    }
    //设置键的有效期，可以用来设置用户登录的令牌和用户信息的有效期，用来限制唯一登陆和超过登录时间自动失效
    public void expire(String key,int seconds){
        jedis.expire(key,seconds);
    }

}
