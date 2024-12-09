package JavaFinalCodingProject;


public class App {

	public static void main(String[] args) {
		
		
		//instantiate new deck
		Deck deck = new Deck();
		
		//use shuffle method on deck just instantiated
		deck.shuffle();
		
		//instantiate two players
		Player playerOne = new Player("Jensen");
		Player playerTwo = new Player("Silas");
		
		
		
		//using getHand and .add to add to player's hands, while using draw method on deck in 
		//order to use top card 
		for (int i = 0; i < 26; i++) {
			playerOne.getHand().add(deck.draw());
			playerTwo.getHand().add(deck.draw());
		}
		
		
		//this is the game
		//used for loop to go thru code 26 times
		for (int i = 0; i < 26; i++) {
			
			//print round number to console, by adding (i + 1), i'm using iteration number to give round number
			System.out.println("Round: " + (i + 1));
			
			//instantiating player one turn using flip method
			Card p1Draw = playerOne.flip();
			
			//printing player name and added text without moving to next line
			System.out.print(playerOne.getName() + "'s card is: ");
			
			//printing card description
			p1Draw.describe();
			
			//instantiating player two turn using flip method
			Card p2Draw = playerTwo.flip();
			
			//printing player name and added text without moving to next line
			System.out.print(playerTwo.getName() + "'s card is: ");
			
			//printing card description
			p2Draw.describe();
			
			//directly after each player draws, cards are compared to choose round winner
			//first finding if player one has greater value
			if (p1Draw.getValue() > p2Draw.getValue()) {
				
				//if player one wins round, one point is added to their score
				playerOne.incrementScore();
				
				//if player one wins round, printing to console
				System.out.println(playerOne.getName() + " wins this round!");
			
			//if player one does not have greater value, moving on to see if player two has greater value card
			} else if (p1Draw.getValue() < p2Draw.getValue()) {
				
				//if so, adding one point to player two
				playerTwo.incrementScore();	
				
				//if player two wins round, printing that to console
				System.out.println(playerTwo.getName() + " wins this round!");
			
			//only other option would be a tie, so only using else statement
			} else {
				
				//if tied, printing that to console
				System.out.println("Tie Round");
			}
			
			//end of round, printing current score with one space between rounds
			//will run through a total of 26 times
			System.out.println(playerOne.getName() + "'s Current Score is: " + playerOne.getScore());
			System.out.println(playerTwo.getName() + "'s Current Score is: " + playerTwo.getScore());
			System.out.println();
		} //end of for loop and game, code will move to next line once 26 iterations occur
		
		//printing players final score
		System.out.println(playerOne.getName() + "'s Final Score is: " + playerOne.getScore());
		System.out.println(playerTwo.getName() + "'s Final Score is: " + playerTwo.getScore());
		
		//announcing winner of game or if it is a tie
		if(playerOne.getScore() > playerTwo.getScore()) {
			System.out.println(playerOne.getName() + " WINS THE WAR!!");
		} else if (playerOne.getScore() < playerTwo.getScore()) {
			System.out.println(playerTwo.getName() + " WINS THE WAR!!");
		} else {
			System.out.println("Nobody wins in WAR");
		}
		
		
		

	} //end of main method

} //end of App class
