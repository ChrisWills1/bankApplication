package bankApplication;

// Parent class for Checking and Savings accounts
// cannot create objects from an abstract class, these will be made by the child classes.
public abstract class Account implements IBaseRate {

	// list common properties for savings and checking accounts
	private String name;
	private String socialSecurityNum;
	private double balance;
	
	static int index = 10000;
	// protected variables can be accessed by child classes but are hidden.
	protected String accountNumber;
	protected double rate;
	
	// constructor to set base properties and initialise the account
	public Account(String name, String sSN, double initDeposit) {
		this.name = name;
		this.socialSecurityNum = sSN;
		balance = initDeposit;
		
		
		//set account number
		index++;
		this.accountNumber = setAccountNumber();
		
		// this will call the relevant set rate dependent on if it is savings or checking.
		setRate();
	}
	
	// objects cannot be created from an abstract class. Leaves implementation to subclasses
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoOfSSN = socialSecurityNum.substring(socialSecurityNum.length()-2, socialSecurityNum.length());
		int uniqueID = index;
		// Math.random generates a number between 0 and 1, times by 10*3 to get a random 3 digit code.
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		
		// returns the account number including the static index which is always unique, the last two digits of the social security num
		// and a randomly generated 3 digit number.
		return lastTwoOfSSN + uniqueID + randomNumber;
	}
	
	// will take the relevant rate depending on the type of the account. Divided rate by 100 to get a percentage.
	public void compound() {
		double accruedInterest = balance * (rate/100);
		balance = balance + accruedInterest;
		System.out.println("Accrued Interest: £" + accruedInterest);
	}
	
	// List common methods
	
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing £" + amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing £" + amount);
		printBalance();
	}
	
	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transfering £" + amount + " to " + toWhere);
		printBalance();
	}
	
	// handles the printing of the balance to reduce unnecessary code.
	public void printBalance() {
		System.out.println("Your new balance is: £" + balance);
	}
	
	
	public void showInfo() {
		System.out.println(
				"Name: " + name + 
				"\nAccount Number: " + accountNumber + 
				"\nBalance: £" + balance + 
				"\nRate: " + rate + "%"
				);
		
	}
	
}
