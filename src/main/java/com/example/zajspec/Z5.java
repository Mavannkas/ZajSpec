package com.example.zajspec;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/z5")
public class Z5 {
    @GetMapping("/{string}/{number}/{string2}/{number2}")
    public String basicGet(
        @PathVariable String string,
        @PathVariable int number,
        @PathVariable String string2,
        @PathVariable int number2
    ){
        return String.format("string=%s;number=%s;string2=%s&number2=%s", string, number, string2, number2);
    }
}
