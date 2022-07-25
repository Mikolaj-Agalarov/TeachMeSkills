package Lesson6.Computer;

public class HDD {
    private String name;
    private int volume;
    private boolean type;

    public HDD(String name, int volume, boolean type)
    {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    public HDD()
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

    public void setType(boolean type)
    {
        this.type = type;
    }

    void showInfo()
    {
        if (type)
        {
            System.out.println("name: " + name + " volume: " + volume + " type: " + "internal");
        } else
        {
            System.out.println("name: " + name + " volume: " + volume + " type: " + "external");
        }
    }
}
