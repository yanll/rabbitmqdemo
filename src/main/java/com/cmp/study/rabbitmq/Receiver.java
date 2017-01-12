package com.cmp.study.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by YANLL on 2017/01/12.
 */
@Component
@RabbitListener(queues = Const.QUEUE_NAME)
public class Receiver {
    @RabbitHandler
    public void process(String msg) {
        System.out.println("开始接收消息：" + msg);
    }
}
