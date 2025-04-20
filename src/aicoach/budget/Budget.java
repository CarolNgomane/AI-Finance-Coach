package aicoach.budget;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Budget {
    private String budgetId;
    private float totalAmount;
    private Map<String, Float> categoryLimits = new HashMap<>();
    private Date startDate;
    private Date endDate;

    public Budget(String budgetId, float totalAmount, Date startDate, Date endDate) {
        this.budgetId = budgetId;
        this.totalAmount = totalAmount;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void createBudget() {
        System.out.println("Budget created: " + budgetId);
    }

    public void modifyBudget(float newAmount) {
        this.totalAmount = newAmount;
    }
}