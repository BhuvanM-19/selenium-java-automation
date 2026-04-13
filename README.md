# Selenium Java Automation Framework

## Overview
This project is a test automation framework built using Selenium WebDriver with Java. It follows the Page Object Model (POM) design pattern and uses Cucumber for Behavior Driven Development (BDD).

## Features
- Automated test execution for web application
- Page Object Model (POM) for maintainability
- Cucumber BDD using .feature files
- Test execution using TestNG
- Maven for dependency management and build
- Basic test reporting (TestNG & Cucumber reports)

## Tech Stack
- Java
- Selenium WebDriver
- Cucumber
- TestNG
- Maven

## Framework Structure
- `features` → Gherkin test scenarios
- `stepdefinitions` → Step implementation
- `pages` → Page Object classes
- `runners` → Test execution control

## How to Run
1. Clone the repository
2. Open the project in IDE (Eclipse/IntelliJ)
3. Update Maven dependencies
4. Run using:
    Right click `TestRunner.java` → Run As → TestNG Test  
   OR  
    Run command  
     `
     mvn clean test
     `

## Future Improvements
- Add more test scenarios (including edge cases)
- Implement data-driven testing
- Integrate CI/CD (Jenkins/GitHub Actions)
- Add screenshots for failed test cases
- Implement parallel execution
