
## Test Case Development ##

Testing is a critical phase in the software development lifecycle to ensure that the **AI Finance Coach** system meets functional expectations and performs efficiently under different scenarios. This document defines structured test cases to validate both **functional and non-functional requirements** of the system, ensuring that core financial management features operate correctly and meet user expectations.

The test cases are categorized as follows:

**Functional Test Cases** – These validate that system features, such as expense tracking, budget management, and AI-powered recommendations, work as intended.

**Non-Functional Test Cases** – These assess system performance, security, usability, and reliability under various conditions.

Each test case follows a structured format, including the **test case ID, associated requirement, description, steps to execute, expected outcome, actual result, and status** (pass/fail). The results of these test cases will help determine if the system is ready for deployment or requires further refinements.

### Functional Test Cases ###

| Test Case ID | Requirement ID | Description | Steps | Expected Result | Actual Result | Status |
|-------------|---------------|-------------|-------|----------------|---------------|--------|
| TC-001 | FR-001 | User registers an account | 1. Enter email and password <br> 2. Click 'Sign Up' <br> 3. Verify email | Account is created successfully | - | - |
| TC-002 | FR-002 | User logs in to the system | 1. Enter credentials <br> 2. Click 'Login' | User is redirected to the dashboard | - | - |
| TC-003 | FR-003 | User logs an expense | 1. Select 'Add Expense' <br> 2. Enter details <br> 3. Click 'Save' | Expense is recorded in the system | - | - |
| TC-004 | FR-004 | User creates a budget | 1. Select 'Create Budget' <br> 2. Enter budget details <br> 3. Click 'Save' | Budget is successfully saved | - | - |
| TC-005 | FR-005 | User receives AI-generated budget recommendations | 1. Enter spending data <br> 2. Request recommendations | AI provides an optimized budget | - | - |
| TC-006 | FR-006 | User sets a savings goal | 1. Enter goal details <br> 2. Click 'Save' | Goal is successfully saved | - | - |
| TC-007 | FR-007 | System sends notifications for budget alerts | 1. Exceed budget threshold <br> 2. System triggers notification | Notification is received | - | - |
| TC-008 | FR-008 | User generates a financial report | 1. Select 'Generate Report' <br> 2. Choose format (CSV/PDF) <br> 3. Click 'Download' | Report is generated and available for download | - | - |


### Non-Functional Test Cases ###

| Test Case ID  | Requirement ID | Description                          | Steps                                                       | Expected Result                  | Actual Result | Status |
|--------------|---------------|--------------------------------------|-------------------------------------------------------------|----------------------------------|---------------|--------|
| TC-NF-001   | NFR-001       | Performance test for concurrent users | Simulate 1,000 concurrent users logging in and tracking expenses | System response time ≤ 2 seconds | -             | -      |
| TC-NF-002   | NFR-002       | Security test for unauthorized access | Attempt to access a user account without credentials         | System denies access            | -             | -      |


### Conclusion ###

By executing these test cases, the development team can identify **functional defects, performance issues, and security vulnerabilities** before deploying the AI Finance Coach system. The test results will guide refinements and improvements, ensuring the system is reliable, efficient, and secure for users.
