package com.baristamatic

import grails.test.*

class InventoryEntryTests extends GrailsUnitTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testSave() {
		 def inventoryEntry = new InventoryEntry(displayName: "Cocoa", iname: "cocoa", cost: 0.90, invCount: 10)
		 assertNotNull inventoryEntry.save()
		 assertNotNull inventoryEntry.id
		 
		 def foundIE = InventoryEntry.get(inventoryEntry.id)
		 assertEquals "cocoa", foundIE.iname

    }
}
