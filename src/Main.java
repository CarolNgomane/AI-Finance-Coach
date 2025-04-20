import aicoach.user.user;
import aicoach.transaction.Transaction;
import aicoach.budget.Budget;
import aicoach.Goal.SavingsGoal;
import aicoach.report.Report;
import aicoach.advisor.AIBudgetAdvisor;
import aicoach.notification.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create a user
        user user = new user("U001", "Carol", "carol@example.com", "securepass123");
        user.login();

        // Record a transaction
        Transaction transaction = new Transaction("T001", new Date(), 150.75f, "Groceries", "Expense");
        transaction.recordTransaction();

        // Create a budget
        Budget budget = new Budget("B001", 5000f, new Date(), new Date());
        budget.createBudget();

        // Set a savings goal
        SavingsGoal goal = new SavingsGoal("G001", 2000f, 500f, new Date());
        goal.updateProgress(250f);

        // Generate reports
        Report report = new Report("R001", new Date(), "PDF");
        report.generatePDF();

        // Use AI advisor
        AIBudgetAdvisor advisor = new AIBudgetAdvisor("v1.0");
        advisor.generateRecommendations();

        // Send notifications
        NotificationSystem notifier = new NotificationSystem();
        notifier.sendAlert();
        notifier.sendWeeklyInsights();

        Notification email = new EmailNotification("carol@example.com");
        email.send();

        Notification sms = new SMSNotification("+1234567890");
        sms.send();

        user.logout();
    }
}