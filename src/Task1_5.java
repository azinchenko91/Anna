/**
 * Created by user on 04.06.2017.
 */
public class Task1_5 {
    public static void main(String[] args) {
        int sum = 0;
        int multiplication = 1;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
            multiplication *= Integer.parseInt(args[i]);
        }
        System.out.println(sum);
        System.out.println(multiplication);
    }
}
