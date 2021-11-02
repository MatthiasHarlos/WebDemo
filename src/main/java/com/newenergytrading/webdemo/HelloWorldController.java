package com.newenergytrading.webdemo;

import org.springframework.boot.Banner;
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

    @GetMapping("toupper")
    public String toUpper(@RequestParam String firstname,@RequestParam String lastname, Model model) {
        model.addAttribute("originalInput", firstname + " " + lastname);
        model.addAttribute("inputToUpper", firstname.toUpperCase() + "\n" + lastname.toUpperCase());

        Person person = new Person();
        person.setFirstname("Matthias");
        person.setLastname("Harlos");
        model.addAttribute("person", person);
        return "toupper-template";
    }
}
