package java16.service.impl;

import java16.dao.impl.UserDaoImpl;
import java16.db.DataBase;
import java16.enums.Gender;
import java16.models.User;
import java16.service.UserService;

import java.util.Scanner;

import static java16.dao.impl.UserDaoImpl.dataBase;

public class UserServiceImpl implements UserService {

   final UserDaoImpl userDao;


    public UserServiceImpl(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    Scanner scannerStr = new Scanner(System.in);
    Scanner scannerInt = new Scanner(System.in);


    @Override
    public void register(User newUser) {
        try {
            System.out.print("write id: ");
            newUser.setId(scannerInt.nextLong());

            //name
            System.out.print("write user name: ");
            String name = scannerStr.nextLine();
            boolean isblok = false;
            for (User user : dataBase.users) {
                if (user.getUserName().equalsIgnoreCase(name)) {
                    isblok = true;
                    throw new RuntimeException("user name unikalduu kyl");
                }
            }
            if (!isblok) newUser.setUserName(name);

            //phone number
            System.out.print("write Phone number: ");
            String phone = scannerStr.nextLine();
            if (!phone.startsWith("+996") && phone.length() != 13) {
                throw new RuntimeException("number tuura emes formatta!");
            }
            newUser.setPhoneNumber(phone);

            //gmail
            System.out.print("write gmail: ");
            String gmail = scannerStr.nextLine();
            if (!gmail.contains("@gmail.com")) {
                throw new RuntimeException("tuura jaz!");
            }
            newUser.setGmail(gmail);
            //password
            System.out.print("write password: ");
            String password = scannerStr.nextLine();
            if ((password.length() < 5)) {
                throw new RuntimeException("4ton kop jaz!");
            }
            newUser.setPassword(password);

            //gender
            System.out.print("write gender:(\n1.FEMALE\n2.MALE)");
            String gender = scannerStr.nextLine();
            if (gender.equals("1")){
                newUser.setGender(Gender.FEMALE);
            }else if (gender.equals("2")){
                newUser.setGender(Gender.MALE);
            }else {
                throw new RuntimeException("1 or 2 write !!");
            }


        userDao.register(newUser);
            System.out.println(newUser);
            System.out.println("Successful !");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void login() {
        userDao.login();
    }
}
