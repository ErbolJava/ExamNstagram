package dao;

import model.User;

public interface UserDao {
    String addNewUser(User user); //добавить новый user
    User userUpdateById(Long id,String nickName,String password,String photo); //изменить name, password, и photo
    User searchByName(String nickName);// искать по name
    User sortByAge();// stream//сортировка по возрасту (по возрастанию и убыванию)
    User filter();// stream //фильтрация по age(например старше >20 лет или младше <20 лет)
}
