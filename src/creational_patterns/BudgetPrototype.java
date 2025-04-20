package creational_patterns;

public class BudgetPrototype {
    private final boolean prototype;

    public BudgetPrototype(boolean budget) {
        this.prototype = budget;
    }

    public boolean cloneBudget() {
        return prototype;
    }
}
//