package pl.camp.it.rest;

import pl.camp.it.rest.model.User;

public class App {
    public static void main(String[] args) {
        User user = new User();
        user.setId(10);
        user.setLogin("asdf");
        user.setPassword("asdjhgfasd");
    }
}
