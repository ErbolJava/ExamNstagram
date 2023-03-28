package dao.impl;

import dao.UserDao;
import db.Database;
import model.User;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class UserImpl implements UserDao {
    List<User>users = new ArrayList<>();
    Database database = new Database(users);

    @Override
    public String addNewUser(User user) {
        database.getUsers().add(user);
        return "Successfully created";
    }

    @Override
    public User userUpdateById(Long id, String nickName, String password, String photo) {
        database.getUsers().get(users.size()).setNickName(nickName);
        database.getUsers().get(users.size()).setPhoto(photo);
            return null;
    }

    @Override
    public User searchByName(String nickName) {
        boolean a = false;
        for (User getUser:database.getUsers()) {
            if (nickName.equalsIgnoreCase(getUser.getNickName())) {
                System.out.println(getUser);
            } else {
                a = true;
            }
            if (a) {
                for (User getuser : database.getUsers()) {
                    if (nickName.equalsIgnoreCase(getuser.getNickName())) {
                        System.out.println(getuser);
                    }
                    else{
                        System.out.println("Error");
                    }
                }
            }
        }
        return null;
    }

    @Override
    public User sortByAge(int age) {
        return null;
    }

    @Override
    public User filter(int age) {
        return null;
    }
}