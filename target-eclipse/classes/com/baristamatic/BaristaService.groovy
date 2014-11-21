package com.baristamatic

import org.springframework.flex.remoting.RemotingDestination
import org.springframework.flex.remoting.RemotingInclude
import org.springframework.stereotype.Service

/*
 * Tell Spring to expose this as a remotely accessed service through BlazeDS
 * If no name is specified after @Service the service is named using the classname - "BaristaService"
 * 
 * Must run grails run-war rather than run-app so flex can communicate
 *
 */
@Service
@RemotingDestination
class BaristaService {


   static transactional = true

   //Define this method as remotely accessible, can use @RemotingExclude to exclude
   @RemotingInclude
   def getDrinks() {
      println "getDrinks: called"
      Drink.list()
   }

   def updateDrink(Drink drink) {
      println "updateDrink: called with - " + drink
      drink.save()
   }

   def getDrink(int id) {
      println "getDrink: called with -" + id
      Drink.get(id)
   }

   def deleteDrink(Drink drink) {
      println "deleteDrink: called with - " + drink
      drink.delete()
   }
}
