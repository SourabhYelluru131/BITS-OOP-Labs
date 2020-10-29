package Lab_8;

public class Movie {
	//Declaring Interface inside the class
	interface Bookable {
		public void printTicket();
		public void giveTicket(String movie);
	}
	public void BookTheTicket() {
		//Inner Class that implements bookable
		class EnglishMovie implements Bookable {
			String name;
			public void printTicket() {
				giveTicket("BlindDate");
			}
			public void giveTicket(String movie) {
				name = movie;
				System.out.println("You have booked for the movie "+name);
			}//end of class EnglishMovie
		}
		//creating object of inner class
		Bookable hollywood = new EnglishMovie();
		//anonymous innerclass which is basing the interface
		Bookable hindiMovie = new Bookable() {
			public void printTicket() {
				giveTicket("Bachna Ae Haseeno");
			}
			public void giveTicket(String movie) {
				String name = movie;
				System.out.println("You have booked for the movie "+ name);
			}
		};
		hollywood.printTicket();
		hindiMovie.printTicket();
	}//end of BookTheTicket
	
	//EnglishMovie is the Inner class
	//hindiMovie was an instance of Anonymous Inner Class
	public static void main(String[] args) {
		Movie easyMovie = new Movie();
		easyMovie.BookTheTicket();
	}
}
