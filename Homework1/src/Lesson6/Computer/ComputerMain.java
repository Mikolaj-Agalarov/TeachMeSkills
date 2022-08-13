package Lesson6.Computer;

public class ComputerMain {
    public static void main(String[] args) {
        Computer computer = new Computer("Supercomputer", 1000);
        computer.showInfo();
        Computer computer2 = new Computer("Supercomputer2", 1000, "rAM", 100, "hDD", 200, true);
        computer2.showInfo();
    }
}
