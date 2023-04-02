package com.example.zajspec;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/z4")
public class Z4 {
    @GetMapping("/form")
    public String form(
            @RequestParam("name") String name,
            @RequestParam("surname") String surname,
            @RequestParam("pesel") String pesel,
            @RequestParam(value = "phone", required = false) String phone,
            @RequestParam(value = "email", required = false) String email
            ){
        return String.format("name=%s;surname=%s;pesel=%s", name, surname, pesel) +
                (phone != null ? ";phone=" + phone : "") +
                (email != null ? ";email=" + email : "");
    }
}
