package one_to_many_association;

//Target Object
public class Department {

	private String did;
	private String dname;
	//HAS-A relationship
	private Employee[] emps;

	//Constructor Injection
	public Department(String did, String dname, Employee[] emps) {
		super();
		this.did = did;
		this.dname = dname;
		this.emps = emps;
	}
	
	public void getDepartmentDetails() {
		System.out.println("Department Details");
		System.out.println("-------------------");
		System.out.println("Department Id   : "+did);
		System.out.println("Department Name : "+dname);
		System.out.println();
		System.out.println("Employee Details are : ");
		System.out.println("----------------------------");
		for (Employee employee : emps) {
			System.out.println("EMP ID ::"+employee.eid);
			System.out.println("EMP NAME :: "+employee.ename);
			System.out.println("EMP ADDRESS :: "+employee.eaddr);
			System.out.println("----------------------------");
		}

	}
	
}
