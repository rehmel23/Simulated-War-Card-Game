package codingAssignment;

public class Card {

	// Fields
	private String name;
	private String suit;
	private int value;

	/*
	 * Constructor - takes String "suit" and int "value" as arguments. Fields are
	 * defined by the arguments. Use "setName" to define "name" field
	 */
	public Card(String suit, int value) {
		setName(suit, value);
		this.suit = suit;
		this.value = value;
	}

	/*
	 * Getters and Setters
	 */
	public String getName() {
		return name;
	}

	// Set name based on suit and value.
	public void setName(String suit, int value) {
		switch (value) {
		case 2:
			this.name = "Two of " + suit;
			break;
		case 3:
			this.name = "Three of " + suit;
			break;
		case 4:
			this.name = "Four of " + suit;
			break;
		case 5:
			this.name = "Five of " + suit;
			break;
		case 6:
			this.name = "Six of " + suit;
			break;
		case 7:
			this.name = "Seven of " + suit;
			break;
		case 8:
			this.name = "Eight of " + suit;
			break;
		case 9:
			this.name = "Nine of " + suit;
			break;
		case 10:
			this.name = "Ten of " + suit;
			break;
		case 11:
			this.name = "Jack of " + suit;
			break;
		case 12:
			this.name = "Queen of " + suit;
			break;
		case 13:
			this.name = "King of " + suit;
			break;
		case 14:
			this.name = "Ace of " + suit;
			break;
		}
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	// Describe Method
	public void describe() {
		System.out.println(name + ": " + value);
	}

}
