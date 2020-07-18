package com.qf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.qf.mapper")
@EnableTransactionManagement//启用事务
public class WebShoppingApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebShoppingApplication.class, args);
    }
}
