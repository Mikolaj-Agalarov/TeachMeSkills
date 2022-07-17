package Lesson5;
import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        String[][] line = new String[8][8];
        for (int i = 0; i < line.length; i++)
        {
            for (int j = 0; j < line[i].length; j++)
            {
                if (i % 2 != 0)
                {
                    if (j % 2 != 0)
                    {
                        line[i][j] = "W";
                    } else {
                        line[i][j] = "B";
                    }
                } else {
                    if (j % 2 != 0)
                    {
                        line[i][j] = "B";
                    } else {
                        line[i][j] = "W";
                    }
                }

            }
            // Не знаю как убрать запятые и скобки кроме как реплейсать каждую.
            System.out.println(Arrays.toString(line[i]));
        }



    }
}
