package com.kbs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String getLandingPage(){
        return "index";
    }
    @GetMapping("/input")
    public String getInputPage(){
        return "input";
    }
}
