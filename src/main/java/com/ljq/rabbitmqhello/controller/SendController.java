package com.ljq.rabbitmqhello.controller;

import com.ljq.rabbitmqhello.sender.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lujinqi
 * @date 2018/8/28
 */
@RestController
public class SendController {

    @Autowired
    private Sender sender;

    @GetMapping("/send")
    public String send(){
        sender.send();
        return "send success";
    }

    @GetMapping("/send2")
    public String send2(){
        sender.send2();
        return "send success";
    }

    @GetMapping("/send3")
    public String send3(){
        sender.send3();
        return "send success";
    }

}
