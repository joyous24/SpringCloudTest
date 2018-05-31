package com.zxq.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zxq.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.ExecutionException;


@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HelloService helloService;

    @RequestMapping("/ribbon-consumer")
    @HystrixCommand(fallbackMethod = "helloFallback")
    public String helloConsumer() {
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
    }

    /**
     * 定义服务降级
     * @return
     */
    public String helloFallback() {
        return "error";
    }

    /**
     * 异步调用写法
     *
     * @return
     */
    @RequestMapping("/ribbon-consumerAsynmc")
    public String helloCounsumerAsynmc() throws ExecutionException, InterruptedException {
        return helloService.helloCounsumerAsynmc().get();
    }
}
