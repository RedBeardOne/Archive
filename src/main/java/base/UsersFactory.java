package base;

public class UsersFactory {
    private String[] name = {"Kolya", "Sonya", "Galya", "Gena", "Genya", "Olya", "Andrii", "Alexandr", "Serhii", "Darya", "Maxim", "Alexii", "Valeryi", "Oleg"};;
    private String[] mail = {"me@mgail.com", "someone@mgail.com", "krutoy@mgail.com", "logic@mgail.com", "another@mgail.com", "oncemore@@mgail.com", "notnull@mgail.com", null};
    private int[] age = {12, 13, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};;
    private boolean[] status;

    public User create() {
        double random = Math.random();
        int randname =(int)(random* name.length);
        String uName = name[randname];
        random = Math.random();
        int randmail = (int)(random* mail.length);
        String uMail = mail[randmail];
        random = Math.random();
        int randage = (int)(random* age.length);
        int uAge = age[randage];
        random = Math.random();
        boolean stat = check(random);
        User user = new User(uName, uMail, uAge, stat);
        return user;
    }
    private boolean check(double numb){
        return numb > 0.5;
    }
}
