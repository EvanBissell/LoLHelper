package com.fourfoureight.lolhelper;

import com.fourfoureight.lolhelper.General_Info.ChampionAttributes;

public class TeamBuilderData{

	public static final int numOfChampions = 5;

	//numbers of champions who are good in some positions, i.e. top, mid......
	private int[] numOfPosition;
	
	private ChampionAttributes[] allChampions;
	private ChampionAttributes[] ourTeam;

	// strategy array encoding: the first position indicates how many strategies
	// this team is good at, followed by a list of strategies.
	// strategies are numbered from 0 to 9
	private int[] availableStrategy;
	// this is the actual strategy the user pick. -1 means not picked yet.
	private int ourStrategy;

//==============================================================================

	public TeamBuilderData(){

		numOfPosition = new int[5];
		ourTeam = new ChampionAttributes[5];
		ourStrategy = -1;
		availableStrategy = new int[11];
		allChampions = new ChampionAttributes[numOfChampions];
		
		for (int i = 0; i < 5; i++){
			ourTeam[i] = new ChampionAttributes();
		}
		
		availableStrategy[0] = 10;
		for (int i = 1; i < 11; i++){
			availableStrategy[i] = i - 1;
		}
		
		// Create ChampionAttributes class for each champion in array "allChampions"
		// not done yet...
//		findNumOfAttributes();
//		findNumOfPositions();
		int aaArray[] = {20, 0, 20, 0, 20, 0, 20, 0, 20, 0};
		int aaPosition[] = {1, 1, 1, 1, 1};
		ChampionAttributes aa = new ChampionAttributes("aa", aaArray, aaPosition);
		int bbArray[] = {20, 0, 20, 0, 20, 0, 20, 0, 20, 0};
		int bbPosition[] = {1, 1, 1, 1, 1};
		ChampionAttributes bb = new ChampionAttributes("bb", bbArray, bbPosition);
		int ccArray[] = {20, 0, 20, 0, 20, 0, 20, 0, 20, 0};
		int ccPosition[] = {1, 1, 1, 1, 1};
		ChampionAttributes cc = new ChampionAttributes("cc", ccArray, ccPosition);
		int ddArray[] = {20, 0, 20, 0, 20, 0, 20, 0, 20, 0};
		int ddPosition[] = {1, 1, 1, 1, 1};
		ChampionAttributes dd = new ChampionAttributes("dd", ddArray, ddPosition);
		int eeArray[] = {20, 0, 20, 0, 20, 0, 20, 0, 20, 0};
		int eePosition[] = {1, 1, 1, 1, 1};
		ChampionAttributes ee = new ChampionAttributes("ee", eeArray, eePosition);
		
		allChampions[0] = aa;
		allChampions[1] = bb;
		allChampions[2] = cc;
		allChampions[3] = dd;
		allChampions[4] = ee;

		findNumOfPositions();
	}
	
	public void setOurTeam(int position, ChampionAttributes newChampion){
		this.ourTeam[position] = newChampion;
	}
	
	public void setOurStrategy(int strategy){
		this.ourStrategy = strategy;
	}
	
	public int getOurStrategy(){
		return this.ourStrategy;
	}
	
	public int getAvailableStrategyArray(int index){
		return this.availableStrategy[index];
	}
	
	public String[] getAvailableStrategy(){
		String[] returnArray = new String[availableStrategy[0] + 1];
		returnArray[0] = "Check Team Style Here";
		for (int i = 1; i <= availableStrategy[0]; i++){
			switch (availableStrategy[i]){
				case 0:
					returnArray[i] = "Hard Engage";
					break;
				case 1:
					returnArray[i] = "Split Push";
					break;
				case 2:
					returnArray[i] = "Poke";
					break;
				case 3:
					returnArray[i] = "Catch Out";
					break;
				case 4:
					returnArray[i] = "Wombo Combo";
					break;
				case 5:
					returnArray[i] = "Dunk Squad";
					break;
				case 6:
					returnArray[i] = "Yordle Only";
					break;
				case 7:
					returnArray[i] = "Full Revive Bungaloo";
					break;
				case 8:
					returnArray[i] = "Early Game";
					break;
				case 9:
					returnArray[i] = "Late Game";
					break;
			}
		}
		return returnArray;
	}
	
//==============================================================================
	
	// find the numbers of champions for each position
	private void findNumOfPositions(){
		// initialize the array
		for (int i = 0; i < 5; i++){
			numOfPosition[i] = 0;
		}
		for (int i = 0; i < numOfChampions; i++){
			for (int j = 0; j < 5; j++){
				if (allChampions[i].getPosition(j) == 1)
					numOfPosition[j] += 1;
			}
		}
	}

	private int championCounter(int strategy, int position){
		int count = 0;
		for (int i = 0; i < numOfChampions; i++){
			boolean strategyMatch = false;
			boolean positionMatch = false;
			for (int j = 0; j < 10; j++){
				if (allChampions[i].getAttribute(j) == 20){
					strategyMatch = true;
					break;
				}
			}
			for (int k = 0; k < 5; k++){
				if (allChampions[i].getPosition(k) == 1){
					positionMatch = true;
					break;
				}
			}
			if (strategyMatch && positionMatch){
				count += 1;
			}
		}
		return count;
	}
	
