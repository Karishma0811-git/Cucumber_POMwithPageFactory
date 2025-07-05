# Cucumber BDD Selenium Framework (Java + POM + PageFactory)

This is a lightweight and scalable **BDD Test Automation Framework** built using:

- 🐍 **Cucumber** (BDD)
- 🕸️ **Selenium WebDriver**
- ☕ **Java**
- 🧱 **Page Object Model (POM)** with **PageFactory**
- 🧪 **TestNG (optional for runner)**
- 📦 **Maven** for build and dependency management
- 📊 **Cucumber HTML Reports**

---

## 📁 Project Structure

src/
└── test/
├── java/
│ ├── stepDefinitions/ # Glue code for steps
│ ├── pageObjects/ # POM with PageFactory
│ ├── testRunners/ # Cucumber test runners
│ └── utilities/ # Helper files (if any)
└── resources/
└── features/ # Feature files

---

## 🚀 How to Run the Project

1. **Clone the Repository**

https://github.com/Karishma0811-git/Cucumber_POMwithPageFactory.git

----

Run via Maven

```bash

mvn test

---
Gherkin Syntax

Feature: Product search and add to cart

  Scenario: user adds a product and logout
    Given user login with valid username and password
    When user search for a product and add a product to the cart
    Then user go to the cart verify the product is added
    And logout from the application

---

Report
target/cucumber-reports.html

---
 Author

Karishma Arora
Quality Analyst | SDET | Automation Enthusiast
📧 arorakarishma0811@gmail.com


