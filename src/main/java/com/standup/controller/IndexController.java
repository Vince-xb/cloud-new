package com.standup.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 入口controller
 * @author macbookpro
 */
@Controller
@RequestMapping("/")
@Slf4j
public class IndexController {

    @GetMapping("index")
    @ResponseBody
    public String index(HttpServletRequest request){
        //http://localhost:8081/index
        log.info("request:" + request.getRequestURL());
        return "index page";
    }

    @GetMapping
    @ResponseBody
    public String hello(){
        return "hello world";
    }



}