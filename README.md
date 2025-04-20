# AI Finance Coach

AI Finance Coach is an application designed to assist users in managing their personal finances effectively. The app provides tools for budgeting, transaction tracking, savings goals, report generation, and AI-driven financial advice.

## Language of Choice

The project is built using **Java**. This language was selected for several important reasons:

- **Object-Oriented Programming (OOP)**: Java’s object-oriented principles help structure the application into reusable classes. It allows for clear organization and separation of concerns across various modules like user management, transactions, and budgeting.
- **Platform Independence**: Java applications are compiled into bytecode, which can run on any platform supporting the Java Virtual Machine (JVM). This ensures that AI Finance Coach can run on different systems without modification.
- **Rich Ecosystem and Libraries**: Java offers a wide array of libraries and frameworks that facilitate development. For example, Java’s robust support for handling dates and working with collections like HashMaps makes it ideal for managing finances, transactions, and reports.
- **Scalability**: Java is a scalable language, making it suitable for growing applications. As AI Finance Coach evolves, Java’s capabilities will support the addition of new features and improvements without compromising performance.

## Key Design Decisions

### 1. **Modular Design**

The project follows a **modular design**, where each functional area is encapsulated in its own class or module. The following modules were created:

- **User Management**: Handles user authentication, profile updates, and session management.
- **Transaction Management**: Allows users to record, view, and modify financial transactions.
- **Budgeting**: Users can create budgets, set category-specific limits, and track progress against those budgets.
- **Savings Goals**: Facilitates the creation and tracking of savings goals, enabling users to monitor their progress over time.
- **Report Generation**: Supports the creation of CSV and PDF reports that summarize the user’s financial data.
- **AI Budget Advisor**: Analyzes user spending and provides personalized financial advice based on AI recommendations.
- **Notifications**: Notifies users of important updates, such as budget thresholds or savings goal progress.

### 2. **Use of Java Collections**

Java’s built-in collections, such as **HashMap**, are utilized for tracking category-specific limits in the **Budget** module. This allows for quick updates and retrievals of category data, ensuring that the budgeting process is efficient and flexible.

### 3. **Date Management**

Date handling is crucial in managing financial transactions and goals. The **Java Date and Time API** is used extensively to calculate deadlines, track transaction dates, and monitor budget periods. This ensures accuracy and consistency in date management across the application.

### 4. **Extensible Notification System**

The **notification system** is built to be **extensible**. A base `Notification` class is extended to provide various types of notifications, such as **Email** and **SMS**. This design ensures that adding new notification types in the future (e.g., push notifications or app alerts) can be done without significant changes to the core system.

### 5. **AI Advisor**

The **AI Budget Advisor** provides users with personalized recommendations based on their financial data. The architecture allows for future improvements by integrating more sophisticated AI models, which could analyze spending patterns and provide even more tailored advice.

### 6. **Security Considerations**

While security is not fully implemented in this version, the project takes user data security seriously. In a production environment, encryption and secure password storage (e.g., hashing) would be implemented to protect sensitive information such as user profiles and transaction data.

### 7. **File Generation (CSV & PDF)**

Users can generate financial reports in both **CSV** and **PDF** formats. CSV is ideal for data analysis and manipulation using tools like Excel, while PDF provides a polished and professional way to present financial summaries. The ability to generate both formats enhances the flexibility of the system.

## Future Enhancements

The following features are planned for future versions of AI Finance Coach:

- **Integration with Bank APIs**: Direct integration with bank APIs to automatically fetch user transaction data.
- **Mobile Application**: A mobile version of the app to allow users to manage their finances on the go.
- **Machine Learning for Financial Advice**: Incorporating machine learning to enhance the AI Budget Advisor and provide smarter, more accurate recommendations.
- **Advanced Reporting**: More detailed and customizable reports, including graphs and financial trends over time.



## 🛠 Pattern Implementations

# 💸 AI Budget & Notification System – Assignment 10

This Java project demonstrates the **Six Creational Design Patterns** through a budgeting and notification system. The system models how users manage their budgets, set goals, and receive notifications using various object creation techniques.

---

## 🧩 Design Patterns Used (with Justification)

| Pattern              | File                                 | Justification |
|----------------------|--------------------------------------|---------------|
| **Singleton**        | `DatabaseConnection.java`            | Ensures only one instance of a database connection is used throughout the app. Critical for resource management and consistency. |
| **Factory Method**   | `NotificationFactory.java`           | Delegates the creation of `Notification` objects (Email, SMS), allowing dynamic instantiation based on type. |
| **Abstract Factory** | `AbstractNotificationFactory.java`   | Provides an interface for creating related objects (email/sms notifications) without specifying their concrete classes. Useful for scalable notification families. |
| **Builder**          | `SavingsGoalBuilder.java`            | Facilitates the construction of `SavingsGoal` objects step by step, useful when objects have many optional fields. |
| **Prototype**        | `BudgetPrototype.java`               | Enables cloning of existing budget objects to allow quick duplication with minimal setup. |
| **Simple Factory**   | `SimpleTransactionFactory.java`      | A static factory used to centralize transaction creation logic for reuse and encapsulation. |

---

### Pattern Justification (In-depth)
🟢 **Singleton – DatabaseConnection**
Ensures only one instance of the database connection is ever created. This helps prevent accidental multiple connections and ensures global access.

🟢 **Factory Method – NotificationFactory**
Encapsulates the object creation logic and returns different types of Notification objects depending on the input (email/SMS).

🟢 **Abstract Factory – AbstractNotificationFactory**
Promotes flexibility by allowing the creation of families of notifications (e.g., urgent vs non-urgent types), and it enables extensibility without modifying core logic.

🟢 **Builder – SavingsGoalBuilder**
Allows for flexible and readable construction of SavingsGoal objects with optional parameters, avoiding constructors with many parameters.

🟢 **Prototype – BudgetPrototype**
Provides a cloning mechanism to quickly duplicate existing budget configurations, reducing setup time and promoting reusability.

🟢 **Simple Factory – SimpleTransactionFactory**
A static factory method centralizes the creation of Transaction objects, keeping the instantiation logic in one place and decoupling it from the rest of the app.




