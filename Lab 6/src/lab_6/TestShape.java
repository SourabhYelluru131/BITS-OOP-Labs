package lab_6;
/*class Shape{
	private String colour;
	public Shape(String colour) {
		this.colour = colour;
	}
	
	@Override
	public String toString() {
		return "Shape of colour=\"" + colour +"\"";
	}
	public double getArea() {
		System.err.println("Shape unknown! Cannot compute area!");
		return 0;
	}
}*/
class Rectangle extends Shape {
	private int length;
	private int width;
	
	public Rectangle(String colour, int length, int width) {
		super(colour);
		this.length = length;
		this.width = width;
	}
	@Override
	public String toString() {
		return "Rectangle of length=" + length + " and width=" + width + ", subclass of " + super.toString();
	}
	@Override
	public double getArea() {
		return length*width;
	}
}
class Triangle extends Shape {
	private int base;
	private int height;
	public Triangle(String colour, int base, int height) {
		super(colour);
		this.base = base;
		this.height = height;
	}
	@Override
	public String toString() {
		return "Traingle of base=" + base + " and height=" + height + ", subclass of " + super.toString();
	}
	@Override
	public double getArea() {
		return 0.5*base*height;
	}
}
public class TestShape {
	public static void main(String[] args) {
		Shape s1 = new Rectangle("red",4,5);
		System.out.println(s1);
		System.out.println("Area is " + s1.getArea());
		Shape s2 = new Triangle("blue", 4, 5);
		System.out.println(s2);
		System.out.println("Area is " + s2.getArea());
	}
}
