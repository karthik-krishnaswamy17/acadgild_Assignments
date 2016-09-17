/*
 * Program to find Area & Perimeter of a Circle,Rectangle and Triangle. 
 */

package day5.acadgild.com;

import java.util.Scanner;

import pack.assignment5_1.Circle;
import pack.assignment5_1.Rectangle;
import pack.assignment5_1.Triangle;

public class Assignment5_1 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.println("\n-----Area and Perimeter of a Circle-----");
		System.out.println("Enter radius: ");
		double radius_of_circle = reader.nextFloat();
		Circle circle = new Circle(radius_of_circle);
		circle.findArea();
		circle.findPerimeter();

		System.out.println("\n-----Area and Perimeter of a Rectangle-----");
		System.out.println("Enter Width: ");
		double width_of_rectangle = reader.nextFloat();
		System.out.println("Enter Length: ");
		double length_of_rectangle = reader.nextFloat();
		Rectangle rect = new Rectangle(width_of_rectangle, length_of_rectangle);
		rect.findArea();
		rect.findPerimeter();

		System.out.println("\n-----Area and Perimeter of a Triangle-----");
		System.out.println("Enter Base: ");
		double base_of_triangle = reader.nextFloat();
		System.out.println("Enter Height: ");
		double height_of_triangle = reader.nextFloat();
		System.out.println("Enter Left Side: ");
		double left_side = reader.nextFloat();
		System.out.println("Enter Right Side: ");
		double right_side = reader.nextFloat();
		Triangle triangle = new Triangle(base_of_triangle, height_of_triangle, left_side, right_side);
		triangle.findArea();
		triangle.findPerimeter();

		reader.close();

	}

}
