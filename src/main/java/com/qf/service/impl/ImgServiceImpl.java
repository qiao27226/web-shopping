package com.qf.service.impl;

import com.qf.mapper.TbImgMapper;
import com.qf.service.ImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: springboot-01
 * @description
 * @author:
 * @create: 2020-07-15 09:56
 **/
@Service
public class ImgServiceImpl implements ImgService {
    @Autowired
    TbImgMapper imgMapper;
}
