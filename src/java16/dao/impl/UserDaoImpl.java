package java16.dao.impl;

import java16.dao.UserDao;
import java16.db.DataBase;
import java16.enums.Gender;
import java16.models.User;

import java.util.Arrays;
import java.util.Scanner;

public class UserDaoImpl implements UserDao {
   public static DataBase dataBase = new DataBase();
    Scanner scannerStr = new Scanner(System.in);
    Scanner scannerInt = new Scanner(System.in);

    @Override
    public void register(User newUser) {
        dataBase.users = Arrays.copyOf(dataBase.users, dataBase.users.length + 1);
        dataBase.users[dataBase.users.length - 1] = newUser;
    }

    @Override
    public void login() {
        try {

            System.out.print("write gmail : ");
            String gmail = scannerStr.nextLine();

            System.out.print("write password :");
            String password = scannerStr.nextLine();

            boolean is = false;
            for (User user : dataBase.users) {
                if (user.getGmail().equals(gmail) && user.getPassword().equals(password)) {
                    is = true;
                    System.out.println("hello " + user.getUserName() + " welcome to java 16 ev");
                    break;
                }
            }
            if (!is) {
                throw new RuntimeException("not fount this user!");
            }

        }catch (Exception e){
            System.out.println( e.getMessage());
        }
    }

}
