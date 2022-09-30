package SteppingStones;
/*
 * @author Hilsa Parinding
 * Milestone 1
 * 25 September, 2022
 */
import java.util.Scanner;

class Milestone_One_Ingredient  {

	String nameOfIngredient; // The name of the ingredient stored as a string of characters
	double ingredientAmount; // The amount of ingredients for each recipe previous numberOfCups stored with decimal points
	String unitMeasurement; // The unit of mesurement for each ingredient modification
	int numberCaloriesPerMeasure; // The number of calories per unit of measurement used stored as an integer
	double totalCalories; // the total number of calories based on number of calories per unit measurement

public static void main(String[] args) {

//initialize variables
	String nameOfIngredient = "";
	String unitMeasurement = "";
	double ingredientAmount = 0.0;
	double totalCalories = 0.0;
	final int MAX_AMT = 100; //sets the maximum int, value cannot be changed
	int numberCaloriesPerUnitMeasure = 0;

	Scanner scnr = new Scanner(System.in); //creates a new scanner

	System.out.println("Please enter ingredient name: ");
	do {
		if(!scnr.hasNextInt()){
			nameOfIngredient = scnr.nextLine();
			break; //stops execution of loop
		}

		else{
			System.out.println("Error: That is not a valid ingredient. Try again.");
			nameOfIngredient = scnr.nextLine();//reads user input for ingredient name
		}
	} while (true);

	System.out.println("Please enter the measurement unit for the ingredient: ");
	do {
	if (!scnr.hasNextInt()) { //checks if the value entered by user is not an integer
		unitMeasurement = scnr.nextLine();
		break;
	} 

	else {
		System.out.println("Error: That is not a unit. Try again.");
		unitMeasurement = scnr.nextLine();
	}
} while (true);

System.out.println("Please enter the amount of " + unitMeasurement + " of " + nameOfIngredient + " we'll need");
do
{
if(scnr.hasNextDouble()) {//check if the value if decimal
	ingredientAmount = scnr.nextDouble();
	if (ingredientAmount > 0 && ingredientAmount <= MAX_AMT){ 
		System.out.println(ingredientAmount + " is a valid number!");
		break;
	}
}
else //if not a valid decimal value
	{
		System.out.println("That is a not valid number!");
		System.out.println("Please enter another number between 1 and 100: ");
		scnr.nextLine();
	}

	if (ingredientAmount > 0 && ingredientAmount <= MAX_AMT)
		{
			System.out.println(ingredientAmount + " is a valid number!");
			break;
		}

		else if (ingredientAmount <1 ) {
			System.out.println(ingredientAmount + " is less than 1. Sorry you are out of attempts.");
			break;
		}

		else {
			System.out.println(ingredientAmount + " is greater than 100. Sorry you are out of attempts");
			ingredientAmount = 1;
			break;
		}
	}
	while (true);


//calculate the total calories per respective unit of ingredient measurement

	System.out.println("Please enter the number of calories per " + unitMeasurement + ":");
	do {
	if (scnr.hasNextInt()) { // Check if the entered value is not an integer
		numberCaloriesPerUnitMeasure = scnr.nextInt();
		break;
	} else {
		System.out.println("Error: That is not a whole number. Try again.");
		scnr.next();
	}
}
while (true);
totalCalories = ingredientAmount * numberCaloriesPerUnitMeasure; //calculates the total calories of each recipe
System.out.println("The Total Calories for the ingredient is: " + totalCalories);

scnr.close();
}
}
