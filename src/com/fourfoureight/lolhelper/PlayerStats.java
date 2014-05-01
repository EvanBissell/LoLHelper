package com.fourfoureight.lolhelper;

import java.io.IOException;

import com.fourfoureight.lolhelper.R;
import com.fourfoureight.lolhelper.Stats.StatsPull;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import android.os.Build;

public class PlayerStats extends ActionBarActivity {
	String results[];
	EditText edit1;	
	TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26,t27,t28;
	TextView a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20,a21,a22,a23,a24,a25,a26,a27,a28,a29,a30;
	TextView summonerName;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_player_stats);
		results = new String[66];
		for(int i=0; i<66; i++){
			results[i] = "";
		}
		
		findViews();
		pullStats();
		
	}
	
	private void findViews(){
		summonerName = (TextView) findViewById(R.id.SummonerName);
		
		t1  = (TextView) findViewById(R.id.wins5v5_Ranked);
		t2  = (TextView) findViewById(R.id.kills5v5_Ranked);
		t3  = (TextView) findViewById(R.id.assists5v5_Ranked);
		t4  = (TextView) findViewById(R.id.minionkills5v5_Ranked);
		t5  = (TextView) findViewById(R.id.neutralminionkills5v5_Ranked);
		t6  = (TextView) findViewById(R.id.turretsdestroyed5v5_Ranked);
		
		t7  = (TextView) findViewById(R.id.wins5v5);
		t8  = (TextView) findViewById(R.id.kills5v5);
		t9  = (TextView) findViewById(R.id.assists5v5);
		t10 = (TextView) findViewById(R.id.minionkills5v5);
		t11 = (TextView) findViewById(R.id.neutralminionkills5v5);
		t12 = (TextView) findViewById(R.id.turretsdestroyed5v5);
		
		t13 = (TextView) findViewById(R.id.winsdom);
		t14 = (TextView) findViewById(R.id.killsdom);
		t15 = (TextView) findViewById(R.id.mostkillsdom);
		t16 = (TextView) findViewById(R.id.assistsdom);
		t17 = (TextView) findViewById(R.id.mostassistsdom);
		t18 = (TextView) findViewById(R.id.highestscoredom);
		t19 = (TextView) findViewById(R.id.nodescaptureddom);
		t20 = (TextView) findViewById(R.id.mostnodescaptureddom);
		t21 = (TextView) findViewById(R.id.nodesneutralizeddom);
		t22 = (TextView) findViewById(R.id.mostnodesneutralizeddom);

		t23 = (TextView) findViewById(R.id.wins3v3);
		t24 = (TextView) findViewById(R.id.kills3v3);
		t25 = (TextView) findViewById(R.id.assists3v3);
		t26 = (TextView) findViewById(R.id.minionkills3v3);
		t27 = (TextView) findViewById(R.id.neutralminionkills3v3);
		t28 = (TextView) findViewById(R.id.turretsdestroyed3v3);
		
		a1  = (TextView) findViewById(R.id.winsofa);
		a2  = (TextView) findViewById(R.id.killsofa);
		a3  = (TextView) findViewById(R.id.assistsofa);
		a4  = (TextView) findViewById(R.id.minionkillsofa);
		a5  = (TextView) findViewById(R.id.neutralminionkillsofa);
		a6  = (TextView) findViewById(R.id.turretsdestroyedofa);
		
		a7  = (TextView) findViewById(R.id.winsfb1);
		a8  = (TextView) findViewById(R.id.killsfb1);
		a9  = (TextView) findViewById(R.id.assistsfb1);
		a10 = (TextView) findViewById(R.id.minionkillsfb1);
		a11 = (TextView) findViewById(R.id.neutralminionkillsfb1);
		a12 = (TextView) findViewById(R.id.turretsdestroyedfb1);
		
		a13 = (TextView) findViewById(R.id.winsfb2);
		a14 = (TextView) findViewById(R.id.killsfb2);
		a15 = (TextView) findViewById(R.id.assistsfb2);
		a16 = (TextView) findViewById(R.id.minionkillsfb2);
		a17 = (TextView) findViewById(R.id.neutralminionkillsfb2);
		a18 = (TextView) findViewById(R.id.turretsdestroyedfb2);
		
		a19 = (TextView) findViewById(R.id.winshex);
		a20 = (TextView) findViewById(R.id.killshex);
		a21 = (TextView) findViewById(R.id.assistshex);
		a22 = (TextView) findViewById(R.id.minionkillshex);
		a23 = (TextView) findViewById(R.id.neutralminionkillshex);
		a24 = (TextView) findViewById(R.id.turretsdestroyedhex);
		
		a25 = (TextView) findViewById(R.id.winsurf);
		a26 = (TextView) findViewById(R.id.killsurf);
		a27 = (TextView) findViewById(R.id.assistsurf);
		a28 = (TextView) findViewById(R.id.minionkillsurf);
		a29 = (TextView) findViewById(R.id.neutralminionkillsurf);
		a30 = (TextView) findViewById(R.id.turretsdestroyedurf);
		
	}
	
	private void pullStats(){
		edit1 = (EditText) findViewById(R.id.editText1);
		Button enter = (Button) findViewById(R.id.enter);
		
		// Links the "done" soft button with execution
		View.OnKeyListener myOnKeyListener = new View.OnKeyListener() {
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				if((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)){
					new StatsTask().execute();
					return true;
				}
				return false;
			}
		}; 
		
		// Code that is executed when the button is pressed is housed inside onClick
		View.OnClickListener myListener = new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				new StatsTask().execute();
			};
			
		};
		enter.setOnClickListener(myListener);
		edit1.setOnKeyListener(myOnKeyListener);
	}
	

	
	private class StatsTask extends AsyncTask<String, Void, String[]>{
		@Override
		protected String[] doInBackground(String... params) {
			String summonerName = edit1.getText().toString();
			results[0] = summonerName;
			
			try {
				StatsPull stats = new StatsPull(summonerName);
				
				results[1] = stats.getProfileIcon();
				results[2] = stats.getLevel();
				
				//Ranked Stats
				results[3] = Long.toString(stats.getRankedSolo5x5Wins());
				results[4] = Long.toString(stats.getrChampKills());
				results[5] = Long.toString(stats.getrAssists());
				results[6] = Long.toString(stats.getrMinionKills());
				results[7] = Long.toString(stats.getrNeutralMonsterKills());
				results[8] = Long.toString(stats.getrTotalTurretKills());
				
				//Normal Stats
				results[9] = Long.toString(stats.getUnrankedWins());
				results[10] = Long.toString(stats.getnChampKills());				
				results[11] = Long.toString(stats.getnAssists());
				results[12] = Long.toString(stats.getnMinionKills());
				results[13] = Long.toString(stats.getnNeutralMonsterKills());
				results[14] = Long.toString(stats.getnTotalTurretKills());
				
				//Dominion Stats (OdinUnranked)
				results[15] = Long.toString(stats.getDomWins());
				results[16] = Long.toString(stats.getDomChampKills());
				results[17] = Long.toString(stats.getDomMostKills());
				results[18] = Long.toString(stats.getDomAssists());
				results[19] = Long.toString(stats.getDomMostAssists());
				results[20] = Long.toString(stats.getDomHighestScore());
				results[21] = Long.toString(stats.getDomNodesCaptured());
				results[22] = Long.toString(stats.getDomMostNodesCaptured());
				results[23] = Long.toString(stats.getDomNodesNeutralized());
				results[24] = Long.toString(stats.getDomMostNodesNeutralized());
				
				//3v3 Stats
				results[25] = Long.toString(stats.getUnranked3x3Wins());
				results[26] = Long.toString(stats.getTvtChampKills());
				results[27] = Long.toString(stats.getTvtAssists());
				results[28] = Long.toString(stats.getTvtMinionKills());
				results[29] = Long.toString(stats.getTvtNeutralMonsterKills());
				results[30] = Long.toString(stats.getTvtTotalTurretKills());
				
				//One for All
				results[31] = Long.toString(stats.getOfaWins());
				results[32] = Long.toString(stats.getOfaChampKills());
				results[33] = Long.toString(stats.getOfaAssists());
				results[34] = Long.toString(stats.getOfaMinionKills());
				results[35] = Long.toString(stats.getOfaNeutralMonsterKills());
				results[36] = Long.toString(stats.getOfaTotalTurretKills());
				
				//First Blood 1v1
				results[37] = Long.toString(stats.getFb1Wins());
				results[38] = Long.toString(stats.getFb1ChampKills());
				results[39] = Long.toString(stats.getFb1Assists());
				results[40] = Long.toString(stats.getFb1MinionKills());
				results[41] = Long.toString(stats.getFb1NeutralMonsterKills());
				results[42] = Long.toString(stats.getFb1TotalTurretKills());
				
				//First Blood 2v2
				results[43] = Long.toString(stats.getFb2Wins());
				results[44] = Long.toString(stats.getFb2ChampKills());
				results[45] = Long.toString(stats.getFb2Assists());
				results[46] = Long.toString(stats.getFb2MinionKills());
				results[47] = Long.toString(stats.getFb2NeutralMonsterKills());
				results[48] = Long.toString(stats.getFb2TotalTurretKills());
				
				//Hexakill
				results[49] = Long.toString(stats.getHexWins());
				results[50] = Long.toString(stats.getHexChampKills());
				results[51] = Long.toString(stats.getHexAssists());
				results[52] = Long.toString(stats.getHexMinionKills());
				results[53] = Long.toString(stats.getHexNeutralMonsterKills());
				results[54] = Long.toString(stats.getHexTotalTurretKills());
				
				//Urf
				results[55] = Long.toString(stats.getUrfWins());
				results[56] = Long.toString(stats.getUrfChampKills());
				results[57] = Long.toString(stats.getUrfAssists());
				results[58] = Long.toString(stats.getUrfMinionKills());
				results[59] = Long.toString(stats.getUrfNeutralMonsterKills());
				results[60] = Long.toString(stats.getUrfTotalTurretKills());
				
				//Extra Ranked Stats
				results[61] = Long.toString(stats.getRankedPremade3x3Wins());
				results[62] = Long.toString(stats.getRankedPremade5x5Wins());
				results[63] = Long.toString(stats.getRankedTeam3x3Wins());
				results[64] = Long.toString(stats.getRankedTeam5x5Wins());
				results[65] = Long.toString(stats.getCoopVsAIWins());
				
			} catch (IOException e) {
				for(int i=0; i<66; i++){
					results[i] = "";
				}
				results[0] = "Invalid Summoner Name";
				//e.printStackTrace();
			}
			return results;
		}
		
		@Override
        protected void onPostExecute(String[] results) {
			if(results[0].equals("Invalid Summoner Name")){
				summonerName.setText(results[0]);
			} else {
				summonerName.setText(results[0] + ": " + results[2]);
			}
			// profile icon
			t1.setText(results[3]);
			t2.setText(results[4]);
			t3.setText(results[5]);
			t4.setText(results[6]);
			t5.setText(results[7]);
			
			t6.setText(results[8]);
			t7.setText(results[9]);
			t8.setText(results[10]);
			t9.setText(results[11]);
			t10.setText(results[12]);
			t11.setText(results[13]);
			t12.setText(results[14]);
			
			t13.setText(results[15]);
			t14.setText(results[16]);
			t15.setText(results[17]);
			t16.setText(results[18]);
			t17.setText(results[19]);
			t18.setText(results[20]);
			t19.setText(results[21]);
			t20.setText(results[22]);
			t21.setText(results[23]);
			t22.setText(results[24]);
			
			t23.setText(results[25]);
			t24.setText(results[26]);
			t25.setText(results[27]);
			t26.setText(results[28]);
			t27.setText(results[29]);
			t28.setText(results[30]);
			
			a1.setText(results[31]);
			a2.setText(results[32]);
			a3.setText(results[33]);
			a4.setText(results[34]);
			a5.setText(results[35]);
			a6.setText(results[36]);
			
			a7.setText(results[37]);
			a8.setText(results[38]);
			a9.setText(results[39]);
			a10.setText(results[40]);
			a11.setText(results[41]);
			a12.setText(results[42]);
			
			a13.setText(results[43]);
			a14.setText(results[44]);
			a15.setText(results[45]);
			a16.setText(results[46]);
			a17.setText(results[47]);
			a18.setText(results[48]);
			
			a19.setText(results[49]);
			a20.setText(results[50]);
			a21.setText(results[51]);
			a22.setText(results[52]);
			a23.setText(results[53]);
			a24.setText(results[54]);
			
			a25.setText(results[55]);
			a26.setText(results[56]);
			a27.setText(results[57]);
			a28.setText(results[58]);
			a29.setText(results[59]);
			a30.setText(results[60]);
        }

        @Override
        protected void onPreExecute() {
        	CharSequence text = "Fetching Summoner Stats";
        	int duration = Toast.LENGTH_LONG;
        	Toast toast = Toast.makeText(getApplicationContext(), text, duration);
        	toast.setGravity(Gravity.TOP|Gravity.CENTER, 0, 0);
        	toast.show();
        }

        @Override
        protected void onProgressUpdate(Void... values) {}
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
