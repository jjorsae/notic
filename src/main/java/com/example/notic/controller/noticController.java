package com.example.notic.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/notic/*")
@RestController
public class noticController {

    @GetMapping("/test")
    public String notictest(){
        return "/blog/test";
    }
}
