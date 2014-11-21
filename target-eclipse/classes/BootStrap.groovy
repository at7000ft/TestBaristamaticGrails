import grails.util.Environment;

import com.baristamatic.Drink;
import com.baristamatic.InventoryEntry;
import com.baristamatic.RecipeEntry;

class BootStrap {
	
	def init = { servletContext ->
		switch (Environment.current) {
			case Environment.DEVELOPMENT:
			createInventoryAndDrinks()
			break;
			case Environment.PRODUCTION:
			println "BootStrap>>init: No special config required"
			break;
		}
	}
	def destroy = {
	}
	
	void createInventoryAndDrinks() {
		println "Clean database, creating inventory and driniks"
		createInventory()
		createDrinks()
	}
	
	void createInventory() {
		def inventoryEntry = new InventoryEntry(displayName: "Coffee", iname: "coffee", cost: 0.75, invCount: 10)
		inventoryEntry.save()
		inventoryEntry = new InventoryEntry(displayName: "Cocoa", iname: "cocoa", cost: 0.90, invCount: 10)
		inventoryEntry.save()
		inventoryEntry = new InventoryEntry(displayName: "DecafCoffee", iname: "decafCoffee", cost: 0.75, invCount: 10)
		inventoryEntry.save()
		inventoryEntry = new InventoryEntry(displayName: "Sugar", iname: "sugar", cost: 0.25, invCount: 10)
		inventoryEntry.save()
		inventoryEntry = new InventoryEntry(displayName: "Cream", iname: "cream", cost: 0.25, invCount: 10)
		inventoryEntry.save()
		inventoryEntry = new InventoryEntry(displayName: "Steamed Milk", iname: "steamedMilk", cost: 0.35, invCount: 10)
		inventoryEntry.save()
		inventoryEntry = new InventoryEntry(displayName: "Foamed Milk", iname: "foamedMilk", cost: 0.35, invCount: 10)
		inventoryEntry.save()
		inventoryEntry = new InventoryEntry(displayName: "Espresso", iname: "espresso", cost: 1.10, invCount: 10)
		inventoryEntry.save()
		inventoryEntry = new InventoryEntry(displayName: "Whipped Cream", iname: "whippedCream", cost: 1.00, invCount: 10)
		inventoryEntry.save()
	}
	
	void createDrinks() {
		List recipeList = [
			new RecipeEntry(iname:"coffee", icount:3),
			new RecipeEntry(iname:"sugar", icount:1),
			new RecipeEntry(iname:"cream", icount:1)
		]
		def drink = new Drink(number: 1, dname: "coffee", displayName: "Coffee", recipeEntries: recipeList)
		drink.save()
		recipeList = [
			new RecipeEntry(iname:"decafCoffee", icount:3),
			new RecipeEntry(iname:"sugar", icount:1),
			new RecipeEntry(iname:"cream", icount:1)
		]
		drink = new Drink(number: 2, dname: "decafCoffee", displayName: "DecafCoffee", recipeEntries: recipeList)
		drink.save()
		recipeList = [
			new RecipeEntry(iname:"espresso", icount:2),
			new RecipeEntry(iname:"steamedMilk", icount:1)
		]
		drink = new Drink(number: 3, dname: "caffeLatte", displayName: "Caffe Latte", recipeEntries: recipeList)
		drink.save()
		recipeList = [
			new RecipeEntry(iname:"espresso", icount:3),
		]
		drink = new Drink(number: 4, dname: "caffeAmericano", displayName: "Caffe Americano", recipeEntries: recipeList)
		drink.save()
		recipeList = [
			new RecipeEntry(iname:"espresso", icount:1),
			new RecipeEntry(iname:"cocoa", icount:1),
			new RecipeEntry(iname:"steamedMilk", icount:1)
		]
		drink = new Drink(number: 5, dname: "caffeMocha", displayName: "Caffe Mocha", recipeEntries: recipeList)
		drink.save()
		recipeList = [
			new RecipeEntry(iname:"espresso", icount:2),
			new RecipeEntry(iname:"steamedMilk", icount:1),
			new RecipeEntry(iname:"foamedMilk", icount:1)
		]
		drink = new Drink(number: 6, dname: "cappuccino", displayName: "Cappuccino", recipeEntries: recipeList)
		drink.save()
	}
}
