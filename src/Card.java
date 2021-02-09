public class Card {
	// variabel for the card type and the cards number
	private Type type;
	private int numbers;

	// constructor for Card which holds a Type and int and sets a value to them
	public Card(Type type, int numbers) {
		this.type = type;
		this.numbers = numbers;
	}

	// returns the card type and number of the card without the class name "Class"
	// and a bunch hexadecimal numbers
	public String toString() {
		return "Card: " + type + " Numbers: " + numbers;
	}

	// getter for "Type"
	public Type getType() {
		return type;
	}

	// getter for "numbers"
	public int getNumbers() {
		return numbers;
	}
}