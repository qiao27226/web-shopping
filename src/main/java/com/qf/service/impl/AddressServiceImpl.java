package com.qf.service.impl;

import com.qf.mapper.TbAddressMapper;
import com.qf.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    TbAddressMapper addressMapper;

}
