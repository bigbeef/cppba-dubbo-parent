package com.cppba.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.cppba.service.TestService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @Reference
    private TestService testService;

    @RequestMapping("/test.htm")
    public void test() {
        String jack = testService.sayHello("Jack");
        System.out.println(jack);
    }
}
