import java.util.Scanner;

public class Authentication {

    public static void main(String[] args) {

        // Stored email and password
        String correctEmail = "user@gmail.com";
        String correctPassword = "123456";

        Scanner scanner = new Scanner(System.in);

        // Login input
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        // Authentication check
        if (email.equals(correctEmail) && password.equals(correctPassword)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid Email or Password!");
        }

        scanner.close();
    }
}
