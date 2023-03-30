import dao.impl.UserImpl;
import db.Database;
import model.User;
import service.impl.UserServed;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        Scanner scanner = new Scanner(System.in);
        UserImpl userImpl = new UserImpl();
        List<User>userList = new ArrayList<>();
        while(true) {
            System.out.println("""
                    1 - Add New User | 2 - Update By Id | 3 - Search By Name
                    4 - Sort By Age | 6 - Filter age >20 || <20""");

            int a = scanner.nextInt();
            switch (a) {
                case 1 :
                    User user = new User();
                    System.out.print("Print name: ");
                    String inputName = new Scanner(System.in).next();
                    System.out.print("Print password: ");
                    String inputPassword = new Scanner(System.in).next();
                    System.out.print("Enter age: ");
                    int inputAge = new Scanner(System.in).nextInt();
                    user.setAge(inputAge);
                    user.setId((long) (database.getUsers().size()+1));
                    user.setNickName(inputName);
                    user.setPassword(inputPassword);
                    userList.add(user);
                    database.setUsers(userList);
                    userImpl.addNewUser(user);
                    System.out.println(database.getUsers());
                    break;
                case 2 :
                    System.out.print("Verify your id: ");
                    Long inputId = Long.valueOf(new Scanner(System.in).next());
                    System.out.print("Now enter your password: ");
                    String inputPsw = new Scanner(System.in).next();
                    System.out.print("New name: ");
                    String inputNickname = new Scanner(System.in).next();
                    System.out.print("New photo: ");
                    String inputPhoto = new Scanner(System.in).next();
                    userImpl.userUpdateById(inputId,inputNickname,inputPsw,inputPhoto);
                    System.out.println(database.getUsers());
                    break;
                case 3 :
                    System.out.print("Enter name that who you want to search: ");
                    String nameEnter = new Scanner(System.in).next();
                    userImpl.searchByName(nameEnter);
                    break;
                case 4 :
                    System.out.println(userImpl.sortByAge());
                    break;
                case 5 :
                    System.out.println(userImpl.filter());
            }
        }
    }
}