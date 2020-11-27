package Lab_10;
interface Shape{
	void draw();
}
class Rectangle implements Shape{
	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method");
	}
}
class Square implements Shape{
	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method");
	}
}
class Circle implements Shape{
	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method");
	}
}
class ShapeFactory{
	// use getShape() method to get object of type shape
	public Shape getShape(String shapeType) {
		if(shapeType==null) {
			return null;
		}
		if(shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}
		else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		else if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}
	
}
public class FactoryPatternDemo {
	public static void main(String [] args) {
		ShapeFactory sf = new ShapeFactory();
		Shape shape1 = sf.getShape("CIRCLE");
		shape1.draw();
		Shape shape2 = sf.getShape("RECTANGLE");
		shape2.draw();
		Shape shape3 = sf.getShape("CIRCLE");
		shape3.draw();
	}
}
