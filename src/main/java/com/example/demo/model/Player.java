package com.example.demo.model;

@Document(collection = "players")
public class Player {
    @Id
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
