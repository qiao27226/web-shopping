package com.qf.vo;

import lombok.Data;

/**
 * 返回给前端页面信息的数据
 * @param <T>
 */
@Data
public class R<T> {
    private int code;
    private String msg;
    private T data;//这里用泛型表示返回的数据

    public R(){}

    public R(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    //成功
    public static <E> R ok(E obj){
        return new R(200,"OK",obj);
    }
    public static <E> R ok(){
        return new R(200,"OK",null);
    }


    //失败
    public static <E> R error(String msg){
        return new R(400,msg,null);
    }
}
