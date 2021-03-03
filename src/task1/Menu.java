package task1;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    User user = new User();

    public Menu() {
    }

    public void showPages() throws IOException {
        boolean exit = false;
        while (!exit) {
            showMenu();
            int menuInput = scanner.nextInt();
            if (menuInput == 1 && user.isUserLogged() == true) {

                //action
            } else if (menuInput == 2 && user.isUserLogged() == true) {
                //action
            } else if (menuInput == 3 && user.isUserLogged() == true) {
                //action
            } else if (menuInput == 4) {
                System.out.println("Enter \"login\", \"register\", or \"exit\"");
                String input = scanner.next();
                while (!exit)
                {
                    if (input.equals("register"))
                    {
                        if (user.register() == true){
                            System.out.println("You are successfully registered");
                            break;
                        }
                    }
                    else if (input.equals("login"))
                    {
                        if (user.login() == true){
                            System.out.println("You are successfully logged");
                        } else
                        {
                            System.out.println("Login or password is invalid. Try again please");
                        }
                        break;
                    }
                    else if(input.equals("exit"))
                    {
                        exit = true;
                    }
                    else
                    {
                        System.out.println("Invalid input. Try again, please.");
                    }
                }
                //action
            } else if (menuInput == 5) {
                exit = true;
            } else if (user.isUserLogged() == false)
            {
                System.out.println("Log in or register, please");
            } else
            {
                System.out.println("Invalid number. Try again, please.");
            }
        }
    }



    public void showMenu() {
        System.out.println(
                "Press the number:" + "\n"
                        + "1 - Store" + "\n"
                        + "2 - Basket" + "\n"
                        + "3 - Profile" + "\n"
                        + "4 - Login" + "\n"
                        + "5 - Exit" + "\n"

        );
    }
}
