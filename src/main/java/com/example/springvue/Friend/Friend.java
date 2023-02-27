package com.example.springvue.Friend;

//lombok puts in all my getters and setters free of charge
import lombok.AllArgsConstructor;//AllArgsConstructor Creates a constructor with every private variable I declare
import lombok.Data;



public @Data @AllArgsConstructor class Friend {//@data is from Lombok
    private String id,name;
    public String toString(){
        return "[id: "+getId() +" name:"+getName()+"]";
    }
}
