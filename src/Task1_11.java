import java.util.Scanner;

/**
 * Created by user on 04.06.2017.
 */
public class Task1_11 {
    public static void main(String[] args) {
        System.out.println("Enter six-digit number:");
        Scanner scaner = new Scanner(System.in);
        String array = scaner.nextLine();
        int a1 = Integer.parseInt(array) % 10;
        int a2 = Integer.parseInt(array) / 10 % 10;
        int a3 = Integer.parseInt(array) / 100 % 10;
        int a4 = Integer.parseInt(array) / 1000 % 10;
        int a5 = Integer.parseInt(array) / 10000 % 10;
        int a6 = Integer.parseInt(array) / 100000 % 10;
        if ((a1 + a2 + a3) == (a4 + a5 + a6)) {
            System.out.println("Lucky ticket");
        } else {
            System.out.println("Not lucky ticket");
        }
    }
}
