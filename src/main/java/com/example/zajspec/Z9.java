package com.example.zajspec;

import jakarta.servlet.http.HttpServletRequest;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static java.util.Map.entry;

@Data
class UserRequest {
    private String name = "";
    private String email = "";
    private String age = "";
    private String surname = "";
}
@Controller
@RequestMapping("/z9")
public class Z9 {
    @GetMapping("")
    public String get(
    ) {
        return "/form";
    }

    @PostMapping("")

    public String post(
            @ModelAttribute("userRequest") UserRequest userRequest,
            Model model
    ) {
        System.out.println(userRequest);
        model.addAllAttributes(
                Map.ofEntries(
                        entry("isNameValid", userRequest.getName().length() > 2),
                        entry("isSurnameValid", userRequest.getSurname().length() > 2),
                        entry("isAgeValid",  !userRequest.getAge().equals("") && Integer.parseInt(userRequest.getAge()) > 2),
                        entry("isEmailValid", userRequest.getEmail().length() > 2
                )
        ));
        return "/form";
    }

}
