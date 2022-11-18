
public class CheckingAccount extends SavingsAccount{
	
	private double wLimit;
	
	public CheckingAccount()
	{
		super();
		
		wLimit = 0;
	}
	
	//withdraw funds from balance. amount must be less than wLimit
	//and greater than 0
	
	public double withdraw(double amt)
	{
		if(amt <= wLimit && amt > 0)
		{
			double b = this.getBalance();
			b -= amt;
			this.setBalance(b);
			
			return b;
		}
		else
		{
			return -1;
		}
	}
	
	//deposit funds into balance. amount must be greater than 0.
	
	public double deposit(double amt)
	{
		if(amt > 0)
		{
			double b = this.getBalance();
			b += amt;	
			this.setBalance(b);
			
			return b;
		}
		else
		{
			return -1;
		}
		

	}

}
