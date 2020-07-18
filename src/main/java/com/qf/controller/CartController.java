package com.qf.controller;

import com.qf.service.CartService;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("cart")
public class CartController {
    @Autowired
    CartService cartService;


}
