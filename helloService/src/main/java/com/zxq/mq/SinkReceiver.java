package com.zxq.mq;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;


@EnableBinding(Sink.class)
public class SinkReceiver {

    private final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(getClass());

    @StreamListener(Sink.INPUT)
    public void receive(Object payload) {
        logger.info("MQ接受消息：" + String.valueOf(payload));
    }

}
