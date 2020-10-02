package lab_6;

class Room{
	double length,breadth,height;
	Room() {
		length = -1;
		breadth = -1;
		height = -1;
	}
	//Overloading constructor
	Room(double l, double b, double h){
		length = l;
		breadth = b;
		height = h;
	}
	Room(double len){
		length = breadth = height = len;
	}
	double volume() {
		return length*breadth*height;
	}
}
public class OverloadConstructors {
	public static void main(String[] args) {
		Room a = new Room(20,30,40);
		Room b = new Room();
		Room c = new Room(10);
		double vol;
		vol = a.volume();  //24000.0
		System.out.println("Volume of room a is "+ vol);
		vol = b.volume();  //-1.0
		System.out.println("Volume of room b is "+ vol);
		vol = c.volume();  //1000.0
		System.out.println("Volume of room c is "+ vol);
	}
}
