package Lesson14;

public class ReverseOrFactorial implements MyFunctionForClass {
    @Override
    public Object test(int value, Object thing) {
        if (value == 1) {
            String stringToReverse = (String) thing;
            String reversedString = "";
            for (int i=0; i<stringToReverse.length(); i++)
            {
                char ch = stringToReverse.charAt(i);
                reversedString = ch + reversedString;
            }
            return reversedString;
        } else if (value == 2) {
            int integerToFactorial = (int) thing;
            int factorialOfInteger = 1;
            for(int i = 1; i <= integerToFactorial; i++) {
                factorialOfInteger = factorialOfInteger *i ;
            }
            return factorialOfInteger;
        }
        return null;
    }
}
