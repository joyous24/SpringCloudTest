package com.zxq.controller;

import com.zxq.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/ribbon-consumer")
    public String helloConsumer() {
        return helloService.hello();
    }

    @RequestMapping("/ribbon-save")
    public String saveUser() {
        return helloService.saveUser();
    }
}
