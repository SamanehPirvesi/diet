package diet;

public class Menu {

	private String menuNameOfFood;
	private String foodInformation;

	public Menu(String menuNameOfFood, String foodInformation) {

		this.menuNameOfFood = menuNameOfFood;
		this.foodInformation = foodInformation;
	}

	public String getMenuNameOfFood() {
		return menuNameOfFood;
	}

	public void setMenuNameOfFood(String menuNameOfFood) {
		this.menuNameOfFood = menuNameOfFood;
	}

	public String getFoodInformation() {
		return foodInformation;
	}

	public void setFoodInformation(String foodInformation) {
		this.foodInformation = foodInformation;
	}

}
