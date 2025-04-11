# Domain Model 

This section outlines the domain model for the **AI-Powered Personal Finance Coach** system. It identifies key entities, their attributes, methods, and relationships, and documents the essential business rules that govern the system.

## Key Domain Entities

The system includes the following key entities:
- User
- Expense
- Budget
- Category
- Goal
- Notification
- Report

## Domain Model Overview

| **Entity**   | **Attributes**                                                                 | **Methods (Responsibilities)**                                                                 | **Relationships**                                                                 |
|-------------|----------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------|
| **User**    | userId, name, email, password, phoneNumber, registrationDate                    | register(), login(), updateProfile(), deleteAccount()                                         | Has many Expenses, Budgets, Goals, Notifications, and Reports                      |
| **Expense** | expenseId, userId, categoryId, amount, date, description                        | addExpense(), editExpense(), deleteExpense()                                                  | Belongs to User and Category                                                       |
| **Budget**  | budgetId, userId, categoryId, amount, startDate, endDate                        | createBudget(), updateBudget(), checkBudgetLimit()                                           | Belongs to User and Category                                                       |
| **Category**| categoryId, name, description                                                   | addCategory(), updateCategory(), deleteCategory()                                             | Associated with many Expenses and Budgets                                          |
| **Goal**    | goalId, userId, title, targetAmount, savedAmount, deadline, status             | createGoal(), updateGoal(), trackProgress(), markAsComplete()                                | Belongs to User                                                                    |
| **Notification** | notificationId, userId, message, type, isRead, timestamp                     | sendNotification(), markAsRead()                                                              | Belongs to User                                                                    |
| **Report**  | reportId, userId, startDate, endDate, format (PDF/CSV), createdAt               | generateReport(), exportReport()                                                              | Belongs to User                                                                    |

## Entity Relationships

- **User – Expense:** A user can record multiple expenses.
- **User – Budget:** A user can define multiple budgets.
- **User – Goal:** A user can set multiple financial goals.
- **User – Notification:** A user receives multiple notifications.
- **User – Report:** A user can generate various financial reports.
- **Category – Expense:** Each expense is categorized under a specific category.
- **Category – Budget:** Budgets are created for specific categories.

## Business Rules

| **Rule ID** | **Description** |
|------------|-----------------|
| BR1 | A user must have a unique email address when registering. |
| BR2 | A user can only edit or delete their own expenses and budgets. |
| BR3 | A user can create a maximum of 10 savings goals at a time. |
| BR4 | If spending in a category exceeds the budgeted amount, a notification is triggered. |
| BR5 | A report can only be generated for expenses recorded within the last 12 months. |
| BR6 | A budget must be linked to a category and have a valid date range. |
| BR7 | A goal is considered complete when the saved amount meets or exceeds the target amount. |

This domain model provides a foundational understanding of the core entities, their roles, and how they interact within the AI Finance Coach system. It ensures consistency across development and supports future design and implementation phases.


