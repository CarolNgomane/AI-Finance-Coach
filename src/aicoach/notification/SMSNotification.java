package aicoach.notification;

public class SMSNotification extends Notification {
    private String phoneNumber;

    public SMSNotification(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send() {
        System.out.println("SMS sent to: " + phoneNumber);
    }
}