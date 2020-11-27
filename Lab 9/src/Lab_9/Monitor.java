package Lab_9;
import java.io.*;
public class Monitor implements Runnable {
	private Data d; // shared object
	private int tails = 0; // count number of tails 
	private int heads = 0; // count number of heads 
	public Monitor(Data d){ this.d = d; } // constructor
    public void run() {
    	Object obj = d.getLock();
    	for(int i=0;i<d.getNoP();i++) {
    		synchronized(obj){
    			while(d.ispChance()) {
    				try {
    					System.out.println("monitor is going to wait...");
    					obj.wait();
    				}
    				catch (InterruptedException e) {}
    			}
	    		System.out.println("monitor is going to read value ...");
	    		if(d.getResult() ==0) tails++;
	    		else heads++;
	    		d.setmChance(false);
	    		d.setpChance(true);
	    		obj.notifyAll();
    		}
    	}
    	try {
    		PrintWriter outStream = new PrintWriter(new FileOutputStream("/Users/sourabhyelluru/Git codes/BITS-OOP-Labs/Lab 9/src/Lab_9/out.txt"));
    		outStream.println("No of heads = " + heads);
    		outStream.println("No of tails = " + tails);
    		outStream.close();
    		System.out.println("No of heads = " + heads);
    		System.out.println("No of tails = " + tails);
    	}
    	catch (FileNotFoundException e) {}
    }
}
