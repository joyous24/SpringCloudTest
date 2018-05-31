package com.zxq.mq;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.command.AsyncResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.Future;

@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 异步调用
     *
     * @return
     */
    @HystrixCommand
    public Future<String> helloCounsumerAsynmc() {
        return new AsyncResult<String>() {
            @Override
            public String invoke() {
                return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
            }
        };
    }
}
