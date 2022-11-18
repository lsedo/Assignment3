public class Customer {
	
	private int creditScore;
	private String ssn;
	private String customerID;
	private String address;
	private String phoneNumber;
	
	public Customer()
	{
		creditScore = 0;
		ssn = "xxx-xxx-xxxx";
		customerID = "xxxx";
		address = "n/a";
		phoneNumber = "xxx-xxx-xxxx";
	}
	
	public int getCreditScore()
	{
		return creditScore;
	}
	
	public String getSSN()
	{
		return ssn;
	}
	
	public String getCustomerID()
	{
		return customerID;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public void setCreditScore(int i)
	{
		creditScore = i;
	}
	
	public void setSSN(String s)
	{
		ssn = s;
	}
	
	public void setCustomerID(String s)
	{
		customerID = s;
	}
	
	public void setAddress(String s)
	{
		address = s;
	}
	
	public void setPhoneNumber(String s)
	{
		phoneNumber = s;
	}
	
	public String toString()
	{
		String s = "CUSTOMER DATA\n";
		s += "\tCredit score: " + getCreditScore()
		+  "\n\tSSN: " + getSSN()
		+  "\n\tID: " + getCustomerID()
		+  "\n\tAddress: " + getAddress()
		+  "\n\tPhone number: " + getPhoneNumber();
		
		return s;
	}
}
