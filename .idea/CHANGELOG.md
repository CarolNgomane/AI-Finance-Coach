# CHANGELOG.md

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/), and this project adheres to [Semantic Versioning](https://semver.org/).

---

## [1.0.0] - 2025-04-21
### Added
- ✅ Implemented all **six creational design patterns**:
  - Singleton: `DatabaseConnection`
  - Factory Method: `SimpleTransactionFactory`
  - Abstract Factory: `NotificationFactory`, `AbstractNotificationFactory`
  - Builder: `SavingsGoalBuilder`
  - Prototype: `BudgetPrototype`
  - Object Pool: *(Not implemented due to scope, intentionally omitted)*

- ✅ Created `/tests` package with **unit tests** for:
  - Singleton pattern (thread safety, instance control)
  - Factory Method pattern (correct object creation)
  - Abstract Factory pattern (type consistency in product families)
  - Builder pattern (attribute validation and edge case handling)
  - Prototype pattern (deep vs shallow copy check)

- ✅ Test coverage ensured with JUnit (ready for JaCoCo integration).

### Fixed
-  `Builder` pattern now throws `IllegalArgumentException` for invalid inputs (e.g., negative amounts).
-  Ensured `Singleton` is thread-safe using synchronized blocks.
-  Fixed minor null pointer risks in `NotificationFactory` with safe null checks.

### Testing Improvements
- ✅ Added edge-case tests for invalid input values in `BuilderTest`.
- ✅ Verified `Prototype` cloning by modifying original and asserting difference from clone.
- ✅ Improved error messages in `assertThrows()` for clearer debugging.
- ✅ Consolidated test classes under `tests` package using consistent naming (`*Test.java`).

### Refactored
- Moved test files into `src/tests/creational_patterns/` for modular structure.
- Renamed test methods for readability (e.g., `testSingletonThreadSafety()`).
- Cleaned up unused imports, removed redundant code after testing.

### Project Management
- 🎯 Created GitHub issues for each pattern implementation.
- ✅ Linked commits to issues using `Fix #<issue number>` convention.
- ✅ Created new issues for:
  - Bugs discovered during testing (e.g., Builder with negative input)
  - Pattern enhancements and test coverage extensions
- ✅ Updated project board with “Done” status for completed items.

---

## [0.1.0] - 2025-04-10
### Initial Release
- Project initialized with Sprint 1 goals and structure.
- Basic GitHub Project Board setup.
- Created issues for core finance features:
  - Expense Tracking
  - Budget Management
  - User Login
- Set up base folder structure under `src/`.

