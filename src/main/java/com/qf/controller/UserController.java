package com.qf.controller;

import com.qf.pojo.TbUser;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("api/user/")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("getAll")
   // @CheckToken//这里的注释是需要通过校验的，校验前端是否携带令牌
    public List<TbUser> getAll(){
        return userService.getAll();
    }



}
