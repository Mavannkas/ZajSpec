package com.example.zajspec;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/z6")
public class Z6 {
    @GetMapping("/dodawanie/{number}/{number2}")
    public int add(
            @PathVariable int number,
            @PathVariable int number2
    ) {
        return number + number2;
    }

    @GetMapping("/odejmowanie/{number}/{number2}")
    public int sub(
            @PathVariable int number,
            @PathVariable int number2
    ) {
        return number - number2;
    }

    @GetMapping("/mnozenie/{number}/{number2}")
    public int mul(
            @PathVariable int number,
            @PathVariable int number2
    ) {
        return number * number2;
    }

    @GetMapping("/dzielenie/{number}/{number2}")
    public int div(
            @PathVariable int number,
            @PathVariable int number2
    ) {
        return number / number2;
    }

}
