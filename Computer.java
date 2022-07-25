package Lesson6.Computer;

public class Computer {
    private int price;
    private String model;
    private RAM ram;
    private HDD hdd;

    public Computer(String model, int price)
    {
        this.model = model;
        this.price = price;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public Computer(String model, int price, String nameRam, int volumeRam, String nameHdd, int volumeHdd,
                    boolean typeHdd)
    {
        this.model = model;
        this.price = price;
        this.ram = new RAM(nameRam, volumeRam);
        this.hdd = new HDD(nameHdd, volumeHdd, typeHdd);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    void showInfo()
    {
        System.out.println("name: " +  model + " price: " + price);
        ram.showInfo();
        hdd.showInfo();
    }
}
