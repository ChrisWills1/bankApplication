# bankApplication
A simple bank application to create and manipulate bank accounts. Input read from a .csv file.

Scenario: I am a back-end developer and need to create an application to handle new customer bank account requests.

Application requirements:
- Read a .csv file of names, social security numbers, account types and initial deposits.
- Use a data structure to hold all the accounts read from the file.
- Two types of accounts - Checking and Savings, these should have the following properties:
  - deposit
  - withdraw
  - transfer
  - show info
  
  11 digit account number (Generated with the following process: 1 or 2 depending on the type of account 1 = savings, 2 = checking.
  last two digits of the social security number, a unique 5-digit number and a random 3 digit number)
  
- Savings account holders are given a safety deposit box and this is identified by a 3 digit number and accessed with a 4 digit code.
- Checking account holders are assigned a debit card with a 12 digit number and a 4 digit PIN.
- both accounts will use an interface that determines the base interest rate.
   - Savings accounts will use .25 points less than the base rate
   - Checking accounts will use 15% of the base rate.
- The show info method should reveal relevant account information as well as information specific to the checking account or savings account.

------------------------------------------------------------------------------------------
Further Note:

In this project the CSV.java file is a utility created specifically to read the csv file.
