package bankApplication;

public class Checking extends Account {
	
	// list properties specific to checking account
	int debitCardNumber;
	int debitCardPin;
	
	// constructor to initialise checking account properties
	public Checking(String name, String sSN, double initDeposit) { 
		super(name, sSN, initDeposit);
		// adds the 2 onto the start of the account number string to show this is a checking account.
		this.accountNumber = "2" + accountNumber;
		setDebitCard();
		
	}
	
	//Overrides the original abstract method from the account  
	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
	}
	
	// private is only accessible in this class, void as does not return a value. This is used internally to create the debit card details.
	private void setDebitCard() {
		debitCardNumber = (int)(Math.random() * Math.pow(10, 12));
		debitCardPin = (int)(Math.random() * Math.pow(10, 4));
		
	}
	
	// list any methods specific to the checking account
	
	//overrides original showInfo method from account.
	public void showInfo() {
		// calls the original show info method from the Account superclass. 
		super.showInfo();
		System.out.println("Account type: Checking");
		System.out.println(
				"Your checking account features" + 
				"\n Debit Card Number: " + debitCardNumber + 
				"\n Pin Number: " + debitCardPin				
				);
		
	}

}
