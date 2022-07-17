package Lesson5;

import java.util.Arrays;
import java.lang.Math;

public class Homework5 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
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
        System.out.println("Left-right diagonal");
        for (int i = 0, j = 0; i < arr.length; i++)
        {
            System.out.print(arr[i][j] + " ");
            j++;
        }
        System.out.println("\n");
        System.out.println("Right-left diagonal");
        for (int i = 0, j = arr.length-1; i < arr.length; i++)
        {
            System.out.print(arr[i][j] + " ");
            j--;
        }

    }
}
