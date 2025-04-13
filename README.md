
# AI-Powered Personal Finance Coach

# Overview
The **AI-Powered Personal Finance Coach** is an intelligent financial management system that helps users track their spending, set budgets, and receive AI-driven financial recommendations to optimize savings and avoid overspending.

# Features
✔ **Automatic Transaction Categorization**: Uses AI to classify transactions into spending categories.

✔ **Personalized Budget Recommendations**: Analyzes spending patterns and suggests optimized budgets.

✔ **AI-Powered Financial Insights**: Provides real-time financial health analysis and suggestions.

✔ **Goal Tracking for Savings**: Allows users to set financial goals and monitor progress.

✔ **Secure Authentication**: Ensures data privacy with multi-factor authentication.

✔ **Real-Time Notifications**: Alerts users when they approach budget limits.


 
# Usage Guide
1. **Register/Login** using an email or social media.
2. **Input Transactions** manually or connect a bank account.
3. **Set Budgets** for different spending categories.
4. **Track Savings** and get AI recommendations.

# Architecture
- **Backend**: Node.js with Express.js
- **Frontend**: React.js
- **Database**: PostgreSQL
- **AI/ML**: TensorFlow for financial insights

# Project Files
### SPECIFICATION- System specification document

[SPECIFICATION.md](https://github.com/CarolNgomane/AI-Finance-Coach/blob/main/SPECIFICATION.md?plain=1)

### ARCHITECTURE - C4 diagrams and system architecture
[ARCHITECTURE.md](https://github.com/CarolNgomane/AI-Finance-Coach/blob/main/ARCHITECTURE.md)

### SYSTEM REQUIREMENTS
[SYSTEM REQUIREMENTS DOCUMATATION](https://github.com/CarolNgomane/AI-Finance-Coach/blob/main/SYSTEM_REQUIREMENTS.md)
  
### ACTIVITY_WORKFLOWS
[ACTIVITY_WORKFLOWS.md](https://github.com/CarolNgomane/AI-Finance-Coach/blob/main/ACTIVITY_WORKFLOWS.md)
  
### STATE DIAGRAMS.
[STATE_DIAGRAMS.md](https://github.com/CarolNgomane/AI-Finance-Coach/blob/main/STATE_DIAGRAMS.md)

### DOMAIN MODEL.
[DomainModel.md](https://github.com/CarolNgomane/AI-Finance-Coach/blob/main/DomainModel.md)

### CLASSDIAGRAM
[ClassDiagram.md](https://github.com/CarolNgomane/AI-Finance-Coach/blob/main/ClassDiagram.md)

### REFLECTION

[REFLECTION.md](https://github.com/CarolNgomane/AI-Finance-Coach/blob/main/REFLECTION.md)


# Traceability
- **Functional Requirements**:[SYSTEM_REQUIREMENTS.md](https://github.com/CarolNgomane/AI-Finance-Coach/blob/main/SYSTEM_REQUIREMENTS.md)
- **User Stories & Sprints**: [USE_CASE_SPECIFICATIONS.md](https://github.com/CarolNgomane/AI-Finance-Coach/blob/main/USE_CASE_SPECIFICATIONS.md)

## Integration with Prior Work

### 1. Mapping to Functional Requirements (Assignment 4)
Each activity workflow aligns with the functional requirements:

| Activity Workflow | Related Functional Requirement |
|-------------------|--------------------------------|
| **User Registration & Authentication** | Users must register, authenticate, and receive confirmation emails. |
| **Track Expenses** | Users manually input and categorize expenses. |
| **Budget Creation & Management** | Users create and allocate budget amounts per category. |
| **AI-Powered Budget Recommendations** | AI suggests budget optimizations based on user spending. |
| **Set Savings Goals** | Users define and track financial goals. |
| **Receive Notifications** | System sends alerts when spending limits are reached. |
| **View Financial Dashboard** | Users access real-time financial summaries. |
| **Generate Financial Reports** | Users export reports in CSV and PDF formats. |

### 2. Mapping to User Stories and Sprint Tasks (Assignment 6)
The workflows also align with user stories and agile sprint tasks:

| Activity Workflow | Related User Story | Sprint Task |
|-------------------|-------------------|------------|
| **User Registration & Authentication** | "As a user, I want to sign up securely so that I can access my account safely." | Implement authentication with email confirmation and MFA. |
| **Track Expenses** | "As a user, I want to log my expenses so that I can track my financial activity." | Develop expense input form with category selection. |
| **Budget Creation & Management** | "As a user, I want to set budgets for different categories so that I can manage my finances." | Create budget entry UI and integrate with spending tracker. |
| **AI-Powered Budget Recommendations** | "As a user, I want AI recommendations for budgeting so that I can optimize my spending." | Implement AI-based budget analysis engine. |
| **Set Savings Goals** | "As a user, I want to set savings goals so that I can plan for future expenses." | Develop savings goal tracking module. |
| **Receive Notifications** | "As a user, I want to receive alerts when I exceed my budget so that I can stay on track." | Implement real-time budget alert system. |
| **View Financial Dashboard** | "As a user, I want to view my financial overview so that I can understand my spending habits." | Design and develop financial dashboard UI. |
| **Generate Financial Reports** | "As a user, I want to export my financial data so that I can analyze it later." | Implement report generation in CSV and PDF formats. |






# MERMAID DIAGRAM

![Untitled diagram-2025-03-14-130939](https://github.com/user-attachments/assets/1c944bcb-b1cf-44ed-baa3-6f421d30725a)

## Key Actors and Their Roles
1. **User** – Registers, logs in, tracks expenses, sets budgets.
2. **Admin** – Manages users, system configurations, and financial settings.
3. **AI Engine** – Analyzes spending data and generates financial insights.
4. **Notification System** – Sends alerts to users about budget limits and recommendations.
5. **Report Generator** – Generates financial reports for users.
6. **Database System** – Stores user transactions, budget data, and reports.

**Use Cases**
- Register & Authenticate – Users register and log in securely.
- Track Expenses – Users manually input income and expenses.
- Create & Manage Budgets – Users set and modify monthly budgets.
- Receive AI Budget Recommendations – AI suggests optimized spending plans.
- Set Savings Goals – Users define and track savings objectives.
- Receive Notifications – System sends alerts for budget limits and financial insights.
- View Financial Dashboard – Users access a real-time financial summary.
- Generate Financial Reports – Users export financial summaries in CSV/PDF formats.

# PROJECT "Agile Task Management System" 
## KANBAN BOARD
This project is designed to help software teams track tasks efficiently using a Kanban board. It follows Agile principles and is integrated with GitHub Issues for sprint tracking, task management, and collaboration.

[KANBAN BOARD](https://github.com/users/CarolNgomane/projects/5)

![kb1](https://github.com/user-attachments/assets/de8b5f73-1669-4b6d-8472-84f919380bf4)

![kb2](https://github.com/user-attachments/assets/5756799b-57e8-4cb2-85ae-65c0b1978226)



## Domain Model Summary

The domain model defines the **core business logic and data structure** of the AI Finance Coach system. It identifies essential entities such as `User`, `Budget`, `Transaction`, and `SavingsGoal`, each with its own responsibilities and behaviors. These entities are interconnected and represent how real-world financial planning is handled within the application.

Key business rules—such as limiting savings goals, ensuring budgets are tied to categories, and triggering alerts when spending exceeds limits—are clearly defined to maintain system integrity and enhance user experience.

> The domain model supports all core functional requirements outlined in Assignment 4 and aligns with user stories in Assignment 6.

## 🧱 Class Diagram Summary

The class diagram provides an **object-oriented blueprint** for the AI Finance Coach. It models the structure of the system using classes, attributes, methods, and relationships. Design highlights include:

- **Modular class design** for scalability.
- **Use of inheritance** for notification flexibility (email/SMS).
- **Clear relationships and multiplicity** to support business logic.
- **AI integration** through `AIBudgetAdvisor`.

> 📐 This diagram aids in system development by visually structuring the application logic and ensuring smooth mapping from design to implementation.


![mermaid-diagram-2025-04-13-204835](https://github.com/user-attachments/assets/bd7b3c79-5dd0-4745-95f5-3ce22e94c2f9)


  

 
