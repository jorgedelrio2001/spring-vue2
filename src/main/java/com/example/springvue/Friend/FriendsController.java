package com.example.springvue.Friend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //allows RESt API like activities
@RequestMapping(value = "/api/friends")
public class FriendsController {

    private final FriendService friendService;
    @Autowired
    public FriendsController(FriendService friendService){
        this.friendService = friendService;
        //friends=new ArrayList<>();

    }

    @GetMapping()
    public List<Friend> list(){
        return this.friendService.getFriends();
    }
 /*   @GetMapping("/{id}")
    public Friend getFriend(@PathVariable String id){

        return friends.stream().filter(
                friend-> id.equals(
                        friend.getId()
                )
                ).findAny().orElse(null);

    }
    @DeleteMapping("/{id}")
    public String deleteFriend(@PathVariable String id){
        if(friends.removeIf(friend->id.equals(friend.getId()))) {
            return "[Result: Delete Successful!]";
        }
        return"[Result:Delete Failed]";
    }*/
    @PostMapping()
    public String addFriend(@RequestBody Friend friend) {
        friendService.addFriend(friend);
        return "Event Successful";
    }

}

