package inheritance_concept;

class Parent{
	int a,b,c;
	Parent(){
		this(111,222);
		a=10;
		b=20;
		System.out.println("Parent constructor");
	}
	Parent(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("Parent parameterized constrctor");
	}
}
class Child extends Parent{
	int x,y;
	Child(){
		super();
		x=111;
		y=222;
		System.out.println("Child class constructor");
	}
	Child(int x,int y){
		super(x,y);
		this.x=x;
		this.y=y;
	}
	void disp() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
}
public class MainClass2 {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.disp();
	}
}
