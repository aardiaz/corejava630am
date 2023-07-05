package constrolstatments.selection;

public class LadderTest {
	
	/*
	 *   =============== else if (Ladder) ====================
	 *     syntax :
	 *     
	 *       if(condition-1){
	 *       
	 *       }
	 *       
	 *       else if(condition-2){
	 *       
	 *       }
	 *       
	 *       ...............
	 *       ................
	 *       ...............
	 *       else{
	 *       
	 *       }
	 */
	
	public static void main(String[] args) {
		
		 int age = 40;
		 
		 if(age >= 80) {
			 System.out.println("You are too old");
		 }
		 
		 else if(age >= 60) {
			 System.out.println("You are old");
		 }
		 
		 else if(age >= 40) {
			 System.out.println("You are Adult");
		 }
		 
		 else if(age >= 20) {
			 System.out.println("You are Bachelor");
		 }
		 
		 else if(age >= 13) {
			 System.out.println("You are Teenager");
		 }
		 else {
			 System.out.println("You are child");
		 }
		
	}

}




