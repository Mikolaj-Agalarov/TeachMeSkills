package Lesson10;
import java.lang.*;
import java.util.Locale;

public class IdChecker {
    // Вывести на экран в одну строку два первых блока по 4 цифры
    public static void fourLetters(String id) {
        System.out.print(id.subSequence(0, 4));
        System.out.println(id.subSequence(9, 13));
    }

    public static void idLetterChanger(String id) {
        //Вывести на экран номер документа, но блоки из трех букв заменить
        int[] indexes = {5, 6, 7, 14, 15, 16};
        char[] idAsArray = id.toCharArray();
        for (int i = 0; i < indexes.length; i++) {
            idAsArray[indexes[i]] = '*';
        }
        String newId = String.valueOf(idAsArray);
        System.out.println(newId);
    }

    public static String showOnlyLetters(String id) {
        //Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре
        String idWithoutInt = id.replaceAll("[^A-Za-z]+", "").toLowerCase(Locale.ROOT);
        StringBuffer stringBufferIdWithoutInt = new StringBuffer(idWithoutInt);
        stringBufferIdWithoutInt.insert(3, "/");
        stringBufferIdWithoutInt.insert(7, "/");
        stringBufferIdWithoutInt.insert(9, "/");
        String stringIdWithoutInt = stringBufferIdWithoutInt.toString();
        return stringIdWithoutInt;
    }

    public static void showOnlyLettersWithStringBuilder(String id) {
        //Вывести на экран буквы из номера документа в формате
        //"Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder).
        String ID = id;
        String stringIdWithoutInt = IdChecker.showOnlyLetters(ID);
        StringBuilder sBuilder = new StringBuilder("Letters:");
        String stringForBuilder = stringIdWithoutInt.toUpperCase();
        sBuilder.append(stringForBuilder);
        System.out.println(sBuilder);
    }

    public static void checkAbcSequence(String id){
        //Проверить содержит ли номер документа последовательность abc и
        //вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью
        String idToCheckSequence  = id.toLowerCase();
        System.out.println(idToCheckSequence.contains("abc"));
    }

    public static void check555sequence(String id){
        //Проверить начинается ли номер документа с последовательности 555
        System.out.println(id.startsWith("555"));
    }

    public static void check1a2bSequence (String id){
        //Проверить заканчивается ли номер документа на последовательность 1a2b.
        System.out.println(id.endsWith("1a2b"));
    }

}


