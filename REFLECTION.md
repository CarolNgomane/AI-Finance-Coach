# Challenges Faced in Balancing Stakeholder Needs

Developing the AI Finance Coach system presents various challenges in balancing stakeholder needs, particularly considering that users must manually enter income and expenses. While the system aims to provide AI-driven financial insights, optimizing user experience, data accuracy, and engagement remains a priority. This reflection highlights key challenges encountered and how they impact system development and user adoption.

## Challenges Faced in Balancing Stakeholder Needs

### 1. Manual Data Entry Burden

One of the primary challenges is ensuring that users can manually input income and expenses efficiently. If the system’s interface is not intuitive. To address this, the system must incorporate:

- User-friendly input fields that minimize the number of steps required for data entry.
- Autocomplete and smart suggestions to reduce the effort of categorizing transactions.
- Voice input or receipt scanning as potential future enhancements to streamline manual entry.

### 2. User Engagement & Motivation

Encouraging users to consistently log their transactions manually is another challenge. Without proper engagement mechanisms, users may abandon the system over time. Strategies to improve engagement include:

- Gamification elements such as achievement badges and progress tracking for maintaining financial goals.
- Personalized reminders based on user activity patterns to prompt manual input.
- AI-generated encouragement messages that highlight financial improvements or spending insights.

### 3. Data Accuracy & Consistency

Users may enter incomplete, duplicate, or incorrect financial data, which can lead to misleading AI-driven insights. To maintain data integrity, the system must:

- Validate input fields to ensure transactions contain necessary details such as amount, category, and date.
- Provide AI-powered error detection, alerting users to potential duplicate or suspicious entries.
- Allow easy editing and reviewing of past transactions to correct mistakes.

### 4. Balancing Simplicity with Advanced Features

The system must be accessible to novice users while offering enough depth for experienced individuals who require detailed financial analytics. Key solutions include:

- Customizable dashboards where users can select either a simplified or detailed financial view.
- Progressive disclosure to show advanced analytics only when requested, preventing information overload.
- Predefined budgeting templates to assist users who may not be familiar with financial planning.

### 5. Ensuring Timely Financial Insights

Since users enter transactions manually, AI-generated financial insights must adapt dynamically without real-time transaction data from bank integrations. The system must:

- Continuously analyze user inputs and generate meaningful insights based on spending patterns.
- Provide instant feedback by updating the financial dashboard as soon as new transactions are entered.
- Use predictive analytics to anticipate spending trends and offer proactive recommendations.


# Reflection: Challenges in Translating Requirements to Use Cases and Tests

Interpreting system requirements and translating them into **use cases** and **test cases** is a fundamental step in software development. The AI Finance Coach project requires careful planning to ensure that its functionalities are correctly structured and tested before actual development. However, several challenges arise during this process, including understanding vague requirements, defining detailed interactions, handling edge cases, and ensuring comprehensive test coverage.

### Interpreting Ambiguous Requirements

One of the most significant challenges is ensuring that all functionalities are clearly understood and correctly translated into **use cases and test cases**. Requirements are often written in broad terms, leaving room for ambiguity. For example, a requirement like *“The system shall provide AI-driven budget recommendations”* does not specify **how** these recommendations will be generated or displayed to the user.

### Solution:
- Define **structured user stories and acceptance criteria** to create clear expectations.
- Use iterative refinement methods to improve requirement accuracy.

### Defining Comprehensive Use Cases

Creating **detailed use cases** that cover all possible interactions and exceptions is challenging. It is common to focus on the **main functionality** while overlooking **alternative flows and error handling**. For instance, a **“User Login”** use case should account for **incorrect passwords, locked accounts, and security timeouts**.

### Solution:
- Use **UML Use Case Diagrams** to visualize interactions between actors and the system.
- Define **preconditions, postconditions, and alternative flows** for every use case.
- Review use cases with peers to ensure completeness.

### Handling Non-Functional Requirements in Test Cases

Non-functional requirements (NFRs), such as **performance, security, and usability**, are harder to define and validate. For example, stating that *“The system shall load the dashboard within 2 seconds”* requires benchmark testing under different conditions.

### Solution:
- Establish **measurable testable criteria** for non-functional requirements.
- Plan for performance simulations using tools such as **JMeter** once the system is developed.
- Define security test cases based on best practices.

### Managing Edge Cases and Unexpected User Behavior

Users often interact with systems in **unexpected ways**, leading to edge cases that must be anticipated in test planning. For example, in the budget creation feature, users might enter **negative values or extremely high amounts**, leading to logical inconsistencies.

### Solution:
- Apply **Boundary Value Analysis (BVA) and Equivalence Partitioning** techniques.
- Plan **input validation tests** to prevent system crashes or incorrect calculations.
- Conduct usability evaluations once a prototype is available.

### Keeping Use Cases and Test Cases Updated

Requirements may evolve as new insights emerge. Without continuous updates, existing **use cases and test cases may become outdated**.

### Solution:
- Maintain **version control** for requirement documents and test cases.
- Regularly review and update **use cases and test cases** to reflect evolving requirements.
- Implement automated regression testing once development begins.





