import java.util.Scanner;

/**
 * Created by user on 04.06.2017.
 */
public class Task1_10 {
    public static void main(String[] args) {
        System.out.println("Enter three-digit numbers:");
        Scanner scaner = new Scanner(System.in);
        String input = scaner.nextLine();
        String[] array = input.split(" ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() == 3) {
                int b = Integer.parseInt(array[i]) % 10;
                int c = Integer.parseInt(array[i]) / 10 % 10;
                int d = Integer.parseInt(array[i]) / 100 % 10;
                if (b != c && c != d && d != b) {
                    System.out.println(array[i]);
                }
            }
        }
    }
}
