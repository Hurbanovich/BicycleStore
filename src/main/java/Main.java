import entity.User;
import service.UserService;

public class Main {
    public static void main(String[] args) {
        System.out.println(1);
        UserService userService = new UserService();
        System.out.println(2);
        User user = new User("Dima","Sidfer@mail.ru","1q2w3e4r","Donza");
        System.out.println(3);
        userService.saveUser(user);
        System.out.println(4);
       // System.out.println(userService.findUser(1));

    }
}
