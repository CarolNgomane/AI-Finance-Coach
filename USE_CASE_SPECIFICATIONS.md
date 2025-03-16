
## Use Case Specifications
## Use Cases

The **Use Case Diagram** provides a high-level overview of the interactions between users and the AI Finance Coach system. It visually represents how different actors engage with key system functionalities, outlining the relationships between users, system components, and core financial management features. This diagram serves as a foundation for understanding system behavior and guiding the development of functional components.

### Key Actors and Their Roles

1. **User** – Registers, logs in, tracks expenses, sets budgets.

2. **Admin** – Manages users, system configurations, and financial settings.

3. **AI Engine** – Analyzes spending data and generates financial insights.

4. **Notification System** – Sends alerts to users about budget limits and recommendations.

5. **Report Generator** – Generates financial reports for users.

6. **Database System** – Stores user transactions, budget data, and reports.

## Use Cases

1. **Register & Authenticate** – Users register and log in securely.

2. **Track Expenses** – Users manually input income and expenses.

3. **Create & Manage Budgets** – Users set and modify monthly budgets.

4. **Receive AI Budget Recommendations** – AI suggests optimized spending plans.

5. **Set Savings Goals** – Users define and track savings objectives.

6. **Receive Notifications** – System sends alerts for budget limits and financial insights.

7. **View Financial Dashboard** – Users access a real-time financial summary.

8. **Generate Financial Reports** – Users export financial summaries in CSV/PDF formats.


### Relationships Between Actors and Use Cases

- User interacts with all primary financial functions.

- Admin manages system settings but does not engage in personal finance tasks.

- AI Engine is linked to Budget Recommendations and Spending Insights use cases.

- Notification System is associated with alerts when budgets exceed limits.

- Report Generator provides users with downloadable reports.

- Database System stores and retrieves financial data for the system.

![Untitled diagram-2025-03-14-131046](https://github.com/user-attachments/assets/563df7d9-9bde-4bf9-9a88-dd8e58a00f9f)



## Addressing Stakeholder Concerns

This use case diagram ensures that:

- Users can efficiently manage their finances through intuitive tracking, budgeting, and reporting features.

- AI Engine provides intelligent insights to improve financial habits.

- Admins oversee system operations and ensure smooth functionality.

- Automated Notifications help prevent overspending by alerting users.

- Regulatory Compliance is maintained by storing financial data securely in the Database System


## Use Case Specifications
The **Use Case Specifications** document defines the detailed steps and conditions for each system functionality. It helps developers, testers, and stakeholders understand how the AI Finance Coach system behaves in different scenarios and how users interact with it. Each use case includes actors, preconditions, postconditions, and flow descriptions to ensure a structured approach to development and validation.

### Use Case 1: Register & Authenticate
**Description:** Users register and log in securely.  
**Actors:** User, System  
**Preconditions:** User must have a valid email or social media account.  
**Postconditions:** User is authenticated and redirected to the dashboard.  
**Basic Flow:**  
1. User enters email and password.  
2. System verifies credentials.  
3. User gains access to the dashboard.  
**Alternative Flow:**  
- If credentials are incorrect, the system displays an error message.  

### Use Case 2: Track Expenses
**Description:** Users manually input income and expenses.  
**Actors:** User, System  
**Preconditions:** User must be logged in.  
**Postconditions:** Transaction is recorded in the database.  
**Basic Flow:**  
1. User selects "Add Expense."  
2. User enters transaction details.  
3. System categorizes and saves the entry.  
**Alternative Flow:**  
- If required fields are missing, an error message is displayed.  

### Use Case 3: Create & Manage Budgets
**Description:** Users create, modify, and manage monthly budgets.  
**Actors:** User, System  
**Preconditions:** User is logged in.  
**Postconditions:** Budget is saved and linked to spending categories.  
**Basic Flow:**  
1. User selects "Create Budget."  
2. User enters budget details.  
3. System saves and links the budget.  
**Alternative Flow:**  
- If budget allocation exceeds income, the system warns the user.  

### Use Case 4: AI-Powered Budget Recommendations
**Description:** The system analyzes spending patterns and suggests optimized budget plans.  
**Actors:** User, AI Engine, System  
**Preconditions:** User must have past expense data recorded.  
**Postconditions:** A budget recommendation is displayed.  
**Basic Flow:**  
1. AI Engine reviews spending history.  
2. System generates recommended budgets.  
3. User reviews and applies the budget.  
**Alternative Flow:**  
- If insufficient data exists, the system notifies the user.  

### Use Case 5: Set Savings Goals
**Description:** Users define and track their savings objectives.  
**Actors:** User, System  
**Preconditions:** User must have a linked financial account or input income manually.  
**Postconditions:** Savings goal progress is tracked.  
**Basic Flow:**  
1. User selects "Set Savings Goal."  
2. User defines goal amount and timeframe.  
3. System tracks progress.  
**Alternative Flow:**  
- If income is insufficient, the system suggests adjusting the goal.  

### Use Case 6: Receive Notifications
**Description:** Users receive alerts for budget limits and financial insights.  
**Actors:** User, Notification System  
**Preconditions:** User must have active budgets and spending data.  
**Postconditions:** Notifications are delivered to the user.  
**Basic Flow:**  
1. System monitors budget usage.  
2. If spending exceeds 80% of the budget, a notification is sent.  
**Alternative Flow:**  
- If notifications are disabled, alerts are logged in the user’s dashboard.  

### Use Case 7: View Financial Dashboard
**Description:** Users access a real-time summary of their financial health.  
**Actors:** User, System  
**Preconditions:** User must be logged in.  
**Postconditions:** Dashboard displays financial insights.  
**Basic Flow:**  
1. User selects "Dashboard."  
2. System retrieves and displays financial data.  
**Alternative Flow:**  
- If no financial data exists, the system prompts the user to enter transactions.  

### Use Case 8: Generate Financial Reports
**Description:** Users export financial summaries in CSV/PDF.  
**Actors:** User, Report Generator  
**Preconditions:** User must have recorded financial transactions.  
**Postconditions:** A report is generated and downloaded.  
**Basic Flow:**  
1. User selects "Generate Report."  
2. User chooses format (CSV/PDF).  
3. System processes and generates the file.  
**Alternative Flow:**  
- If no data exists, the system notifies the user.





