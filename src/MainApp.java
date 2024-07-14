/*
    6510405806
    Weeranut Chayakul
*/

public class MainApp {
    Verifier verifier;

    public MainApp() {
        verifier = new Verifier(new StringPatternRecognizer());
    }

    public boolean register(User user) throws IllegalArgumentException {
        verifier.verifyName(user);
        verifier.verifyEmail(user);
        verifier.verifyAge(user, 20);
        return true;
    }
}
