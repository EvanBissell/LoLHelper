package com.fourfoureight.lolhelper;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class GeneralInfo extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_general_info);
		getSupportActionBar().setTitle("LoL Helper > General Info");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.general_info, menu);
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
	
	@Override
	public void onBackPressed() {
		Intent intent = new Intent(this, MainActivity.class);
    	startActivity(intent);
	}	
    
    /** Called when the user clicks the In Game button */
    public void ingame(View view) {
    	Intent intent = new Intent(this, InGame.class);
    	startActivity(intent);
    }
    
    public void viewitems(View view) {
    	Intent intent = new Intent(this, Items.class);
    	startActivity(intent);
    }
    
    public void viewchampions(View view) {
    	Intent intent = new Intent(this, Champions.class);
    	startActivity(intent);
    }
    
    /** Called when the user clicks the Champion Select button */
    public void championselect(View view) {
    	Intent intent = new Intent(this, ChampionSelect.class);
    	startActivity(intent);
    }
    
    public void playerstats(View view) {
    	Intent intent = new Intent(this, PlayerStats.class);
    	startActivity(intent);
    }
    
    /** Called when the user clicks the General Info button */
    public void generalinfo(View view) {
    	Intent intent = new Intent(this, MainActivity.class);
    	startActivity(intent);
    }
    
    /** Called when the user clicks the Options button */
    public void options(View view) {
    	Intent intent = new Intent(this, Options.class);
    	startActivity(intent);
    }

}
