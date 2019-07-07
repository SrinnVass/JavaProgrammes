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
		
		
		USBank b = new HSBC(); // Dynamic or Runtime polymorphism
		
		b.credit();
		
		b.debit();
		
		b.transfermoney();    // only over ridden methods can be called in Dynamic polymorphism
		
		
		BrazilBank b1 = new HSBC();
		
		b1.mutualtransfer();
		
		System.out.println(USBank.min_bal);
<<<<<<< HEAD
		
		
		
		
=======
>>>>>>> c0f84abd842871c64429c28570d0167eb45d5a92

	}

}
