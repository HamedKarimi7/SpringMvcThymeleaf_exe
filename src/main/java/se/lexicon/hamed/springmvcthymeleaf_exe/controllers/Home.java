package se.lexicon.hamed.springmvcthymeleaf_exe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {

    @GetMapping("/index")
    public String index(){
        System.out.println(" index method executed!");
        return("index");
    }

    @GetMapping("/contact")
    public String contact(){
        System.out.println("contact method executed");
        return("contact");
    }
}
