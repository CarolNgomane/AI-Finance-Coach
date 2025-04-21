package creational_patterns;

public class BudgetPrototype {
    private final boolean prototype;

    public BudgetPrototype(boolean budget) {
        this.prototype = budget;
    }

    public BudgetPrototype(String groceries, int i, boolean prototype) {
        this.prototype = prototype;
    }

    public BudgetPrototype(String groceries, int i) {
        prototype = false;
    }

    public boolean cloneBudget() {
        return prototype;
    }

    public double getCategory() {
        return 0;
    }

    public double getAmount() {
        return 0;
    }

    public Object equals() {
        return null;
    }
}
//