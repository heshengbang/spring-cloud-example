package com.hsb.spring.boot.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * created by heshengbang
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2018/8/13 14:30
 */

@Component
@RabbitListener(queues = "topic.messageAll")
public class TopicMessageAllReceiver {

    @RabbitHandler
    public void process(String msg) {
        System.out.println("topicMessageAllReceiver  : " +msg);
    }
}