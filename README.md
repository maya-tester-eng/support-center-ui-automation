# Support Center UI Automation Framework

## Project Overview

This project is a UI test automation framework built to validate the functionality of a Support Center web application. The framework demonstrates real-world Quality Assurance (QA) automation practices using Behavior-Driven Development (BDD).

The goal of this project is to simulate how QA engineers design, implement, and maintain automated tests for web applications. It includes positive and negative test scenarios, validation checks, and documented bugs discovered during testing.

This framework is suitable for:

* QA Engineers
* QA Automation Engineers
* Developers collaborating with QA teams
* Students building a professional automation portfolio

---

## Project Goals

* Automate functional testing of a web application
* Implement a maintainable test automation framework
* Demonstrate industry-standard QA practices
* Detect and document software defects (bugs)
* Practice Git and GitHub workflow for team collaboration

---

## Repository Purpose

This repository is part of a QA automation learning and portfolio development process. It demonstrates the ability to design, implement, and maintain an automated testing framework using industry-standard tools and practices.

---

## Technology Stack

Language:

* Java

Automation Tools:

* Selenium WebDriver
* Cucumber (BDD)
* TestNG

Design Patterns:

* Page Object Model (POM)
* Singleton Design Pattern (Driver management)

Build Tool:

* Maven

Version Control:

* Git
* GitHub

Utilities:

* WebDriverManager
* PageFactory

---

## Framework Architecture

The framework follows a standard layered automation structure used in real QA teams.

Project Structure:

src/test/java

* pages

    * LoginPage.java
    * SupportPage.java

* step_definitions

    * LoginSteps.java
    * SupportSteps.java
    * Hooks.java

* utilities

    * Driver.java
    * ConfigurationReader.java

* runners

    * TestRunner.java

src/test/resources

* features

    * login.feature
    * support.feature

* configuration.properties

---

## Design Decisions

### Page Object Model (POM)

Each web page is represented as a Java class containing locators and actions. This improves maintainability and readability.

### Singleton Driver Pattern

A single WebDriver instance is used across the test execution to prevent conflicts and reduce resource usage.

### BDD (Behavior-Driven Development)

Test scenarios are written in Gherkin language so that both technical and non-technical stakeholders can understand the test cases.

---

## Test Scenarios Implemented

### Login Page Testing

* Valid login
* Invalid email format
* Short password validation
* Negative login testing

### Support Page Testing

* Form submission
* Name validation
* Fields clear after submission
* Link navigation verification
* Negative input validation

---

## Bug Detection and Documentation

During automation testing, several defects were identified and documented directly inside feature files.

Examples of detected issues:

* System accepts numbers in the name field
* System accepts an invalid email format
* Incorrect name validation behavior

Each bug includes:

* Expected result
* Actual result
* Test result status
* Scenario location

This demonstrates a real QA workflow where automation tests help identify product defects.

---

## Test Execution

### Run Tests from IntelliJ

1. Open TestRunner.java
2. Right-click the file
3. Select Run

Tests will execute all scenarios defined in feature files.

---

## Configuration Management

The framework uses a configuration.properties file to store environment settings such as:

* Browser type
* Application URL
* Timeout settings

Example:

browser=chrome
url=file:///path/to/index.html

This allows easy updates without modifying the code.

---

## Git Workflow Used

Typical development workflow:

1. Update test code
2. Add new scenarios
3. Detect bugs
4. Commit changes locally
5. Push updates to GitHub repository

This simulates real team collaboration.

---

## Future Improvements

The framework can be expanded with additional features such as:

* Screenshot capture on test failure
* Explicit waits
* Cross-browser testing
* Parallel execution
* Test reporting (HTML reports)
* CI/CD pipeline integration

---

## What This Project Demonstrates

This project shows practical QA automation skills, including:

* UI test automation
* Test framework design
* Bug detection
* Test case design
* Negative testing
* Git version control
* Collaboration workflow

---

## Author

Automation Framework created by:

Musabekhon Ishanova

QA Automation Engineer (Portfolio Project)

---







