import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public static class budget {
    private String budgetId;
    private float totalAmount;
    private Map<String, Float> categoryLimits = new HashMap<>();

    public budget(String budgetId, float totalAmount, Date startDate, Date endDate) {
        this.budgetId = budgetId;
        this.totalAmount = totalAmount;
    }

    public budget(String budgetId) {

    }

    public void createBudget() {
        System.out.println("Budget created: " + budgetId);
    }

    public void modifyBudget(float newAmount) {
        this.totalAmount = newAmount;
    }
}

@Override
public budget clone() {
    budget clone = new budget(this.budgetId);
    clone.categoryLimits = new HashMap<>(this.categoryLimits);
    return clone;
}

private String budgetId;

public void main() {
}

private int categoryLimits;

