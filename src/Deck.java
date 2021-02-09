import java.util.ArrayList;
import java.util.*;

public class Deck {
	public static void createDeck(ArrayList<Card> cards) {
		// Array with the cards numbers which is an int
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
		// Iterates through the arrays with a for loop and adds them to the deck
		for (Type type : Type.values()) {
			for (int i = 0; i < numbers.length; i++) {
				cards.add(new Card(type, numbers[i]));
			}
		}
	}

	// Using the collection library to shuffle the deck
	public static void shuffle(ArrayList<Card> cards) {
		Collections.shuffle(cards);
	}

}
