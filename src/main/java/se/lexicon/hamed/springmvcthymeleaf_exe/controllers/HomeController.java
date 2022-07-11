package se.lexicon.hamed.springmvcthymeleaf_exe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/index")
    public String index() {
        return ("index");
    }

    @GetMapping("/contact")
    public String contact() {
        return ("contact");
    }

    @PostMapping("/contact")
    public String contact(@RequestParam("email") String email) {
        System.out.println("Email:" + email);
        return "contacts";
    }
}


