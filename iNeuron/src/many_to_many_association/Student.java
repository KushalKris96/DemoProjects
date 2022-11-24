package many_to_many_association;

//Target Object
public class Student {

	private String sid;
	private String sname;
	private String saddr;
	
	//HAS-A variable
	private Course[] course;

	public Student(String sid, String sname, String saddr, Course[] course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddr = saddr;
		this.course = course;
	}	
	
	public void getStudentDetails() {
		System.out.println("Student Details ::::::::: ");
		System.out.println("Student Id :: "+sid);
		System.out.println("Student Name :: "+sname);
		System.out.println("Student Address :: "+saddr);
		System.out.println();
		System.out.println("Course Details ::::::::: ");
		for (Course courses : course) {
			System.out.println("Course ID   ::: "+courses.cid);
			System.out.println("Course Name ::: "+courses.cname);
			System.out.println("Course Cost ::: "+courses.ccost);
			System.out.println();
		}
		System.out.println("=====================================================");
	}
}
