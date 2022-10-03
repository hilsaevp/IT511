package SteppingStones;

import java.util.Scanner;
import java.util.ArrayList;

/*

 @author Hilsa Parinding
 Stepping Stone 5

 */

public class SteppingStone5_Recipe {
    
    private String recipeName; //
    ArrayList<String> recipeIngredients = new ArrayList(); //this variable will hold a list of items (string)
    double totalRecipeCalories = 0.0; //initialized to hold zero as a value (with one decimal point)
    int servings;

        //mutators and accessors for each class field and defined variable
        /*
         * mutators can be used to safely change the value of a variable.
         * used as a "checkpoint" rather than allowing direct changes -> maintains the integrity of said variable 
         */
    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) { //sets the private name field (recipeName) to store the value of the following name field (this.recipeName)
        this.recipeName = recipeName;
    }
    
    public int getServings() {
        return servings;
    }
    
    public void setServings(int servings) {
        this.servings = servings;
    }
    
    public ArrayList<String> getRecipeIngredients() {
        return recipeIngredients;
    }

    public void setRecipeIngredients(ArrayList<String> recipeIngredients) { 
    this.recipeIngredients = recipeIngredients;
    }
    
    public double getTotalRecipeCalories() {
        return totalRecipeCalories;
    }
    
    public void setTotalRecipeCalories(int totalRecipeCalories) {
        this.totalRecipeCalories = totalRecipeCalories;
    }
    

        //initial constructor
    public SteppingStone5_Recipe() {
        this.recipeName = "";
        this.servings = 0;
        this.recipeIngredients = new ArrayList<String>();
        this.totalRecipeCalories = 0;
        
    }

        //overloaded constructor
    public SteppingStone5_Recipe(String recipeName, int servings, 
    	ArrayList<String> recipeIngredients, double totalRecipeCalories) 

    {
        this.recipeName = recipeName; 
        this.servings = servings;
        this.recipeIngredients = recipeIngredients;
        this.totalRecipeCalories = totalRecipeCalories;
    }
    
    public void printRecipe() {
        double singleServingCalories = (totalRecipeCalories / servings);
        System.out.println("Recipe: " + recipeName);
        System.out.println("Servings: " + servings);

        System.out.println("ingredients: ");
        for (int i = 0; i < recipeIngredients.size(); i++){
            String ingredient = recipeIngredients.get(i);
            System.out.println(ingredient);
        }

        System.out.println("Each serving has " + singleServingCalories + " Calories.");

    }
    
    
    public static void main(String[] args) {
        int totalRecipeCalories = 0;
        ArrayList <String> recipeIngredients = new ArrayList();
        boolean addMoreIngredients = true;
        
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Please enter the recipe name: ");
        String recipeName = scnr.nextLine();
        
        System.out.println("Please enter the number of servings: ");
        //correct data type & Scanner assignment method for servings variable
        int servings = scnr.nextInt();


        //while-loop to add more ingredients         
        do {
            System.out.println("Please enter the ingredient name or type 'end' if you are finished entering ingredients: ");
                String ingredientName = scnr.next();
                
                        //ends the program if the user types "end" to indicate that they no longer wish to add to the ingredient list
                if (ingredientName.toLowerCase().equals("end")) {
                    addMoreIngredients = false;
                    break; //tells the program to not continue to the proceeding methods in the loop
                } else {
                    recipeIngredients.add(ingredientName); //adds to the array list
                    addMoreIngredients = true; //tells the program to loop to continue to the proceeding methods 

                        //the program will output the following and continue if the user does not type "end" as indicated above
                    System.out.println("Please enter the ingredient amount: ");
                    float ingredientAmount = scnr.nextFloat(); //returns the Float scanned from user input, stored in the variable ingredientAmount

                    System.out.println("Please enter the ingredient Calories: ");
                    int ingredientCalories = scnr.nextInt();
                
                    //calculates the total number of calories of the ingredients the user listed 
                totalRecipeCalories += ingredientCalories * ingredientAmount;
            
            }
           
       } while (addMoreIngredients == true);
        
        SteppingStone5_Recipe recipe1 = new SteppingStone5_Recipe(recipeName, servings, recipeIngredients, totalRecipeCalories);
        recipe1.printRecipe();
        
        scnr.close();
    }
}