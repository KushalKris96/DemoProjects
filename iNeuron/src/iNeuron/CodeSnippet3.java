package iNeuron;

public class CodeSnippet3 {

	public static void main(String[] args) {
		int i=10;
		int j=20; // j+=1 j=j+1
		int k=(j+=i)/5;  // k=((j=j+i))/5  k=(j=30)/5
		System.out.println(i+":"+j+":"+k);
	}
}
