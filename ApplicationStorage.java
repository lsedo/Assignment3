import java.io.*;

public class ApplicationStorage {
	
	private String path;
	
	String[] applicantIDs;
	
	int numApplications;
	
	public ApplicationStorage(String s)
	{
		path = s;
		numApplications = 0;
		applicantIDs = new String[150];
	}
	
	public String getPath()
	{
		return path;
	}
	
	public void setPath(String s)
	{
		path = s;
	}
	
	//takes toString of credit application and saves it to a file. files are named according to the order in which they were saved.
	
	public void save(CreditApplication ca)
	{
		FileWriter fw;
		
		try {
			
			fw = new FileWriter(String.format("%04d", numApplications) + ".txt");
			
			fw.write(ca.toString());
			
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		applicantIDs[numApplications] = ca.getApplicant().getCustomerID();
		numApplications++;
	}
	
	//open file, read from string dump and return a CreditApplication
	
	public CreditApplication readByFile(String file)
	{
		String[] params = parseFileData(fileDump(file));
		
		return populateApplication(params);
	}
	
	public CreditApplication readByID(String id)
	{
		for(int x = 0; x < numApplications; x++)
		{
			if(applicantIDs[x].equals(id))
			{
				String[] params = parseFileData(fileDump(String.format("%04d", x)));
				
				return populateApplication(params);
			}
		}
		
		return null;

	}
	
	//initialize customer and application objects with parameters
	
	public CreditApplication populateApplication(String[] params)
	{
		Customer applicant = new Customer();
		CreditApplication ca = new CreditApplication();
		
		applicant.setCreditScore(Integer.parseInt(params[0]));
		applicant.setSSN(params[1]);
		applicant.setCustomerID(params[2]);
		applicant.setAddress(params[3]);
		applicant.setPhoneNumber(params[4]);
		
		ca.setFirstName(params[5]);
		ca.setLastName(params[6]);
		ca.setAcctNumber(Integer.parseInt(params[7]));
		ca.setStatus(Integer.parseInt(params[8].substring(0, params[8].length() - 1)));
		
		ca.setApplicant(applicant);
		
		return ca;
	}
	
	//open file, dump all contents into char array and concatenate non-null characters to a single string
	
	public String fileDump(String file)
	{
		String s = "";
		FileReader fr;
		
		try {
			fr = new FileReader(file + ".txt");
			char[] arr = new char[500];
			fr.read(arr);
			
			for(int i = 0; i < 500; i++)
			{
				s += arr[i];
				
				if(arr[i] == '\0')
				{
					i = 500;
				}
			}
			
			fr.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return s;
	}
	
	//read string dump and separate field parameters into array
	
	public String[] parseFileData(String s)
	{
		String[] arr = new String[9];
		
		int arrIndex = 0;
		int x = 0;
		
		while(x < s.length() && arrIndex < 9)
		{
			if(s.charAt(x) == ':')
			{
				int y = x;
				
				while(y < s.length()  && s.charAt(y) != '\n')
				{
					y++;
				}
				
				arr[arrIndex] = s.substring(x + 2, y);
				arrIndex++;
			}
			
			x++;
		}
		
		return arr;
	}

}
