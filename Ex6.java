package Lesson4;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Ex6 {
    public static void main(String[] args) {
        // Пользователь задаёт количество имён в массиве
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of names ");
        int quantity = scanner.nextInt();
        String[] names = new String[quantity];
        // Программа генерирует случайной длинны слова из случайных символов и преобразует получившееся слово в заглавное.
        String name = "";
        for (int i = 0; i < names.length; i++)
        {
            name = "";
            int numberOfLettersInName = (int) (Math.random() * 10);
            while (numberOfLettersInName <= 1)
            {
                numberOfLettersInName = (int) (Math.random() * 10);
            }
            for ( int j = 0; j < numberOfLettersInName; j++)
            {
                Random random = new Random();
                char randomizedCharacter = (char) (random.nextInt(26) + 'a');
                String randomCharString = "" + randomizedCharacter;
                name += randomCharString;
            }
            String nameCapitalized = name.substring(0, 1).toUpperCase() + name.substring(1);
            names[i] = nameCapitalized;

        }
        // Сортировка массива
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }
}
