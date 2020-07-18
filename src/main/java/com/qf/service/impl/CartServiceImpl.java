package com.qf.service.impl;

import com.qf.mapper.TbCartMapper;
import com.qf.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    TbCartMapper cartMapper;
}
