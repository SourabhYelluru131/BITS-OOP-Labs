package complex_number;

public class ComplexDemo {
	public static void main(String [] args) {
		Complex fi = new Complex(3,4); // 3 + 4i
		Complex sec = new Complex(5,12); // 5 + 12i
		Complex last = new Complex(0); // 0 + 0i
		last = fi.add(sec);
		System.out.println(last.getRealPart());
		System.out.println(last.getImaginaryPart());
		last.setRealPart(0);
		last.setImaginaryPart(0);
		
		last = fi.subtract(sec);
		System.out.println(last.getRealPart());
		System.out.println(last.getImaginaryPart());
		last.setRealPart(0);
		last.setImaginaryPart(0);
		
		last = fi.multiply(sec);
		System.out.println(last.getRealPart());
		System.out.println(last.getImaginaryPart());
		last.setRealPart(0);
		last.setImaginaryPart(0);
		
		last = fi.divide(sec);
		System.out.println(last.getRealPart());
		System.out.println(last.getImaginaryPart());
		last.setRealPart(0);
		last.setImaginaryPart(0);
		
	}
}
