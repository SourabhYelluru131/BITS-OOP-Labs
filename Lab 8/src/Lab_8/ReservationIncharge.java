package Lab_8;
import java.util.*;
class ReservationCounter{
	LinkedList ReservationQueue;
	private ReservationCounter() {
		ReservationQueue = new LinkedList();
	}
	public void standInLine(String customer) {
		ReservationQueue.add((String) customer);
	}
	public void leaveTheLine() {
		ReservationQueue.remove();
	}
	public String giveTicket() {
		return (String) ReservationQueue.getFirst();
	}
	public String checktheCustomerAt(int position) {
		return (String)ReservationQueue.get(position);
	}
	public static ReservationCounter InitializeCounter() {
		return new ReservationCounter();
	}
	public int customersInLine() {
		return ReservationQueue.size();
	}
}
public class ReservationIncharge {
	public static void main(String[] args) {
		ReservationCounter counter =  ReservationCounter.InitializeCounter();
		counter.standInLine("Amitab");
		counter.standInLine("amir");
		counter.standInLine("salman");
		counter.standInLine("Tom Cruise");
		for(int position=0;position<counter.customersInLine();position++) {
			System.out.println("customer at "+(position+1)+" place in line is " + counter.checktheCustomerAt(position));
			System.out.println("Ticket given to "+counter.giveTicket());
			counter.leaveTheLine();
			counter.standInLine("Emma Watson");
			System.out.println("customer in position 2 is "+counter.checktheCustomerAt(1));
			System.out.println("Still there are "+counter.customersInLine()+" people in line");
		}
	}
}
