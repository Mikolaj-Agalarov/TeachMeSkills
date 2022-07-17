package Lesson4;
import java.util.Scanner;
import java.util.Arrays;


public class Ex0 {
    public static void main(String[] args) {
        int array[] = {1, 2, 5, 8, 3};
        Scanner scanner = new Scanner(System.in);
        System.out.println("type some int to check");
        int guess = scanner.nextInt();
        // boolean answer = contains(array, guess);
        boolean answer = false;
        for (int n : array)
        {
            if(n==guess)
            {
                answer = true;
                break;
            }
        }

        if (answer)
        {
        System.out.println(guess + " contains inside the array ");
        } else {
            System.out.println(guess + " does not contain inside the array");
        }
}}
