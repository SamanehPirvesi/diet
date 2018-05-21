import diet.ControlDiet;
import diet.Material;
import diet.Menu;
import diet.Product;
import diet.Recipe;

public class RunDiet {

	public static void main(String[] args) {
	
		ControlDiet control=new ControlDiet();
		control.addMaterial("sugar",400,0,100,0,true);
		control.addMaterial("milk",34,3.30,5.10,0.05,true);
		control.addMaterial("pasta",350,12.0,72.2,1.5,true);
		control.addMaterial("corn",70,2.7,12.0,0.05,true);
		control.addMaterial("olive oil",900,0,0,100,true);
		control.addMaterial("nutella",530,6.8,56,31,true);
		
		control.addProduct("icecream",123.2,1.2,32,31.3);
		control.addProduct("yoghurt",240,32.4,12,76);
		control.addProduct("cheese",187,45.7,78.4,38);
		
		control.addRecipe("soup","corn",200.2);
		control.addRecipe("pasta","pasta",134);
		
		control.addmenu("pasta", "Pasta: 70; Mais: 70; Olio Extravergine: 13");
		
		for(Material m: control.getMaterials().values()) {
			System.out.println(m.getMaterialName()+"  "+m.getKiloCalories()+"  "+m.getProtein()+"  "+m.getCarbohydrate()+"  "+m.getFat());
		}
		
		if(control.getMaterial("corn")!=null) {
			System.out.println(control.getMaterial("corn").getMaterialName()+"  "+control.getMaterial("corn").getKiloCalories()+"  "+control.getMaterial("corn").getProtein()+"  "+control.getMaterial("corn").getCarbohydrate()+"  "+control.getMaterial("corn").getFat());
			
			
		}
		
		
			if(control.getProductByName("cheese")!=null)
			{
				System.out.println(control.getProductByName("cheese").getProductName()+" "+control.getProductByName("cheese").getProductKiloCalories()+ " "+control.getProductByName("cheese").getProductCarbohydrate()+"  "+control.getProductByName("cheese").getProductProtein());
			}
			System.out.println("list of products are :");
			for(Product p:control.getProducts().values()) {
			System.out.println(p.getProductName()+" "+p.getProductKiloCalories()+" "+p.getProductProtein()+" "+p.getProductCarbohydrate()+" "+p.getProductFat());
		
		}
			System.out.println("recipes list are :");
			for(Recipe r:control.getRecipe().values()) {
				System.out.println(r.getFoodName()+" "+"with"+r.getFoodMaterial()+" "+r.getQuantityInGram());
			}
			System.out.println("material of food is: ");
			if(control.getRecipeByName("soup")!=null) {
			System.out.println(control.getRecipeByName("soup").getFoodName()+" "+control.getRecipeByName("soup").getFoodMaterial()+" "+control.getRecipeByName("soup").getQuantityInGram());
			}
			//else {
			//	System.out.println("recipe is not exist");
		//	}
			for (Menu m:control.getMenu().values()) {
				System.out.println(m.getMenuNameOfFood()+""+"="+m.getFoodInformation());
			}
		
	}

}
