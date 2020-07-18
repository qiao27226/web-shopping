package com.qf.controller;

import com.qf.service.HistoryService;
import com.qf.service.ImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("img")
public class ImgController {
    @Autowired
    ImgService imgService;


}
