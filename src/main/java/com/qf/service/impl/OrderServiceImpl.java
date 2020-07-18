package com.qf.service.impl;

import com.qf.mapper.TbOrderMapper;
import com.qf.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: springboot-01
 * @description
 * @author:
 * @create: 2020-07-15 10:00
 **/
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    TbOrderMapper orderMapper;
}
