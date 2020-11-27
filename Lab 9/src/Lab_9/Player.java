package Lab_9;
import java.util.*;
public class Player implements Runnable{
	private Data d; // shared object
	Random rand = new Random(); // random number generator 
	public Player(Data d) { this.d = d; } // constructor
	public void run() {
		Object obj = d.getLock();
		for(int i=0;i<d.getNoP();i++) {
			synchronized(obj) {
				try {
					while(d.ismChance()) {
						System.out.println("Player is waiting...");
						obj.wait();
					}
				}
				catch (InterruptedException e) {}
				d.setResult(rand.nextInt(2));
			
				d.setpChance(false);
				d.setmChance(true);
				obj.notifyAll();
			}
		}
	}

}
