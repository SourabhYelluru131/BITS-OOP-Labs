package Examples;

public class test2 {
	static int y=5;
	int z=6;
	public static void main(String [] args) {
		System.out.println(method1());
	}
	public static int method1() {
		final int x = 3;
		int r = y+x;
		return r;
	}
}
