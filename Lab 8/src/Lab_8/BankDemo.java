package Lab_8;
import java.util.*;
class Account{
	private long acctNumber;
	private double balance;
	private String name;
	public Account(String name, long acctNumber, long balance) {
		this.name = name;
		this.acctNumber = acctNumber;
		this.balance = balance;
	}
	public long getAcNo() {
		return acctNumber;
	}
	public void setamt(double balance) {
		this.balance = balance;
	}
	public double getamt() {
		return balance;
	}
}
class Bank{
	private ArrayList<Account> accts;
	int maxActive;
	public boolean addAccount(Account newone) {
		if(maxActive>=30) return false;
		else {
			accts.add(newone);
			maxActive++;
			return true;
		}
	}
	public boolean removeAccount(long acctnum) {
		if(maxActive==0) return false;
		else {
			ListIterator lit = accts.listIterator();
			int index =-1,flag = 0;
			while(lit.hasNext()) {
				Account act = (Account)lit.next();
				index++;
				if(act.getAcNo()==acctnum) {
					flag = 1;
					break;
				}
			}
			if(flag==0) return false;
			accts.remove(index);
			maxActive--;
			return true;
		}
	}
	public double deposit(long acctnum, double amount) {
		if(maxActive==0) return -1;
		else {
			ListIterator lit = accts.listIterator();
			int index =-1,flag = 0;
			double retval=0;
			while(lit.hasNext()) {
				Account act = (Account)lit.next();
				index++;
				if(act.getAcNo()==acctnum) {
					retval = act.getamt()+amount;
					act.setamt(retval);
					flag = 1;
					break;
				}
			}
			if(flag==0) return -1;
			return retval;
		}
	}
	public double withdraw(long acctnum, double amount) {
		if(maxActive==0) return -1;
		else {
			ListIterator lit = accts.listIterator();
			int index =-1,flag = 0;
			double retval=0;
			while(lit.hasNext()) {
				Account act = (Account)lit.next();
				index++;
				if(act.getAcNo()==acctnum) {
					retval = act.getamt()-amount;
					if(retval<0) return -1;
					act.setamt(retval);
					flag = 1;
					break;
				}
			}
			if(flag==0) return -1;
			return retval;
		}
		
	}
}
public class BankDemo {
	
}
