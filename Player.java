package JavaFinalCodingProject;

import java.util.ArrayList;
import java.util.List;

public class Player {

	
	//instantiate array list to hold variables that will be assigned to each players hand
	//also naming variables to hold running score and player names
	//private to block access from other classes
	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	
	
	//method to assign value to variables w/in this class and can be done from another class
	public Player(List<Card> hand, int score, String name) {
		this.hand = hand;
		this.score = 0;
		this.name = name;
	}
	
	//method if i only want to assign value to the name variable, can be used in another class
	public Player(String name) {
		this.name = name;
	}

	//method describe to show player's name and their current score along
	//with showing what card is in their hand
	public void describe() {
		
		//printing info
		System.out.println("Player: " + name + " Score: " + score);
		
		//iterating over hand array
		for (Card card: hand) {
			
			//calling describe method from Card class to list info from the card in player's hand
			card.describe();
		} //end of for loop
	} //end of describe method
	
	//method using Card class so that player will be able "flip" a card
	public Card flip() {
		
		//creating variable to hold value of card drawn at element 0 and removing from player's hand
		Card card = this.hand.remove(0);		
		return card;
	}
	
	
	//method using Deck class  to draw
	public void draw(Deck deck) {
		
		//calling draw method from Deck class
		deck.draw();
	}
	
	//method to add to player score
	public void incrementScore() {
		
		//adds value of 1 to score
		score ++; 
	}
	
	
	//setters and getters to access these variables outside of this class
	public List<Card> getHand() {
		return hand;
	}
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}//end of player class
