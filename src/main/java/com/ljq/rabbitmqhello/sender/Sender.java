package com.ljq.rabbitmqhello.sender;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author: lujinqi
 * @date: 2018/8/19 13:50
 */
@Component
@Slf4j
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String context = "topic 1 " + new Date();
        log.info("Send {}",context);
        this.amqpTemplate.convertAndSend("exchange", "topic.message",context);
    }

    public void send2(){
        String context = "topic 2 " + new Date();
        log.info("Send {}",context);
        this.amqpTemplate.convertAndSend("exchange", "topic.messages",context);
    }

    public void send3(){
        String context = "fanout  " + new Date();
        log.info("Send {}",context);
        this.amqpTemplate.convertAndSend("fanoutExchange", "xxxxxx",context);
    }
}
