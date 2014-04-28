package com.fourfoureight.lolhelper;

import java.io.IOException;
import java.io.Serializable;

import com.fourfoureight.lolhelper.R;
import com.fourfoureight.lolhelper.R.menu;
import com.fourfoureight.lolhelper.Stats.StatsPull;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import android.os.Build;

public class PlayerStats extends ActionBarActivity {
	private final String TAG = "enter";
	String results[];
	EditText edit1;
	TextView text1, text2, text3, text4, text5, text6, text7, text8, text9, text10, text11, text12, text13, text14, text15, text16, text17, text18, text19, text20, text21, text22, text23, text24;
	static StatsPull stats;
	String summonerName;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_player_stats);
		results = new String[26];
		for(int i=0; i<25; i++){
			results[i] = "";
		}
		edit1 = (EditText) findViewById(R.id.editText1);
		text1 = (TextView) findViewById(R.id.textView1);
		text2 = (TextView) findViewById(R.id.textView2);
		text3 = (TextView) findViewById(R.id.textView3);
		text4 = (TextView) findViewById(R.id.textView4);
		text5 = (TextView) findViewById(R.id.textView5);
		text6 = (TextView) findViewById(R.id.textView6);
		text7 = (TextView) findViewById(R.id.textView7);
		text8 = (TextView) findViewById(R.id.textView8);
		text9 = (TextView) findViewById(R.id.textView9);
		text10 = (TextView) findViewById(R.id.textView10);
		text11 = (TextView) findViewById(R.id.textView11);
		text12 = (TextView) findViewById(R.id.textView12);
		text13 = (TextView) findViewById(R.id.textView13);
		text14 = (TextView) findViewById(R.id.textView14);
		text15 = (TextView) findViewById(R.id.textView15);
		text16 = (TextView) findViewById(R.id.textView16);
		text17 = (TextView) findViewById(R.id.textView17);
		text18 = (TextView) findViewById(R.id.textView18);
		text19 = (TextView) findViewById(R.id.textView19);
		text20 = (TextView) findViewById(R.id.textView20);
		text21 = (TextView) findViewById(R.id.textView21);
		text22 = (TextView) findViewById(R.id.textView22);
		text23 = (TextView) findViewById(R.id.textView23);
		text24 = (TextView) findViewById(R.id.textView24);
		pullStats();
		
	}
	
	private void pullStats(){
		Button enter = (Button) findViewById(R.id.enter);
		
		// Code that is executed when the button is pressed is housed inside onClick
		View.OnClickListener myListener = new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				new StatsTask().execute();
			};
			
		};
		enter.setOnClickListener(myListener);
	}
	

	
	private class StatsTask extends AsyncTask<String, Void, String[]>{
		@Override
		protected String[] doInBackground(String... params){
			summonerName = edit1.getText().toString();
			results[0] = summonerName;
			
			try {
				stats = new StatsPull(summonerName);
				
				results[1] = stats.getProfileIcon();
				results[2] = stats.getLevel();
				results[3] = Long.toString(stats.getUnrankedWins());
				results[4] = Long.toString(stats.getnAssists());
				results[5] = Long.toString(stats.getnChampKills());
				results[6] = Long.toString(stats.getnMinionKills());
				results[7] = Long.toString(stats.getnNeutralMonsterKills());
				results[8] = Long.toString(stats.getnTotalTurretKills());
				results[9] = Long.toString(stats.getRankedSolo5x5Wins());
				results[10] = Long.toString(stats.getrAssists());
				results[11] = Long.toString(stats.getrChampKills());
				results[12] = Long.toString(stats.getrMinionKills());
				results[13] = Long.toString(stats.getrNeutralMonsterKills());
				results[14] = Long.toString(stats.getrTotalTurretKills());
				results[15] = Long.toString(stats.getUnranked3x3Wins());
				results[16] = Long.toString(stats.getTvtAssists());
				results[17] = Long.toString(stats.getTvtChampKills());
				results[18] = Long.toString(stats.getTvtMinionKills());
				results[19] = Long.toString(stats.getTvtNeutralMonsterKills());
				results[20] = Long.toString(stats.getTvtTotalTurretKills());
				results[21] = Long.toString(stats.getRankedPremade3x3Wins());
				results[22] = Long.toString(stats.getRankedPremade5x5Wins());
				results[23] = Long.toString(stats.getRankedTeam3x3Wins());
				results[24] = Long.toString(stats.getRankedTeam5x5Wins());
				results[25] = Long.toString(stats.getCoopVsAIWins());
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// SOMEONE HELP ME FIGURE OUT HOW TO HANDLE THIS
				// I think this is for when it cannot set up the URL
				//Toast.makeText(MainActivity.this, "UHOH", Toast.LENGTH_LONG).show();
				for(int i=0; i<25; i++){
					results[i] = "";
				}
				//e.printStackTrace();
			}
			return results;
		}
		
		@Override
        protected void onPostExecute(String[] results) {
    		text1.setText("Level: " + results[2]);  
			text2.setText("Normal Wins: " + results[3]);
			text3.setText("Assists: " + results[4]);
			text4.setText("Champion Kills: " + results[5]);
			text5.setText("Minions Killed: " + results[6]);
			text6.setText("Neutral Monsters Killed: " + results[7]);
			text7.setText("Turrets Killed: " + results[8]);
			text8.setText("Ranked Solo 5v5 Wins: " + results[9]);
			text9.setText("Assists: " + results[10]);
			text10.setText("Champion Kills: " + results[11]);
			text11.setText("Minions Killed: " + results[12]);
			text12.setText("Neutral Monsters Killed: " + results[13]);
			text13.setText("Turrets Killed: " + results[14]);
			text14.setText("Normal 3v3 Wins: " + results[15]);
			text15.setText("Assists: " + results[16]);
			text16.setText("Champion Kills: " + results[17]);
			text17.setText("Minions Killed: " + results[18]);
			text18.setText("Neutral Monsters Killed: " + results[19]);
			text19.setText("Turrets Killed: " + results[20]);
			text20.setText("Ranked Premade 3v3 Wins: " + results[21]);
			text21.setText("Ranked Premade 5v5 Wins: " + results[22]);
			text22.setText("Ranked Team 3v3 Wins: " + results[23]);
			text23.setText("Ranked Team 5v5 Wins: " + results[24]);
			text24.setText("Coop vs AI Wins: " + results[25]);
        }

        @Override
        protected void onPreExecute() {
        	Toast.makeText(PlayerStats.this, "Retrieving Summoner Stats", Toast.LENGTH_LONG).show();
        }

        @Override
        protected void onProgressUpdate(Void... values) {}
	}
	
	//Called when "Advanced Stats" button is pressed
	public void advanced(View view){
		if(stats!=null){
			//Grab information
			String[] info = {
					"One For All Wins: " + Long.toString(stats.getOfaWins()),
					"Assists: " + Long.toString(stats.getOfaAssists()),
					"Kills: " + Long.toString(stats.getOfaChampKills()),
					"Minion Kills: " + Long.toString(stats.getOfaMinionKills()),
					"Neutral Monster Kills: " + Long.toString(stats.getOfaNeutralMonsterKills()),
					"Turret Kills: " + Long.toString(stats.getOfaTotalTurretKills()),
					"First Blood (1v1) Wins: " + Long.toString(stats.getFb1Wins()),
					"Assists: " + Long.toString(stats.getFb1Assists()),
					"Kills: " + Long.toString(stats.getFb1ChampKills()),
					"Minion Kills: " + Long.toString(stats.getFb1MinionKills()),
					"Neutral Monster Kills: " + Long.toString(stats.getFb1NeutralMonsterKills()),
					"Turret Kills: " + Long.toString(stats.getFb1TotalTurretKills()),
					"First Blood (2v2) Wins: " + Long.toString(stats.getFb2Wins()),
					"Assists: " + Long.toString(stats.getFb2Assists()),
					"Kills: " + Long.toString(stats.getFb2ChampKills()),
					"Minion Kills: " + Long.toString(stats.getFb2MinionKills()),
					"Neutral Monster Kills: " + Long.toString(stats.getFb2NeutralMonsterKills()),
					"Turret Kills: " + Long.toString(stats.getFb2TotalTurretKills()),
					"Hexakill Wins: " + Long.toString(stats.getHexWins()),
					"Assists: " + Long.toString(stats.getHexAssists()),
					"Kills: " + Long.toString(stats.getHexChampKills()),
					"Minion Kills: " + Long.toString(stats.getHexMinionKills()),
					"Neutral Monster Kills: " + Long.toString(stats.getHexNeutralMonsterKills()),
					"Turret Kills: " + Long.toString(stats.getHexTotalTurretKills()),
					"URF Wins: " + Long.toString(stats.getUrfWins()),
					"Assists: " + Long.toString(stats.getUrfAssists()),
					"Kills: " + Long.toString(stats.getUrfChampKills()),
					"Minion Kills: " + Long.toString(stats.getUrfMinionKills()),
					"Neutral Monster Kills: " + Long.toString(stats.getUrfNeutralMonsterKills()),
					"Turret Kills: " + Long.toString(stats.getUrfTotalTurretKills())
			};
			
			Bundle bundle = new Bundle();
			bundle.putStringArray("info", info);
	         Intent intent = new Intent(this, PlayerStatsAdvanced.class);
	         intent.putExtra("bundle", bundle);
	         startActivity(intent);
		}
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
