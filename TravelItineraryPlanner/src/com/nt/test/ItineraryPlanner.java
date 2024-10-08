package com.nt.test;

import java.util.ArrayList;
import java.util.List;


public class ItineraryPlanner 
{
	private List<Destination> destinations;
	
	public ItineraryPlanner()
	{
		this.destinations = new ArrayList<>();
	}
	
	public void addDestination(Destination destination) 
	{
		destinations.add(destination);
	}
	
	public List<Destination> getDestinations()
	{
		return destinations;
	}
}
