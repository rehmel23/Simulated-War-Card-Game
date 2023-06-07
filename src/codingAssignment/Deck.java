package codingAssignment;

// Deck utilizes a few defined classes in Java. Import below.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	/*
	 * Field - a deck is a list of cards
	 */
	private List<Card> cards = new ArrayList<>();

	/*
	 * Constructor - doesn't take any arguments, all decks will be made of the same
	 * 52 cards
	 */
	public Deck() {
		// Define 4 suits for deck
		String[] suits = { "Spades", "Clubs", "Diamonds", "Hearts" };
		// Enhanced for loop creates each card value (2 - 14) for every suit.
		for (String suit : suits) {
			int value = 2;
			// Add each card to the deck List
			while (value <= 14) {
				cards.add(new Card(suit, value));
				value++;
			}
		}
	}

	// Describe Method for testing, not used in App class
	public void describe() {
		for (Card card : cards) {
			card.describe();
		}
	}

	/*
	 * Shuffle method - takes "shuffle()" method from the Collections interface and
	 * randomly places each element back into the List
	 */
	public void shuffle() {
		Collections.shuffle(cards);
	}

	/*
	 * Remove the the first card (top card) from the List and return the card that
	 * is removed
	 */
	public Card draw() {
		Card drawCard = this.cards.remove(0);

		return drawCard;

	}
}
