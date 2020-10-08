package Lab_7;

public class Outer {
	Inner i1 = new Inner();
	private String s = "Outer string";
	void getS() {
		System.out.println(s);
	}
	void getInnerS() {
		System.out.println(i1.s);
	}
	class Inner{
		private String s = "Inner String";
		void getS() {
			System.out.println(s);
		}
		void getOuterS() {
			System.out.println(Outer.this.s);
		}
	}
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner oi = o.new Inner();
		o.getS();
		oi.getS();
		o.getInnerS();
		oi.getOuterS();
	}
}
