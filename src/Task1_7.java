import java.util.Scanner;

/**
 * Created by user on 04.06.2017.
 */
public class Task1_7 {
    public static void main(String[] args) {
        //throws IOException {
        System.out.println("Enter numbers:");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] array = inputString.split(" ");
        int max = Integer.parseInt(array[0]);
        int min = Integer.parseInt(array[0]);
        for (int i = 0; i < array.length; i++) {
            if (Integer.parseInt(array[i]) > max)
                max = Integer.parseInt(array[i]);
            else if (Integer.parseInt(array[i]) < min)
                min = Integer.parseInt(array[i]);
        }
        System.out.println("Max number:" + max);
        System.out.println("Min number:" + min);
    }
}
