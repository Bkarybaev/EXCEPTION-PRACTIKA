package java16;

import java16.dao.impl.UserDaoImpl;
import java16.models.User;
import java16.service.impl.UserServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserDaoImpl userDao = new UserDaoImpl();

        UserServiceImpl userService = new UserServiceImpl(userDao);

        Scanner scannerStr = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    1.Register
                    2.Login
                    """);
            String word = scannerStr.nextLine();
            switch (word) {
                case "1" -> {
                    User user = new User();
                    userService.register(user);
                }
                case "2" -> {
                    userService.login();
                }
                default -> System.out.println("error!!");
            }
        }


    }
}