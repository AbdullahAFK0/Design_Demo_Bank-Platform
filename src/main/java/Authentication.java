import java.util.Scanner;

public class Authentication {

    public static boolean authenticate(String email, String password) {

        String correctEmail = "user@gmail.com";
        String correctPassword = "123456";

        return email.equals(correctEmail)
                && password.equals(correctPassword);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        if (authenticate(email, password)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid Email or Password!");
        }

        scanner.close();
    }
}
