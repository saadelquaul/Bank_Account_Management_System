# 🏦 Bank Account Management System

A comprehensive Java-based banking application that provides essential account management functionality through a command-line interface.

![Java](https://img.shields.io/badge/Java-8-orange)
![Build](https://img.shields.io/badge/Build-Passing-brightgreen)
![License](https://img.shields.io/badge/License-MIT-blue)

---

## 📋 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Architecture](#architecture)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [UML Design](#uml-design)
- [Development](#development)
- [Testing](#testing)
- [Contributing](#contributing)
- [License](#license)

---

## 🔍 Overview

The Bank Account Management System is a robust Java 8 console application designed to simulate real-world banking operations. Built with object-oriented principles and clean architecture patterns, this system provides a secure and efficient way to manage multiple types of bank accounts.

### Key Highlights
- **Object-Oriented Design**: Follows SOLID principles and design patterns
- **Layered Architecture**: Separation of concerns with UI, Service, and Model layers
- **Multiple Account Types**: Support for Current and Savings accounts
- **Transaction Management**: Complete audit trail of all operations
- **Dependency Injection**: Custom DI container for loose coupling

---

## ⚡ Features

### Core Banking Operations
- ✅ **Account Creation**: Create Current or Savings accounts with unique identifiers
- ✅ **Secure Authentication**: Login system with account codes
- ✅ **Deposit Operations**: Add funds to accounts with validation
- ✅ **Withdrawal Operations**: Withdraw funds with balance verification
- ✅ **Money Transfers**: Transfer between accounts with transaction logging
- ✅ **Balance Inquiry**: Real-time account balance checking
- ✅ **Transaction History**: Complete operation history with timestamps

### Account Types
- **Current Account**: Standard checking account with overdraft protection
- **Savings Account**: Interest-bearing account with withdrawal limits

### Additional Features
- 🔐 Input validation and error handling
- 📊 Real-time balance updates
- 📝 Comprehensive transaction logging
- 🎯 User-friendly console interface

---

## 🏗️ Architecture

```
┌─────────────────┐
│   UI Layer      │  ← DisplayScreen
├─────────────────┤
│ Service Layer   │  ← AccountService, OperationService
├─────────────────┤
│  Utils Layer    │  ← InputUtils, AccountUtils
├─────────────────┤
│  Model Layer    │  ← Account, Operation, etc.
└─────────────────┘
```

### Design Patterns Used
- **Dependency Injection**: Custom DI container for service management
- **Strategy Pattern**: Different account type behaviors
- **Factory Pattern**: Account creation
- **Repository Pattern**: Data access abstraction

---

## 🚀 Getting Started

### Prerequisites
- **Java Development Kit (JDK) 8** or higher
- **Git** for version control
- **IDE** (Eclipse, IntelliJ IDEA, or VS Code)

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/saadelquaul/Bank_Account_Management_System.git
   cd Bank_Account_Management_System
   ```

2. **Compile the project**
   ```bash
   # Create bin directory if it doesn't exist
   mkdir bin
   
   # Compile all Java files
   javac -d bin main\*.java main\model\*.java main\service\*.java main\ui\*.java main\utils\*.java
   ```

3. **Run the application**
   ```bash
   java -cp bin Main
   ```

### Alternative: JAR Execution

1. **Create executable JAR**
   ```bash
   jar cfe BankSystem.jar Main -C bin .
   ```

2. **Run JAR file**
   ```bash
   java -jar BankSystem.jar
   ```

---

## 💻 Usage

### Application Flow

1. **Start Application**
   ```
   ═══════════════════════════════════
   🏦 BANK ACCOUNT MANAGEMENT SYSTEM 🏦
   ═══════════════════════════════════
   
   1. Create New Account
   2. Login to Existing Account
   3. Transfer Between Accounts
   0. Exit Application
   ```

2. **Account Creation**
   ```
   ── CREATE NEW ACCOUNT ──
   Select Account Type:
   1. Current Account (Overdraft Available)
   2. Savings Account (Interest Earning)
   
   Enter initial deposit amount: $500.00
   ✅ Account created successfully!
   Your Account Code: SAV-2025001
   ```

3. **Account Operations**
   ```
   ── ACCOUNT DASHBOARD (SAV-2025001) ──
   Current Balance: $500.00
   
   1. 💰 Deposit Money
   2. 💸 Withdraw Money
   3. 📊 Check Balance
   4. 📋 View Transaction History
   5. 🔄 Transfer to Another Account
   0. 🚪 Logout
   ```

---

## 📁 Project Structure

```
main/
├── 📄 Main.java                 # Application entry point
├── 📄 README.txt               # Project documentation
├── 🖼️ ClassDiagram1.png        # UML class diagram
├── model/                      # Domain models
│   ├── Account.java            # Abstract account class
│   ├── CurrentAccount.java     # Current account implementation
│   ├── SavingsAccount.java     # Savings account implementation
│   ├── Operation.java          # Transaction model
│   ├── Deposit.java           # Deposit operation
│   └── Withdrawal.java        # Withdrawal operation
├── service/                    # Business logic layer
│   ├── AccountService.java     # Account management service
│   ├── OperationService.java   # Transaction service
│   └── DIContainer.java        # Dependency injection
├── ui/                        # User interface layer
│   └── DisplayScreen.java     # Console UI controller
└── utils/                     # Utility classes
    ├── AccountUtils.java      # Account helper methods
    └── InputsUtils.java       # Input validation utilities
```

---

## 📊 UML Design

The system follows a well-structured object-oriented design:

![Class Diagram](ClassDiagram1.png)

### Key Classes:
- **Account**: Abstract base class for all account types
- **CurrentAccount/SavingsAccount**: Concrete account implementations
- **Operation**: Base class for all transactions
- **AccountService**: Core business logic for account operations
- **DisplayScreen**: User interface controller

---

## 🛠️ Development

### Build Commands

```bash
# Compile project
javac -d bin main\*.java main\model\*.java main\service\*.java main\ui\*.java main\utils\*.java

# Create JAR
jar cfe BankSystem.jar Main -C bin .

# Run application
java -cp bin Main
```
