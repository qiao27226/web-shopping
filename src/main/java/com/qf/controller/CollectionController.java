package com.qf.controller;

import com.qf.service.CollectionService;
import com.qf.vo.LayuiR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 收藏商品
 */

@RestController
@RequestMapping("api/collection/")
public class CollectionController {
    @Autowired
    CollectionService collectionService;

    @GetMapping("getAllColl")
    LayuiR getAllColl(HttpServletRequest request){
        return collectionService.getAllColl(request);
    }

}
