package task1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private int id;
    private String name, lastName, role, email, login, password;
    private boolean userLogged = false;

    Scanner scanner = new Scanner(System.in);


    File file = new File("credentials");


    public void setUserLogged(boolean userLogged) {
        this.userLogged = userLogged;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRole() {
        return role;
    }

    public String getEmail() {
        return email;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public boolean isUserLogged() {
        return userLogged;
    }

    public User() {

    }

    ArrayList<String> credentials = new ArrayList<>();

    public boolean register() throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter(file, true));
        System.out.println("Enter your name, please");
        name = scanner.nextLine();
        System.out.println("Enter your last name, please");
        lastName = scanner.nextLine();
        System.out.println("Enter your email, please");
        email = scanner.nextLine();
        System.out.println("Enter login, please");
        login = scanner.nextLine();
        System.out.println("Enter password, please");
        password = scanner.nextLine();
        pw.print(login + " " + password + ";");
        credentials.add(login + ", " + password);
        pw.close();

        setUserLogged(true);
        id++;


        return true;
    }

    public boolean login() throws IOException {

        System.out.println("Enter your login, please");
        login = scanner.nextLine();
        System.out.println("Enter your password, please");
        password = scanner.next();

        String str = login + " " + password;

        scanner = new Scanner(file);
        String line = scanner.nextLine();
        boolean stat = false;

        String[] credentials = line.split(";");

        for (String cred : credentials){
            if (str.equals(cred))
            {
                setUserLogged(true);
                stat = true;

                break;
            }

        }
        return stat;


    }
}
