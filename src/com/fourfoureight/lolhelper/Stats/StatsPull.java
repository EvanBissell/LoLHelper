package com.fourfoureight.lolhelper.Stats;

import java.net.*;
import java.io.*;

import org.json.JSONException;

public class StatsPull {
	private String summonerName, summonerID, profileIcon, level;
	private SummonerStats summonerStats;
	private String apikey = "?api_key=f685bd80-568e-4ff3-9d20-4bde13ab7106";
	
	//  ---===== Player Statistics data =====---
	// Wins
	private long rankedPremade3x3Wins, rankedPremade5x5Wins, rankedTeam3x3Wins, rankedTeam5x5Wins, rankedSolo5x5Wins;
	private long unrankedWins, unranked3x3Wins, coopVsAIWins;
	// Normal Stats
	private long nChampKills, nAssists, nMinionKills, nNeutralMonsterKills, nTotalTurretKills; 
	// Ranked Solo 5x5 Stats
	private long rChampKills, rAssists, rMinionKills, rNeutralMonsterKills, rTotalTurretKills;
	// Normal 3x3 Stats
	private long tvtChampKills, tvtAssists, tvtMinionKills, tvtNeutralMonsterKills, tvtTotalTurretKills;

	//--------------------------------------------------
	// Takes in summoner name and returns summonerID
	//--------------------------------------------------
	private void retrieveSummonerID() throws IOException{
		String summonerInfo, newSummonerInfo, actualSummonerID;
		int index = 0;
		String summonerinfo = "https://prod.api.pvp.net/api/lol/na/v1.3/summoner/by-name/"+summonerName+apikey;
		
		URL info = new URL(summonerinfo);
		URLConnection yc1 = info.openConnection();
		BufferedReader summonerInfoReader = new BufferedReader(new InputStreamReader(yc1.getInputStream()));
		summonerInfo = summonerInfoReader.readLine();
		
		// Parse summoner Info to extract summonerID
		newSummonerInfo = summonerInfo.substring(summonerName.length() + 9);
		index = newSummonerInfo.indexOf(",");	
		actualSummonerID = newSummonerInfo.substring(1, index);
		this.summonerID = actualSummonerID;
		
		//Parse summoner Info to extract profile picture
		newSummonerInfo = summonerInfo.substring(2*summonerName.length() + summonerID.length() + 36);
		index = newSummonerInfo.indexOf(",");	
		profileIcon = newSummonerInfo.substring(1, index);
		
		//Parse summonerInfo to extract level
		newSummonerInfo = newSummonerInfo.substring(profileIcon.length() + 17);
		index = newSummonerInfo.indexOf(",");	
		level = newSummonerInfo.substring(1, index);
	}
	
	//--------------------------------------------------
	// Uses summoner ID to pull summoner statistics
	//--------------------------------------------------
	private void retrieveSummonerStats() throws IOException, JSONException {
		String statsrequest = "https://prod.api.pvp.net/api/lol/na/v1.2/stats/by-summoner/" + summonerID + "/summary" + apikey;
		System.out.println("love is empty");
		URL oracle = new URL(statsrequest);
		URLConnection yc = oracle.openConnection();
		this.summonerStats = new SummonerStats(summonerName, yc.getInputStream());
		statsExtract();
	}
	
	private void statsExtract() throws JSONException {
		
		//Normal Stats
		if(summonerStats.hasSummary("Unranked")){
			this.unrankedWins         = summonerStats.getSummary("Unranked").getField("wins");
			this.nAssists			  = summonerStats.getSummary("Unranked").getAggregatedStat("totalAssists");
			this.nChampKills          = summonerStats.getSummary("Unranked").getAggregatedStat("totalChampionKills");
			this.nMinionKills         = summonerStats.getSummary("Unranked").getAggregatedStat("totalMinionKills");
			this.nNeutralMonsterKills = summonerStats.getSummary("Unranked").getAggregatedStat("totalNeutralMinionsKilled");
			this.nTotalTurretKills    = summonerStats.getSummary("Unranked").getAggregatedStat("totalTurretsKilled");
		}
		
		//Ranked 5v5
		if(summonerStats.hasSummary("RankedSolo5x5")){
			this.rankedSolo5x5Wins    = summonerStats.getSummary("RankedSolo5x5").getField("wins");
			this.rAssists             = summonerStats.getSummary("RankedSolo5x5").getAggregatedStat("totalAssists");
			this.rChampKills          = summonerStats.getSummary("RankedSolo5x5").getAggregatedStat("totalChampionKills");
			this.rMinionKills         = summonerStats.getSummary("RankedSolo5x5").getAggregatedStat("totalMinionKills");
			this.rNeutralMonsterKills = summonerStats.getSummary("RankedSolo5x5").getAggregatedStat("totalNeutralMinionsKilled");
			this.rTotalTurretKills    = summonerStats.getSummary("RankedSolo5x5").getAggregatedStat("totalTurretsKilled");
		}
		
		// Normal 3v3
		if(summonerStats.hasSummary("Unranked3x3")){
			this.unranked3x3Wins      = summonerStats.getSummary("Unranked3x3").getField("wins");
			this.tvtAssists			  = summonerStats.getSummary("Unranked3x3").getAggregatedStat("totalAssists");
			this.tvtChampKills          = summonerStats.getSummary("Unranked3x3").getAggregatedStat("totalChampionKills");
			this.tvtMinionKills         = summonerStats.getSummary("Unranked3x3").getAggregatedStat("totalMinionKills");
			this.tvtNeutralMonsterKills = summonerStats.getSummary("Unranked3x3").getAggregatedStat("totalNeutralMinionsKilled");
			this.tvtTotalTurretKills    = summonerStats.getSummary("Unranked3x3").getAggregatedStat("totalTurretsKilled");
			
		}
		
		//Ranked Premade 3v3
		if(summonerStats.hasSummary("RankedPremade3x3")){
			this.rankedPremade3x3Wins = summonerStats.getSummary("RankedPremade3x3").getField("wins");
		}

		//Ranked Premade 5v5
		if(summonerStats.hasSummary("RankedPremade5x5")){
			this.rankedPremade5x5Wins = summonerStats.getSummary("RankedPremade5x5").getField("wins");
		}
		
		//Ranked Team 3v3
		if(summonerStats.hasSummary("RankedTeam3x3")){
			this.rankedTeam3x3Wins    = summonerStats.getSummary("RankedTeam3x3").getField("wins");
		}
		
		//Ranked Team 5v5
		if(summonerStats.hasSummary("RankedTeam5x5")){
			this.rankedTeam5x5Wins    = summonerStats.getSummary("RankedTeam5x5").getField("wins");
		}
		
		//Coop Vs AI
		if(summonerStats.hasSummary("CoopVsAI")){
			this.coopVsAIWins         = summonerStats.getSummary("CoopVsAI").getField("wins");
		}
	}
	
