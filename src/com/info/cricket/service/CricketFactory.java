package com.info.cricket.service;

public class CricketFactory {
	
	public CricketSelection getInstance(String role) {
		
		if(role.equals("Batsman")) {
			return new Batsman();
		}
		else if (role.equals("Bowler")) {
			return new Bowler();
		}
		else if (role.equals("AllRounder")) {
			return new AllRounder();
		}
		else if (role.equals("WicketKeeper")) {
			return new WicketKeeper();
		}
		return null;
	}

}
