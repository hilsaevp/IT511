package Final;

import java.util.ArrayList;

/**
 *
 * @author Hilsa Parinding
 */
public class Recipe {

	//variables
	private ArrayList<Ingredient> ingredientList;
	private ArrayList<String> instructions;
	private String recipeName;
	private double totalRecipeCalories = 0.0; //initialized to hold zero as a value (with one decimal point)

	//mutators and accessors for each class field and defined variable
        /*
         * mutators can be used to safely change the value of a variable.
         * used as a "checkpoint" rather than allowing direct changes -> maintains the integrity of said variable 
         */

	public Recipe(String recipeName) {
		this.recipeName = recipeName; //sets the private name field (recipeName) to store the value of the following name field (this.recipeName)
		this.ingredientList = new ArrayList<>();
		this.instructions = new ArrayList<>();
	}

	//get IngredientList
	public ArrayList<Ingredient> getIngredientList() {
		return ingredientList;
	}

	//set IngredientList
	public void setIngredientList(ArrayList<Ingredient> ingredientList) {
		this.ingredientList = ingredientList;
	}

	// add Ingredient in recipe
	public boolean addIngredient(Ingredient ingredient){
		return this.ingredientList.add(ingredient);
	}

	// remove Ingredient in recipe
	public boolean removeIngredient(Ingredient ingredient){
		return this.ingredientList.remove(ingredient);
	}

	// remove all Ingredient in recipe
	public boolean removeAllIngredient(){
		return this.ingredientList.removeAll(ingredientList);
	}


	// print Ingredients in recipe
	public void printRecipe(){
		int i = 0;
		System.out.println("Reciepe contains:");
		for (Ingredient ing : ingredientList){
			i++;
			System.out.println(i);
			ing.printItemDetails();
		}
	}

	//create new recipe
	public static Recipe createNewRecipe(String recipeName){
		return new Recipe(recipeName);
	}

	//insert instruction
	public boolean insertInstruction(String instruction){
		return this.instructions.add(instruction);
	}

	public void printInstruction(){
		instructions.toString();
	}
}
