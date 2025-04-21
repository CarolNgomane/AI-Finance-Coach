package tests;

import aicoach.creational_patterns.AbstractNotificationFactory;
import aicoach.notification.Notification;
import aicoach.creational_patterns.EmailNotificationFactory;
import aicoach.creational_patterns.SMSNotificationFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AbstractFactoryTest {

    @Test
    void testEmailNotificationFactoryCreatesEmail() {
        AbstractNotificationFactory factory = new EmailNotificationFactory();
        Notification notification = factory.createNotification("carol@example.com", "Hello");
        assertNotNull(notification);
        assertEquals("carol@example.com", notification.getRecipient());
    }

    @Test
    void testSMSNotificationFactoryCreatesSMS() {
        AbstractNotificationFactory factory = new SMSNotificationFactory();
        Notification notification = factory.createNotification("+1234567890", "Hi there");
        assertNotNull(notification);
        assertEquals("+1234567890", notification.getRecipient());
    }
}
