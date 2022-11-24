package inheritance_concept;

class Demo1{
	int age=50;
	void display() {
		System.out.println(age);
	}
}
class Demo2 extends Demo1{
	int age = 26;
	void display() {
		System.out.println("I am child");
		System.out.println(age);
	}
}
public class MainClass4 {
     public static void main(String[] args) {
    	 Demo1 d1 = new Demo2();
    	 d1.display();
	}
}
