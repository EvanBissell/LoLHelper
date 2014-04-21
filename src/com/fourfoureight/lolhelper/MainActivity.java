package com.fourfoureight.lolhelper;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.content.Intent;
// nothing
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    
    @Override
    public void onBackPressed() {
       //Log.d("CDA", "onBackPressed Called");
       Intent setIntent = new Intent(Intent.ACTION_MAIN);
       setIntent.addCategory(Intent.CATEGORY_HOME);
       setIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
       startActivity(setIntent);
    }
   
    
    /** Called when the user clicks the In Game button */
    public void ingame(View view) {
    	Intent intent = new Intent(this, InGame.class);
    	startActivity(intent);
    }
    
    /** Called when the user clicks the Champion Select button */
    public void championselect(View view) {
    	Intent intent = new Intent(this, ChampionSelect.class);
    	startActivity(intent);
    }
    
    /** Called when the user clicks the Post Game button */
    public void postgame(View view) {
    	Intent intent = new Intent(this, PostGame.class);
    	startActivity(intent);
    }
    
    /** Called when the user clicks the General Info button */
    public void generalinfo(View view) {
    	Intent intent = new Intent(this, GeneralInfo.class);
    	startActivity(intent);
    }
    
    /** Called when the user clicks the Options button */
    public void options(View view) {
    	Intent intent = new Intent(this, Options.class);
    	startActivity(intent);
    }

}
