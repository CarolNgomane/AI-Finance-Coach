
# Agile User Stories, Backlog, and Sprint Planning

## Introduction

The **AI Finance Coach** is a cutting-edge financial management tool designed to help users take control of their personal finances through AI-driven insights. With the increasing complexity of financial decision-making, many individuals struggle with budgeting, tracking expenses, and saving effectively. This system aims to simplify financial management by providing users with automated expense tracking, personalized budget recommendations, real-time financial health analysis, and savings goal tracking.

By leveraging artificial intelligence and machine learning, the AI Finance Coach continuously learns from user spending habits and provides tailored suggestions to optimize financial behavior. The system also integrates alerts and notifications to ensure users remain within their budget limits and meet their financial goals.

To ensure a structured and efficient development process, this document outlines the Agile methodology used in planning and building the AI Finance Coach. Agile enables flexibility, incremental development, and continuous improvement, allowing the team to refine functionalities based on user feedback and evolving requirements. Through user story creation, backlog prioritization, and sprint planning, the project remains adaptable and focused on delivering high-value features in each development cycle.The AI Finance Coach is a personal finance management system designed to help users track their spending, set budgets, and receive AI-driven financial recommendations. The system leverages artificial intelligence to analyze spending patterns and provide actionable insights to optimize savings and avoid overspending.


## 1. User Story Creation
### User Stories Table

https://github.com/users/CarolNgomane/projects/1

https://github.com/CarolNgomane/AI-Finance-Coach/issues

| **User Story ID** | **User Story** | **Acceptance Criteria** | **Priority** |
|------------------|---------------|--------------------|----------|
| US-001 | As a user, I want to register an account so that I can securely access the system. | Users must receive a confirmation email upon registration. Multi-factor authentication should be available. | High |
| US-002 | As a user, I want to log in so that I can access my financial dashboard. | System must validate credentials and provide access within 3 seconds. Incorrect logins should trigger an error message. | High |
| US-003 | As a user, I want to manually add income and expenses so that I can track my financial transactions. | Users must be able to input a transaction description, amount, and category. | High |
| US-004 | As a user, I want to create and manage a budget so that I can control my spending. | System must allow setting budget limits per category. Users should receive alerts if they exceed their budget. | High |
| US-005 | As a user, I want to receive AI-powered budget recommendations so that I can optimize my savings. | AI should analyze past transactions and suggest optimized budget allocations. | Medium |
| US-006 | As a user, I want to set savings goals so that I can track my progress over time. | Users should be able to input a goal amount and see their progress in real-time. | Medium |
| US-007 | As a user, I want to view my financial dashboard so that I can see an overview of my finances. | The dashboard should display total income, expenses, and balance in an easy-to-read format. | High |
| US-008 | As a user, I want to generate financial reports in CSV or PDF format so that I can analyze my spending. | Reports must be downloadable and must reflect real-time transactions. | Medium |

## 2. Product Backlog

### Prioritized Backlog Table

| **Story ID** | **User Story** | **MoSCoW Priority** | **Effort Estimate (Story Points)** | **Dependencies** |
|-------------|---------------|-----------------|----------------|--------------|
| US-001 | Register an account | Must-have | 3 | - |
| US-002 | Log in to the system | Must-have | 2 | US-001 |
| US-003 | Add income and expenses | Must-have | 4 | US-002 |
| US-004 | Create and manage a budget | Must-have | 5 | US-003 |
| US-007 | View financial dashboard | Must-have | 3 | US-003, US-004 |
| US-005 | Receive AI-powered budget recommendations | Should-have | 6 | US-004 |
| US-006 | Set savings goals | Should-have | 4 | US-003 |
| US-008 | Generate financial reports | Could-have | 5 | US-003, US-007 |

## 3. Sprint Planning

### Sprint Goal
The primary goal of **Sprint 1** is to **establish core functionalities**, allowing users to register, log in, and track financial transactions. This sprint lays the foundation for further enhancements, including AI-driven insights and financial reporting.

Selected User Stories for Sprint 1

The following user stories have been selected based on their priority and contribution to the Minimum Viable Product (MVP):

- **US-001:** User Registration
- **US-002:** User Login
- **US-003:** Expense Tracking
- **US-004:** Budget Management
- **US-007:** Financial Dashboard


### Sprint Backlog

| **Task ID** | **Task Description** | **Assigned To** | **Estimated Hours** | **Status** |
|------------|------------------|--------------|----------------|--------|
| T-001 | Develop user registration system | Developer 1 | 8 | To Do |
| T-002 | Implement login and authentication | Developer 1 | 6 | To Do |
| T-003 | Create UI for expense tracking | Developer 2 | 10 | To Do |
| T-004 | Implement backend logic for transactions | Developer 2 | 12 | To Do |
| T-005 | Develop basic financial dashboard | Developer 3 | 10 | To Do |
| T-006 | Set up database schema | Developer 1 | 6 | To Do |
| T-007 | Write unit tests for authentication | Developer 3 | 5 | To Do |
| T-008 | Integrate budget management module | Developer 2 | 8 | To Do |

### Sprint Contribution to MVP

This sprint establishes the core functionalities of the AI Finance Coach by allowing users to register, log in, track transactions, and manage budgets. Completing these foundational tasks ensures that users can securely interact with the system and view their financial data in a structured format. These features are critical for enabling AI-driven recommendations in future sprints, leading to a fully functional and intelligent financial coaching platform.
This sprint establishes the core functionalities of the AI Finance Coach by allowing users to register, log in, track transactions, and manage budgets. Completing these foundational tasks ensures that users can securely interact with the system and view their financial data in a structured format. These features are critical for enabling AI-driven recommendations in future sprints, leading to a fully functional and intelligent financial coaching platform.

## 4. Reflection on Agile Planning
### Challenges in Prioritization and Estimation

Agile development relies on prioritization, estimation, and discipline to ensure efficient execution. However, working as both the developer and sole stakeholder presented unique challenges. Balancing technical feasibility with user needs, accurately estimating tasks, and staying motivated without external pressure were the most significant difficulties.

### Prioritization Challenges

Without external stakeholders providing feedback, prioritizing user stories became an internal debate. Typically, product owners and users dictate what is most valuable. In this case, decisions were based on assumptions and logical sequencing rather than direct user input.

To address this, I followed the MoSCoW prioritization method, categorizing core functionalities such as registration, authentication, and transaction tracking as must-haves, while AI-driven insights and reports were labeled as should-have or could-have features. Even with this structure, the absence of real-time feedback meant that prioritization was still speculative.

### Estimation Difficulties

Agile teams usually refine estimates collectively using story points, considering different perspectives. Working solo, I had to rely on research, past experiences, and best-guess estimations. Some tasks, such as user authentication, initially seemed simple but became complex due to security concerns like multi-factor authentication. Conversely, building the dashboard UI appeared complex but was streamlined through visualization libraries.

Breaking down tasks into smaller, well-defined components helped improve accuracy. However, unforeseen complexities still led to time overruns, highlighting the importance of iterative learning in Agile estimation.


### Lessons Learned
1. **MoSCoW Prioritization Helps** – Identifying core functionalities early allowed me to focus on must-have features in **Sprint 1** while planning enhancements for future sprints.
2. **Story Points Improve Planning** – Using effort estimates helped distribute workload evenly and anticipate potential bottlenecks.
3. **User Needs vs. Technical Challenges** – Balancing both perspectives ensured that the system was both functional and scalable.

