package JavaFinalCodingProject;

public class Card {

	//naming variables for class Card, used private so their structure and usage cannot be altered elsewhere
	//can only use these variables in this class
	private String name;
	private String suit;
	private int value;
	
	
	//Card method to assign variables to hold info about the individual cards
	Card(String name, String suit, int value) {
		this.name = name;
		this.suit = suit;
		this.value = value;
	}	
	
	
	//setters and getters, methods that i can use to access the variables
	//i made in this class
	//made public so that i access from other classes
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//method used to display info about a specific card
	public void describe() {
		System.out.println(name + " of " + suit + " " + "Value: " + value);
	}
	
	
	
	
	
	
} //end of Card class
