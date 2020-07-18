package com.qf.controller;

import com.qf.service.CollectionService;
import com.qf.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("goods")
public class GoodsController {
    @Autowired
    GoodsService goodsService;


}
