package bankApplication;

// this interface is used to simulate receiving information from an external source/API in this example takes the bank of england rate.
public interface IBaseRate {

	// This is the default base rate that accounts will use.
	default double getBaseRate() {	
		return 2.5;
	}
	
}
