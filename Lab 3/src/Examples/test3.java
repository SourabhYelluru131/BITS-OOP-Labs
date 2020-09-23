package Examples;


class test4 {
private static String[] Str;
static {
	System.out.println("1.%");
}
public static void main(String args) {
	System.out.println("2.@");
	//System.out.println();
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

class test3{
public static void main(String[] args) {
	test4 Check = new test4();
	Check.getClass();
	//test3.main(args);
	test4.main(new String());
	System.out.println("6.#");
}
}
