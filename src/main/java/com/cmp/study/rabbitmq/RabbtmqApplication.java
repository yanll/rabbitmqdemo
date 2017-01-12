package com.cmp.study.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by YANLL on 2017/01/12.
 */
@SpringBootApplication
@ComponentScan("com.cmp.study.rabbitmq")
public class RabbtmqApplication extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer {
    public static void main(String[] args) {
        SpringApplication.run(RabbtmqApplication.class, args);
        System.out.println("RabbtmqApplication started.");
    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(8082);
    }


}
