package OopsConcepts1;

public class TestBank {

	public static void main(String[] args) {
		
		
		HSBC hs = new HSBC(); // Compile time or static time polymorphism
		
		hs.credit();
		
		hs.debit();
		
		hs.transfermoney();
		
		hs.carloan();
		
		hs.educationloan();
		
		hs.mutualtransfer();
		
		System.out.println("********");
		
		
		USBank b = new HSBC(); // Dynamic or Runtime polymorphism
		
		b.credit();
		
		b.debit();
		
		b.transfermoney();    // only over ridden methods and parent methods can be called in Dynamic polymorphism
		
		System.out.println("********");
		
		
		BrazilBank b1 = new HSBC();
		
		b1.mutualtransfer();
		
		System.out.println(USBank.min_bal);

	

	}

}
