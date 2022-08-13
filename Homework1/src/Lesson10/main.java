package Lesson10;

public class main {
    public static void main(String[] args) {
        String id = "1111-ABC-2222-ABC-3c4v";
        IdChecker.showOnlyLettersWithStringBuilder(id);

        String string = "Hello";
        StringChecker.findShortestWord(string);

        System.out.println(StringChecker.characterDifferenceMinimal(string));
//        System.out.println(StringChecker.isTheWordPalindrome(string));
        System.out.println(StringChecker.duplicateCharactersOfWord(string));
    }
}
