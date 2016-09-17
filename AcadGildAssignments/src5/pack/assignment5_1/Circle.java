/*
 * Class Module to find Area and Perimeter of a Circle.
 */
package pack.assignment5_1;

public class Circle extends pack.assignment5_1.Figure {
	private double radius;

	public Circle(double r) {
		this.radius = r;
	}

	@Override
	public void findArea() {
		// TODO Auto-generated method stub

		double area = Math.PI * getRadius() * getRadius();
		System.out.format("Area of a Circle: %.3f\n",area);

	}

	@Override
	public void findPerimeter() {
		// TODO Auto-generated method stub
		double area_of_perimeter = 2 * Math.PI * getRadius();
		System.out.format("Perimeter of a Circle:%.3f\n",area_of_perimeter);

	}

	public double getRadius() {
		return radius;
	}

}
