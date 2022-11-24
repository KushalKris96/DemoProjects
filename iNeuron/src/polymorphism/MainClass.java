package polymorphism;

class Parent{
	public void cry() {
		System.out.println("cry() method from parent class");
	}
}
class Child1 extends Parent{
	public void cry() {
		System.out.println("cry() method from Child-1 class");
	}
	public void eat() {
		System.out.println("eat() method from Child-1 class");
	}
}
class Child2 extends Parent{
	public void cry() {
		System.out.println("cry() method from Child-2 class");
	}
	public void eat() {
		System.out.println("eat() method from Child-2 class");
	}
}
public class MainClass {
   public static void main(String[] args) {
	        Parent p1 = new Child1();  //UpCasting or loose Coupling to achieve Polymorphism
	        p1.cry();
	        
	        ((Child1)p1).eat();  //DownCasting--to call specialized method of child
	        
	        Parent p2 = new Child2();
	        ((Child2)p2).eat();   //DownCasting--to call specialized method of child
	     
   }
}




