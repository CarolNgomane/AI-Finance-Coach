package tests;

//import aicoach.creational_patterns.NotificationFactory;
import aicoach.notification.EmailNotification;
import aicoach.notification.Notification;
import aicoach.notification.SMSNotification;
import creational_patterns.AbstractNotificationFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactoryTest {

    @Test
    void testCreateEmailNotification() {
        AbstractNotificationFactory NotificationFactory = null;
        Notification email = NotificationFactory.createNotification("EMAIL");
        assertTrue(email instanceof EmailNotification);
    }

    @Test
    void testCreateSMSNotification() {
        AbstractNotificationFactory NotificationFactory = null;
        Notification sms = NotificationFactory.createNotification("SMS");
        assertTrue(sms instanceof SMSNotification);
    }

    @Test
    void testCreateInvalidNotificationType() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            AbstractNotificationFactory NotificationFactory = null;
            NotificationFactory.createNotification("INVALID");
        });
        assertEquals("Unknown notification type", exception.getMessage());
    }
}
