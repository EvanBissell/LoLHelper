package com.fourfoureight.lolhelper.General_Info;

public class ItemBuild {
	//Variables - Start (4), Rush (3), As Needed (5)
	private String[] start = {"","","",""};
	private String[] rush = {"","",""};
	private String[] asNeeded = {"","","","",""};
	//Counters to add items
	private int startcur = 0;
	private int rushcur = 0;
	private int asneededcur = 0;
	
	//Constructor
	public ItemBuild(){
	}
	
	//Setters
	public void setStart(String set){
		if(startcur < 4){
			start[startcur]=set;
			startcur++;
		}
	}
	
	public void setRush(String set){
		if(rushcur < 3){
			rush[rushcur]=set;
			rushcur++;
		}
	}
	
	public void setAsNeeded(String set){
		if(asneededcur < 5){
			asNeeded[asneededcur]=set;
			asneededcur++;
		}
	}
	
	//Getters
	public String[] getStart(){
		return start;
	}
	
	public String[] getRush(){
		return rush;
	}
	
	public String[] getAsNeeded(){
		return asNeeded;
	}
}
