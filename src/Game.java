import java.util.ArrayList;
import java.util.Scanner;

public class Game {

	public static void Game() {
		// Creates a new arraylist containing the Card class called "cards"
		ArrayList<Card> cards = new ArrayList<>();
		// Bool for the while playing, set to true
		boolean playing = true;
		// Calls the Deck class and creates a new deck and shuffles it
		Deck.createDeck(cards);
		Deck.shuffle(cards);

		// while true plays the game otherwise it ends
		while (playing) {
			// Assigns the new value to the cards that got drawn from the deck with help
			// from the valueBonus function
			int Card1 = valueBonus(cards, 0);
			int Card2 = valueBonus(cards, 1);
			int Card3 = valueBonus(cards, 2);
			// prints out the three first card from the deck and their new values
			System.out.println(cards.get(0) + " -> Value = " + Card1);
			System.out.println(cards.get(1) + " -> Value = " + Card2);
			System.out.println(cards.get(2) + " -> Value = " + Card3);

			// checker method to see if the card in the middle is in between the first and
			// the third
			checker(Card1, Card2, Card3);

			// Scanner checks the users input
			String option;
			Scanner play = new Scanner(System.in);
			System.out.println("Press r to retry or q to quit");
			option = play.next();
			// if the user input is equal to a certain case it will run whats inside
			switch (option) {
			case "r":
				Deck.createDeck(cards);
				Deck.shuffle(cards);
				break;
			case "q":
				playing = false;
				System.out.println("Thank you for playing!");
				break;
			default:
				playing = false;
				System.out.println("Told you to press r or q :)");

				break;
			}
		}
	}

	// method to check if Card3 is inbetween Card1 and Card2, then prints out a
	// message depending on the result
	public static void checker(int Card1, int Card2, int Card3) {
		if (Card1 < Card3 && Card3 < Card2 || Card1 > Card3 && Card3 > Card2) {
			System.out.println("You have won!");
		} else {
			System.out.println("You have lost!");
		}
	}

	// here we get the type and number of a card assign new values
	public static int valueBonus(ArrayList<Card> cards, int currentPosition) {
		Type type = cards.get(currentPosition).getType();
		int sum = cards.get(currentPosition).getNumbers();
		// if the type is equal to hearts it adds "8" to the cards current value
		if (type.equals(Type.Hearts)) {
			sum += 8;
		} else if (type.equals(Type.Clubs)) {
			sum += 6;
		} else if (type.equals(Type.Diamonds)) {
			sum += 4;
		} else if (type.equals(Type.Spades)) {
			sum += 10;
		}
		return sum;
	}
}
