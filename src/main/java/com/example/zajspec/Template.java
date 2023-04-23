package com.example.zajspec;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Template {
    @RequestMapping("/hello2")
    String hello(@ModelAttribute Model model) {
        model.addAttribute("message", "xd");
        System.out.println("XDDD");
        return "/hello";
    }
}
