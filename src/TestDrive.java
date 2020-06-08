import java.util.Scanner;
public class TestDrive {
    public static void main(String[] args) {
        Generate user = new Generate();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your full name. Include a middle initial if you have one: ");
        String fullName = scan.nextLine();
        String[] nameArray = fullName.split(" ", 5);
        String firstName = nameArray[0];
        String middleInit = nameArray[1];
        String lastName = nameArray[nameArray.length - 1];
        user.generateEmail(firstName, middleInit, lastName);
        user.generatePassword();
        System.out.println("Please save your username and password in a secure location. We recommend a password-storage site like LastPass.");
    }
}
