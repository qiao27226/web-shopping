package com.qf.service;

import com.qf.vo.LayuiR;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: springboot-01
 * @description
 * @author:
 * @create: 2020-07-15 09:51
 **/
public interface CollectionService {
    LayuiR getAllColl(HttpServletRequest request);
}
