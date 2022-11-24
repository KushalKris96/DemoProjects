package inheritance_concept;

class Parent1{
	Parent1(){
		System.out.println("Parent class constructor");
	}
	void disp() {
		System.out.println("Parent class disp method");
	}
}
class Child1 extends Parent1  {
	Child1(){
		
	}
	void disp2() {
		System.out.println("Child class disp method");
	}
}
public class MainClass {
     public static void main(String[] args) {
    	 Child1 ch = new Child1();
    	 ch.disp();
	}
}
