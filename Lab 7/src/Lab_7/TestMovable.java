package Lab_7;

interface Movable{
	public void moveUp();
	public void moveDown();
	public void moveLeft();
	public void moveRight();
}
class MovablePoint implements Movable {
	//coordinates
	private int x;
	private int y;
	
	//Constructor
	public MovablePoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "Point at (" + x + " ," + y + ")";
	}
	
	//Implementation of interface methods
	public void moveUp() {
		y--;
	}
	public void moveDown() {
		y++;
	}
	public void moveLeft() {
		x--;
	}
	public void moveRight() {
		x++;
	}
}
public class TestMovable {
	public static void main(String[] args) {
		Movable m1 = new MovablePoint(5,5); //upcast
		System.out.println(m1);
		m1.moveDown();
		System.out.println(m1);
		m1.moveRight();
		System.out.println(m1);
	}
}
