package com.qf.controller;

import com.qf.service.GoodsService;
import com.qf.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("history")
public class HistoryController {
    @Autowired
    HistoryService historyService;


}
