package db;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class Database {
List<User> users = new ArrayList<>();
public Database (){

}
    public Database(List<User> users) {
        this.users = users;
    }


    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Database{" +
                "users=" + users +
                '}';
    }
}
