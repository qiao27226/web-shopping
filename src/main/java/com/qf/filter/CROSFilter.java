package com.qf.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: springboot-01
 * @description：设置跨域
 * @author:
 * @create: 2020-07-16 15:07
 **/
@Component
//@WebFilter("/*")
public class CROSFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        response.setHeader("Access-Control-Allow-Origin","*");//允许跨域
        response.setHeader("Access-Control-Allow-Credentials","true"); //允许跨域
        response.setHeader("Access-Control-Allow-Methods","GET,POST,PUT,DELETE,OPTIONS");//支持跨域的请求方式
        response.setHeader("Access-Control-Allow-Headers","content-type,votertoken");// 允许跨域的请求消息头
        response.setHeader("Access-Control-Max-Age","3600");
        chain.doFilter(request,response);
    }
}
