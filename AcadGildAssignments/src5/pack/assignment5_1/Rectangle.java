/*
 * Class Module to find Area and Perimeter of a Rectangle.
 */
package pack.assignment5_1;

public class Rectangle extends pack.assignment5_1.Figure {

	private double width_of_rectangle, length_of_rectangle;

	public Rectangle(double w, double l) {

		this.width_of_rectangle = w;
		this.length_of_rectangle = l;
	}

	@Override
	public void findArea() {
		double area = getWidth_of_rectangle() * getLength_of_rectangle();
		System.out.format("Area of a Rectnagle: %.3f\n", area);

	}

	@Override
	public void findPerimeter() {
		double perimeter = 2 * (getWidth_of_rectangle() + getLength_of_rectangle());
		System.out.format("Perimeter of a Rectnagle: %.3f\n", perimeter);
	}

	public double getWidth_of_rectangle() {
		return width_of_rectangle;
	}

	public double getLength_of_rectangle() {
		return length_of_rectangle;
	}

}
