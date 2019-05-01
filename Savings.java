package bankApplication;

public class Savings extends Account {
	
	// list properties specific to savings account
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	
	// constructor to initialise savings account properties
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		// adds the 1 onto the start of the account number string to show this is a savings account.
		this.accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
	
	}
	
	//Overrides the original abstract method from the account
	@Override
	public void setRate() {	
		rate = getBaseRate() - .25;
	}
		
	// list any methods specific to the savings account
	private void setSafetyDepositBox() {
		// casts to an int and generates a random 3 digit ID.
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		// generates the random 4 digit Key.
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}
	
	//overrides original showInfo method from account.
	public void showInfo() {
		// calls the original show info method from the Account superclass. 
		super.showInfo();
		System.out.println("Account type: Savings");
		System.out.println(
				"Your savings account features" + 
				"\n SafetyDeposit Box ID: " + safetyDepositBoxID + 
				"\n Safety Deposit Box Key: " + safetyDepositBoxKey				
				);
	
	}

}
