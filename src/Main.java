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
        boolean looping = false;
        List<User> users = new ArrayList<>();
        UserServed userImpl = new UserServed();
        Database database = new Database(users);
        while(true) {
            System.out.println("""
                    1 - Add New User | 2 - Update By Id | 3 - Search By Name
                    4 - Sort By Age | 6 - Filter age >20 || <20""");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    User user = new User();
                    System.out.print("Input Name: ");
                    String inputName = new Scanner(System.in).next();
                    System.out.print("Input Password: ");
                    String inputPassword = new Scanner(System.in).next();
                    user.setNickName(inputName);
                    user.setPassword(inputPassword);
                    user.setId((long) (users.size()+1));
                    System.out.println(user);
                    System.out.println(userImpl.addNewUser(user));
                    break;
                case 2:
                    System.out.print("Verify Id: ");
                    Long idd = Long.valueOf(new Scanner(System.in).next());
                    for (User us:users){
                    if (Objects.equals(us.getId(), idd)) {
                        System.out.print("Input name: ");
                        String inputNName = new Scanner(System.in).next();
                        System.out.print("Input photo: ");
                        String inputPhoto = new Scanner(System.in).next();
                        userImpl.userUpdateById(null,inputNName,inputPhoto,null);
                        looping = true;
                    }
                    if (!looping){
                        for (User u:users) {
                            if (u.getId().equals(idd)){
                                System.out.print("Input name: ");
                                String inputNName = new Scanner(System.in).next();
                                System.out.print("Input photo: ");
                                String inputPhoto = new Scanner(System.in).next();
                                userImpl.userUpdateById(null,inputNName,inputPhoto,null);
                            }
                        }
                    }
                }
                    if (looping){
                        System.out.println("Not found");
                    }
                    System.out.print("Input name: ");
                    String inputNName = new Scanner(System.in).next();
                    break;
                case 3:
                    System.out.print("Enter name: ");
                    String inPutName = new Scanner(System.in).next();
                    userImpl.searchByName(inPutName);
                    break;
                case 4 :

            }
        }
    }
}