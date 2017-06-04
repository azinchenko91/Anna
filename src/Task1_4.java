import java.util.Scanner;

/**
 * Created by user on 04.06.2017.
 */
public class Task1_4 {
    public static void main(String[] args) {
        System.out.println("Enter your password:");
        String password = "1234";
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (password.equals(input)) {
            System.out.println("Correct password!");
        } else {
            System.out.println("Invalid password!");
        }
    }
}
