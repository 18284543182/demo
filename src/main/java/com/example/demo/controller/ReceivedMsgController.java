package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/receive")
public class ReceivedMsgController {


    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/msg",method = RequestMethod.GET)
    public String getMsg(){

        return restTemplate.getForEntity("http://EUREKA-CLIENT/book/Hello",String.class).getBody();
    }
}
