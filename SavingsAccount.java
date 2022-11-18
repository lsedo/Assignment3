
public class SavingsAccount {
	
	private int acctNumber;
	private String customerID;
	private double balance;
	private boolean active;

	public SavingsAccount()
	{
		acctNumber = -1;
		customerID = "xxxx";
		balance = -1;
		active = false;
	}
	
	public int getAcctNumber()
	{
		return acctNumber;
	}
	
	public String getCustomerID()
	{
		return customerID;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public boolean isActive()
	{
		return active;
	}
	
	public void setAcctNumber(int i)
	{
		acctNumber = i;
	}
	
	public void setCustomerID(String s)
	{
		customerID = s;
	}
	
	public void setBalance(double d)
	{
		balance = d;
	}
	
	public void setActive(boolean a)
	{
		active = a;
	}
}
