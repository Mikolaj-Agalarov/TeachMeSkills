package Lesson11;

public class NotFoundSequenceException extends Exception {
    private String announcement = "";

    public NotFoundSequenceException(String string) {
        this.announcement = string;
    }

    public NotFoundSequenceException() {

    }

    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }
}
