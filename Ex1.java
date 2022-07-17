package Lesson4;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int array[] = {2, 1, 3, 5, 4, 6, 7, 0, 9, 8};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide an integer to remove from array");
        int ask = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] != ask)
            {
                count += 1;
            }
        }

        int[] copy = new int[count];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != ask) {
                copy[j++] = array[i];
            }
        }
        System.out.println(Arrays.toString(copy));

    }
}