	public StatsPull(String givenSummonerName) throws IOException{
		//Initializations to prevent unexpected outputs
		summonerID = "0";
		profileIcon = "607";
		level = "0";
		rankedPremade3x3Wins = 0;
		rankedPremade5x5Wins = 0;
		rankedTeam3x3Wins = 0;
		rankedTeam5x5Wins = 0;
		rankedSolo5x5Wins = 0;
		unrankedWins = 0;
		unranked3x3Wins = 0;
		coopVsAIWins = 0;
		nChampKills = 0;
		nAssists = 0;
		nMinionKills = 0;
		nNeutralMonsterKills = 0;
		nTotalTurretKills = 0;
		rChampKills = 0;
		rAssists = 0;
		rMinionKills = 0;
		rNeutralMonsterKills = 0;
		rTotalTurretKills = 0;
		tvtChampKills = 0;
		tvtAssists = 0;
		tvtMinionKills = 0;
		tvtNeutralMonsterKills = 0;
		tvtTotalTurretKills = 0;
		
		this.summonerName = givenSummonerName;
		this.retrieveSummonerID();
		try {
			this.retrieveSummonerStats();
		} catch (JSONException e) {
			System.err.println(e);
			System.exit(1);
		}
	}
	
	// Getter Methods
	public String getSummonerName() {
		return summonerName;
	}

	public String getSummonerID() {
		return summonerID;
	}

	public String getProfileIcon(){
		return profileIcon;
	}
	
	public String getLevel(){
		return level;
	}
	
	public SummonerStats getSummonerStats() {
		return summonerStats;
	}

	public long getRankedPremade3x3Wins() {
		return rankedPremade3x3Wins;
	}

	public long getRankedPremade5x5Wins() {
		return rankedPremade5x5Wins;
	}

	public long getRankedTeam3x3Wins() {
		return rankedTeam3x3Wins;
	}

	public long getRankedTeam5x5Wins() {
		return rankedTeam5x5Wins;
	}

	public long getRankedSolo5x5Wins() {
		return rankedSolo5x5Wins;
	}

	public long getUnrankedWins() {
		return unrankedWins;
	}
	
	public long getUnranked3x3Wins(){
		return unranked3x3Wins;
	}
	

	public long getCoopVsAIWins() {
		return coopVsAIWins;
	}

	public long getnChampKills() {
		return nChampKills;
	}

	public long getnAssists() {
		return nAssists;
	}

	public long getnMinionKills() {
		return nMinionKills;
	}

	public long getnNeutralMonsterKills() {
		return nNeutralMonsterKills;
	}

	public long getnTotalTurretKills() {
		return nTotalTurretKills;
	}

	public long getrChampKills() {
		return rChampKills;
	}

	public long getrAssists() {
		return rAssists;
	}

	public long getrMinionKills() {
		return rMinionKills;
	}

	public long getrNeutralMonsterKills() {
		return rNeutralMonsterKills;
	}

	public long getrTotalTurretKills() {
		return rTotalTurretKills;
	}

	public long getTvtChampKills() {
		return tvtChampKills;
	}

	public long getTvtAssists() {
		return tvtAssists;
	}

	public long getTvtMinionKills() {
		return tvtMinionKills;
	}

	public long getTvtNeutralMonsterKills() {
		return tvtNeutralMonsterKills;
	}

	public long getTvtTotalTurretKills() {
		return tvtTotalTurretKills;
	}
}
