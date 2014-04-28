package com.fourfoureight.lolhelper.General_Info;

public class BuildInfo {
	//Build Guide Variables - Start (4), Rush (3), As Needed (5)
	private String[] start = {
			"abc_ab_bottom_transparent_dark_holo",
			"abc_ab_bottom_transparent_dark_holo",
			"abc_ab_bottom_transparent_dark_holo",
			"abc_ab_bottom_transparent_dark_holo"};
	private String[] rush = {
			"abc_ab_bottom_transparent_dark_holo"
			,"abc_ab_bottom_transparent_dark_holo"
			,"abc_ab_bottom_transparent_dark_holo"};
	private String[] asNeeded = {
			"abc_ab_bottom_transparent_dark_holo",
			"abc_ab_bottom_transparent_dark_holo",
			"abc_ab_bottom_transparent_dark_holo",
			"abc_ab_bottom_transparent_dark_holo",
			"abc_ab_bottom_transparent_dark_holo"};
	//Build Guide - Counters to add items
	private int startcur = 0;
	private int rushcur = 0;
	private int asneededcur = 0;

	
	public BuildInfo(){
		
	}
	
	
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
