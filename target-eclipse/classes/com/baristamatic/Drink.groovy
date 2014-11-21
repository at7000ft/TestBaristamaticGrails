package com.baristamatic

import java.util.Map;

class Drink {
	int number
	String dname
	String displayName
	//Map<String,Integer> recipe 			//Maps parameters in domain classes must be <String,String>
	
	static constraints = {
		number (blank:false, nullable: false)
		displayName (blank:false, nullable: false)
		dname (blank:false, nullable: false)
	}
	
	static hasMany = [recipeEntries : RecipeEntry]

	/* 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Drink [number=" + number + ", dname=" + dname + ", displayName=" + displayName + "]";
	}
	
	
}
