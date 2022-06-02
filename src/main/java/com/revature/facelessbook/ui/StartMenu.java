package com.revature.facelessbook.ui;

import java.util.Scanner;
import java.util.UUID;

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
                        login();
                        break;
                    case "2":
                        signup();
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
    }

    private void signup(){
        String username;
        String password;
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("\nCreate Account!");
            completeExit:{
                while (true){
                    System.out.print("\nUsername: ");
                    username = scan.nextLine();
                }
                while (true) {
                    while (true) {
                        System.out.print("\nPassword ");
                        password = scan.nextLine();
                    }
                    confirmExit:
                    {
                        while(true){
                            System.out.println("\nPlease confirm your credentials are correct!");
                            System.out.println("Username: " + username);
                            System.out.println("Password: " + password);
                            System.out.println("Enter: (y/n)");
                            String input = scan.nextLine();

                            switch (input){
                                case "y":
                                    new MainMenu().start();
                                    break completeExit;
                                case "n":
                                    break completeExit;
                                default:
                                    System.out.println("Invalid input!");
                                    break confirmExit;
                            }
                        }
                    }
                }
            }

        }
    }


}


