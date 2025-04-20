package aicoach.notification;

public class Notification {
    protected String notificationId;
    protected String message;

    public void send() {
        System.out.println("Notification sent.");
    }
}
//