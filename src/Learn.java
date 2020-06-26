

class Account {
		public void accountType(){
			System.out.println("There are 3 types of atm cards");
			
		}
	}

class SalaryAccount extends Account{
	public void accountType() {
		System.out.println("This is salary account");
		
	}
}

class SavingsAccount extends Account{
	public void accountType() {
		System.out.println("This is savings account");
	}
		
		
		
	
}

class PFAccount extends Account{
	public void accountType() {
		System.out.println("This is PF account");
		
	}
}


public class Learn {
	
	static void minBalance(int bal) {
		System.out.println("This is normal account");
	}
	
	static void minBalance(int bal, char type) {
		System.out.println("This is "+type +" type account");
	}

	
	//polymorphism is a concept of doing a single task in different ways
	public static void main(String[] args) {
		
				Account acc;
		
		acc = new SavingsAccount();
		minBalance(10000);
		acc.accountType();
		
		acc = new SalaryAccount();
		acc.accountType();
		minBalance(20000, 'A');
		
		acc = new PFAccount();
		acc.accountType();		
		
		
	}
	

}
