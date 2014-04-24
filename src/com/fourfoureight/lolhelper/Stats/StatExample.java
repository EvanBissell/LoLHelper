package com.fourfoureight.lolhelper.Stats;

import java.io.FileReader;
import java.io.IOException;


public class StatExample {
	public static void runExample(String[] args) {
		FileReader fileReader;
		try {
			fileReader = new FileReader("/home/dyoung/summoner-stats.txt");
			
			SummonerStats stats = new SummonerStats(fileReader);
			
			System.out.format("Unranked wins: %s\n", stats.getSummaries().get("Unranked").getStats().get("wins"));
			
			fileReader.close();
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
