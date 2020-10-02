package lab_6;

class A {
	public int a = 100;
}
class B extends A{
	public int a = 80;
}
class C extends B {
	public int a = 60;
}
class D extends C {
	public int a = 40;
}
class E extends D{
	public int a = 10;
	public void show() {
		int a = 0;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(new A().a);
		System.out.println(new B().a);
		System.out.println(new C().a);
		System.out.println(super.a);
		
	}
}
public class Ex3Test {
	public static void main(String[] args) {
		new E().show(); //anonymous object
		A a1 = new E();
		System.out.println(a1.a);
		D d1 = (D) a1; 
		System.out.println(d1.a);
	}
}
