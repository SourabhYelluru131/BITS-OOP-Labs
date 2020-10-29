package Lab_8;

public class Anonymous {
	public Circle getCircle(int radius) {
		//One line of code
		return new Circle(radius);
	}
	public static void main(String[] args) {
		Anonymous p = new Anonymous();
		Circle w = p.getCircle(10);
		System.out.println(w.area());
	}
}
class Circle{
	private int rad;
	public Circle(int radius) {
		rad = radius;
	}
	public double area() {
		return rad*rad;
	}
}
