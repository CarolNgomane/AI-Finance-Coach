#  Class Diagram

##  Key Design Decisions

- **Modular Class Design**: Each major component of the budgeting system (User, Budget, Transaction, etc.) is modeled as a separate class to promote maintainability and scalability.
- **Relationship Clarity**: Explicit relationships such as:
  - Aggregation (e.g., `Report *-- AIBudgetAdvisor`)
  - Associations (e.g., `User --> Transaction`)
  - Inheritance (e.g., `Notification <|-- EmailNotification`)
- **Scalability Focus**: The architecture supports adding new features like multiple notification channels or analytics tools without major refactoring.

## 🔍 Explanation of Key Relationships

- **User to Transaction/Budget/Goal/Report:** A single user can create and manage multiple financial entities.
- **Report to AI Advisor:** Reports include AI-driven insights for personalized recommendations.
- **Composition & Aggregation:** The diagram uses `*--` to show tight composition (e.g., a report includes AI advice) and `-->` for logical associations.
- **Inheritance:** Email and SMS notifications inherit from a base Notification class to support polymorphism.

---

##  How This Supports Functional Requirements
This diagram supports:
- **FR-001**: Registration/Login through `User` class.
- **FR-002 to FR-004**: `Transaction`, `Budget`, and `AIBudgetAdvisor` provide tracking and optimization.
- **FR-005**: `SavingsGoal` allows setting and tracking of goals.
- **FR-006**: `NotificationSystem` and `Notification` handle smart alerts.
- **FR-007 & FR-008**: `Report` and AI functions offer insights and export capabilities.

## Notes:

- **User** is the central entity.
- **Transaction, Budget, SavingsGoal, and Report** are all user-related features.
- **AIEngine** is a service entity responsible for analytics and insights.
- All methods reflect system operations aligned with your **functional requirements** and **use cases** (from Assignments 4–6).
- This diagram supports the object-oriented view of the system and helps visualize entity responsibilities and relationships.

---

## 📊 Mermaid.js Class Diagram

```mermaid
classDiagram

%% === Core Entities ===
class User {
  +String userId
  +String name
  +String email
  +String password
  +login()
  +logout()
  +updateProfile()
}

class Transaction {
  +String transactionId
  +Date date
  +float amount
  +String category
  +String type
  +recordTransaction()
  +editTransaction()
}

class Budget {
  +String budgetId
  +float totalAmount
  +Map<String, float> categoryLimits
  +Date startDate
  +Date endDate
  +createBudget()
  +modifyBudget()
}

class SavingsGoal {
  +String goalId
  +float targetAmount
  +float currentAmount
  +Date deadline
  +updateProgress()
  +editGoal()
}

class Report {
  +String reportId
  +Date generatedOn
  +String format
  +generateCSV()
  +generatePDF()
}

class AIBudgetAdvisor {
  +String modelVersion
  +generateRecommendations()
  +analyzeSpendingPatterns()
}

class NotificationSystem {
  +sendAlert()
  +sendWeeklyInsights()
}

class Notification {
  +String notificationId
  +String message
  +send()
}

class EmailNotification {
  +String email
  +send()
}

class SMSNotification {
  +String phoneNumber
  +send()
}

%% === Relationships and Multiplicities ===
User "1" --> "*" Transaction : makes
User "1" --> "*" Budget : defines
User "1" --> "*" SavingsGoal : sets
User "1" --> "*" Report : requests

Report "1" *-- "1" AIBudgetAdvisor : uses
User --> NotificationSystem : interacts
Budget --> AIBudgetAdvisor : sends data to
Transaction --> Budget : belongs to
SavingsGoal --> Transaction : tracks from

%% === Inheritance ===
Notification <|-- EmailNotification
Notification <|-- SMSNotification
NotificationSystem --> Notification : uses


