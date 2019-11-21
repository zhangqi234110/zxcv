package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 张齐 on 2019/11/21.
 */
@RestController
public class Hellow {


    @RequestMapping("/hellow")
    public String  hi(){
        return "世界真美好！";

    }

}
