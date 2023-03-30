package service.impl;

import dao.impl.UserImpl;
import model.User;
import service.UserServe;

public class UserServed implements UserServe {
    UserImpl userImpl = new UserImpl();
    @Override
    public String addNewUser(User user) {
        return userImpl.addNewUser(user);
    }

    @Override
    public User userUpdateById(Long id, String nickName, String password, String photo) {
        return userImpl.userUpdateById(id,nickName,password,photo);
    }

    @Override
    public User searchByName(String nickName) {
        return null;
    }

    @Override
    public User sortByAge() {
        return null;
        // stream//сортировка по возрасту (по возрастанию и убыванию)
    }

    @Override
    public User filter() {
        return null;
    }
}
