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
        this.dept = this.setDept();
        this.password = this.generatePassword(8);
        this.email = this.generateEmail();
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
        String numbers = "0123456789";
        String symbols = "!@#$%&?";
        String values = capitalChars + smallChars + numbers + symbols;

        String password = "";
        for (int i = 0; i < length; i++) {
            password = password + values.charAt(random.nextInt(values.length()));
        }
        return password;
    }

    public void setPassword() {
        boolean flag = false;
        do (
            System.out.println("ARE YOU SURE YOU WANT TO CHANGE THE PASSWORD? (Y/N) : ");
            char choice = scanner.next().charAt(0);
            if (choice == 'Y' || choice == 'y') {
                flag = true;
                System.out.println("Enter current Password: ");
                String temp = scanner.next();
                if (temp.equals(this.password)) {
                    System.out.println("Enter new Password");
                    this.password = scanner.next();
                    System.out.println("PASSWORD CHANGED SUCCESSFULLY");
                } else {
                    System.out.println("Incorrect Password");
                }
            } else if (choice == 'N' || choice == 'n') {
                flag = true;
                System.out.println("PASSWORD CHANGE CANCELED");
            } else {
                System.out.println("**ENTER A VALID CHOICE**");
            }
            ) while (!flag);
    }

    public void setMailCap() {
        System.out.println("Current capacity = " + this.mailCapacity + "mb");
        System.out.print("Enter new capacity: ");
        this.mailCapacity = scanner.nextInt();
        System.out.println("MAILBOX CAPACITY CHANGED SUCCESSFULLY!");
    }

    public void alternateEmail() {
        System.out.println("Enter new alternate email: ");
        this.alterEmail = scanner.next();
        System.out.println("Sucess");
    }

    public void getInfo() {
        System.out.println("NAME: " + this.firstName + " " + this.lastName);
        System.out.println("DEPARTMENT: " + this.dept);
        System.out.println("EMAIL: " + this.email);
        System.out.println("PASSWORD: " + this.password);
        System.out.println("MAILBOX CAPACITY: " + this.mailCapacity + "mb");
        System.out.println("ALTER EMAIL: " + this.alterEmail);
    }

}
