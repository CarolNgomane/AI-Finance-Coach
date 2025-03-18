
# Agile User Stories, Backlog, and Sprint Planning

## 1. User Story Creation
### User Stories Table

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

## 4. Reflection on Agile Planning

### Challenges Faced in Prioritization and Estimation
One of the biggest challenges in Agile planning was **prioritizing user stories** based on value while considering technical complexity. While registration and authentication were essential for system security, transaction tracking required more development time but was equally crucial. Balancing these priorities while ensuring timely delivery required careful estimation.

Estimating effort in **story points** was another challenge. Some tasks, such as developing the UI, seemed straightforward but required additional refinements. Similarly, backend tasks like database setup and API integration had hidden complexities that increased effort estimates.

Another difficulty was aligning **technical tasks with user-centric features**. While users care about **interface usability**, developers focus on **security, performance, and database efficiency**. Breaking down large user stories into smaller, testable tasks helped mitigate this challenge.

### Lessons Learned
1. **MoSCoW Prioritization Helps** – Identifying core functionalities early allowed us to focus on must-have features in **Sprint 1** while planning enhancements for future sprints.
2. **Story Points Improve Planning** – Using effort estimates helped distribute workload evenly and anticipate potential bottlenecks.
3. **User Needs vs. Technical Challenges** – Balancing both perspectives ensured that the system was both functional and scalable.

