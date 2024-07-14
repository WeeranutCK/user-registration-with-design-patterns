/*
    6510405806
    Weeranut Chayakul
*/

import java.util.regex.Pattern;

public class StringPatternRecognizer {
    public void checkStringMatch(String string, String regex, String errorMessage) throws IllegalArgumentException {
        Pattern validPattern = Pattern.compile(regex);

        if (!validPattern.matcher(string).matches()) {
            throw new IllegalArgumentException(errorMessage);
        }
    }

    public void checkNullString(String string, String errorMessage) throws IllegalArgumentException {
        if (string == null || string.trim().equals("")) {
            throw new IllegalArgumentException(errorMessage);
        }
    }
}
