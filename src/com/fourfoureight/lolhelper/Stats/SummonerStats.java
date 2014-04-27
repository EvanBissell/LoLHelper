package com.fourfoureight.lolhelper.Stats;

import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/*import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;*/






import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.annotation.SuppressLint;
import android.util.JsonReader;

public class SummonerStats {
	private String summonerName;
	private Map<String, StatSummary> summaries;

	@SuppressLint("NewApi")
	private void parseSummaries(InputStream stream) {
		String contents = new Scanner(stream).useDelimiter("\\A").next();
		try {
			JSONObject jsonObject = new JSONObject(contents);
			JSONArray jsonSummaries = jsonObject.getJSONArray("playerStatSummaries");
			
			for (int i = 0; i < jsonSummaries.length(); ++i) {
				JSONObject  jsonSummary = jsonSummaries.getJSONObject(i);
				String      summaryType = jsonSummary.get("playerStatSummaryType").toString();

				Iterator<String> it = jsonSummary.keys();
				
				JSONObject aggregatedStats = null;
				
				if (!jsonSummary.get("aggregatedStats").equals("{}")) {
					aggregatedStats = jsonSummary.getJSONObject("aggregatedStats");
				}
				
				StatSummary summary = new StatSummary(summaryType
				                                     ,aggregatedStats);
				
				while (it.hasNext()) {
					String entry = it.next();
					if (entry.equals("aggregatedStats") || entry.equals("playerStatSummaryType")) {
						continue;
					}
					summary.addField(entry, jsonSummary.getInt(entry));
				}
				summaries.put(summaryType, summary);
			}
		} catch (JSONException e) {
			System.err.println(e);
			System.exit(1);
		}
	}
	
	public SummonerStats(String summonerName, InputStream stream) {
		this.summonerName = summonerName;
		this.summaries    = new HashMap<String, StatSummary>();
		parseSummaries(stream);
	}
	
	public String getSummonerName() {
		return summonerName;
	}
	
	public boolean hasSummary(String summaryType) {
		return summaries.containsKey(summaryType);
	}
	
	public Set<String> summaryTypeSet() {
		return summaries.keySet();
	}
	
	public StatSummary getSummary(String summaryType) {
		return summaries.get(summaryType);
	}
}