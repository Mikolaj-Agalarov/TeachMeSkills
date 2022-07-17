package Lesson5;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Homework1 {
    public static void main(String[] args) {
        int[][][] arr = new int[3][3][3];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                for (int k = 0; k < arr[i][j].length; k++)
                {
                    int randInt = (int) (Math.random() * 10);
                    arr[i][j][k] = randInt;
                }
            }
        }
        System.out.println("Source array: " + Arrays.deepToString(arr));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number by which to increment the contents of the array");
        int incrementFor = scanner.nextInt();
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                for (int k = 0; k < arr[i][j].length; k++)
                {
                    arr[i][j][k] += incrementFor;
                }
            }
        }
        System.out.println("Final Array: " + Arrays.deepToString(arr));

    }
}
