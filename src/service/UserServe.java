package service;

import model.User;

public interface UserServe {
    String addNewUser(User user); //добавить новый user
    User userUpdateById(Long id,String nickName,String password,String photo); //изменить name, password, и photo
    User searchByName(String nickName);// искать по name
    User sortByAge(int age);// stream//сортировка по возрасту (по возрастанию и убыванию)
    User filter(int age);// stream //фильтрация по age(например старше >20 лет или младше <20 лет)
}
