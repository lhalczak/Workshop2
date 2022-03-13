package pl.halczak;

public class Main01 {

    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setUserName("Halczak");
        user.setEmail("lukasz@halczak.pl");
        user.setPassword("tesy123");

        System.out.println(user.getUser());

        UserDao userDao = new UserDao();

    }
}
