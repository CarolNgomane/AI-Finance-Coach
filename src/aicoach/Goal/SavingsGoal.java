package aicoach.Goal;

import java.util.Date;

public class SavingsGoal {
    private String goalId;
    private float targetAmount;
    private float currentAmount;
    private Date deadline;

    public SavingsGoal(String goalId, float targetAmount, float currentAmount, Date deadline) {
        this.goalId = goalId;
        this.targetAmount = targetAmount;
        this.currentAmount = currentAmount;
        this.deadline = deadline;
    }

    public SavingsGoal(String goalId, double targetAmount, double deadline) {
    }

    public void updateProgress(float saved) {
        this.currentAmount += saved;
    }

    public void editGoal(float newTarget) {
        this.targetAmount = newTarget;
    }
}
//