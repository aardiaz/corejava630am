package method;

public class MethodTest {

	public static void main(String[] args) {
       
		 //sum();
		//printTable(456);
		  int x = getSumof1to100();
		  System.out.println("Sum of 100 nums = "+x);
		  
		  int sv = findSmallestValue(6789, 67898);
		  System.out.println("Smallest value = "+sv);
	}

	// 1. no return type with no arguments
	static void sum() {
		int a = 6000;
		int b = 7689;

		int s = a + b;
		System.out.println("Total sum = " + s);
	}

	// 2. no return type with arguments
	static void printTable(int n) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}

	}

	//3. return type with no arguments
	static int getSumof1to100() {

		int s = 0;

		for (int i = 1; i <= 100; i++) {
			s = s + i;
		}

		return s;
	}
	
//4.  return type with arguments
	static int  findSmallestValue(int x, int y) {
		
		   if(x < y) {
			   return x;
		   }
		   return y;
	}
	

	   /*
	    *  Q> Find area and volume as :
	    *    a> getArea :
	    *       ->  pass l and b as parameters
	    *       ->  calculate area
	    *       ->  return area
	    *       ->  call this method in main
	    *       
	    *   b> volume :
	    *      -> pass area and h as param
	    *      -> calculate volume
	    *      -> print area
	    *      -> print volume
	    *      -> call this method in main    
	    *      
	    *      
	    *   Q>  SI and Amount using following methods:
	    *      a> input
	    *      b> processing
	    *      c> output   
	    */
	   

}
