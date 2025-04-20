package aicoach.advisor;

public class AIBudgetAdvisor {
    private String modelVersion;

    public AIBudgetAdvisor(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    public void generateRecommendations() {
        System.out.println("Recommendations generated.");
    }

    public void analyzeSpendingPatterns() {
        System.out.println("Spending patterns analyzed.");
    }
}
