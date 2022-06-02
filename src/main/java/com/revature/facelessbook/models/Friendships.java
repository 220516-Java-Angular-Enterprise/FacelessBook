package com.revature.facelessbook.models;

public class Friendships {
    private Integer friendid;
    private  Integer userid;

    Friendships(){}

    Friendships(Integer friendid, Integer userid){

        this.friendid = friendid;
        this.userid = userid;
    }
}
