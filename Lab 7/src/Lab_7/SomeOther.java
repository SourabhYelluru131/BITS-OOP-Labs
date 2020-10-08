package Lab_7;
class StaticOuter{
	String a = "static Outer string";
	static String b = "static Outer static string";
	void seeStaticInner() {
		//System.out.println(StaticInner.nonstatic);
		System.out.println(new StaticInner().nonstatic);// anonymous method
		System.out.println(StaticInner.s); //s is static anyways
	}
	static class StaticInner{
		String nonstatic = "StaticInner nonstatic string";
		static String s = "StaticInner static string";
		public static void main(String[] args) {
			//4.System.out.println(nonstatic);
			System.out.println(s);
			System.out.println(b);
		}
	}
	public static void main(String[] args) {
		//3.System.out.println(s);
		System.out.println(StaticInner.s);
		StaticOuter so = new StaticOuter();
		so.seeStaticInner();
	}
}
public class SomeOther {
	public static void main(String[] args) {
		System.out.println("Here");
		System.out.println(StaticOuter.StaticInner.s);
		StaticOuter.StaticInner si = new StaticOuter.StaticInner();
		System.out.println(si.nonstatic);
		System.out.println(si.s);
		
	}
}
