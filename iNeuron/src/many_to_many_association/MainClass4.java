package many_to_many_association;

public class MainClass4 {
  public static void main(String[] args) {
	  Course c1 = new Course("101","Java",10000);
	  Course c2 = new Course("102","Spring",15000);
	  Course c3 = new Course("103","Microservices",8000);
	  
	  Course[] courses = new Course[3];
	  courses[0] = c1;
	  courses[1] = c2;
	  courses[2] = c3;
	  
	  Student s1 = new Student("10","Sachin","MI",courses);
	  Student s2 = new Student("7","Kushal","Bengaluru",courses);
	  Student s3 = new Student("18","Kohli","Delhi",courses);
	  
	  s1.getStudentDetails();
	  s2.getStudentDetails();
	  s3.getStudentDetails();
}
}
