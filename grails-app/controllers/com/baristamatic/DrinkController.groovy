package com.baristamatic

class DrinkController {
	def scaffold = true
	
	//When the default url is accessed http://localhost:8080/TestBaristamaticGrails, index is called. This redirects to the
	//inherited list method
    def index = {redirect(action: list) }
}
