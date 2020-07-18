package com.qf.service.impl;

import com.qf.mapper.TbCatalogMapper;
import com.qf.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: springboot-01
 * @description
 * @author:
 * @create: 2020-07-15 09:50
 **/
@Service
public class CatalogServiceImpl implements CatalogService {
    @Autowired
    TbCatalogMapper catalogMapper;
}
