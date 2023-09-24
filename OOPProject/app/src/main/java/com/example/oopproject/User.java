package com.example.oopproject;

public class User extends People{
    //Property
    String name;
    String job;

    //Constructor


    public User(String nameI, String jobI) {
        this.name = nameI;
        this.job = jobI;

        System.out.println("User Created");
    }
}
