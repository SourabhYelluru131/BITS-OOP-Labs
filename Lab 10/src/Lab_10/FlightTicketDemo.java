package Lab_10;
interface Tier{
	int getCost();
	String toString();
}
class Economy implements Tier{
	int cost ;
	public Economy() {
		this.cost = 2500;
	}
	public int getCost() {
		return cost;
	}
	public String toString() {
		return "Economy";
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
	public String toString() {
		return "Premium Economy";
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
	public String toString() {
		return "Business";
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
	public String toString() {
		return "FirstClass";
	}
}
class FlightTicket implements Tier{
	String start;
	String end;
	int cost;
	Tier tier;
	
	public FlightTicket(String start, String end, String tier){
		this.start = start;
		this.end = end;
		if(tier.equalsIgnoreCase("Economy")) {
			this.tier = new Economy();
			this.cost = new Economy().getCost();
		}
		else if(tier.equalsIgnoreCase("Premium Economy")) {
			this.tier = new PremiumEconomy();
			this.cost = new PremiumEconomy().getCost();
		}
		else if(tier.equalsIgnoreCase("Business")) {
			this.tier = new Business();
			this.cost = new Business().getCost();
		}
		else if(tier.equalsIgnoreCase("First Class")) {
			this.tier = new FirstClass();
			this.cost = new FirstClass().getCost();
		}
	}
	@Override
	public int getCost() {
		return this.cost;
	}
}
class AddAmenities implements Tier{
	int cost;
	public AddAmenities(String amenity, Tier ticket) {
		if(amenity.equalsIgnoreCase("wifi")) {
			cost = ticket.getCost()+10;
		}
		else if(amenity.equalsIgnoreCase("LiveTV")) {
			cost = ticket.getCost()+50;
		}
		else if(amenity.equalsIgnoreCase("Wine")) {
			cost = ticket.getCost()+30;
		}
	}
	public int getCost() {
		return cost;
	}
}
public class FlightTicketDemo {
	public static void main(String[] args) {
		/*FlightTicket ticket1 = new FlightTicket("Delhi","Toronto","Economy");
		FlightTicket ticket2 = new FlightTicket("Delhi","Toronto","Premium Economy");
		FlightTicket ticket3 = new FlightTicket("Delhi","Toronto","Business");
		FlightTicket ticket4 = new FlightTicket("Delhi","Toronto","First Class");*/
		
		System.out.println(new AddAmenities("wifi",new AddAmenities("LiveTV",new AddAmenities("Wine",new FlightTicket("Delhi","Toronto","First Class")))).getCost());
		//Output : 5590
		
	}
}
