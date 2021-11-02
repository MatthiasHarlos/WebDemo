package com.newenergytrading.webdemo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello(@RequestParam String firstname,@RequestParam String lastname) {
        return ResponseEntity.ok("Hello " + firstname + lastname + "!");
    }

    @GetMapping("thymeleaf")
    public String sayHelloThymeleaf(Model model,@RequestParam String firstname,@RequestParam String lastname) {
        model.addAttribute("name", firstname + " " + lastname);
        model.addAttribute("loremipsum", "Gib Gas");
        return "hello-template";
    }

}
