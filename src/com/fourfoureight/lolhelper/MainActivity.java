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
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	
	ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //TextView txt = (TextView) findViewById(R.id.lblListHeader);
        // Typeface font = Typeface.createFromAsset(getAssets(), "POORICH.TTF");
        //txt.setTypeface(font);
        
     // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);
 
        // preparing list data
        prepareListData();
 
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);
 
        // setting list adapter
        expListView.setAdapter(listAdapter);
        
        // Listview Group click listener
        expListView.setOnGroupClickListener(new OnGroupClickListener() {
 
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                    int groupPosition, long id) {
                // Toast.makeText(getApplicationContext(),
                // "Group Clicked " + listDataHeader.get(groupPosition),
                // Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        
        // Can probably get rid of code commented out below, doesn't do anything useful.
 
        /* Listview Group expanded listener
        expListView.setOnGroupExpandListener(new OnGroupExpandListener() {
 
            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Expanded",
                        Toast.LENGTH_SHORT).show();
            } 
        }); */
 
        /* Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {
 
            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Collapsed",
                        Toast.LENGTH_SHORT).show();
 
            }
        }); */
 
        // Listview on child click listener
        expListView.setOnChildClickListener(new OnChildClickListener() {
 
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                    int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub
                /* Toast.makeText(
                        getApplicationContext(),
                        listDataHeader.get(groupPosition)
                                + " : "
                                + listDataChild.get(
                                        listDataHeader.get(groupPosition)).get(
                                        childPosition), Toast.LENGTH_SHORT)
                        .show(); */
                
                String check = listDataChild.get(listDataHeader.get(groupPosition)).get(childPosition);
                
                if (check == "Build Guides")
                {
                	buildguides(v);
                }
                else if (check == "Jungle Timer"){
                	jungletimers(v);
                }
                else if (check == "Team Builder")
                {
                	teamBuilder(v);
                }
                else if (check == "Counters")
                {
                	counters(v);
                }
                else if (check == "Ultimate Bravery")
                {
                	ultimateBravery(v);
                }
                else if (check == "Player Stats")
                {
                	playerStats(v);
                }
                else if (check == "Champions")
                {
                	champions(v);
                }
                else if (check == "Items")
                {
                	items(v);
                }
                else if (check == "Summoner Spells")
                {
                	ultimateBravery(v);
                }
                
                return false;
            }
        });
    }
    
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();
        

        // Adding child data
        listDataHeader.add("In Game");
        listDataHeader.add("Champion Select");
        listDataHeader.add("Player Stats");
        listDataHeader.add("General Info");
 
        // Adding child data
        List<String> inGame = new ArrayList<String>();
        inGame.add("Build Guides");
        inGame.add("Jungle Timer");
 
        List<String> championSelect = new ArrayList<String>();
        championSelect.add("Team Builder");
        championSelect.add("Counters");
        championSelect.add("Ultimate Bravery");
 
        List<String> playerStats = new ArrayList<String>();
        playerStats.add("Player Stats");
        
        List<String> generalInfo = new ArrayList<String>();
        generalInfo.add("Champions");
        generalInfo.add("Items");
        generalInfo.add("Summoner Spells");
 
        listDataChild.put(listDataHeader.get(0), inGame); // Header, Child data
        listDataChild.put(listDataHeader.get(1), championSelect);
        listDataChild.put(listDataHeader.get(2), playerStats);
        listDataChild.put(listDataHeader.get(3), generalInfo);
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
 
    
    public void buildguides(View view) {
    	Intent intent = new Intent(this, BuildScreen.class);
    	startActivity(intent);
    }
    public void jungletimers(View view) {
    	Intent intent = new Intent(this, JungleTimer.class);
    	startActivity(intent);
    }    
    public void teamBuilder(View view) {
    	Intent intent = new Intent(this, TeamBuilder.class);
    	startActivity(intent);
    }
    
    public void counters(View view) {
    	Intent intent = new Intent(this, Counters.class);
    	startActivity(intent);
    }
    
    public void ultimateBravery(View view) {
    	Intent intent = new Intent(this, UltimateBravery.class);
    	startActivity(intent);
    }
    
    public void playerStats(View view) {
    	Intent intent = new Intent(this, PlayerStats.class);
    	startActivity(intent);
    }
    
    public void items(View view) {
    	Intent intent = new Intent(this, Items.class);
    	startActivity(intent);
    }
    
    public void champions(View view) {
    	Intent intent = new Intent(this, Champions.class);
    	startActivity(intent);
    }
    
    //public void summonerSpells(View view) {
    //	Intent intent = new Intent(this, SummonerSpells.class);
    //	startActivity(intent);
    //}

}
