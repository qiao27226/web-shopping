package com.qf.service.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.qf.config.RedisKeyConfig;
import com.qf.constant.SystemConstant;
import com.qf.mapper.TbCollectionMapper;
import com.qf.pojo.TbCollection;
import com.qf.pojo.TbCollectionExample;
import com.qf.pojo.TbUser;
import com.qf.service.CollectionService;
import com.qf.util.JedisCore;
import com.qf.vo.LayuiR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

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
    @Autowired
    JedisCore jedisCore;

    //qxm: 获取当前用户所有的收藏商品信息
    @Override
    public LayuiR getAllColl(HttpServletRequest request) {
        String token = request.getHeader(SystemConstant.TOKEN_HEADER);
        TbUser user = (TbUser) JSON.parseObject(jedisCore.get(RedisKeyConfig.TOKEN_USER+token),TbUser.class);
        TbCollectionExample example = new TbCollectionExample();
        example.createCriteria().andUserIdEqualTo(user.getUid());
        PageInfo <TbCollection> pageInfo = new PageInfo<TbCollection>(collectionMapper.selectByExample(example));

        return LayuiR.ok(pageInfo.getList(),pageInfo.getPages());



    }
}
