# OrangeHRM Login Automation — Hybrid Framework

A modular, highly scalable **Hybrid Test Automation Framework** built using the **Page Object Model (POM)** pattern. This repository showcases structural best practices for automating web applications (using an OrangeHRM login workflow) with a heavy emphasis on reusability, maintenance efficiency, and enterprise-grade reporting features.

## 🛠️ Architecture & Core Components

This framework is built upon a **Hybrid Architecture** combining Page Object Model (POM) with Data-Driven capabilities.

### 1. Core Framework Layers
* **Page Classes:** Houses explicit web elements and page-specific actions (e.g., `LoginPage.java`). Web elements are isolated from test validation logic to ensure high maintainability.
* **TestBase Package (BaseClass):** Controls lifecycle setup and teardown (`@BeforeMethod` / `@AfterMethod`). Initializes driver configurations, implicit/explicit waits, and manages browser capabilities (Chrome, Firefox, Edge).
* **Test Case Layer (LoginTest):** Pure functional assertions (`TestNG`). Focuses strictly on business workflows (Valid login, Invalid credentials, Null validations) keeping code highly readable.

### 2. Infrastructure & Utilities
* **Utilities:** Custom wrapper classes handling driver actions, explicit waits (`WebDriverWait`), and explicit web interactions.
* **Test-Data Management:** Decoupled test input layers utilizing external sources (e.g., Excel/Properties files) to dynamically feed scenarios via TestNG DataProviders.
* **Logs & Monitoring:** System logs generated natively to record execution steps, state changes, and debug workflows.
* **Failure Interception (Screenshots):** Integrated runtime listeners that automatically capture full-page timestamps and screenshots upon test failures for seamless debugging.

---

## 📂 Project Directory Structure

```text
├── src
│   ├── main
│   │   └── java
│   │       ├── com.orangehrm.pages         # Page Object Classes (LoginPage.java)
│   │       ├── com.orangehrm.testBase      # Base Setup & Driver Lifecycle (BaseClass.java)
│   │       └── com.orangehrm.utilities     # Generic wrappers, Wait mechanisms, File Readers
│   └── test
│       └── java
│           └── com.orangehrm.tests         # Executable Test Runner classes (LoginTest.java)
├── test-data/                              # External data sheets (Excel / Config files)
├── logs/                                   # Dynamically generated execution logs
├── screenshots/                            # Automatically generated failure screenshots
├── testng.xml                              # Test Suite execution configuration
├── pom.xml                                 # Dependency and plugin configurations
└── README.md
```

---

