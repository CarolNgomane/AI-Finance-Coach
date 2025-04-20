package aicoach.notification;
//
public class EmailNotification extends Notification {
    private String email;

    public EmailNotification(String email) {
        this.email = email;
    }

    @Override
    public void send() {
        System.out.println("Email sent to: " + email);
    }
}