package Lesson5;
import java.util.Arrays;
import java.lang.Math;

public class Homework4 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                int randInt = (int) (Math.random() * 10);
                arr[i][j] = randInt;
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of elements equal to: " +  sum);
    }
}
