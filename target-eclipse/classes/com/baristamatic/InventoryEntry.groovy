package com.baristamatic

class InventoryEntry {
	String displayName;
	String iname;
	Float cost;
	Integer invCount;

    static constraints = {
		 displayName (blank:false, nullable: false)
		 iname (blank:false, nullable: false)
		 cost (blank:false, nullable: false)
		 invCount (blank:false, nullable: false)
    }

	/* 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "InventoryEntry [displayName=" + displayName + ", iname=" + iname + ", cost=" + cost + ", invCount="
					+ invCount + "]";
	}
	 
	 
}
