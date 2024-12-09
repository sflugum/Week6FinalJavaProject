package JavaFinalCodingProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	//instantiate array list in order to create a compilation of one of each card into a single deck
	//private so this may not be changed in structure or function elsewhere
	private List<Card> cards = new ArrayList<Card>();


	//Deck method to create a new deck of cards
	Deck(){
		
		//arrays to hold the suits and numbers/names of cards
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", 
				"Ten", "Jack", "Queen", "King", "Ace"};
		
		//intro to loop to iterate through both arrays to assign all suits one of each value
		//beginning by naming each suit individually
		for(String suit : suits) {
			
			//create variable to store the value based on counting the iterations
			//start at 2 since that's lowest card number/value
			int count = 2;
			
			//w/in loop, each individual suit will now be paired with each individual
			//number/name
			for(String number : numbers) {
				
				//instantiating new class of Card based on previous loops
				Card card = new Card(number, suit, count);
				
				//adding new Card instance to array named cards which is the deck
				this.cards.add(card);
					
				//adding 1 for every iteration
				count++;				
				}//end of 2nd loop
			}//end of 1st loop
		}//end of Deck method
	
	
	//setter and getter made public so i can access my array from other classes
	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}	
	
	
	//method to shuffle the deck from other classes
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	//method to draw card from the deck in other classes
	public Card draw() {
		
		//assigning variable to card located at 1st element in array and removing from deck
		//so it cannot be drawn again
		Card card = this.cards.remove(0);		
		
		//because we will need to use the name/value of the card in the game, we need a method that will
		//give us that info
		return card;
	} //end of draw method
	
} //end of Deck class
