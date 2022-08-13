package Lesson6.CashMachine;

public class CashMachineMain {
    public static void main(String[] args) {
        CashMachine bankomat = new CashMachine(10, 10, 10);
        bankomat.showInfo();
        bankomat.withdraw(1070);
        bankomat.showInfo();
        bankomat.depositMoney(10000);
        bankomat.showInfo();
    }
}
