package com.revature.facelessbook.ui;

import java.util.Scanner;

public class MainMenu implements IMenu{

    @Override
    public void start() {
        Scanner scan = new Scanner(System.in);
        exit:{
            while (true) {
                System.out.println("\nWelcome, ");
                System.out.println("\n[1] Find Faceless Friends");
                System.out.println("\n[2] View Your Faceless Friends");
                System.out.println("\n[3] Edit Your Profile");
                System.out.println("\n[4] Sign Out");
                System.out.print("\nEnter:");

                switch (scan.nextLine()) {
                    case "1":
                        viewAllUsers();
                        break;
                    case "2":
                        viewUserFriends();
                        break;
                    case "3":
                        editProfile();
                        break;
                    case "4":
                        break exit;
                    default:
                        System.out.println("\nInvalid selection");
                        break ;
                }

            }
        }

    }
    //list out all the users that are not current user friends
    private void viewAllUsers(){
        userProfile();
    }

    // lists out users that are "friends" with current user
    private void viewUserFriends(){
        userProfile();
    }

    // method to view profiles of these users
    //takes in list of users from above
    private void userProfile(){

    }

    private void editProfile(){

    }






}
