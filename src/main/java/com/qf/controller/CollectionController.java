package com.qf.controller;

import com.qf.service.CatalogService;
import com.qf.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;


@RestController
@RequestMapping("collection")
public class CollectionController {
    @Autowired
    CollectionService collectionService;


}
