package com.example.notic.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class noticController {

    @GetMapping("/test")
    public String notictest(@RequestParam("name") String name, Model model){
        model.addAttribute("name",name);
        return "test";
    }

    @GetMapping("/test-api")
    @ResponseBody//기본 json으로 변환해서 나타내준다 그냥 문자면 String converter가 동작 데이터 타입이면 jsonconverter
    public Apiclass testapi(@RequestParam("name") String name, Model model){
        Apiclass api = new Apiclass();
        api.setName(name);
        return api;
    }





    static class Apiclass{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
