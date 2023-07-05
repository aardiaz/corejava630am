package datatypes;

public class TypeCasting {
	
	/*
	 *  ================== Type Casting ================
	 *    1> implicit type casting(auto casting) :
	 *    	byte -> short -> int -> long -> float -> double 
	 *    
	 *    2> explicit type casting(By force casting) :
	 *    	double -> float -> long -> int -> short -> byte -> char
	 *    
	 *      syntax :
	 *        
	 *          data_type    var =  (data_type) value;
	 */
	
	public static void main(String[] args) {
		
		   long k = 334343;
		   int p = (int) k;//explicit casting
		   
		   double a =34334345.44545;
		   long m = (long)a; //explicit casting
		   
		   int x = 50000;
		   double w = x;//auto casting
		   
		    byte t = 90;
		   System.out.println((char)t);
	}

}
