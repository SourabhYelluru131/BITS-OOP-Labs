package Examples;

public class test3 {
	private static String[] Str;
	static {
		System.out.println("1.%");
	}
	public static void main(String args) {
		System.out.println("Hey\n");
		System.out.println("2.@");
	}
	static {
		System.out.println("3.&");
	}
	static {
		//test3.main(Str[0]);
		//test4.main(Str);
		System.out.println("4.~");
	}
	static {
		System.out.println("5.$");
	}
		
}

class test4{
	public static void main(String[] args) {
		test3 Check = new test3();
		test3.main(args[0]);
		test3.main(new String());
		System.out.println("6.#");
	}
}
