package Lesson4;
import java.lang.Math;
import java.util.Arrays;


public class Ex3 {
    public static void main(String[] args) {
        int arr1[] = new int[5];
        int arr2[] = new int[5];
        for (int i = 0; i < arr1.length; i++)
        {
            double randD = Math.random() * 10;
            int randI = (int) randD;
            arr1[i] = randI;
        }
        for (int i = 0; i < arr1.length; i++)
        {
            double randD = Math.random() * 10;
            int randI = (int) randD;
            arr2[i] = randI;
        }
        System.out.println("First array: " + Arrays.toString(arr1));
        System.out.println("Second array: " + Arrays.toString(arr2));

        int sumOfArr1 = 0;
        for (int i = 0; i < arr1.length; i++)
        {
            sumOfArr1 += arr1[i];
        }
        double avgArr1 = (double) sumOfArr1/5;

        int sumOfArr2 = 0;
        for (int i = 0; i < arr2.length; i++)
        {
            sumOfArr2 += arr2[i];
        }
        double avgArr2 = (double) sumOfArr2/5;

        if (avgArr1 > avgArr2)
        {
            System.out.println("Average of first array is equal to " + avgArr1 + " and it's more than average of second array " + avgArr2);
        } else if (avgArr1 < avgArr2)
        {
            System.out.println("Average of second array is equal to " + avgArr2 + " and it's more than average of first array " + avgArr1);
        } else if (avgArr1 == avgArr2)
        {
            System.out.println("Average of both arrays are the same and equals to" + avgArr2);
        }
    }
}
