package Lab_5;

public class RetailStore {
	private int[] itemId = {1001,1002,1003,1004,1005};
	private double[] price = {13.50, 18.00, 19.50, 25.50};
	
	private double computePrice(int value) {
		//Compute price of item
		for(int i=0; i<price.length;i++) {
			//note the use of price.length
			//it gives the length of the array
			if(itemId[i] == value) {
				return price[i];
			}
		}
		return price[value];
	}
	public static void main(String[] args) {
		//main method. Execution begins here
		RetailStore retailOne = new RetailStore();
		System.out.println("prince of item id 1002 is " + retailOne.computePrice(1003));
		System.out.println("price of item id 1004 is " + retailOne.computePrice(1004));
		//System.out.println("price of item id 1009 is " + retailOne.computePrice(1007));
	}
}
