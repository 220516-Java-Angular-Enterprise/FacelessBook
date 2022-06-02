package com.revature.daos;

import com.revature.database.DatabaseConnection;
import sun.swing.BakedArrayList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FriendsDAO {
    Connection con = DatabaseConnection.getCon();

    public void sendFriendRequest(){
        try{
            PreparedStatement ps = con.prepareStatement("insert into friends(status) values('pending')");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public void addFriend(){
        try{
            PreparedStatement ps = con.prepareStatement("update friends set status = 'friends' where friendID = ?");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public List<Users> retrieveRequests(String userID){
        List<Users> requests = new ArrayList<>();
        try{
            PreparedStatement ps = con.prepareStatement("select username, fname, lname, birthday, city, state from users as u inner join friendShips as fs on u.userID = fs.userID\n" +
                    "inner join friends as f on fs.friendID = f.friendID where u.userID = ? and status = 'friends'");
            ps.setString(1, userID);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                requests.add(new Users(rs.getString("username"),rs.getString("fname"),rs.getString("lname"),rs.getString("birthday")
                ,rs.getString("city"),rs.getString("state")));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public List<Users> retrieveFriends(String userID){
        List<Users> friends = new ArrayList<>();
        try{
            PreparedStatement ps = con.prepareStatement("select username, fname, lname, birthday, city, state from users as u inner join friendShips as fs on u.userID = fs.userID\n" +
                    "inner join friends as f on fs.friendID = f.friendID where u.userID = ? and status = 'pending'");
            ps.setString(1, userID);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                friends.add(new Users(rs.getString("username"),rs.getString("fname"),rs.getString("lname"),rs.getString("birthday")
                        ,rs.getString("city"),rs.getString("state")));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
