package polymorphism;

abstract class Plane{
    int a;
	abstract public void takeOff();
	abstract public void fly();
	abstract public void landing();
	public void airport() {
		System.out.println("All planes need airport");
	}
}
public class MainClass2 {

}
