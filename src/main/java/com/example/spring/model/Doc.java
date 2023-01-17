package com.example.spring.model;


import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table (name = "docs")
public class Doc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String type;

    @Lob
    private byte[] data;

    public Doc(){}

    public Doc(String name, String type, byte[] data) {
        this.name = name;
        this.type = type;
        this.data = data;
    }
}
