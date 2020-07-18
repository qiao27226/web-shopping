package com.qf.config;

import com.qf.util.JedisCore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springboot-01
 * @description:
 * @author:
 * @create: 2020-07-15 15:08
 **/
@Configuration
public class JedisConfig {
    @Value("${shopping.redis.host}")
    private String host;
    @Value("${shopping.redis.port}")
    private int port;
    @Value("${shopping.redis.pass}")
    private String pass;

    @Bean
    public JedisCore createJC(){
        return new JedisCore(host,port,pass);
    }
}
