package com.revature.facelessbook.ui;

import java.util.Scanner;

public class StartMenu implements IMenu{
    @Override
    public void start() {
        Scanner scan = new Scanner(System.in);

        exit:{
            while(true){
                displayWelcomeMenu();

                System.out.println("\nEnter: ");
                String input = scan.nextLine();

                switch(input){
                    case "1":
                        //login();
                        break;
                    case "2":
                        //signup();
                        break;
                    case "x":
                        break exit;
                    default:
                        System.out.println("Invalid Input.");
                        break;
                }
            }
        }
    }

    private void displayWelcomeMenu(){
        System.out.println("\nWelcome to FacelessBook!!");
        System.out.println("[1] Login");
        System.out.println("[2] Sign Up");
        System.out.println("[x] Exit");
    }


    private void login() {

        Scanner scan = new Scanner(System.in);
        String username;
        String password;

        System.out.println("Welcome to the sign up menu");


    }




}


