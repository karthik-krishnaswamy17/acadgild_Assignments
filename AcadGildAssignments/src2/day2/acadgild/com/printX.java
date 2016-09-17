/*
 * Program to print X
 */
package day2.acadgild.com;

public class printX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size=9,sum;
		
		/* Taking X pattern in the matrix format*/
		
		for (int row = 0; row < size; row++) {
	        for (int column = 0; column < size; column++) {
	        	sum=(row + column)+1;
	            if (row == column  || sum == size) { 
	                System.out.print("x");
	            } else {
	                System.out.print("_");
	            }
	        }
	        System.out.println();
	    }
		
		
			
		

	}

}
