package lab_6;


public class Circle {
	private double radius;
	private String colour;
	public Circle() {
		radius = 1.0;
		colour = "red";
	}
	public Circle (double r) {
		radius = r;
		colour = "red";
	}
	public Circle(double r, String c) {
		radius = r;
		colour = c;
	}
	public double getRadius() {
		return radius;
	}
	public String getColour() {
		return colour;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
}
