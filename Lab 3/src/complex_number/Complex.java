package complex_number;

public class Complex {
	private double realPart;
	private double imaginaryPart;
	
	//Constructor
	public Complex() {
		this.realPart = 0.00;
		this.imaginaryPart = 0.00;
	}
	public Complex(double realPart, double imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}
	public Complex(double... c) {
		if(c.length==1) {
			this.realPart = c[0];
			this.imaginaryPart = 0;
		}
		else{
			this.realPart = c[0];
			this.imaginaryPart=c[1];
		}
	}
	
	//Methods
	public void setRealPart(double realPart) {
		this.realPart = realPart;
	}
	public void setImaginaryPart(double imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}
	public double getRealPart() {
		return realPart;
	}
	public double getImaginaryPart() {
		return imaginaryPart;
	}
	public Complex add(Complex otherNumber) {
		Complex result = new Complex();
		double a = this.realPart + otherNumber.getRealPart();
		result.setRealPart(a);
		double b = this.imaginaryPart + otherNumber.getImaginaryPart();
		result.setImaginaryPart(b);
		return result;
	}
	public Complex subtract(Complex otherNumber) {
		Complex result = new Complex();
		double a = this.realPart - otherNumber.getRealPart();
		result.setRealPart(a);
		double b = this.imaginaryPart - otherNumber.getImaginaryPart();
		result.setImaginaryPart(b);
		return result;
	}
	public Complex multiply(Complex otherNumber) {
		Complex result = new Complex();
		double a = this.realPart;
		double b = otherNumber.getRealPart();
		double c = this.imaginaryPart;
		double d = otherNumber.getImaginaryPart();
		double r = a*b - c*d;
		double i = a*d + b*c; 
		result.setRealPart(r);
		result.setImaginaryPart(i);
		return result;
	}
	public Complex divide(Complex otherNumber) {
		Complex result = new Complex();
		double a = this.realPart;
		double b = otherNumber.getRealPart();
		double c = this.imaginaryPart;
		double d = otherNumber.getImaginaryPart();
		double r = (a*c + b*d)/(c*c + d*d);
		double i = (b*c - a*d)/(c*c + d*d); 
		result.setRealPart(r);
		result.setImaginaryPart(i);
		return result;
	}
}
