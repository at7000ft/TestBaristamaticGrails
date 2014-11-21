package com.baristamatic

import grails.test.*

class DrinkTests extends GrailsUnitTestCase {
	protected void setUp() {
		super.setUp()
	}
	
	protected void tearDown() {
		super.tearDown()
	}
	
	void testSave() {
		//def drink = new Drink(number: 1, name: "coffee", displayName: "Coffee", recipe: ["coffee": '3', "sugar" : '1', "cream": '1'])
		List recipeList = [new RecipeEntry(iname:"coffee", icount:3), new RecipeEntry(iname:"sugar", icount:1),new RecipeEntry(iname:"cream", icount:1)]
		def drink = new Drink(number: 1,dname: "coffee", displayName: "Coffee", recipeEntries: recipeList)
		assertNotNull drink.save()
		assertNotNull drink.id
		def foundDrink = Drink.get(drink.id)
		assertEquals "coffee", foundDrink.dname
		//assertEquals 1, foundDrink.recipeEntries
		
	}
	
}
