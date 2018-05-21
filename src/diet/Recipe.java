package diet;

public class Recipe {
	private String foodName;
	private String foodMaterial;
	private double quantityInGram;

	public Recipe(String foodName, String foodMaterial, double quantityInGram) {

		this.foodName = foodName;
		this.foodMaterial = foodMaterial;
		this.quantityInGram = quantityInGram;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getFoodMaterial() {
		return foodMaterial;
	}

	public void setFoodMaterial(String foodMaterial) {
		this.foodMaterial = foodMaterial;
	}

	public double getQuantityInGram() {
		return quantityInGram;
	}

	public void setQuantityInGram(double quantityInGram) {
		this.quantityInGram = quantityInGram;
	}

}
