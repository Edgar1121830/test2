package com.example.test2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test2 {

    @GetMapping(value = "/")
    public String test(){
        return "Hola 2";
    }
}
