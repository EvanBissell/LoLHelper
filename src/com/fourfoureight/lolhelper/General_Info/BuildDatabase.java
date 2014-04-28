package com.fourfoureight.lolhelper.General_Info;

public class BuildDatabase {
	private BuildInfo database[];
	
	public BuildDatabase(){
		database = new BuildInfo[117];
		
		database[0] = new BuildInfo();
		database[0].setStart("ionianbootsoflucidity");
		database[0].setRush("ionianbootsoflucidity");
	}
	
	public BuildInfo[] getDatabase(){
		return database;
	}
}
