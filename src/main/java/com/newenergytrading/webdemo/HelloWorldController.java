package com.newenergytrading.webdemo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello(@RequestParam String firstname, String lastname) {
        return ResponseEntity.ok("Hello " + firstname + lastname + "!");
    }

    @GetMapping("thymeleaf")
    public String sayHelloThymeleaf() {
        return "hello-template";
    }
}
