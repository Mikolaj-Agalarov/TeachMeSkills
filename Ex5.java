package Lesson4;
import java.lang.Math;
import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
    int[] arr = new int[7];
    for (int i = 0; i < arr.length; i++)
    {
        int randomInt = (int) (Math.random() * 10);
        arr[i] = randomInt;
//        System.out.println(Arrays.toString(arr));
    }
        System.out.println(Arrays.toString(arr));
    for (int i = 0; i < arr.length; i++)
    {
        if (i % 2 == 0)
        {
            arr[i] = 0;
        }
    }
        System.out.println(Arrays.toString(arr));
    }
}
