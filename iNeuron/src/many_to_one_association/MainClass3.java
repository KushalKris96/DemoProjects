package many_to_one_association;

public class MainClass3 {

	public static void main(String[] args) {
		Branch br = new Branch();
		br.setBid("IND100");
		br.setBname("INDIA");
		
		Student student = new Student();
		student.setSid("10");
		student.setSname("Sachin");
		student.setSaddr("MI");
		student.setBranch(br);
		
		Student student2 = new Student();
		student2.setSid("7");
		student2.setSname("Dhoni");
		student2.setSaddr("CSK");
		student2.setBranch(br);
		
		Student student3 = new Student();
		student3.setSid("18");
		student3.setSname("Kohli");
		student3.setSaddr("Bengaluru");
		student3.setBranch(br);
		
		System.out.println("Student ID is :: "+student.getSid());
		System.out.println("Student Name is :: "+student.getSname());
		System.out.println("Student address is :: "+student.getSaddr());
		System.out.println("Branch Details::::::::::::");
		System.out.println("Branch ID is :: "+student.getBranch().getBid());
		System.out.println("Branch name is :: "+student.getBranch().getBname());
		System.out.println("------------------------------------------------");
		System.out.println("Student ID is :: "+student2.getSid());
		System.out.println("Student Name is :: "+student2.getSname());
		System.out.println("Student address is :: "+student2.getSaddr());
		System.out.println("Branch Details::::::::::::");
		System.out.println("Branch ID is :: "+student2.getBranch().getBid());
		System.out.println("Branch name is :: "+student2.getBranch().getBname());
		System.out.println("------------------------------------------------");
		System.out.println("Student ID is :: "+student3.getSid());
		System.out.println("Student Name is :: "+student3.getSname());
		System.out.println("Student address is :: "+student3.getSaddr());
		System.out.println("Branch Details::::::::::::");
		System.out.println("Branch ID is :: "+student3.getBranch().getBid());
		System.out.println("Branch name is :: "+student3.getBranch().getBname());
	}
	

	
}
