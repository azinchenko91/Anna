package HomeWork2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

/**
 * Created by user on 06.06.2017.
 */
//public class Task1_1 {
//    public static void main(String[] args) {
//        System.out.println("Enter numbers:");
//        Scanner scaner = new Scanner(System.in);
//        String input = scaner.nextLine();
//        String[] array = input.split(" ");
//        int max = 1;
//        int min = 1;
//        String maxNumber = null;
//        String minNumber = null;
//
//        for (int i = 0; i < array.length; i++) {
//            if (max < array[i].length()) {
//                max = array[i].length();
//                maxNumber = array[i];
//            } else if (min > array[i].length()) {
//                min = array[i].length();
//                minNumber = array[i];
//            }
//        }
//
//        System.out.println( "Max number = " +  maxNumber + " " + "with amount of digits" + max);
//        System.out.println("Min number = " + minNumber + " " + "with amount of digits" + min);
//    }
//}

public class Task1_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        TreeSet<Integer>treeSet = new TreeSet<>();
        String[] array = string.split(" ");
        for (int i = 0; i < array.length; i++)
        {
            treeSet.add(Integer.parseInt(array[i]));
        }
        System.out.println(treeSet);
        System.out.println("Min number " + treeSet.first() + " with amount of digits " + treeSet.first().toString().length());
        System.out.println("Max number " + treeSet.last() + " with amount of digits " + treeSet.last().toString().length());
    }
}