	// return a list of champions that matches the given strategy and given position.
	// strategy is labeled from 0 to 9, the return list won't include the 
	// champions that already in the team.
	public ChampionAttributes[] suggestChampionsByStrategy(int position){
		
		if (ourStrategy == -1){
			return suggestChampionsByPosition(position);
		}
		
		int returnSize = championCounter(ourStrategy, position);
		if (returnSize == 0){
			return null;
		}
		
		ChampionAttributes[] returnArray = new ChampionAttributes[returnSize];
		for (int i = 0; i < returnSize; i++){
			returnArray[i] = new ChampionAttributes();
		}

		// fill the return array
		for (int i = 0, j = 0; i < numOfChampions; i++){
			// Exclude all champions that already in the given team.
			if ((allChampions[i].getName() != ourTeam[0].getName()) 
								&& (allChampions[i].getName() != ourTeam[1].getName())
								&& (allChampions[i].getName() != ourTeam[2].getName())
								&& (allChampions[i].getName() != ourTeam[3].getName())
								&& (allChampions[i].getName() != ourTeam[4].getName())){

				// determine if the champion is good at given strategy
				if ((allChampions[i].getAttribute(ourStrategy) == 20) && 
						(allChampions[i].getPosition(position) == 1)){
					returnArray[j] = allChampions[i];
					j += 1;
				}
			}
		}
		return returnArray;
	}
	
	// return a list of champions that matches the given position.
	// strategy is labeled from 0 to 9, the return list won't include the 
	// champions that already in the given team.
	public ChampionAttributes[] suggestChampionsByPosition(int position){

		ChampionAttributes[] returnArray = new ChampionAttributes[numOfPosition[position]];
		for (int i = 0; i < numOfPosition[position]; i++){
			returnArray[i] = new ChampionAttributes();
		}
		
		// fill the return array
		for (int i = 0, j = 0; i < numOfChampions; i++){
			
			// Exclude all champions that are already in the given team.
			if ((allChampions[i].getName() != ourTeam[0].getName()) 
								&& (allChampions[i].getName() != ourTeam[1].getName())
								&& (allChampions[i].getName() != ourTeam[2].getName())
								&& (allChampions[i].getName() != ourTeam[3].getName())
								&& (allChampions[i].getName() != ourTeam[4].getName())){

				// determine if the champion is good at given strategy
				if (allChampions[i].getPosition(position) == 1){
					returnArray[j] = allChampions[i];
					j += 1;
				}
			}
		}
		return returnArray;
	}
	
	//	suggest a strategy for the team
	public void suggestStrategyForTeam(){
		
		// detect # of current team members
		int numOfCurrentTeamMembers = 0;
		for (int i = 0; i < 5; i++){
			if (ourTeam[i].getName() != "NONAME")
				numOfCurrentTeamMembers += 1;
		}
		
		// if the team is empty, then all strategies are available.
		if (numOfCurrentTeamMembers == 0){
			int[] strategies = {10, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
			availableStrategy = strategies;
			return;
		}
		
		// cumulative score of a certain strategy for the given team
		int[] strategyScore = new int[10];
		for (int i = 0; i < 5; i++){
			for (int j = 0; j < 10; j++){
				strategyScore[j] += ourTeam[i].getAttribute(j);
			}
		}
		
		// returnArray encoding: the first position indicates how many strategies
		// this team is good at, followed by a list of strategies (strategy index 
		// 0 ~ 9)
		// Initialization, -1 means not strategy on that index.
		int[] returnArray = new int [11];
		returnArray[0] = 0;
		for (int i = 1; i <= 10; i++){
			returnArray[i] = -1;
		}
		
		// for every strategy score, find if it is the greatest in the array. if so, 
		// append the strategy to returnArray and increment returnArray[0] 
		for (int i = 0; i < 10; i++){
			boolean isGreatest = true;
			for (int j = 0; j < 10; j++){
				if (strategyScore[j] > strategyScore[i])
					isGreatest = false;
			}
			if (isGreatest){
				returnArray[0] += 1;
				returnArray[returnArray[0]] = i;
			}
		}		
		availableStrategy = returnArray;
	}
	
	public ChampionAttributes[] getAllAvailableChampions(){
		ChampionAttributes[] returnArray = new ChampionAttributes[numOfChampions];
		for (int i = 0; i < numOfChampions; i++){
			returnArray[i] = new ChampionAttributes();
		}
		
		// fill the return array
		for (int i = 0, j = 0; i < numOfChampions; i++){
			// Exclude all champions that are already in the given team.
			if ((allChampions[i].getName() != ourTeam[0].getName()) 
								&& (allChampions[i].getName() != ourTeam[1].getName())
								&& (allChampions[i].getName() != ourTeam[2].getName())
								&& (allChampions[i].getName() != ourTeam[3].getName())
								&& (allChampions[i].getName() != ourTeam[4].getName())){
				returnArray[j] = allChampions[i];
				j += 1;
			}
		}
		return returnArray;
	}
}
