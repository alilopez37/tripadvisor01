package com.upchiapas.tripadvisor.models;

import java.util.ArrayList;

public class ValidateUser {
    private ArrayList<User> users = new ArrayList<>();

    public ValidateUser(){
        users.add(new User("Alí López","alilopez","1234"));
        users.add(new User("Juan Ramirez","juan","1234"));
    }

    public boolean autenticarUser(String username, String password){
        boolean status = false;
        User user = findUser(username);
        if ( user != null && user.getPassword().equals(password))
            status = true;
        return status;
    }

    private User findUser(String username){
        User user = null;
        boolean status = false;
        int index = 0;
        while (!status && index<users.size()){
            if (users.get(index).getUsername().equals(username)){
                user = users.get(index);
                status = true;
            }
            index++;
        }
        return user;
    }
}
