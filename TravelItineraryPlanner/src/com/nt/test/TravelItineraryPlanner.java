package com.nt.test;

@SuppressWarnings("unused")
public class TravelItineraryPlanner 
{
	 public static void main(String[] args)
	 {
		ItineraryPlanner itineraryPlanner = new ItineraryPlanner();
	
	    Destination paris = new Destination("Paris");
	    Destination london= new Destination("London");
	
	    paris.addActivity(new Activity("Visit Eiffel Tower", "Morning"));
	    paris.addActivity(new Activity("Louvre Museum", "Afternoon"));
	
	     
	     london.addActivity(new Activity("British Museum", "Morning"));
	     london.addActivity(new Activity("London Eye", "Afternoon"));
	
	    itineraryPlanner.addDestination(paris);
	    itineraryPlanner.addDestination(london);
	
	     
	     for (Destination destination : itineraryPlanner.getDestinations())
	     {
	         System.out.println("Destination: " + destination);
	         for (Activity activity : destination.getActivities()) 
	         {
	             System.out.println("- " + activity);
	         }
	         System.out.println(); 
	     }
	 }
}