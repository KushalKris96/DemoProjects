package iNeuron;

public class CodeSnippet1 {
   public static void main(String[] args) {
	   int x=10,y=15;
	  /* if(++x<10 || ++y>15) { //11<10 16>15 Short Circuit OR -> second operand evaluation will happen only 
	   * if first operand result is false 
		   x++;                 //  11++
	   }else {              // x=12 y=16
		   y++;
	   }
	   System.out.println(x+"---"+y); */
	   
	  /* if(++x<10 && ++y>15) { //11<10   Short circuit AND -> second operand evaluation will happen only
	   * if first operand result is true
		   x++;                 //  11++
	   }else {              // x=11 y=16
		   y++;
	   }
	   System.out.println(x+"---"+y); */
	   
	/*   if(++x<10 | ++y>15) { // 11<10 | 16>15  //Logical OR
		   x++;                 //  11++ 
	   }else {              
		   y++;
	   }
	   System.out.println(x+"---"+y); // x=12 y=16 */
	   
	   if(++x<10 & ++y>15) { // 11<10 & 16>15  //Logical AND
		   x++;               
	   }else {              
		   y++;      //16++
	   }
	   System.out.println(x+"---"+y); // x=11 y=17
  }
}
