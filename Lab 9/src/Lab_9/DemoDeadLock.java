package Lab_9;
class Res1 {
	
}
class Res2{
	
}
public class DemoDeadLock {
	public static void main(String[] args) {
		Res1 a = new Res1();
		Res2 b = new Res2();
		
		Runnable[] t = new Runnable[10];
		for(int i=0;i<10;i++) {

			int x = i;
			t[i] = new Runnable() {
				public void run() {
					synchronized(a) {
						try {
							Thread.sleep(1000);
						}
						catch(InterruptedException e){
							//e.printStackTrace();
						}
						synchronized(b) {
							System.out.println("In block : "+x);
						}
					}
				}
			};
		}
		for(int i=0;i<10;i++) {
			new Thread(t[i]).start();
		}
	}
}
