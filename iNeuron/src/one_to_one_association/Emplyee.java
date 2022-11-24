package one_to_one_association;

public class Emplyee {
     private String eid;
     private String ename;
     private String eaddr;
     
     //HAS-A relationship
     Account account;

	public Emplyee(String eid, String ename, String eaddr, Account account) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddr = eaddr;
		this.account = account;
	}
     
     public void getEmployeDetails() {
    	 System.out.println("Employee Details Are :::::");
    	 System.out.println("EID  :: "+eid);
    	 System.out.println("EMP NAME :: "+ename);
    	 System.out.println("EMP ADDR :: "+eaddr);
    	 System.out.println("==========================");
    	 System.out.println("ACCOUNT DETAILS ARE ::  ");
    	 System.out.println("ACCNO :: "+account.accNo);
    	 System.out.println("ACCNAME :: "+account.accName);
    	 System.out.println("ACCType :: "+account.accType);
     }
     
     
}





