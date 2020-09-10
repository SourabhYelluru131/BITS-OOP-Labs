package taxation;

public class test {
	public static void main(String[] args) {
		TaxonSalary tax1 = new TaxonSalary(true);
		TaxonSalary tax2 = new TaxonSalary();
		System.out.println("Salary of peson 1:");
		tax1.inputSalary();
		System.out.println("Salary of peson 2:");
		tax2.inputSalary();
		double a = tax1.calculateTax();
		double b = tax2.calculateTax();
		System.out.println(a);
		System.out.println(b);
	}
}
