package taxation;
import java.util.Scanner;

public class TaxonSalary {
	private double salary;
	private boolean isPANsubmitted;
	
	//Constructor
	public TaxonSalary(boolean isPANsubmitted) {
		this.isPANsubmitted = isPANsubmitted;
		this.salary = 1000.00;
	}
	public TaxonSalary() {
		this.salary = 0.00;
		this.isPANsubmitted = false;
	}
	//Accessor
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isPANsubmitted() {
		return isPANsubmitted;
	}
	public void setPANsubmitted(boolean isPANsubmitted) {
		this.isPANsubmitted = isPANsubmitted;
	}
	
	//Methods

	public void inputSalary() {
		Scanner myscan = new Scanner(System.in);
		double salary = myscan.nextDouble();
		this.salary = salary;
	}
	public double calculateTax() {
		double res;
		if(this.salary < 180000) {
			if(isPANsubmitted) res = 0;
			else {
				res = 0.05*this.salary;
			}
		}
		else {
			if(this.salary < 500000) res = 0.1*this.salary;
			else {
				if(this.salary < 1000000) res = 0.2*this.salary;
				else {
					res = 0.3*salary;
				}
			}
		}
		return res;
	}
}
