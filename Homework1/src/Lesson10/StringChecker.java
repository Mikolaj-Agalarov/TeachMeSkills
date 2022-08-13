package Lesson10;

import java.util.Arrays;
import java.util.Scanner;

public class StringChecker {
    public static String findShortestWord(String string){
        String[] stringArray = string.split(" ");
        String smallest = stringArray[0];
        for (int i = 0; i < stringArray.length; i++){
            if (stringArray[i].length() < smallest.length()) {
                smallest = stringArray[i];
            }
        }
        return smallest;
    }

    public static String findTallestWord(String string){
        String[] strings = string.split(" ");
        System.out.println(Arrays.deepToString(strings));
        String tallest = strings[0];
        for (int i = 0; i < strings.length; i++){
            if (strings[i].length() > tallest.length()) {
                tallest = strings[i];
            }
        }
        return tallest;
    }

    public static String characterDifferenceMinimal(String string){
        String[] strings = string.split(" ");
        int[] arrayOfDifferentCharacters = new int[strings.length];
        for (int i = 0; i < strings.length; i++){
            char[] charactersOfWord = strings[i].toCharArray();
            int numberOfDifferentCharactersInWord = 0;

            for (int j = 0; j < charactersOfWord.length; j++){
                if (j < charactersOfWord.length - 1) {
                    String characterAsString = Character.toString(charactersOfWord[j]);
                    String nextCharacterAsString = Character.toString(charactersOfWord[j + 1]);
                    if (characterAsString.equals(nextCharacterAsString)) {
                        numberOfDifferentCharactersInWord++;
                    }
                }
            }
            arrayOfDifferentCharacters[i] = numberOfDifferentCharactersInWord;
        }
        int index = 0;
        for (int i = 0; i < strings.length; i++){
            if (arrayOfDifferentCharacters[i] > index){
                index = i;
            }
        }
        return strings[index];
    }

    public static boolean isTheWordPalindrome(String string){
        String[] arrayOfStrings = string.split(" ");
        boolean check = false;
        String chosenWord = "";

        while (!check){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Provide the index of word you want to check for palindroism");
            int index = scanner.nextInt();
            if (index >= arrayOfStrings.length) {
                System.out.println("Index is out of range, provide another integer");
            } else {
                check = true;
                chosenWord = arrayOfStrings[index];
            }
        }
        StringBuilder wordStringBuilder = new StringBuilder(chosenWord);
        wordStringBuilder.reverse();
        String reversedWord = wordStringBuilder.toString();
        if (chosenWord.equals(reversedWord)){
            return true;
        } else {
            return false;
        }

    }

    public static StringBuilder duplicateCharactersOfWord(String string){
        char[] characterizedString = string.toCharArray();
        StringBuilder stringBuilded = new StringBuilder();
        for (int i = 0; i < characterizedString.length; i++){
            stringBuilded.append(characterizedString[i]);
            stringBuilded.append(characterizedString[i]);

        }
        return stringBuilded;
    }
}



