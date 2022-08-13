package Lesson11;

import java.io.IOException;
import java.util.Locale;

public class IdChecker {


    public static void checkAbcSequence(String id) throws NotFoundSequenceException {
        //Проверить содержит ли номер документа последовательность abc и
        //вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью
        if(id.contains("abc")) {
            String idToCheckSequence = id.toLowerCase();
            System.out.println(idToCheckSequence.contains("abc"));
        } else {
            throw new NotFoundSequenceException();
        }
        ;


    }

    public static void check555sequence(String id) throws NotFoundSequenceException {
        //Проверить начинается ли номер документа с последовательности 555
        if(id.startsWith("555"))
        {
            System.out.println(id.startsWith("555"));
        } else
        {
            throw new NotFoundSequenceException();
        }
    }

    public static void check1a2bSequence (String id) throws NotFoundSequenceException {
        //Проверить заканчивается ли номер документа на последовательность 1a2b.
        if(id.endsWith("1a2b"))
        {
            System.out.println(id.endsWith("1a2b"));
        } else
        {
            throw new NotFoundSequenceException();
        }
    }

}


