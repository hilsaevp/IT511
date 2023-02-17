package Final;

/**
 *
 * @author Hilsa Parinding
 */
import java.util.ArrayList;

//ReciepeBox class: collection of recipe

public class RecipeBox {
	private final ArrayList<Recipe> recipes;
	public RecipeBox() {
		this.recipes = new ArrayList<>();
	}

	//add a Recipe in collection
	public void addItem(Recipe recipe){
		recipes.add(recipe);
	}

	//delete a Recipe in collection
	public void deleteItem(Recipe recipe){
		recipes.remove(recipe);
	}

	//print all recipes
	public void printAllRecipies(){
		int i = 0;
		for(Recipe rec: recipes){
			i++;
			System.out.println("Recipe " + i);
			rec.printRecipe();
		}
	}

	public static void main(String[] args) {
	//create some demo recipes
		Recipe recipe1 = Recipe.createNewRecipe("Milkshake");
		Ingredient ingredient1 = new Ingredient("Strawberries",30,"grams",50);
		recipe1.addIngredient(ingredient1);
		Recipe recipe2 = Recipe.createNewRecipe("Burger");
		Ingredient ingredient2 = new Ingredient("Patty",200,"gram",300);
		recipe2.addIngredient(ingredient2);

		// add in box
		RecipeBox box = new RecipeBox();
		box.addItem(recipe1);
		box.addItem(recipe2);
		box.printAllRecipies();
	}
}
