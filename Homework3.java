package Lesson5;
import java.lang.Math;
import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        int[][] arrOne = new int[3][3];
        int[][] arrTwo = new int[3][3];
        // заполняем два массива случайными числами и выводим их на экран

        for (int i = 0; i < arrOne.length; i++)
        {
            for (int j = 0; j < arrOne[i].length; j++)
            {
                int randInt = (int) (Math.random() * 10);
                arrOne[i][j] = randInt;
            }
            System.out.println(Arrays.toString(arrOne[i]));
        }
        System.out.println("\n");

        for (int i = 0; i < arrTwo.length; i++)
        {
            for (int j = 0; j < arrTwo[i].length; j++)
            {
                int randInt = (int) (Math.random() * 10);
                arrTwo[i][j] = randInt;
            }
            System.out.println(Arrays.toString(arrTwo[i]));
        }

        int[][] finalArr = new int[3][3];
        System.out.println("\n");

        // перемножаем массивы

        for (int i = 0; i < finalArr.length; i++)
        {
            int finalInt = 0;

            for (int j = 0; j < finalArr[i].length; j++)
            {
                int IntegerOfRow = arrOne[i][j];
                int IntegerOfColumn = arrTwo[j][i];
                finalInt += (IntegerOfRow * IntegerOfColumn);
            }
//            finalArr[i][j] = finalInt;

        }
        System.out.println(Arrays.deepToString(finalArr));

        }


        // (arrOne[j][i] * ArrTwo[j][i]) + (ArrOne)

    }

