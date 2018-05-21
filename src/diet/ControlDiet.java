package diet;

import java.util.Map;
import java.util.TreeMap;

public class ControlDiet {
	private Map<String, Material> materials = new TreeMap<>();
	private Map<String, Product> products = new TreeMap<>();
	private Map<String, Recipe> recipes = new TreeMap<>();
	private Map<String, Menu> menu = new TreeMap<>();

	public ControlDiet() {

	}

	public Map<String, Recipe> getRecipes() {
		return recipes;
	}

	public void setRecipes(Map<String, Recipe> recipes) {
		this.recipes = recipes;
	}

	public Map<String, Menu> getMenu() {
		return menu;
	}

	public void setMenu(Map<String, Menu> menu) {
		this.menu = menu;
	}

	public Map<String, Recipe> getRecipe() {
		return recipes;
	}

	public void setRecipe(Map<String, Recipe> recipe) {
		this.recipes = recipe;
	}

	public Map<String, Material> getMaterials() {
		return materials;
	}

	public Map<String, Product> getProducts() {
		return products;
	}

	public void setProducts(Map<String, Product> products) {
		this.products = products;
	}

	public void setMaterials(Map<String, Material> materials) {
		this.materials = materials;
	}

	public void addMaterial(String materialName, double kiloCalories, double protein, double carbohydrate, double fat,
			boolean for100g) {
		Material material = new Material(materialName, kiloCalories, protein, carbohydrate, fat, for100g);
		materials.put(materialName, material);

	}

	public void addProduct(String productName, double productkiloCalories, double productprotein,
			double productcarbohydrate, double productfat) {

		Product product = new Product(productName, productkiloCalories, productprotein, productcarbohydrate,
				productfat);

		products.put(productName, product);
	}

	public void addRecipe(String foodName, String materialname, double quantityOfMaterial) {

		

			Recipe recipe = new Recipe(foodName, materialname, quantityOfMaterial);

			recipes.put(foodName,recipe);
		
	}

	public void addmenu(String menuFoodName, String materialInfo) {
		
			Menu menu = new Menu(menuFoodName, materialInfo);
			this.menu.put(menuFoodName, menu);
		

	}

	public Recipe getMenu(String menuFoodName) {

		return recipes.get(menuFoodName);
	}

	public Recipe getRecipeByName(String foodName) {

		return recipes.get(foodName);
	}

	public Product getProductByName(String name) {

		return products.get(name);
	}

	public Material getMaterial(String material) {

		return materials.get(material);
	}
}
