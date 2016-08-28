/*
 * Program to calculate sum of two numbers without using + Operator.
 */
package day1.acadgild.com;

import java.util.Scanner;

public class sumoftwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter two numbers");
		System.out.println("Enter number one___");
		int a = reader.nextInt();
		System.out.println("Enter number two___");
		int b = reader.nextInt();
		System.out.println("Sum:" + sum(a, b));
		reader.close();

	}

	private static int sum(int a, int b) {
		// TODO Auto-generated method stub
		return (a - (-b));
	}

}
