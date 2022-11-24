package inheritance_concept;

class A{
	public void show() {
		System.out.println("In class A");
	}
}
class B extends A{
//	void show() {  you cannot reduce the visibiliy for method overriding
//		
//	}
	public void show() {
		System.out.println("In class B");
	}
}
public class MainClass3 {

	public static void main(String[] args) {
		A obj = new B();
		obj.show();
	}
}
