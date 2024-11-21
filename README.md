# Laxmi Chit Fund - Bank Account Management System

## Overview

The **Laxmi Chit Fund** project is a simple console-based Java application that simulates a basic bank account management system. It offers functionalities for account creation, deposit, withdrawal, balance check, statement generation, profile editing, and more. The system ensures secure access with PIN authentication and provides detailed account transaction statements.

## Features

1. **Account Creation:**
   - Allows users to create a new account by providing essential details like username, mobile number, Aadhaar, PAN, address, PIN, and deposit amount.
   
2. **Login System:**
   - Users can log in to their account using their mobile number and PIN.
   - Offers 3 login attempts before exiting the program.

3. **Home Page:**
   - Provides multiple options:
     - Deposit money.
     - Withdraw money.
     - Check balance.
     - View transaction statement.
     - Edit profile.
     - Logout.

4. **Deposit and Withdrawal:**
   - Users can deposit or withdraw money with a PIN check for security.
   - Withdrawals are restricted to available balance.

5. **Balance Check:**
   - Displays the current balance after verifying the user's PIN.

6. **Transaction Statement:**
   - Displays all deposit and withdrawal transactions made by the user.

7. **Profile Editing:**
   - Users can edit their profile details, including username, mobile number, address, and PIN.
   - Requires PIN verification for each edit action.

8. **Security:**
   - The system uses a PIN for login and sensitive actions like withdrawals, balance checks, and profile editing.

9. **Account Deactivation:**
   - If the wrong PIN is entered three times, the account gets deactivated for 24 hours, and the user is logged out.

## How to Run the Project

1. **Pre-requisites:**
   - Java Development Kit (JDK) 8 or higher.
   - A basic understanding of Java programming.

2. **Steps to Run:**
   - Clone or download the repository.
   - Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse).
   - Compile and run the `LaxmiChitFund` class.

3. **Example Usage:**

   Upon running the application, you will be prompted with options to either:
   - **Login** (if you already have an account).
   - **Create a new account** (if you're a new user).

   After logging in, you'll have access to the home page where you can choose from various options like deposit, withdraw, check balance, view statements, and edit your profile.

4. **Sample Login:**
   - Mobile: `1234567890`
   - Pin: `1234`

## Code Structure

- **LaxmiChitFund.java**: Main class that handles the flow of the application.
  - The `main()` method starts the application and calls the `welcome()` method for user interaction.
  - It includes methods for account creation, login, home page, deposit, withdrawal, balance check, statement viewing, profile editing, and updating user information.
  
- **Variables:**
  - `username`, `mobile`, `pan`, `adhar`, `address`, `pin`, `bal`: Stores user account details.
  - `accountNumber`, `ifscCode`: Fixed details related to the bank.
  - `statement`: List to store transaction records (deposits and withdrawals).
    
Happy coding! 😊
