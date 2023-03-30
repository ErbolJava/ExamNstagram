package dao.impl;

import dao.UserDao;
import db.Database;
import model.User;

import java.util.Comparator;
import java.util.Scanner;

public class UserImpl implements UserDao {
    Database database = new Database();

    @Override
    public String addNewUser(User user) {
         database.getUsers().add(user);
         return "Successfully created";
    }

    @Override
    public User userUpdateById(Long id, String nickName, String password, String photo) {
         for (User u : database.getUsers()) {
             if (id.equals(u.getId()) && password.equals(u.getPassword())) {
                 u.setNickName(nickName);
                 u.setPhoto(photo);
            }
        }
        return null;
    }

    @Override
    public User searchByName(String nickName) {
         for (User u : database.getUsers()) {
             if (u.getNickName().equals(nickName)) {
                 return u;
            }
        }
        return null;
    }

    @Override
    public User sortByAge() {
        // stream//сортировка по возрасту (по возрастанию и убыванию)
         System.out.println(database.getUsers().stream().sorted(Comparator.comparingInt(User::getAge)).findAny().orElse(null));
         return database.getUsers()
                 .stream()
                 .sorted(Comparator.comparingInt(User::getAge))
                 .findAny()
                 .orElse(null);
    }


    @Override
    public User filter() {
         System.out.println("1 - person < 20  |  2 - person > 20");
         int inp = new Scanner(System.in).nextInt();
         if (inp == 1) {
            database.getUsers().stream().filter(user -> user.getAge() < 20).forEach(System.out::println);
         }
         if (inp == 2){
            database.getUsers().stream().filter(user -> user.getAge() > 20).forEach(System.out::println);
         }
        return null;
    }
}