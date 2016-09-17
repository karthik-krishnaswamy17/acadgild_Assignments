/*
 * Program to find highest of three numbers;
 */
package day2.acadgild.com;

import java.util.Scanner;

public class HighestNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int a=0, b=10, c=4, large;
		System.out.println("Enter number 1:");
		a = reader.nextInt(2);
		System.out.println("Enter number 2:");
	    b = reader.nextInt();
		System.out.println("Enter number 3:");
		c = reader.nextInt();
		if (a > b && a > c)
			large = a;
		else if (b > c)
			large = b;
		else
			large = c;
		System.out.println("Largest number :" + large);

	}

}
