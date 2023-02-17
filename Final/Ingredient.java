package Final;

/**
 *
 * @author Hilsa Parinding
 */
public class Ingredient {

	//variables
	private String ingredientName;
	private double ingredientAmount;
	private String unitMeasurement;
	private double totalCalories;

	public Ingredient() {

	}

	//constructors
	public Ingredient(String ingredientName, double ingredientAmount, String unitMeasurement, double totalCalories) {
		super(); //calls superclass methods
		this.ingredientName = ingredientName;
		this.ingredientAmount = ingredientAmount;
		this.unitMeasurement = unitMeasurement;
		this.totalCalories = totalCalories;
	}

	//Seter and getter
	public String getIngredientName() {
		return ingredientName;
	}

	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}

	public double getIngredientAmount() {
		return ingredientAmount;
	}

	public void setIngredientAmount(double ingredientAmount) {
		this.ingredientAmount = ingredientAmount;
	}

	public String getUnitMeasurement() {
		return unitMeasurement;
	}

	public void setUnitMeasurement(String unitMeasurement) {
		this.unitMeasurement = unitMeasurement;
	}

	public double getTotalCalories() {
		return totalCalories;
	}

	public void setTotalCalories(double totalCalories) {
		this.totalCalories = totalCalories;
	}

//print item detail
	public void printItemDetails() {
		System.out.println("ingredientName " + this.ingredientName);
		System.out.println("ingredientAmount " + this.ingredientAmount);
		System.out.println("totalCalories " + this.totalCalories);
		System.out.println("unitMeasurement " + this.unitMeasurement);
	}
}
