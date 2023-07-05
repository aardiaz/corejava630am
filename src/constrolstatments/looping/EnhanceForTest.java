package constrolstatments.looping;

public class EnhanceForTest {
	/*
	 *  ================ Enhance For loop/forEach =====================
	 *  # use to read data from collection(array,list,map,set etc.).
	 *  
	 *  syntax :
	 *    
	 *       for(data_type    var : collection){
	 *       
	 *             //statements
	 *        }
	 */
	
	public static void main(String[] args) {
		
		int[]  values = {9,8,76,56,78,76,54,56,787,6,5,46,76,57,87,67};
		int s = 0 ;
		
		for(int x : values) {
			System.out.println(x);
			s = s + x;
		}
		
		System.out.println("Total = "+s);
		
	}

}
