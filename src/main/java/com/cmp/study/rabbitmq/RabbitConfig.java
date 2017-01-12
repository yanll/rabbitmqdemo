package com.cmp.study.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by YANLL on 2017/01/12.
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue poQueue() {
        return new Queue("a_po");
    }
}
