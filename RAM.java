package Lesson6.Computer;

public class RAM {
    private String name;
    private int volume;

    public RAM(String name, int volume)
    {
        this.name = name;
        this.volume = volume;
    }

    public RAM()
    {

    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setVolume(int volume)
    {
        this.volume = volume;
    }

    void showInfo()
    {
        System.out.println("name: " + name + " volume: " + volume);
    }
}
