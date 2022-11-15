package demoApp;

public class DemoApp {
  public static void main(String[] args) {
	int[] a= {10,20,30,40};
	for (int e : a) {
		System.out.print(e+" ");
	}
	String name="sachin";
	int count = name.toUpperCase().length();
	System.out.println("The length of the string is : "+count);
}
}
