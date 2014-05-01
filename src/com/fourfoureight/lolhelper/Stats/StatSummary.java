package com.fourfoureight.lolhelper.Stats;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.json.JSONException;
import org.json.JSONObject;

public class StatSummary {
	private String               summaryType;
	private Map<String, Long> fields;
	private JSONObject           aggregatedStats;
	
	public StatSummary(String summaryType, JSONObject aggregatedStats) {
		this.summaryType     = summaryType;
		this.fields          = new HashMap<String, Long>();
		this.aggregatedStats = aggregatedStats;
	}
	
	public String getSummaryType() {
		return summaryType;
	}
	
	public long getField(String fieldName) {
		return fields.get(fieldName);
	}
	
	public void addField(String name, long field) {
		fields.put(name, field);
	}
	
	public boolean hasField(String fieldName) {
		return fields.containsKey(fieldName);
	}
	
	// For debugging
	public void printFields() {
		System.out.println("*** Fields");
		for (Entry<String, Long> entry : fields.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
	
	public int getAggregatedStat(String statName) throws JSONException {
		return aggregatedStats.getInt(statName);
	}
	
	public String getAgregatedStatString() throws JSONException{
		return this.aggregatedStats.toString();
	}
}