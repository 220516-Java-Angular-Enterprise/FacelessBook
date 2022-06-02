package com.revature.facelessbook.models;


enum Status{
    Pending,
    Friends,
    Blocked,
    NotFriends
}

public class Friends {
    Status status;
    Integer friendID;

    Friends(){}

    Friends(Status status, Integer friendID){
        this.status = status;
        this.friendID = friendID;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getFriendID() {
        return friendID;
    }

    public void setFriendID(Integer friendID) {
        this.friendID = friendID;
    }
}
