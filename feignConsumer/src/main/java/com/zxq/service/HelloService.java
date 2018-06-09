package com.zxq.service;

import com.codingapi.tx.annotation.TxTransaction;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("HELLO-SERVICE")
public interface HelloService {

    @RequestMapping("/hello")
    String hello();

    @RequestMapping("/save")
    @TxTransaction(isStart = true)
    @Transactional
    String saveUser();
}
