package constrolstatments.looping;

public class WhileTest {
	/*
	 *  syntax :
	 *  
	 *     while(condition){
	 *     
	 *           //statements
	 *     }
	 */
	
	public static void main(String[] args) {
		
		// 5! = 5 * 4 * 3 * 2 =  120
		
		int n = 5;
		int fact = 1;
		
		while(n > 1) {
			
			fact = fact * n;
			
			n--;
		}
		
		System.out.println("Factorial = "+fact);
		
	}

}
