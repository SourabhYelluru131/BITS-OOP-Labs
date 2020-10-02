package lab_6;
abstract class Worker {
	public String name;
	public double salary_rate;
	public Worker(String name,double salary_rate) {
		this.name = name;
		this.salary_rate = salary_rate;
	}
	
	public String getName() {
		return name;
	}


	public double getSalary_rate() {
		return salary_rate;
	}

	abstract public double computePay();
}
class FullTimeWorker extends Worker{
	
	private int hours_Worked;
	public FullTimeWorker(String name, double salary_rate, int hours_Worked) {
		super(name,salary_rate);
		this.hours_Worked = hours_Worked;
	}
	@Override
	public double computePay() {
		int hours = Math.min(240,hours_Worked);
		double salary = hours*salary_rate;
		return salary;
	}
}
class HourlyTimeWorker extends Worker{
	
	private int hours_Worked;
	public HourlyTimeWorker(String name, double salary_rate, int hours_Worked) {
		super(name,salary_rate);
		this.hours_Worked = hours_Worked;
	}
	@Override
	public double computePay() {
		int hours = Math.min(60,hours_Worked);
		double salary = hours*salary_rate;
		return salary;
	}
}
public class Exercise3_2 {
	public static void main(String[] args) {
		FullTimeWorker f1 = new FullTimeWorker("ABC",100,200);
		FullTimeWorker f2 = new FullTimeWorker("DEF",100,250);
		HourlyTimeWorker h1 = new HourlyTimeWorker("abc",50,30);
		HourlyTimeWorker h2 = new HourlyTimeWorker("def",50,70);
		System.out.println(f1.computePay());
		System.out.println(f2.computePay());
		
		System.out.println(h1.computePay());
		System.out.println(h2.computePay());
	}
}
