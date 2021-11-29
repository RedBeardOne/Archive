package base;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        testJsonOne();

        Collection<User> users = new LinkedList<>();
        UsersFactory create = new UsersFactory();
        Collection <String> userInGson = new ArrayList<>();
        Collection<User> backUser = new ArrayList<>();
        String temporally;
        User returnedUser;
        Gson gson = new Gson();
        Integer length = getInteger(args);
        if (length == null) return;
        for (int i = 0; i < length; i++) {
            users.add(create.create());
        }
        for (User user : users) {
           temporally = gson.toJson(user);
            userInGson.add(temporally);
        }
        for (String s : userInGson) {
            returnedUser = gson.fromJson(s, User.class);
            backUser.add(returnedUser);
        }
    }
    private static void testJsonOne() {
        User account = new User("Vasyl", null, 19, true);
        Gson son = new Gson();
        String combined = son.toJson(account);
        System.out.println(combined);
        User newUser = son.fromJson(combined, User.class);
        System.out.println(newUser);
    }

    private static Integer getInteger(String[] args) {
        int length;
        if (args == null) {
            System.out.println("Please set args");
            return null;
        }
        String size = args[0];
        try {
            length = Integer.parseInt(size);
        }catch (NumberFormatException e){
            System.out.println(" some exception");
            return null;
        }
        if (length < 0 || length > 20) {
            System.out.println("Arg in position 0 cant be negative or more than 20");
        }
        return length;
    }
}
