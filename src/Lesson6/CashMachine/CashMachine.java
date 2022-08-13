package Lesson6.CashMachine;

public class CashMachine {
    private int twenty;
    private int fifty;
    private int hundred;
    private int total = 0;

    public CashMachine(int twenty, int fifty, int hundred)
    {
        this.twenty = twenty;
        this.fifty = fifty;
        this.hundred = hundred;
    }

    void showInfo()
    {
        this.total = (20 * twenty) + (50 * fifty) + (100 * hundred);
        System.out.println("Total amount that left in machine equal = " + total);
    }

    boolean withdraw(int amount)
    {
        if (total >= amount)
        {
            int hundrets = (int) (amount / 100);
            int fifties = (int) (amount  - (hundrets * 100)) / 50;
            int twenties = (int) (amount  - (hundrets * 100) - (fifties * 50)) / 20;
            hundred -= hundrets;
            twenty -= twenties;
            fifty -= fifties;
            boolean isSuccessful = true;
            System.out.println("Withdraw was successful. There is " + hundrets + " hunderets " + fifties + " fifties and " + twenties + " twenties");
            return isSuccessful;
        } else
        {
            boolean  isSuccessful = false;
            System.out.println("total amount of money in cash machine is less than you wish to withdraw");
            return isSuccessful;
        }
    }
    void depositMoney(int amount)
    {
        int hundrets = (int) (amount / 100);
        int fifties = (int) (amount  - (hundrets * 100)) / 50;
        int twenties = (int) (amount  - (hundrets * 100) - (fifties * 50)) / 20;
        hundred += hundrets;
        twenty += twenties;
        fifty += fifties;
        System.out.println("Withdraw was successful. There is " + hundred + " hunderets " + fifty + " fifties and " + twenty + " twenties");
    }

}
