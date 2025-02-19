package lesson12code;

public class Circle {

	static final double PI = 3.141532d;
	
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double calculatePerimeter() {
		return 2.0d * PI * radius;
	}
	
	public double calculateArea() {
		return Circle.PI * Math.pow(radius,2.0d);
	}

	private static double squarePI() {
		return PI * PI;
	}
	
	
	
}
