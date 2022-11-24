package iNeuron;

public class Pattern4 {

	public static void main(String[] args) {
		int n=12;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if( i==j || j==0 || j==n-1 || i+j==n-1 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
