package diet;

public class Material {
	private String materialName;
	private double kiloCalories;
	private double protein;
	private double carbohydrate;
	private double fat;
	private boolean for100g;

	

	public Material(String materialName, double kiloCalories, double protein, double carbohydrate, double fat,
			boolean for100g) {
		
		this.materialName = materialName;
		this.kiloCalories = kiloCalories;
		this.protein = protein;
		this.carbohydrate = carbohydrate;
		this.fat = fat;
		this.for100g = for100g;
	}

	public boolean isFor100g() {
		return for100g;
	}

	public void setFor100g(boolean for100g) {
		this.for100g = for100g;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public double getKiloCalories() {
		return kiloCalories;
	}

	public void setKiloCalories(float kiloCalories) {
		this.kiloCalories = kiloCalories;
	}

	public double getProtein() {
		return protein;
	}

	public void setProtein(float protein) {
		this.protein = protein;
	}

	public double getCarbohydrate() {
		return carbohydrate;
	}

	public void setCarbohydrate(float carbohydrate) {
		this.carbohydrate = carbohydrate;
	}

	public double getFat() {
		return fat;
	}

	public void setFat(float fat) {
		this.fat = fat;
	}

}
