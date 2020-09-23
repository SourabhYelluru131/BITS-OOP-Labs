package softest;

public class Card {
	String rank;
	String suit;
	public Card(String rank, String suit, int a) {
		this.rank = rank;
		this.suit = suit;
	}
	public String rank() {
		return this.rank;
	}
	public String suit() {
		return this.suit;
	}
	public Boolean matches(Card c1) {
		return (this.rank()==c1.rank() && this.suit() == c1.suit());
	}
}
