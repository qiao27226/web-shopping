package com.qf.exception;

/**
 * @program: voter
 * @description: 自定义异常
 * @author: Feri(邢朋辉)
 * @create: 2020-07-13 17:45
 */
public class UserException extends Exception{
    public UserException(){
        super();
    }
    public UserException(String msg){
        super(msg);
    }
}
