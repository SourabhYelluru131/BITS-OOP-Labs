package lab_6;


public class TestCylinder {
	public void main(String[] args) {
		Cylinder cy1 = new Cylinder();
		System.out.println("Radius is " + cy1.getRadius()+ 
				"Height is " + cy1.getHeight() +
				"Colour is " +cy1.getColour() +
				"Base Area is " + cy1.getArea() +
				"Volume is " + cy1.getVolume());
		Cylinder cy2 = new Cylinder(5.0,2.0);
		System.out.println("Radius is " + cy2.getRadius()+ 
				"Height is " + cy2.getHeight() +
				"Colour is " +cy2.getColour() +
				"Base Area is " + cy2.getArea() +
				"Volume is " + cy2.getVolume());
	}
}
