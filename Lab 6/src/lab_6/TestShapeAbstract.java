package lab_6;
abstract class Shape {
	private String colour;
	
	public Shape(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Shape of colour = \"" + colour + "\"";
	}
	abstract public double getArea();
}
public class TestShapeAbstract {
	public static void main(String[] args) {
		Shape s1 = new Rectangle("red",4,5);
		System.out.println(s1);
		System.out.println("Area is " + s1.getArea());
		Shape s2 = new Triangle("blue", 4, 5);
		System.out.println(s2);
		System.out.println("Area is " + s2.getArea());
		//Shape s3 = new Shape("green"); //Compilation Error!!
	}
}
