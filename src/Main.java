/*
    6510405806
    Weeranut Chayakul
*/

public class Main {
    public static void main(String[] args) {
        MainApp mainApp = new MainApp();
        User user;

        user = new User("Michael", "test.email-123@example-domain.org", 20);
        if (mainApp.register(user)) {
            System.out.println("Register success!");
        }
    }
}
