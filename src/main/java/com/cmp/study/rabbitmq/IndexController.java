package com.cmp.study.rabbitmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by breez on 2016/03/30.
 */

@RestController
@RequestMapping(value = "/index")
public class IndexController {


    @Autowired
    Sender sender;

    @RequestMapping(value = "/s")
    public String s() {
        sender.send("hello, world!");
        return null;
    }

}