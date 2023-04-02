package com.example.zajspec.z1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Table {

    private String name;
    private String color;
    private int height;
    private int width;
    private int legCount;

    Table(String name) {
        super();
        this.name = name;
    }
}
