package com.cmp.study.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by YANLL on 2017/01/12.
 */
@Component
public class Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    @Autowired
    private Queue poQuee;

    public void send(String msg) {
        System.out.println(poQuee);
        rabbitTemplate.convertAndSend(Const.QUEUE_NAME, msg);
    }
}