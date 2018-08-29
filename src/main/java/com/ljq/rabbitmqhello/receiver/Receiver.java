package com.ljq.rabbitmqhello.receiver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author: lujinqi
 * @date: 2018/8/19 13:53
 */
@Component
@Slf4j
@RabbitListener(queues = "topic.message")
public class Receiver {

    @RabbitHandler
    public void process(String hello){
      log.info("Receiver topic {}",hello);
    }
}
