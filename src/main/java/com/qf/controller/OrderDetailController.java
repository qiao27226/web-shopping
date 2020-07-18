package com.qf.controller;

import com.qf.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("order")
public class OrderDetailController {
    @Autowired
    OrderDetailService orderDetailService;


}
