package inheritance_concept;
//co-variant return type concept
class Interest{
	
}
class InterestPersonalLoan extends Interest{
	
}
class Loans{
	public Interest interest() {         //parent return type
		Interest it = new Interest();
		return it;
	}
}
class PersonalLoan extends Loans{     
      public InterestPersonalLoan interest() {   //child return type
    	  InterestPersonalLoan ipl = new InterestPersonalLoan();
    	  return ipl;
	  }
}
public class LaunchLoans {
   public static void main(String[] args) {

		/*
		 * String st =" Ineuron\tT "; System.out.println(st);
		 * System.out.println(st.length()); String str = "  Ineuron\tT   ".strip();
		 * System.out.println(str); System.out.println(str.length());
		 */
	   String s1 = "sachin ramesh tendulkar";
       System.out.println(s1.substring(8,4));
   }
}
