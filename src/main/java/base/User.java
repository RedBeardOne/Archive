package base;

import java.util.Optional;

public class User {
    private String name;
    private String mail;
    private int age;
    private boolean status;

    public User(String name, String mail, int base, boolean status) {
        this.name = name;
        this.mail = mail;
        this.age = base;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getMail() {
        return Optional.ofNullable(mail);
    }

    public int getAge() {
        return age;
    }

    public boolean isStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "User: " +
                "name " + name + ", mail " + mail  + ", age " + age + ", status of account " + status;
    }
}
