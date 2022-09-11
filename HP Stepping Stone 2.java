package SteppingStones;

import java.util.Scanner;

public class SteppingStone2_IngredientCalculator {

    /**
     * @param args the command line arguments
     * @author Hilsa Parinding
     */
    public static void main(String[] args) {
       
       /**
       *Assign the following variables with the appropriate data type and value:
       
       *VARIABLE NAME            VALUE
       
       *nameOfIngredient         ""
       *numberCups               0.0
       *numberCaloriesPerCup     0
       *totalCalories            0.0
       
       */

      String nameOfIngredient = ""; 
         //using 'String' to signify that the the variable value will contain a sequence of characters
      
      double numberCups = 0.0; 
         //using 'double' to signify the presence of a decimal value
      
      int numberCaloriesPerCup = 0; 
         //using 'int' as opposed to 'double' or 'String' to signify the presence of a whole numerical value
      
      double totalCalories = 0.0; 

       
       Scanner scnr = new Scanner(System.in);
       
       System.out.println("Please enter the name of the ingredient: ");
       nameOfIngredient = scnr.next();
       
       System.out.println("Please enter the number of cups of " 
        + nameOfIngredient + " we'll need: ");
       numberCups = scnr.nextFloat();
       
       System.out.println("Please enter the name of calories per cup: ");
       numberCaloriesPerCup = scnr.nextInt();
       
       /**
        * Write an expression that multiplies the number of cups 
        * by the Calories per cup.
        * Assign this value to totalCalories
        */

       totalCalories = numberCups * numberCaloriesPerCup; 
         //using the * symbol to multiply the two varibles
       
       System.out.println(nameOfIngredient + " uses " + numberCups 
       + " cups and has " + totalCalories + " calories.");
       
    }
    
}

/**
 * 
 * Final Project
 *
 *For your Final Project:
 *
 * 1. Create a new java class named Ingredient
 * 
 * 2. Adapt the code from this SteppingStone to include the following changes:
 *
 *   a. Rename the variable, numberCups, to represent the more general 
 *      ingredientAmount;
 *
 *   b. Add a new text variable, unitMeasurement to store unit of measurement
 *      for the ingredient amount (e.g. cups, oz., etc.);
 *
 *   c. Prompt the user to input the measurement unit;
 * 
 * /

