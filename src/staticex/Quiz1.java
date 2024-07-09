package staticex;

public class Quiz1 {

	public static void main(String[] args) {

		Card card1 = new Card();
		Card card2 = new Card();
		Card card3 = new Card();
		System.out.println(card1.cardNo);
		System.out.println(card2.cardNo);
		System.out.println(card3.cardNo);

	}

}

class Card{
	static int count = 100;
	int cardNo;

	public Card() {
		count++;
		cardNo = count;
	}
	
}
