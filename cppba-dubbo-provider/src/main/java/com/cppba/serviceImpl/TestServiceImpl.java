package com.cppba.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cppba.service.TestService;

@Service
public class TestServiceImpl implements TestService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
