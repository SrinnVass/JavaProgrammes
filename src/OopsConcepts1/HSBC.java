package OopsConcepts1;

public class HSBC implements USBank , BrazilBank {

	// over ridden methods from HSBC Bank
	
	public void credit() {
		
		System.out.println("HSBC credit");
		
	}

	
	public void debit() {
		
		System.out.println("HSBC debit");
	
	}


	public void transfermoney() {
		
		System.out.println("HSBC transfermoney");
		
	}
	
	
	// seperate methods
	
	
	public void educationloan() {
		
		System.out.println("HSBC education loan");
		
	}
	
	
	public void carloan() {
		
		System.out.println("HSBC car loan");
		
	}

	

	// Overridden from BrazilBank
	
	public void mutualtransfer() {
	
		
		System.out.println("Brazil bank mutual fund");
		
	}
	
	
	
	
	
	
	
	
	
	

}
