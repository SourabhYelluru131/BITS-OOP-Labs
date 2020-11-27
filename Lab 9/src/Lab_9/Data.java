package Lab_9;
import java.util.*;
import java.io.*;
public class Data {
    // store the result of coin toss
    private int result;
    // set if it is player's chance
    private boolean pChance;
    public boolean ispChance() {
		return pChance;
	}
	public void setpChance(boolean pChance) {
		this.pChance = pChance;
	}
	public boolean ismChance() {
		return mChance;
	}
	public void setmChance(boolean mChance) {
		this.mChance = mChance;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	// set if it is monitor's chance
    private boolean mChance;
    // number of players
    private int nop;
    public int getNoP() {
		return nop;
	}
	public void setNoP(int nop) {
		this.nop = nop;
	}
	private Object lock;
    public Object getLock() {
		return lock;
	}
	public void setLock(Object lock) {
		this.lock = lock;
	}
	public Data(){
    	try{
    		Scanner scanner = new Scanner(new FileInputStream("/Users/sourabhyelluru/Git codes/BITS-OOP-Labs/Lab 9/src/Lab_9/input.txt"));

        	this.result = scanner.nextInt();
        	this.pChance = scanner.nextBoolean();
        	this.mChance = scanner.nextBoolean();
        	this.nop = scanner.nextInt();
    	}
    	catch (FileNotFoundException e) {}
    	this.lock = new Object();
    }
}