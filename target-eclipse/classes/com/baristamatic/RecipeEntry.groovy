package com.baristamatic

class RecipeEntry {
	String iname
	int icount
	
	static constraints = {
		iname (blank:false, nullable: false)
		icount (blank:false, nullable: false)
	}
	/* 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "RecipeEntry [iname=" + iname + ", icount=" + icount + "]";
	}
	
	
}
