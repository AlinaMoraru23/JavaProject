package com.company.JavaConsoleLineProgram;


import java.util.HashMap;
import java.util.Scanner;

class Login {

    Scanner scan = new Scanner(System.in);
    HashMap<String, String> users = new HashMap<String, String>();


    void usersList() {
        users.put("User1", "Pass1");
        users.put("User2", "Pass2");
        users.put("User3", "Pass3");
        users.put("User4", "Pass4");
        users.put("User5", "Pass5");

    }


    void userLogin() {

        usersList();

        boolean repeatUser;
        boolean repeatPassword;
        byte count = 0;

        do {
            System.out.print("Username: ");
            String username = scan.next();

            String passCheck;
            if (!users.containsKey(username)) {
                System.out.println("User does not exist");
                repeatUser = true;
            } else {

                do {
                    repeatUser = false;
                    System.out.print("Password: ");
                    String password = scan.next();

                    passCheck = users.get(username);
                    if (password.equals((passCheck))) {
                        repeatPassword = false;
                    } else {
                        System.out.println("Incorrect password, please try again!");
                        count += 1;
                        if (count >= 3) {
                            System.exit(0);
                        }
                        repeatPassword = true;
                    }
                } while (repeatPassword);
            }

        } while (repeatUser);
    }


    void userRegister() {

        usersList();

        boolean repeatUser = false;
        boolean repeatPassword = false;

        do {
            System.out.print("Username: ");
            String username = scan.next();

            if (users.containsKey(username)) {
                System.out.println("The username is already taken. Please try again");
                repeatUser = true;
            } else {

                do {
                    System.out.print("Password: ");
                    String password = scan.next();

                    System.out.print("Re-enter Password: ");
                    String reEnterPassword = scan.next();

                    if (password.equals(reEnterPassword)) {
                        users.put(username, password);
                        repeatPassword = false;
                        System.out.println("The account has been created. You can now log in. \n");
                        userLogin();
                    } else {
                        System.out.println("The 2 passwords do not match!");
                        repeatPassword = true;
                    }
                } while (repeatPassword);
            }

        } while (repeatUser);
    }

}