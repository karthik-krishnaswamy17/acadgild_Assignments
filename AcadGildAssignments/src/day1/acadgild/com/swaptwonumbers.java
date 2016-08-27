package day1.acadgild.com;

import java.util.Scanner;

public class swaptwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter two numbers");
		System.out.println("Enter number one A:");
		int a = reader.nextInt();
		System.out.println("Enter number two B:");
		int b = reader.nextInt();
		System.out.println("Before Swapping:");
		System.out.println("A:"+a+" B:"+b);
		System.out.println("After Swapping:");
		swap(a,b);
		reader.close();
	}

	private static void swap(int a, int b) {
		// TODO Auto-generated method stub
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("A:"+a+" B:"+b);
	}

}
