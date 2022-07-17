package Lesson4;
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        boolean isQuantityOk = false;
        int quantity = 0;
        while (!isQuantityOk)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Provide number (n) of elements that you wish to be in array (5 < n <= 10): ");
            int q = scanner.nextInt();
            if (q <= 5 || q > 10) {
                System.out.println("Provided number of elements is out of range. Please repeat.");
            } else {
                quantity = q;
                isQuantityOk = true;
                break;
            }
        }
// Цикл while
        int[] arr = new int[quantity];

        for (int i = 0; i < arr.length; i++)
        {
            int randInt = (int) (Math.random() * 10);
            arr[i] = randInt;
        }
        System.out.println(Arrays.toString(arr));
// Хз как подсчитать количество четных чисел и сразу их записать в массив
        int count = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
            {
                count += 1;
            }
        }
        int[] arr2 = new int[count];

        for (int i = 0, j = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
            {
                arr2[j++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr2));


        }
    }

