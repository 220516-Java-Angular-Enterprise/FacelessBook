package com.revature.facelessbook.Services;

import com.revature.facelessbook.daos.FriendsDAO;
import com.revature.facelessbook.models.Friends;
import com.revature.facelessbook.models.Users;
import com.revature.facelessbook.util.CustomException.NoDataException;

import java.sql.SQLException;
import java.util.List;

public class FriendsService {
    private final FriendsDAO mFriendsDAO;

    public FriendsService(FriendsDAO fDAO) {
        mFriendsDAO = fDAO;
    }

    public void sendRequest(Users sender, Users sendee) throws SQLException {
        mFriendsDAO.sendFriendRequest(/*sender, sendee*/);
    }

    public void confirmFriendRequest(Users sendee, Users sender) throws SQLException {
        mFriendsDAO.addFriend(/*sendee, sender*/);
    }

    public List<Users> viewFriendRequests(Users u) throws NoDataException {
        List<Users> friendRequesters =
                mFriendsDAO.retrieveRequests(String.valueOf(u.getUserid()));
        if(!friendRequesters.isEmpty()) return friendRequesters;
        else throw new NoDataException("friend requests");
    }

    public List<Users> viewFriends(Users u) throws SQLException {
        List<Users> friends =
                mFriendsDAO.retrieveFriends(String.valueOf(u.getUserid()));
        if(!friends.isEmpty()) return friends;
        else throw new NoDataException("friends");
    }
}
