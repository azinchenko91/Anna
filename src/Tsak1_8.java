import java.util.Scanner;

/**
 * Created by user on 04.06.2017.
 */
public class Tsak1_8 {
    public static void main(String[] args) {
        System.out.println("Enter numbers");
        Scanner scaner = new Scanner(System.in);
        String input = scaner.nextLine();
        String[] array = input.split(" ");
        for (int i = 0; i < array.length; i++) {
            if (Integer.parseInt(array[i]) % 3 == 0 &&(Integer.parseInt(array[i])!=0) || Integer.parseInt(array[i]) % 9 == 0 &&(Integer.parseInt(array[i])!=0) ) {
                System.out.println(array[i]);
            }
        }
    }
}
