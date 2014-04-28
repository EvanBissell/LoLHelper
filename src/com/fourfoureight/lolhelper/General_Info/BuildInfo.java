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
	
	public void setStart(String set1, String set2){
		if(startcur < 3){
			start[startcur]=set1;
			start[startcur+1]=set2;
			startcur+=2;
		}
	}
	
	public void setStart(String set1, String set2, String set3){
		if(startcur < 2){
			start[startcur]=set1;
			start[startcur+1]=set2;
			start[startcur+2]=set3;
			startcur+=3;
		}
	}
	
	public void setStart(String set1, String set2, String set3, String set4){
		if(startcur < 1){
			start[startcur]=set1;
			start[startcur+1]=set2;
			start[startcur+2]=set3;
			start[startcur+3]=set4;
			startcur+=4;
		}
	}
	
	public void setRush(String set){
		if(rushcur < 3){
			rush[rushcur]=set;
			rushcur++;
		}
	}
	
	public void setRush(String set1, String set2){
		if(rushcur < 2){
			rush[rushcur]=set1;
			rush[rushcur+1]=set2;
			rushcur+=2;
		}
	}
	
	public void setRush(String set1, String set2, String set3){
		if(rushcur < 1){
			rush[rushcur]=set1;
			rush[rushcur+1]=set2;
			rush[rushcur+2]=set3;
			rushcur+=3;
		}
	}
	
	public void setAsNeeded(String set){
		if(asneededcur < 5){
			asNeeded[asneededcur]=set;
			asneededcur++;
		}
	}
	
	public void setAsNeeded(String set1, String set2){
		if(asneededcur < 4) {
			asNeeded[asneededcur]=set1;
			asNeeded[asneededcur+1]=set2;
			asneededcur+=2;
		}
	}
	
	public void setAsNeeded(String set1, String set2, String set3){
		if(asneededcur < 3) {
			asNeeded[asneededcur]=set1;
			asNeeded[asneededcur+1]=set2;
			asNeeded[asneededcur+2]=set3;
			asneededcur+=3;
		}
	}
	
	public void setAsNeeded(String set1, String set2, String set3, String set4){
		if(asneededcur < 2) {
			asNeeded[asneededcur]=set1;
			asNeeded[asneededcur+1]=set2;
			asNeeded[asneededcur+2]=set3;
			asNeeded[asneededcur+3]=set4;
			asneededcur+=4;
		}
	}
	
	public void setAsNeeded(String set1, String set2, String set3, String set4, String set5){
		if(asneededcur < 2) {
			asNeeded[asneededcur]=set1;
			asNeeded[asneededcur+1]=set2;
			asNeeded[asneededcur+2]=set3;
			asNeeded[asneededcur+3]=set4;
			asNeeded[asneededcur+4]=set5;
			asneededcur+=5;
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
