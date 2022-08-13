package Lesson6.CreditCard;

public class CreditCard
{
    private int id;
    private int balance;

    public CreditCard(int id, int balance)
    {
        this.id = id;
        this.balance = balance;
    }

    void showBalance()
    {
        System.out.println("Balance: " + balance + " account id: " + id);
    }

    void payIn(int amount)
    {
        balance += amount;
    }

    void payOut(int amount)
    {
        balance -= amount;
    }
}
