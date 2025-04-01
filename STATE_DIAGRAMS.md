# Object State Modeling with State Transition Diagrams

This document presents state transition diagrams for critical objects in the AI Finance Coach system, ensuring alignment with functional requirements and use cases.

## 1. User Account State Model

### Key States and Transitions:
- **Registered**: User has signed up but not verified.
- **Verified**: User confirms registration via email/social login.
- **Active**: User logs in and accesses system features.
- **Suspended**: Admin disables the user due to policy violations.
- **Deleted**: User deletes the account, and data is removed.

![dgrm1](https://github.com/user-attachments/assets/6960d851-96c1-410c-ac30-0be2002f9379)

**Mapping to Requirements:**
- Supports secure **user registration and authentication**.
- Ensures **security compliance** with email verification and admin control.

## 2. Expense Transaction State Model

### Key States and Transitions:
- **Draft**: User starts adding an expense but hasn't saved it.
- **Saved**: Expense is recorded but not categorized.
- **Categorized**: System assigns an expense category.
- **Reviewed**: AI suggests optimizations; user confirms.
- **Deleted**: User removes the expense entry.

![dgrm2](https://github.com/user-attachments/assets/23391c08-8064-42fc-9209-d65ec31e73d9)


**Mapping to Requirements:**
- Enables **expense tracking** with manual input and AI-driven categorization.
- Provides **AI-powered spending insights** for financial recommendations.

## 3. Budget State Model

### Key States and Transitions:
- **Created**: User sets a budget.
- **Active**: Budget is applied to expenses.
- **Exceeded**: Spending surpasses budget limit.
- **Adjusted**: User modifies the budget amount.
- **Archived**: Past budgets stored for reports.


![dgrm3](https://github.com/user-attachments/assets/94e002a2-2ed5-46b4-befd-d5e394603221)

**Mapping to Requirements:**
- Supports **budget creation and management**.
- Triggers **smart alerts and notifications** when limits are exceeded.

## 4. Savings Goal State Model

### Key States and Transitions:
- **Defined**: User sets a savings target.
- **Tracking**: System monitors progress.
- **Achieved**: User reaches the savings goal.
- **Adjusted**: User modifies the goal amount.
- **Canceled**: User deletes the goal.

![dgrm4](https://github.com/user-attachments/assets/d1980791-2afc-4e1f-9133-c14275465261)


**Mapping to Requirements:**
- Enables **savings goals tracking** with progress monitoring.
- Provides **AI-powered insights** for achieving savings efficiently.

## 5. Financial Report State Model

### Key States and Transitions:
- **Requested**: User selects report type (CSV/PDF).
- **Generating**: System compiles data.
- **Ready**: Report is available for download.
- **Downloaded**: User accesses the report.

![dgrm5](https://github.com/user-attachments/assets/3b8d55a8-61d6-4d48-9c95-8bdf79714dd0)


**Mapping to Requirements:**
- Supports **data export and reporting** for financial summaries.
- Ensures **quick performance** in generating reports.

## 6. Notification State Model

### Key States and Transitions:
- **Triggered**: Event occurs (budget exceeded, new insights available).
- **Queued**: Notification is pending for delivery.
- **Sent**: User receives notification.
- **Acknowledged**: User reads the message.
- **Archived**: Notification stored for history.

![dgrm6](https://github.com/user-attachments/assets/c02a62b6-3429-432b-8f74-ce17fb3144bc)


**Mapping to Requirements:**
- Provides **smart alerts and notifications** for timely user updates.

## 7. AI Budget Recommendation State Model

### Key States and Transitions:
- **Analyzing**: AI reviews past expenses.
- **Suggested**: System provides a budget plan.
- **Applied**: User accepts the recommendation.
- **Ignored**: User dismisses the suggestion.

![dgrm7](https://github.com/user-attachments/assets/5658f30a-45e6-4b01-bb82-e76d6ed629d5)

**Mapping to Requirements:**
- Provides **AI-powered budget recommendations** to enhance financial decisions.

## Conclusion
These state transition diagrams provide a clear visualization of object lifecycles in the AI Finance Coach system, ensuring alignment with functional requirements such as **account management, budg
