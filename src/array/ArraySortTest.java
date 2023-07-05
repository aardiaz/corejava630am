package array;

import java.util.Arrays;

public class ArraySortTest {
	
	public static void main(String[] args) {
		
		int data[] = {67,4,34,56,748,6,54,32,3,13,46,5};
		Arrays.sort(data);
		
		System.out.println(Arrays.toString(data));
		
		System.out.println("=========reverse array =======");

		for(int i=data.length-1; i>=0; i--) {
			
			System.out.print(data[i]+" ,  ");
		}
	}
	

}
