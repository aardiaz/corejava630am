package array;

import java.util.Arrays;

import javax.lang.model.type.PrimitiveType;

public class ArrayWithMethod {
	/*
	 * ================ Array With Method ============
	 * 
	 *    1> Array as parameter/argument:
	 *    	
	 *         void sum(int  a[]){

	 *         }
	 *         sum(array);
	 *         
	 *    
	 *    2> Array as return type:
	 *    
	 *       int[]  get20IntValues(){
	 *       
	 *        // array = 9000,34543,4545,45,4656,5,65,65,656,56,65,6565;
	 *       
	 *          return array;
	 *       }
	 *       
	 */
	
	    public static void main(String[] args) {
			
//	    	int data[] = {89,76,54,32,456,78,97,65,43,567,876,54,35};
//	    	 add(data);
//	    	 
//	    	   int[]  odds = getOddNumsFrom1To100();
//	    	   System.out.println(Arrays.toString(odds));
//	    	   
//	    	   add(odds);
	    	
	    	//printArray(new String[] {"aaa","ddd","eee","ffdfdf","hhhhh"});
	        printArray(getStringArray());
		}
	
	    
	    //=============== array as arguments ============================
	   static void add(int values[]) {
	    	
	    	int s = 0;
	    	
	    	for(int x : values) {
	    		s = s + x;
	    	}
	    	
	    	System.out.println("Total = "+s);
	    }
	      
	//=================== array as return type =====================
	  static int[] getOddNumsFrom1To100() {
		   
		     int oddnums[] =  new int[50];
		     
		     int j = 0;
		   
		     for(int i=1; i<=100; i++) {
		    	 
		    	    if(i%2 != 0) {
		    	    	oddnums[j] = i;
		    	    	j++;
		    	    }
		     }
		   
		     return oddnums;
	   }
	  
	  
	  
	  
	 static void printArray(String array[]) {
		  
		  System.out.println(Arrays.toString(array));
	  }
	 
	 
	static String[] getStringArray() {
		 
		 String[]  array = {"aaa","ddd","eee","ffdfdf","hhhhh"};
		 
		 return array;
		 
	 }
	  
	/*
	 * Q1> WAP to print sub array of numbers divided by 5 from given array.
	 *     2,34,5,67,5,64,3,23,4,56,75,434,3,56,45,66,5,65,467,5,43,45
	 */

}
