/**
 * Created by user on 04.06.2017.
 */
public class Task1_6 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if ((Integer.parseInt(args[i]) % 2) == 0) {
                System.out.println("Четное: " + args[i]);
            } else {
                System.out.println("Нечетное: " + args[i]);
            }
        }
    }
}
