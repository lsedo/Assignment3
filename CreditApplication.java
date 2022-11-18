
public class CreditApplication {
	
	private Customer applicant;
	
	private String fName;
	private String lName;
	
	private int acctNumber;
	private int status;
	
	public CreditApplication()
	{
		applicant = new Customer();
		
		fName = "John";
		lName = "Doe";
		
		acctNumber = -1;
		status = -1;
	}
	
	public Customer getApplicant()
	{
		return applicant;
	}
	
	public int getAcctNumber()
	{
		return acctNumber;
	}
	
	public int getStatus()
	{
		return status;
	}
	
	public String getName()
	{
		return fName + " " + lName;
	}
	
	public void setApplicant(Customer a)
	{
		applicant = a;
	}
	
	public void setAcctNumber(int i)
	{
		acctNumber = i;
	}
	
	public void setStatus(int i)
	{
		status = i;
	}
	
	public void setFirstName(String s)
	{
		fName = s;
	}
	
	public void setLastName(String s)
	{
		lName = s;
	}
	
	public String getCustomerData()
	{
		return applicant.toString();
	}

}
