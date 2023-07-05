package array;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		
		int age[] = new int[5];

		 /*   0 1 2 3 4
		  *   [][][][][]
		  *   <--age--->
		  */
		
		//write data in array
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<age.length; i++) {
			
			System.out.println("Enter your age ");
			 age[i] = sc.nextInt();
		}
		
		//read data from array
		for(int x : age) {
			System.out.println(x);
		}
		
		 /*
        Q1>  WAP to calculate total and average price of 10 books.

        Q2>  Subject          Marks
        	-------         -------
        	Math              99
        	English           90
        	....              ..
        	.....             ..
        	....              ...
          ----------------------------
      		Total        =      ?
      		Percent      =      ?
          -----------------------------

   */
	
		
	}

}
