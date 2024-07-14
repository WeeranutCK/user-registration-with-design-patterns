/*
    6510405806
    Weeranut Chayakul
*/

import java.util.Arrays;
import java.util.List;

public class Verifier {
    StringPatternRecognizer validator;

    public Verifier(StringPatternRecognizer validator) {
        this.validator = validator;
    }

    public void verifyName(User user) throws IllegalArgumentException {
        validator.checkNullString(user.getName(), "Name should not empty");
        validator.checkStringMatch(user.getName(), "[a-zA-Z]+", "Name is wrong format");
    }

    public void verifyEmail(User user) throws IllegalArgumentException {
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        validator.checkNullString(user.getEmail(), "Email should not be empty");
        validator.checkStringMatch(user.getEmail(), EMAIL_PATTERN, "Email is in the wrong format");
        verifyDomain(user);
    }

    public void verifyDomain(User user) throws IllegalArgumentException {
        List<String> notAllowDomains = Arrays.asList("dom1.cc","dom2.cc", "dom3.cc");
        if (notAllowDomains.contains(user.getEmail().split("@")[1])) {
            throw new IllegalArgumentException("Domain Email is not allow");
        }
    }

    public void verifyAge(User user, int age) throws IllegalArgumentException {
        if (user.getAge() < age) {
            throw new IllegalArgumentException("Age should more than " + age + " years");
        }
    }
}
