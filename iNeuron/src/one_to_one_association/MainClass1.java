package one_to_one_association;

public class MainClass1 {
 
	public static void main(String[] args) {
		 Account account = new Account("ABC123","sachin","Savings");
                             //constructor injection
        Emplyee emplyee = new Emplyee("IND10","sachin","MI",account);
        
        emplyee.getEmployeDetails();
	}
	
}
