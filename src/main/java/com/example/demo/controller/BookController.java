package com.example.demo.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.model.Book;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private Book book;

    @Autowired
    private DiscoveryClient client;

    @RequestMapping("/find")
    public  JSONObject  find(){
        ServiceInstance instance =client.getLocalServiceInstance();
        JSONObject json  = new JSONObject();
        log.info("书名:"+book.getName()+"--"+"作者："+book.getAuthor());
        json.put("书名",book.getName());
        json.put("作者",book.getAuthor());
        return json;
    }
    @RequestMapping("/Hello")
    public String Hello(){
        return "Hello";
    }
}
