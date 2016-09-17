/*
 * Class Module to find Area and Perimeter of a Triangle.
 */
package pack.assignment5_1;

public class Triangle extends pack.assignment5_1.Figure {
	double base_of_triangle, height_of_triangle, left_side, right_side;

	public double getLeft_side() {
		return left_side;
	}

	public double getRight_side() {
		return right_side;
	}

	public Triangle(double b, double h, double ls, double rs) {
		this.base_of_triangle = b;
		this.height_of_triangle = h;
		this.left_side = ls;
		this.right_side = rs;
	}

	public double getBase_of_triangle() {
		return base_of_triangle;
	}

	public double getHeight_of_triangle() {
		return height_of_triangle;
	}

	@Override
	public void findArea() {
		double area = (getBase_of_triangle() * getHeight_of_triangle()) / 2;
		System.out.format("Area of a Triangle: %.3f\n", area);

	}

	@Override
	public void findPerimeter() {
		double perimeter = getBase_of_triangle() + getLeft_side() + getRight_side();
		System.out.format("Perimeter of a Triangle: %.3f\n", perimeter);
	}
}
