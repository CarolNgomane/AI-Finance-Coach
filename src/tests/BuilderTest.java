package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import creational_patterns.SavingsGoalBuilder;
import Goal.SavingsGoal;

public class BuilderTest {

    @Test
    void testBuilderCreatesGoal() {
        tests.SavingsGoal goal = new SavingsGoalBuilder()
                .setGoalName("vacation")
                .setTargetAmount(1500)
                .setDeadline("2025-12-31")
                .build();

        assertEquals("vacation", goal.getGoalName());
        assertEquals(1500, goal.getTargetAmount());
    }

    @Test
    void testBuilderWithInvalidAmount() {
        assertThrows(IllegalArgumentException.class, () -> {
            new SavingsGoalBuilder().setTargetAmount(-100);
        });
    }
}

