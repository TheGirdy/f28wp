//Import relevant packages
import java.util.Scanner;

public class BasicCalculator {


	public static void main(String[] args) {
		//Basic calculator, will take in user inputs and calculate answer.
		//This program was used for me to practice various coding techniques such as calling functions, passing parameters and switch statements.
		
		
		//Set up new Scanner.
		Scanner scan = new Scanner(System.in); 
		
		//Create and initialise the first number.
		//Print prompt for user input.
		System.out.println("Please enter first number");
		int a = scan.nextInt();
		
		
		//Create and initialise the second number.
		//Print prompt for user input.
		System.out.println("Please enter the second number");
		int b = scan.nextInt();
		
		
		//Create and initialise calcSymbol.
		//This will be used first to validate user input then to calculate answer.
		System.out.println("Please enter what kind of calculation you are looking for. (+,-,8,/)");
		String calcSymbol = scan.next();
		validateCalcSymbol(calcSymbol, a ,b);
		

	}

	public static void validateCalcSymbol(String calcSymbol, int a, int b){
		//Validate if the user input is correct using a switch statement.
		//If correct/valid input, call relevant function.
		
		switch(calcSymbol) {
		//If user input is...
		//Then...
		//Break.
		case "+":
			addNumbers(a,b);
			break;
		case "-":
			subNumbers(a,b);
			break;
		case "*":
			multiplyNumbers(a,b);
			break;
		case "/":
			divideNumbers(a,b);
			break;
		default:
			System.out.println("Error! Please Try again");
		}
		
	}
	
	public static void addNumbers(int a ,int b) {
		//This function will be used to add the two numbers together.
		System.out.println("The answer is ");
		System.out.println(a + b);
	}
	
	public static void subNumbers(int a ,int b) {
		//This function will be used to subtract the two numbers together.
		System.out.println("The answer is ");
		System.out.println(a - b);
	}
	
	public static void multiplyNumbers(int a ,int b) {
		//This function will be used to multiply the two numbers together.
		System.out.println("The answer is ");
		System.out.println(a * b);
	}
	
	public static void divideNumbers(int a ,int b) {
		//This function will be used to divide the two numbers together.
		System.out.println("The answer is ");
		System.out.println(a + b);
	}
}
