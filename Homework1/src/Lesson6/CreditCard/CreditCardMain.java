package Lesson6.CreditCard;

import Lesson6.CreditCard.CreditCard;

public class CreditCardMain {
    public static void main(String[] args)
    {
        CreditCard cardOne = new CreditCard(01, 1000);
        CreditCard cardTwo = new CreditCard(02, 500);
        CreditCard cardThree = new CreditCard(03, 2000);
        cardOne.payIn(101);
        cardTwo.payIn(502);
        cardThree.payOut(299);
        cardOne.showBalance();
        cardTwo.showBalance();
        cardThree.showBalance();
    }
}
