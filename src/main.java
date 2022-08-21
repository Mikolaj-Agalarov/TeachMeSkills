package Lesson14;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import static java.time.DayOfWeek.TUESDAY;
import static java.time.temporal.TemporalAdjusters.next;

public class main {
    public static void main(String[] args) throws ParseException {
        //Написать программу для вывода на консоль названия дня недели по
        //введенной дате.
        String date = "30/8/2022";
        SimpleDateFormat day = new SimpleDateFormat("dd/M/yyyy");
        Date dt1 = day.parse(date);
        DateFormat format2 = new SimpleDateFormat("EEEE");
        System.out.println(format2.format(dt1));

        //Написать программу для вывода на экран дату следующего вторника.
        LocalDate nextTue = LocalDate.now().with(next(TUESDAY));
        System.out.println(nextTue);

//      Проверка функционального интерфейса при помощи объекта созданного класса
        ReverseOrFactorial objectToChange = new ReverseOrFactorial();
        System.out.println(objectToChange.test(1,"hello"));
        System.out.println(objectToChange.test(2, 5));
        
//      Попытка реализации интерфейса через лямбду, а не через объект класса
        MyFunctionForLambda lambda = (thing) -> {
            String stringToReverse = (String) thing;
            String reversedString = "";
            for (int i=0; i<stringToReverse.length(); i++)
            {
                char ch = stringToReverse.charAt(i);
                reversedString = ch + reversedString;
            }
            System.out.println(reversedString);
            return reversedString;
        };

        // к сожалению не понял как реализовать при помощи лямбды

    }

}
