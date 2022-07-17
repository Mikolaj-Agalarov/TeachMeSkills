package Lesson5;

import java.util.Arrays;
import java.lang.Math;

public class Homework6 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        System.out.println("Source array: ");
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                int randInt = (int) (Math.random() * 10);
                arr[i][j] = randInt;
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("\n");
        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.length; i++)
        {
            Arrays.sort(arr[i]);
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
