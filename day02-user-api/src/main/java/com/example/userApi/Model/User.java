package com.example.userApi.Model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.lang.NonNull;

public class User {

    private int id;

    @Size(min = 2, max = 7, message = "Name must be between 2 to 7 characters")
    private String name;

    @Email(message = "Invalid email format")
    private String email;


    public User(){

    }
    public User(int id,String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;

    }

    // getters
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    // setters
    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }
}
