package com.info.cricket.client;

import com.info.cricket.service.CricketFactory;
import com.info.cricket.service.CricketSelection;

public class SelectPlayers {
	
	public static void main(String[] args) {
		
		//Enter the inputs to register the players 
		
		
		//Factory Patterns to create objects 
		CricketFactory cricketFactory = new CricketFactory();
		
		CricketSelection batsman = cricketFactory.getInstance("Batsman");
		
		CricketSelection Bowler = cricketFactory.getInstance("Bowler");

		//Iterator pattern to show the selected players
		
		
		//Observer pattern to Send Notification to the selected players 
		
		
		
	}

}
