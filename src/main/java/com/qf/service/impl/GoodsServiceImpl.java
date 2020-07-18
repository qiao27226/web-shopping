package com.qf.service.impl;

import com.qf.mapper.TbGoodsMapper;
import com.qf.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: springboot-01
 * @description
 * @author:
 * @create: 2020-07-15 09:53
 **/
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    TbGoodsMapper goodsMapper;
}
