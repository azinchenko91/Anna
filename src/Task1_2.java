import java.util.Random;
import java.util.Scanner;

/**
 * Created by user on 04.06.2017.
 */
public class Task1_2 {
    public static void main(String[] args) {
        System.out.println("Введите количество случайных чисел:");
        Scanner k = new Scanner(System.in);
        int number = k.nextInt();
        Random random = new Random();
        System.out.println("С переходом на новую строку:");
        for (int i = 0; i < number; i++) {
            int ran = random.nextInt();
            System.out.println(ran);
        }
        System.out.println("Без перехода на новую строку:");
        for (int i = 0; i < number; i++) {
            int ran = random.nextInt();
            System.out.print(" " + ran);
        }
    }
}
