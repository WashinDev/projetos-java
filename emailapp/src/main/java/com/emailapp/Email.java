package com.emailapp;

import java.util.*;
import java.io.*;

public class Email {
    public Scanner scanner = new Scanner(System.in);

    private String firstName;
    private String lastName;
    private String dept;
    private String email;
    private String password;
    private int mailCapacity = 500;
    private String alterEmail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("New Employee: " + this.firstName + "" + this.lastName);
    }

    private String generateEmail() {
        return this.firstName.toLowerCase() + "." + this.lastName.toLowerCase()
                + "@" + this.dept.toLowerCase() + ".company.com";
    }

    private String setDept() {
        System.out.println("Department Codes \n1 for Sales \n2 for Development \n3 for Accounting \n0 none");

        boolean flag = false;
        do {
            System.out.println("Enter Department Code");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    return "Sales";
                case 2:
                    return "Development";
                case 3:
                    return "Accounting";
                case 0:
                    return "None";
                default:
                    System.out.println("Invalid choice please choose it again");
            }
        } while (!flag);
            return null;
    }

    private String generatePassword(int length) {
        Random random = new Random();
        String capitalChars="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallChars="abcdefghijklmnopqrstuvwxyz";
    }


}
