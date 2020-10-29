package Lab_8;
interface Movable{
	void moveUp();
	void moveDown();
	void moveLeft();
	void moveRight();
}
class MovablePoint implements Movable,Comparable{
	public int x;
	public int y;
	public int xSpeed;
	public int ySpeed;
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public void moveUp() {
		y = y+ySpeed;
	}

	public void moveDown() {
		y = y-ySpeed;
	}
	public void moveLeft() {
		x = x-xSpeed;
	}
	public void moveRight() {
		x = x+xSpeed;
	}
	public String toString() {
		return x+","+y;
	}
	@Override
	public int compareTo(Object o) {
		MovablePoint other = (MovablePoint) o;
		if(other.xSpeed != this.xSpeed) return other.xSpeed-this.xSpeed; 
		else return other.ySpeed-this.ySpeed;
	}
}
class MovableCircle implements Movable,Comparable{
	public int radius;
	public MovablePoint centre;
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		this.radius = radius;
		centre = new MovablePoint(x,y,xSpeed,ySpeed);
	}
	public void moveUp() {
		centre.moveUp();
	}

	public void moveDown() {
		centre.moveDown();
	}
	public void moveLeft() {
		centre.moveLeft();
	}
	public void moveRight() {
		centre.moveRight();
	}
	public String toString() {
		return "Centre = ("+centre+"), radius= "+radius;
	}

	@Override
	public int compareTo(Object o) {
		MovableCircle other = (MovableCircle) o;
		return other.radius-this.radius;
	}
}
public class Ex_7 {
	public static void main(String[] args) {
		MovablePoint mp1 = new MovablePoint(0,0,2,3);
		MovablePoint mp2 = new MovablePoint(0,0,4,6);
		MovablePoint mp3 = new MovablePoint(0,0,4,6);
		MovablePoint mp4 = new MovablePoint(0,0,4,10);
		MovablePoint mp5 = new MovablePoint(0,0,10,11);
		MovableCircle mc1 = new MovableCircle(1,1,6,8,10);
		MovableCircle mc2 = new MovableCircle(1,1,3,4,5);
		MovableCircle mc3 = new MovableCircle(1,1,3,4,5);
		System.out.println(mp1);
		System.out.println(mp2);
		System.out.println(mp3);
		System.out.println(mc1);
		System.out.println(mc2);
		System.out.println(mc3);
		System.out.println(mc3.compareTo(mc2));
		System.out.println(mp3.compareTo(mp2));
		System.out.println(mc3.compareTo(mc1));
		System.out.println(mp3.compareTo(mp1));
		System.out.println(mp3.compareTo(mp4));
		System.out.println(mp3.compareTo(mp5));
	}
}
