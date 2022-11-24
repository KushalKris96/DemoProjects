package one_to_many_association;

public class MainClass2 {

	public static void main(String[] args) {
		Employee e1 = new Employee("10","Sachin","Mi");
		Employee e2 = new Employee("7","Dhoni","CSK");
		Employee e3 = new Employee("18","Kohli","BLR");
		
		Employee[] emps = new Employee[3];
		emps[0] = e1;
		emps[1] = e2;
		emps[2] = e3;
		
		//Constructor Injection
		Department dept = new Department("101","Cricket",emps);
		dept.getDepartmentDetails();
	}
}
