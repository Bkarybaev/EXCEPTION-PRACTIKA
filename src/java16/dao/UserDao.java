package java16.dao;

import java16.models.User;

public interface UserDao {
    void register(User newUser) ;
    void login();
}
