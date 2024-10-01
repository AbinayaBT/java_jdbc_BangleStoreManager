package com.bangle.product;

import java.util.Scanner;

public class login {
    private String username;
    private String password;

    // Predefined credentials (for demonstration)
    private static final String PREDEFINED_USERNAME = "admin";
    private static final String PREDEFINED_PASSWORD = "password";

    public boolean authenticate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the User name:");
        username = scanner.next();
        System.out.println("Enter the password:");
        password = scanner.next();

        if (username.equals(PREDEFINED_USERNAME) && password.equals(PREDEFINED_PASSWORD)) {
            System.out.println("Login successful!");
            return true;
        } 
        return false;
		
    }
}
