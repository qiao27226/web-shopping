package com.qf.service.impl;

import com.qf.mapper.TbUserMapper;
import com.qf.pojo.SysUser;
import com.qf.pojo.TbUser;
import com.qf.pojo.TbUserExample;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    TbUserMapper userMapper;

    @Override
    public List<TbUser> getAll() {
        return userMapper.selectByExample(null);
    }
}
