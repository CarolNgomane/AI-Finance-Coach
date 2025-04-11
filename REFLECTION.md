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

# Reflection on Template Selection and Customization  

## Challenges Faced  

### 1. Choosing a Suitable Template  
Selecting the right Kanban template was challenging due to the variety of options available in **GitHub Projects**. The **Automated Kanban** template was ultimately chosen because it provided **built-in automation** for issue tracking, which streamlined workflow management. However, other templates, such as **Basic Kanban** and **Bug Triage**, had their own advantages, making the decision difficult.  

### 2. Customizing Columns  
The default **Automated Kanban** template had pre-defined columns, but our workflow required additional stages, such as:  

- **Testing** – Ensuring that tasks meet quality assurance standards before completion.  
- **Blocked** – Identifying tasks that require resolution before progressing.  

Adding these columns required adjusting the workflow to **accommodate testing phases and dependencies**, which was not straightforward.  

### 3. Managing Linked Issues and Assignments  
While GitHub’s issue tracking system integrates well with Kanban boards, manually **linking issues, adding labels (e.g., bug, feature, enhancement), and assigning tasks** required extra effort. Ensuring each task was properly categorized and assigned took time, especially for larger projects.  

---

## Comparison: GitHub Kanban vs. Other Tools  

| **Feature**            | **GitHub Projects** | **Trello** | **Jira** | **Asana** | **ClickUp** |
|------------------------|--------------------|------------|----------|-----------|-------------|
| **Automation**         | Yes                | Limited    | Yes      | Yes (Paid)| Yes         |
| **Agile Sprint Support** | Yes              | No         | Yes      | Limited   | Yes         |
| **Issue Linking**      | GitHub Issues      | Manual     | Jira Issues | Manual  | ClickUp Tasks |
| **Customization**      | Moderate           | High       | High     | High      | High        |
| **Best For**           | Dev Teams          | Simple Tasks | Agile Teams | General Teams | Agile & Teams |

---

## Key Observations  
- **GitHub Projects** is best suited for **development teams** that use GitHub Issues for tracking. Its automation is powerful but **less flexible** than Trello or ClickUp.  
- **Trello** provides a simple and highly customizable Kanban system, but **lacks built-in automation** and Agile support.  
- **Jira** is the **most robust** for Agile workflows but is **complex and requires configuration**.  
- **Asana** is great for general project management but **lacks deep integration** with GitHub.  
- **ClickUp** balances Agile functionality with flexibility, making it a strong alternative to Jira.  

 
# Reflection challenges and insights encountered while designing **activity and state diagrams** for the **AI Finance Coach** system.

## 1. Granularity in States and Actions
One of the main challenges was determining the appropriate level of detail for states and actions in the diagrams. Striking a balance between **readability** and **completeness** was crucial.

- **Too much detail:** Overcomplicates diagrams, making them difficult to interpret.
- **Too little detail:** Misses critical steps, leading to incomplete system representation.

### Example:
- Initially, the **User Registration** workflow included every minor validation step (e.g., "Check email format," "Validate password complexity"). This was **too granular**, so it was refined into a single action: **"Validate User Input."**
- For the **Budget Management** workflow, consolidating redundant steps like "Update Budget" and "Save Budget" into **"Modify Budget"** improved clarity without losing functionality.

## 2. Aligning Diagrams with Agile User Stories
Ensuring the diagrams aligned with Agile user stories was another challenge, particularly when translating **high-level user needs** into **detailed workflows.**

- Some user stories were **broad**, requiring decomposition into multiple actions.
- Sprint tasks helped refine workflows but sometimes introduced **new actions** that were not in the original diagrams.

### Example:
- The user story: *"As a user, I want to receive notifications when I exceed my budget."* was initially mapped to a simple "Send Alert" action.
- After reviewing Agile sprint tasks, it became clear that the system should support **multiple alert types** (email, SMS, in-app notifications), leading to a more refined **"Generate & Deliver Notification"** workflow.

## 3. Comparing State Diagrams vs. Activity Diagrams
Both **state diagrams** and **activity diagrams** were essential for understanding system behavior, but they serve different purposes.

| **Aspect**       | **State Diagrams**                                 | **Activity Diagrams**                              |
|-----------------|-------------------------------------------------|------------------------------------------------|
| **Focus**       | Object lifecycle states                          | Process flow and decision logic                |
| **Use Case**    | Tracks changes in an object's state over time   | Models workflows and system interactions       |
| **Example**     | "Budget" object transitions (e.g., Created → Modified → Exceeded → Archived) | "User creates a budget" workflow (actions and decisions) |

### Insights:
- **State diagrams** provided a **structured view of object behavior** (e.g., how a budget changes over time).
- **Activity diagrams** captured **user interactions and process flows** (e.g., how a user sets up a budget and gets AI recommendations).
- Together, they provided a **comprehensive understanding** of the system’s logic and functionality.


# Reflection Challenges in Designing the Domain Model

---


Determining the right number of entities and their level of detail was one of the initial challenges. Including too few would oversimplify the system, while too many could make the model overly complex. For example, deciding whether to keep Notifications and Reports as separate entities or merge them under a generic "Output" entity was debated. Ultimately, they were modeled separately to preserve their unique attributes and behaviors.

It was also difficult to identify clear boundaries between what should be a method versus a responsibility handled by another component (e.g., should the AI engine generate reports, or should that be a separate report entity?). These distinctions were refined through iteration and feedback.

### 1. Alignment with Previous Assignments

The entities and their relationships closely reflect prior functional requirements and user stories:

- "User sets savings goal" → leads to the Goal entity.
- "User receives notifications for overspending" → results in the Notification class.
- "AI gives budgeting advice" → motivates the AIEngine class.
- State diagrams from Assignment 8 showing Budget status transitions aligned with the attributes and methods of the Budget class.

Agile sprint tasks that focused on user authentication, budget creation, and transaction tracking directly map to User, Budget, and Transaction classes respectively.

### 2. Design Trade-offs

Several design decisions involved trade-offs:
- **Association vs. Inheritance:** Instead of having specialized user roles inherit from User, all roles are treated under one class with feature-based control for simplicity.
- **Aggregation vs. Composition:** Budget and Transaction are linked via aggregation (Budget can exist without Transactions temporarily), which simplifies data flow.
- **AIEngine vs. external service:** Initially AI was a method in Budget, but separating it as a class clarified its distinct responsibilities and reusability.

### 3. Lessons Learned

- **Abstraction clarity:** Defining what each class does and limiting its scope was key to maintaining clean separation of concerns.
- **Iteration is essential:** Revising the model multiple times helped balance detail with simplicity.
- **Mapping to user needs:** Tracing every class and method to a functional requirement or user story improved confidence that the model reflects real usage.
- **Mermaid.js practice:** Working with Mermaid syntax clarified how models are interpreted visually, aiding team collaboration.





