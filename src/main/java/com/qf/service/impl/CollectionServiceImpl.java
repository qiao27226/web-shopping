package com.qf.service.impl;

import com.qf.mapper.TbCollectionMapper;
import com.qf.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: springboot-01
 * @description
 * @author:
 * @create: 2020-07-15 09:51
 **/
@Service
public class CollectionServiceImpl implements CollectionService {
    @Autowired
    TbCollectionMapper collectionMapper;
}
