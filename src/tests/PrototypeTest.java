package tests;

//import aicoach.creational_patterns.BudgetPrototype;

import creational_patterns.BudgetPrototype;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class PrototypeTest {

    @Test
    void testPrototypeCloning() {
        BudgetPrototype original = new BudgetPrototype("Groceries", 500);
        BudgetPrototype clone = (BudgetPrototype) original.equals();

        assertEquals(original.getCategory(), clone.getCategory());
        assertEquals(original.getAmount(), clone.getAmount());
    }

    @Test
    void testPrototypeWithZeroAmount() {
        BudgetPrototype prototype = new BudgetPrototype("Emergency", 0);
        BudgetPrototype clone = (BudgetPrototype) prototype.equals();

        assertEquals(0, clone.getAmount());
    }
}
