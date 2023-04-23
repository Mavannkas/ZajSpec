package com.example.zajspec;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Data
@Builder
class Table {
    private int height;
    private int weight;
    private String name;
    private String color;
}
@Controller
@RequestMapping("/z8")
public class Z8 {
    @GetMapping("")
    public String add(
            Model model
    ) {
        model.addAttribute("objects",  List.of(
                Table.builder().name("Table1").color("Color1").weight(1).height(1).build(),
                Table.builder().name("Table2").color("Color2").weight(2).height(2).build()
        ));

        return "/model";
    }

}
