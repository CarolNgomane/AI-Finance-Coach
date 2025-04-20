package creational_patterns;

import aicoach.Goal.SavingsGoal;

public class SavingsGoalBuilder {
    private String goalId;
    private double targetAmount;
    private double deadline;

    public SavingsGoalBuilder setGoalId(String goalId) {
        this.goalId = goalId;
        return this;
    }
//savings

    public SavingsGoalBuilder setTargetAmount(double targetAmount) {
        this.targetAmount = targetAmount;
        return this;
    }

    public SavingsGoalBuilder setDeadline(double deadline) {
        this.deadline = deadline;
        return this;
    }

    public SavingsGoal build() {
        return new SavingsGoal(goalId, targetAmount, deadline);
    }
}
