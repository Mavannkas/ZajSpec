package com.example.zajspec;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController()
@RequestMapping(path=   "/z3")
public class Z3 {
    @GetMapping("/list")
    List<String> getList() {
        return List.of("a", "b", "c");
    }

    @GetMapping("/string")
    String getString() {
        return "abc";
    }

    @GetMapping("/int")
    int getInt() {
        return 123;
    }
}
