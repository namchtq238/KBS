package com.kbs;

import com.kbs.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String getLandingPage(){
        return "index";
    }
    @GetMapping("/input")
    public String getInputPage(Model model){
        model.addAttribute("cam", new Cam());
        model.addAttribute("longmay", new LongMay());
        model.addAttribute("ma", new Ma());
        model.addAttribute("mat", new Mat());
        model.addAttribute("moi", new Moi());
        model.addAttribute("mui", new Mui());
        model.addAttribute("rang", new Rang());
        model.addAttribute("tran", new Tran());
        return "input";
    }
}
