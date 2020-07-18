package com.qf.service.impl;

import com.qf.mapper.TbHistoryMapper;
import com.qf.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: springboot-01
 * @description
 * @author:
 * @create: 2020-07-15 09:54
 **/
@Service
public class HistoryServiceImpl implements HistoryService {
    @Autowired
    TbHistoryMapper historyMapper;
}
