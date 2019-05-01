package bankApplication;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		// creates a data structure.
		List<Account> accounts = new LinkedList<Account>();
		
		String file = "F:\\Programming\\NewBankAccounts.csv";
		
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for (String[] accountHolder: newAccountHolders) {
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			// casts the string provided from the reader into a double for the variable.
			double initDeposit = Double.parseDouble(accountHolder[3]);
			
			if (accountType.contentEquals("Savings")) {
				
				accounts.add(new Savings(name, sSN, initDeposit));
			} else if (accountType.contentEquals("Checking")) {
				
				accounts.add(new Savings(name, sSN, initDeposit));
			} else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
			
		}
		// for each account in the accounts data structure this will run.
		for (Account acc : accounts) {
			System.out.println("*****************");
			acc.showInfo();
		}
	} 

}
