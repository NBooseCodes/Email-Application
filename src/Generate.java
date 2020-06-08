
import java.util.*;

public class Generate {


    public String generateEmail(String firstName, String middleInit, String lastName) {
        String emailAddress = firstName.charAt(0) + middleInit + lastName + "@gmail.com";
        System.out.println("Your email address is: " + emailAddress);
        return emailAddress;
    }

    protected String generatePassword() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder builder = new StringBuilder();
        Random rnd = new Random();
        while (builder.length() < 18) { // length of the random string.
            int index = (int) (rnd.nextFloat() * chars.length());
            builder.append(chars.charAt(index));
        }
        String password = builder.toString();

        System.out.println("Your new password is: " + password);
        return password;

    }
}
