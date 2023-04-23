package com.example.zajspec;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/z7")
public class Z7 {
    @GetMapping("/dodawanie/{number}/{number2}")
    public String add(
            @PathVariable int number,
            @PathVariable int number2,
            Model model
    ) {
        model.addAttribute("result",  number + number2);
        return "/result";
    }

    @GetMapping("/odejmowanie/{number}/{number2}")
    public String sub(
            @PathVariable int number,
            @PathVariable int number2,
            Model model
    ) {
        model.addAttribute("result",  number - number2);
        return "/result";
    }

    @GetMapping("/mnozenie/{number}/{number2}")
    public String mul(
            @PathVariable int number,
            @PathVariable int number2,
            Model model
    ) {
        model.addAttribute("result",  number * number2);
        return "/result";
    }

    @GetMapping("/dzielenie/{number}/{number2}")
    public String div(
            @PathVariable int number,
            @PathVariable int number2,
            Model model
    ) {
        model.addAttribute("result",  number / number2);
        return "/result";
    }

}
