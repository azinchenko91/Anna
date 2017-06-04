import java.util.Scanner;

/**
 * Created by user on 04.06.2017.
 */
public class Task1_12 {
    public static void main(String[] args) {
        System.out.println("Enters numbers:");
        Scanner scaner = new Scanner(System.in);
        String input = scaner.nextLine();
        String[] array = input.split(" ");
        for (int i = 0; i < array.length - 2; i++) {
            if (Integer.parseInt(array[i + 1]) == (Integer.parseInt(array[i]) + Integer.parseInt(array[i + 2])) / 2) {
                System.out.println(array[i + 1]);

            }
        }
    }
}
