package com.qf.service.impl;

import com.qf.mapper.TbOrderDetailMapper;
import com.qf.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: springboot-01
 * @description
 * @author:
 * @create: 2020-07-15 10:02
 **/
@Service
public class OrderDetailServiceImpl implements OrderDetailService {
    @Autowired
    TbOrderDetailMapper orderDetailMapper;
}
