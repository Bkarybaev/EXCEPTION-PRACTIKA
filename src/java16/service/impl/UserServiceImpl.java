package java16.service.impl;

import java16.dao.impl.UserDaoImpl;
import java16.models.User;
import java16.service.UserService;

public class UserServiceImpl implements UserService {

   final UserDaoImpl userDao;

    public UserServiceImpl(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    @Override
    public void register(User newUser) {
        userDao.register(newUser);
    }

    @Override
    public void login() {
        userDao.login();
    }
}
