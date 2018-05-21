package diet;

public class Product {
	private String productName;
	private double productKiloCalories;
	private double productProtein;
	private double productCarbohydrate;
	private double productFat;

	public Product(String productName, double productKiloCalories, double productProtein,
			double productCarbohydrate, double productFat) {

		this.productName = productName;
		this.productKiloCalories = productKiloCalories;
		this.productProtein = productProtein;
		this.productCarbohydrate = productCarbohydrate;
		this.productFat = productFat;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productMaterialName) {
		this.productName = productMaterialName;
	}

	public double getProductKiloCalories() {
		return productKiloCalories;
	}

	public void setProductKiloCalories(double productKiloCalories) {
		this.productKiloCalories = productKiloCalories;
	}

	public double getProductProtein() {
		return productProtein;
	}

	public void setProductProtein(double productProtein) {
		this.productProtein = productProtein;
	}

	public double getProductCarbohydrate() {
		return productCarbohydrate;
	}

	public void setProductCarbohydrate(double productCarbohydrate) {
		this.productCarbohydrate = productCarbohydrate;
	}

	public double getProductFat() {
		return productFat;
	}

	public void setProductFat(double productFat) {
		this.productFat = productFat;
	}

}
