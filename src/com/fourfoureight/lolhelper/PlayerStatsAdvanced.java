package com.fourfoureight.lolhelper;

import com.fourfoureight.lolhelper.Stats.StatsPull;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

public class PlayerStatsAdvanced extends ActionBarActivity {
	TextView text1, text2, text3, text4, text5, text6, text7, text8, text9, text10,
		text11, text12, text13, text14, text15, text16, text17, text18, text19, text20,
		text21, text22, text23, text24, text25, text26, text27, text28, text29, text30;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_player_stats_advanced);
		
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
		text25 = (TextView) findViewById(R.id.textView25);
		text26 = (TextView) findViewById(R.id.textView26);
		text27 = (TextView) findViewById(R.id.textView27);
		text28 = (TextView) findViewById(R.id.textView28);
		text29 = (TextView) findViewById(R.id.textView29);
		text30 = (TextView) findViewById(R.id.textView30);
		
		Intent intent = getIntent();
		Bundle bundle = intent.getBundleExtra("bundle");
		String[] info = bundle.getStringArray("info");
		TextView[] views = {text1, text2, text3, text4, text5, text6, text7, text8, text9, text10,
				text11, text12, text13, text14, text15, text16, text17, text18, text19, text20,
				text21, text22, text23, text24, text25, text26, text27, text28, text29, text30};
		
		for(int i=0; i<30; i++){
			views[i].setText(info[i]);
		}
	}
}
