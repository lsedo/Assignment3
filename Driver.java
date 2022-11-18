import java.io.*;

public class Driver {
	
	public static void main(String[] args)
	{
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		CreditApplication ca1 = new CreditApplication();
		CreditApplication ca2 = new CreditApplication();
		ApplicationStorage as = new ApplicationStorage("test");
		
		ca1.setApplicant(c1);
		
		c2.setCustomerID("1234");	
		ca2.setApplicant(c2);
		ca2.setFirstName("Lazo");
		ca2.setLastName("Sedor");
		
		as.save(ca1);
		as.save(ca1);
		as.save(ca1);
		as.save(ca1);
		as.save(ca2);
		
		c2.setCustomerID("6789");	
		ca2.setApplicant(c2);
		ca2.setFirstName("Erasmus");
		ca2.setLastName("Kincade");
		
		as.save(ca2);
		as.save(ca1);
		as.save(ca1);
		as.save(ca1);
		
		System.out.println(as.readByID("1234").toString());
		System.out.println(as.readByID("6789").toString());
	}

}
