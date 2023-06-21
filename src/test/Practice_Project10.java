package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice_Project10 {

	public static void main(String[] args) {
		// Regular expression pattern to match email addresses
        String emailPattern = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";

        // Input text to search for matches
        String inputText = "Contact us at i%+_-nfo@example.computer or support@example.org";

        // Creating a Pattern object
        Pattern pattern = Pattern.compile(emailPattern);

        // Creating a Matcher object
        Matcher matcher = pattern.matcher(inputText);

        // Finding and printing matches
        System.out.println("Email addresses found:");
        while (matcher.find()) {
            String email = matcher.group();
            System.out.println(email);
        }
	}

}
