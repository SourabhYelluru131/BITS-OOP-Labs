package Lab_9;

public class Lab9 {
	public static void main(String[] args) {
		Data d = new Data();
		Thread[] players;
		Thread monitor;
		players = new Thread[d.getNoP()];
		for(int i=0;i<d.getNoP();i++) {
			players[i] = new Thread(new Player(d));
			players[i].start();
		}
		monitor = new Thread(new Monitor(d));
		monitor.start();
	}
}
