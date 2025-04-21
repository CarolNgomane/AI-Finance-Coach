package creational_patterns;

import aicoach.notification.*;
import aicoach.notification.SMSNotification;
import aicoach.notification.EmailNotification;

public interface AbstractNotificationFactory {
    Notification createNotification(String id);
}

class ConcreteSMSFactory implements AbstractNotificationFactory {
    private final String phone;

    public ConcreteSMSFactory(String phone) {
        this.phone = phone;
    }

    @Override
    public Notification createNotification(String id) {
        return new SMSNotification(id, message, phone);
    }
}

class ConcreteEmailFactory implements AbstractNotificationFactory {
    private final String email;

    public ConcreteEmailFactory(String email) {
        this.email = email;
    }

    @Override
    public Notification createNotification(String id) {
        return new EmailNotification(id);
    }
}
//