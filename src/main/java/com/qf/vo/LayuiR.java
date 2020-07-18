package com.qf.vo;

import lombok.Data;

/**
 * 返回给前端页面信息的数据
 * @param <T>
 */
@Data
public class LayuiR<T> {
    private Integer code;
    private Integer count;
    private String msg;
    private Object data;

    //封装方法
    public LayuiR(){}
    public LayuiR(Integer code, String msg, Object obj){
        this.code=code;
        this.msg=msg;
        this.data=obj;
    }
    public LayuiR(Integer code, String msg, Object obj,int count){
        this.code=code;
        this.msg=msg;
        this.data=obj;
        this.count=count;
    }
    //成功

    public static <E> LayuiR ok(Object obj,int count){
        return new LayuiR(0,"OK",obj,count);
    }
    public static <E> LayuiR ok(){
        return new LayuiR(0,"OK",null);
    }
    //失败
    public static <E> LayuiR error(String msg){
        return new LayuiR(1,msg,null);
    }
}