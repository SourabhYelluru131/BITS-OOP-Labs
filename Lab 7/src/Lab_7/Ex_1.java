package Lab_7;
interface Movable {
	public void moveUp();
	public void moveDown();
	public void moveRight();
	public void moveLeft();
}
class MovablePoint implements Movable {
	int x, y , xSpeed, ySpeed ; // package access
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public String toString() {
		return "Point at (" + x + " ," + y + ")";
	}
	public void moveUp() {
		y -= ySpeed;
	}
	public void moveDown() {
		y += ySpeed;
	}
	public void moveLeft() {
		x -= xSpeed;
	}
	public void moveRight() {
		x += xSpeed;
	}
}
class MovableCircle implements Movable {
	private MovablePoint center;
	private int radius;
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		center = new MovablePoint(x,y,xSpeed,ySpeed);
		this.radius = radius;
	}
	public String toString() {
		return "Centre at (" + center.x + " ," + center.y + ")";
	}
	public void moveUp() {
		center.y -= center.ySpeed;
	}
	public void moveDown() {
		center.y += center.ySpeed;
	}
	public void moveLeft() {
		center.x -= center.xSpeed;
	}
	public void moveRight() {
		center.x += center.xSpeed;
	}
}
public class Ex_1 {
	public static void main(String[] args) {
		Movable m1 = new MovablePoint(5,6,10,10);
		System.out.println(m1);
		m1.moveLeft();
		System.out.println(m1);
		Movable m2 = new MovableCircle(2,1,2,5,20);
		System.out.println(m2);
		m2.moveRight();
		System.out.println(m2);
	}
}
