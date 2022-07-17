package Lesson4;
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide length of array");
        int length = scanner.nextInt();
        int array[] = new int[length];
        for (int i=0; i <= array.length - 1; i++)
        {
            double randD = Math.random() * 10;
            int randI = (int) randD;
            array[i] = randI;
        }
        System.out.println(Arrays.toString(array));
        int min = array[0];
        for (int i=0; i < array.length; i++)
        {
            if (min > array[i])
            {
                min = array[i];
            }
        }
        int max = array[0];
        for (int i=0; i < array.length; i++)
        {
            if (max < array[i])
            {
                max = array[i];
            }
        }
        int sumOfElements = 0;
        for (int i=0; i < array.length; i++)
        {
            sumOfElements += array[i];
        }
        double avg = (double) sumOfElements/array.length;

        System.out.println("Minimal value of array is " + min);
        System.out.println("Maximal value of array is " + max);
        System.out.println("Average value of array is " + avg);
    }
}
