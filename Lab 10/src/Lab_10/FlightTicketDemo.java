package Lab_10;
interface Tier{
	int getCost();
}
class Economy implements Tier{
	int cost ;
	public Economy() {
		this.cost = 2500;
	}
	public int getCost() {
		return cost;
	}
}
class PremiumEconomy implements Tier{
	int cost ;
	public PremiumEconomy() {
		this.cost = 3500;
	}
	public int getCost() {
		return cost;
	}
}
class Business implements Tier{
	int cost ;
	public Business() {
		this.cost = 4500;
	}
	public int getCost() {
		return cost;
	}
}
class FirstClass implements Tier{
	int cost ;
	public FirstClass() {
		this.cost = 5500;
	}
	public int getCost() {
		return cost;
	}
}
//The following classes also implement Tier as per decorator pattern
class Wifi implements Tier{
	int cost;
	Tier ticket;
	public Wifi(Tier tick) {
		this.cost = tick.getCost()+ 10;
	}
	public int getCost() {
		return this.cost;
	}
}
class LiveTV implements Tier{
	int cost;
	public LiveTV(Tier tick) {
		this.cost = tick.getCost()+ 40;
	}
	public int getCost() {
		return this.cost;
	}
}
class Wine implements Tier{
	int cost;
	public Wine(Tier tick) {
		this.cost = tick.getCost()+ 50;
	}
	public int getCost() {
		return this.cost;
	}
}
public class FlightTicketDemo{
	public static void main(String[] args) {
		Tier t1 = new FirstClass();
		t1 = new Wifi(t1);
		t1 = new LiveTV(t1);
		t1 = new Wine(t1);
		System.out.println(t1.getCost());
	}
}
