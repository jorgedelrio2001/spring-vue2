package com.example.springvue.Friend;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class FriendService {
    private List<Friend>friends;
    public FriendService(){
        friends=new ArrayList<Friend>();
        friends.add(new Friend("super","Epicman"));
        friends.add(new Friend("staunch","McStaunchy"));
        friends.add(new Friend("83124","Shelby"));
        friends.add(new Friend("Guav","Guava"));
    }
    public List<Friend> getFriends(){
        return friends;
    }
    public boolean addFriend(Friend friend){
        friends.add(friend);
        return true;
    }
}

