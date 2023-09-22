//Import relevant packages
import java.util.Random;
import java.util.Scanner;

public class DiceRoll {

	public static void main(String[] args) {
		//Program will allow user to roll a user-specified amount of dice.
		
		//Display a welcome message.
		System.out.println("Welcome to my dice rolling program!");
		
		//Call getUserInput which gets the user input.
		getUserInput();
	
		

	}

	public static void getUserInput() {
		//Function will get user input for number of dices.
		
		//Set up new Scanner.
		Scanner scan = new Scanner(System.in); 
	
		//Ask user how many dice they are looking to roll.
		System.out.println("How many dice do you want to roll?");
		//Create and initialise numOfDice, this will decide how many dice to roll.
		int numOfDice = scan.nextInt();
		rollDice(numOfDice);
		
		
	}
	
	public static void rollDice(int numOfDice) {
		//This program will roll the dice.
		
		//Create random class.
		Random rand = new Random();
		
		//Create upperLimit variable.
		//This makes sure the dice can only roll numbers from 0-6.
		int upperLimit = 7;
		
		//Create diceRoll variable which will be used to store the random number.
		int diceRoll;
		
		//Create a loop for the user-inputted number of dice.
		for(int i = 0; i < numOfDice; i++) {
			
			//Create new random number
			diceRoll = rand.nextInt(upperLimit);
			System.out.println("Dice " + (i+1) + " rolled " + diceRoll + "!");
			
		}
	}
	
	
}
