package tests;

//import aicoach.creational_patterns.DatabaseConnection;

import creational_patterns.DatabaseConnection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class SingletonTest {

    @Test
    void testSingletonSameInstance() {
        DatabaseConnection instance1 = DatabaseConnection.getInstance();
        DatabaseConnection instance2 = DatabaseConnection.getInstance();

        assertSame(instance1, instance2);
    }

    @Test
    void testSingletonNotNull() {
        assertNotNull(DatabaseConnection.getInstance());
    }
}