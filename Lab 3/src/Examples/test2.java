package Examples;

public class test2 {
	static int y=5;
	int z=6;
	public static void main(String [] args) {
		System.out.println(method1());
	}
	public static int method1() {
		int x = 3;     //final need not be written in this case ; there is no concept of static state in stack
		int z = y+x;
		System.out.println(x++);   //prints x and then increments
		return ++x; // increments and then returns
	}
}
