package Lesson11;

public class WrongLoginException extends Exception
{
    private String announcement = "ssssss";

    public WrongLoginException(String string)
    {
        this.announcement = string;
    }

    public WrongLoginException() {

    }

    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }
}
