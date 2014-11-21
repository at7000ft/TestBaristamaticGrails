package com.baristamatic

class RecipeEntryController {
	def scaffold = true
	def index = {redirect(action: list) }
}
