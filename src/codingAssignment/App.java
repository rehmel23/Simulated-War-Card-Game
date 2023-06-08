package codingAssignment;

import java.util.Scanner;

/**
 * War Card Game App
 * 
 * Game is 26 rounds. Each player flips over the top card of
 * their hand. The player with the highest value card is the winner of the round
 * and recieves a point. Player with the most points at the end of the game,
 * wins!
 * 
 * @author clayr
 *
 */
public class App {

	public static void main(String[] args) {
		// Scanner for player name input
		Scanner s = new Scanner(System.in);
		// Instantiate deck of cards and 2 players
		Deck deck = new Deck();
		System.out.print("Who is Player 1? ");
		Player playerOne = new Player(s.nextLine());
		System.out.print("Who is Player 2? ");
		Player playerTwo = new Player(s.nextLine());
		System.out.println("************************");

		// Shuffle deck
		deck.shuffle();

		// Deal cards evenly to each player
		for (int i = 1; i <= 26; i++) {
			playerOne.draw(deck);
			playerTwo.draw(deck);
		}

		// Play out the game. Game ends after 26 rounds.
		for (int i = 1; i <= 26; i++) {
			// Print round number to console
			System.out.println("Round: " + i);
			// Flip playerOne's card and print to the console next to player name
			Card cardOne = playerOne.flip();
			System.out.print(playerOne.getName() + " - ");
			cardOne.describe();
			// Flip playerTwo's card and print to the console next to player name
			Card cardTwo = playerTwo.flip();
			System.out.print(playerTwo.getName() + " - ");
			cardTwo.describe();

			/*
			 * Check to see who won the round based on who has the highest value card
			 * flipped. Score is increased by 1 for the player that one the round.
			 */

			if (cardOne.getValue() > cardTwo.getValue()) {
				playerOne.incrementScore();
				System.out.println("\n" + playerOne.getName() + " Wins Round " + i + "!");
			} else if (cardOne.getValue() < cardTwo.getValue()) {
				playerTwo.incrementScore();
				System.out.println("\n" + playerTwo.getName() + " Wins Round " + i + "!");
			}
			System.out.println("************************");
		}

		// Announce winner
		System.out.println("Final Score " + "\n" + playerOne.getName() + ": " + playerOne.getScore() + "\n"
				+ playerTwo.getName() + ": " + playerTwo.getScore());
		if (playerOne.getScore() > playerTwo.getScore()) {
			System.out.println("\n" + playerOne.getName().toUpperCase() + " IS THE WINNER!");
		} else if (playerOne.getScore() < playerTwo.getScore()) {
			System.out.println("\n" + playerTwo.getName().toUpperCase() + " IS THE WINNER!");
			// If the "score" for each player is the same.
		} else {
			System.out.println("\nTHE GAME IS A DRAW!");
		}
		// Close out the scanner.
		s.close();
	}
}
