package static_concept;

class Demo{
	int a;
	int b;
	static int count;
	
	{               //non-static java block,it executes as many time as object is created
		count++;
		System.out.println("Hello");
	}
	Demo(){
		System.out.println("default constructor");
	}
	Demo(int a){
		System.out.println("parameterized constructor");
		this.a=a;
	}
	Demo(int a,int b){
		System.out.println("double parameterized constructor");
		this.a=a;
		this.b=b;
	}
}
public class Main {
   public static void main(String[] args) {
	   Demo d1 = new Demo();
	   Demo d2 = new Demo(10);
	   Demo d3 = new Demo(10,20);
	   System.out.println(Demo.count);
}
}
