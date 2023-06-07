package codingAssignment;

// Player utilizes a few defined classes in Java. Import below.
import java.util.ArrayList;
import java.util.List;

public class Player {
	/*
	 * Fields
	 */
	private List<Card> hand = new ArrayList<>();
	private int score;
	private String name;

	/*
	 * Constructors - only takes the name of the player. Sets score to 0.
	 */
	public Player(String name) {
		this.score = 0;
		this.name = name;
	}

	/*
	 * Describe method - prints labeled player name and prints out player hand. Not
	 * used in App class
	 */
	public void describe() {
		System.out.println("Player Name: " + this.name);
		for (Card card : hand) {
			System.out.print("      ");
			card.describe();
		}
	}

	/*
	 * Draw method - draws top card from "deck" argument and adds it to "hand"
	 */
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}

	/*
	 * Flip method - removes top card from "hand" and returns card that was
	 * "flipped."
	 */
	public Card flip() {
		Card flippedCard = this.hand.remove(0);

		return flippedCard;
	}

	/*
	 * incrementScore method - increases player "score" by one each time it's called
	 */
	public void incrementScore() {
		score = getScore() + 1;
	}

	/*
	 * Getters and setters 
	 * No setter for "score" since it will always start at 0 as
	 * defined in the constructor.
	 */
	public int getScore() {
		return score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
