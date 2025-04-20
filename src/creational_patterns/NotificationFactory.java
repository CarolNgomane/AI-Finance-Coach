package creational_patterns;

import aicoach.notification.Notification;
import aicoach.notification.SMSNotification;
import aicoach.notification.EmailNotification;

public abstract class NotificationFactory {
    public abstract Notification createNotification(String id, String message);
}

class SMSNotificationFactory extends NotificationFactory {
    private final String phone;

    public SMSNotificationFactory(String phone) {
        this.phone = phone;
    }

    @Override
    public Notification createNotification(String id, String message) {
        return new SMSNotification(id, message, phone);
    }
}

class EmailNotificationFactory extends NotificationFactory {
    private final String email;

    public EmailNotificationFactory(String email) {
        this.email = email;
    }

    @Override
    public Notification createNotification(String id, String message) {
        return new EmailNotification(id);
    }
}
//
