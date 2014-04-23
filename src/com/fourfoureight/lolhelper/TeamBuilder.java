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
import android.widget.*;
import android.widget.AdapterView.OnItemSelectedListener;
import com.fourfoureight.lolhelper.General_Info.ChampionAttributes;

public class TeamBuilder extends ActionBarActivity {
    
    TeamBuilderData teambuilder = new TeamBuilderData();
    int[] buttonFlags = {-1, -1, -1, -1, -1};
        
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_builder);
        
        final Button top = (Button)findViewById(R.id.Button00);
        final Button jungle = (Button)findViewById(R.id.Button01);
        final Button middle = (Button)findViewById(R.id.Button02);
        final Button adc = (Button)findViewById(R.id.Button03);
        final Button support = (Button)findViewById(R.id.Button04);
        final Button suggestChampion = (Button)findViewById(R.id.Button06);
        final Button suggestStyle = (Button)findViewById(R.id.Button05);
        final Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
		final TableLayout table = (TableLayout)findViewById(R.id.Table);
        
        top.setText("Top");
        jungle.setText("Jungle");
        middle.setText("Middle");
        adc.setText("ADC");
        support.setText("Support");
        
        // spinner1
        String[] allStrategies = teambuilder.getAvailableStrategy();
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, allStrategies);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        // selector control for spinner1
        spinner1.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                	teambuilder.setOurStrategy(-1);
                }
                else {
                	teambuilder.setOurStrategy(teambuilder.getAvailableStrategyArray(position));
                }
            	
				suggestChampion.performClick();
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                teambuilder.setOurStrategy(-1);
            }
        });
                        
        // button Suggest Style
        suggestStyle.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				teambuilder.suggestStrategyForTeam();
                String[] allStrategies = teambuilder.getAvailableStrategy();
                ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(TeamBuilder.this, android.R.layout.simple_spinner_item, allStrategies);
                adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner1.setAdapter(adapter1);
				suggestChampion.performClick();
			}
		});
        
        // button Suggest Champion
        suggestChampion.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				
				// scroll bars after five buttons
				LinearLayout scroll1 = (LinearLayout)findViewById(R.id.Linear1);
				LinearLayout scroll2 = (LinearLayout)findViewById(R.id.Linear2);
				LinearLayout scroll3 = (LinearLayout)findViewById(R.id.Linear3);
				LinearLayout scroll4 = (LinearLayout)findViewById(R.id.Linear4);
				LinearLayout scroll5 = (LinearLayout)findViewById(R.id.Linear5);
				
				scroll1.removeAllViews();
				scroll2.removeAllViews();
				scroll3.removeAllViews();
				scroll4.removeAllViews();
				scroll5.removeAllViews();
				
				ChampionAttributes[] suggestedTop = teambuilder.suggestChampionsByStrategy(0);
				if ((suggestedTop != null) && (top.getText().toString() == "Top")){
					for (int i = 0; i < suggestedTop.length; i++){
						final Button newButton = new Button(TeamBuilder.this);
						newButton.setText(suggestedTop[i].getName());
						newButton.setHeight(80);
						newButton.setWidth(80);
						newButton.setTextSize(15);
						if (suggestedTop[i].getName() == "NONAME"){
							newButton.setVisibility(View.GONE);
						}
						scroll1.addView(newButton);
						final ChampionAttributes currentChampion = suggestedTop[i];
						newButton.setOnClickListener(new View.OnClickListener(){
							@Override
					        public void onClick(View v){
								if (buttonFlags[0] == 1){
									teambuilder.setOurTeam(0, currentChampion);
									top.setText(currentChampion.getName());
									buttonFlags[0] = -1;
									buttonFlags[1] = -1;
									buttonFlags[2] = -1;
									buttonFlags[3] = -1;
									buttonFlags[4] = -1;
									newButton.setVisibility(View.GONE);
								}
					        }
						});
					}
				}
				
				ChampionAttributes[] suggestedJungle = teambuilder.suggestChampionsByStrategy(1);
				if ((suggestedJungle != null) && (jungle.getText().toString() == "Jungle")){
					for (int i = 0; i < suggestedJungle.length; i++){
						final Button newButton = new Button(TeamBuilder.this);
						newButton.setText(suggestedJungle[i].getName());
						newButton.setHeight(80);
						newButton.setWidth(80);
						newButton.setTextSize(15);
						if (suggestedJungle[i].getName() == "NONAME"){
							newButton.setVisibility(View.GONE);
						}
						scroll2.addView(newButton);
						final ChampionAttributes currentChampion = suggestedJungle[i];
						newButton.setOnClickListener(new View.OnClickListener(){
							@Override
					        public void onClick(View v){
								if (buttonFlags[1] == 1){
									teambuilder.setOurTeam(1, currentChampion);
									jungle.setText(currentChampion.getName());
									buttonFlags[0] = -1;
									buttonFlags[1] = -1;
									buttonFlags[2] = -1;
									buttonFlags[3] = -1;
									buttonFlags[4] = -1;									
									newButton.setVisibility(View.GONE);
								}
					        }
						});
					}
				}
				
				ChampionAttributes[] suggestedMid = teambuilder.suggestChampionsByStrategy(2);
				if ((suggestedMid != null) && (middle.getText().toString() == "Middle")){
					for (int i = 0; i < suggestedMid.length; i++){
						final Button newButton = new Button(TeamBuilder.this);
						newButton.setText(suggestedMid[i].getName());
						newButton.setHeight(80);
						newButton.setWidth(80);
						newButton.setTextSize(15);
						if (suggestedMid[i].getName() == "NONAME"){
							newButton.setVisibility(View.GONE);
						}
						scroll3.addView(newButton);
						final ChampionAttributes currentChampion = suggestedMid[i];
						newButton.setOnClickListener(new View.OnClickListener(){
							@Override
					        public void onClick(View v){
								if (buttonFlags[2] == 1){
									teambuilder.setOurTeam(2, currentChampion);
									middle.setText(currentChampion.getName());
									buttonFlags[0] = -1;
									buttonFlags[1] = -1;
									buttonFlags[2] = -1;
									buttonFlags[3] = -1;
									buttonFlags[4] = -1;									
									newButton.setVisibility(View.GONE);
								}
					        }
						});
					}
				}
				
				ChampionAttributes[] suggestedADC = teambuilder.suggestChampionsByStrategy(3);
				if ((suggestedADC != null) && (adc.getText().toString() == "ADC")){
					for (int i = 0; i < suggestedADC.length; i++){
						final Button newButton = new Button(TeamBuilder.this);
						newButton.setText(suggestedADC[i].getName());
						newButton.setHeight(80);
						newButton.setWidth(80);
						newButton.setTextSize(15);
						if (suggestedADC[i].getName() == "NONAME"){
							newButton.setVisibility(View.GONE);
						}
						scroll4.addView(newButton);
						final ChampionAttributes currentChampion = suggestedADC[i];
						newButton.setOnClickListener(new View.OnClickListener(){
							@Override
					        public void onClick(View v){
								if (buttonFlags[3] == 1){
									teambuilder.setOurTeam(3, currentChampion);
									adc.setText(currentChampion.getName());
									buttonFlags[0] = -1;
									buttonFlags[1] = -1;
									buttonFlags[2] = -1;
									buttonFlags[3] = -1;
									buttonFlags[4] = -1;									
									newButton.setVisibility(View.GONE);
								}
					        }
						});
					}
				}
				
				ChampionAttributes[] suggestedSupport = teambuilder.suggestChampionsByStrategy(4);
				if ((suggestedSupport != null) && (support.getText().toString() == "Support")){
					for (int i = 0; i < suggestedSupport.length; i++){
						final Button newButton = new Button(TeamBuilder.this);
						newButton.setText(suggestedSupport[i].getName());
						newButton.setHeight(80);
						newButton.setWidth(80);
						newButton.setTextSize(15);
						if (suggestedSupport[i].getName() == "NONAME"){
							newButton.setVisibility(View.GONE);
						}
						scroll5.addView(newButton);
						final ChampionAttributes currentChampion = suggestedSupport[i];
						newButton.setOnClickListener(new View.OnClickListener(){
							@Override
					        public void onClick(View v){
								if (buttonFlags[4] == 1){
									teambuilder.setOurTeam(4, currentChampion);
									support.setText(currentChampion.getName());
									buttonFlags[0] = -1;
									buttonFlags[1] = -1;
									buttonFlags[2] = -1;
									buttonFlags[3] = -1;
									buttonFlags[4] = -1;
									newButton.setVisibility(View.GONE);
								}
					        }
						});
					}
				}
				
				// Table to display all available champions
				table.removeAllViews();
				int buttonInRow = 8;
				TableRow currentRow = null;
				ChampionAttributes[] allAvailableChampions = teambuilder.getAllAvailableChampions();
				for (int i = 0; i < allAvailableChampions.length; i++){
					if (buttonInRow == 8){
						buttonInRow = 0;
						TableRow newRow = new TableRow(TeamBuilder.this);
						table.addView(newRow);
						currentRow = newRow;
					}
					final Button newButton = new Button(TeamBuilder.this);
					newButton.setText(allAvailableChampions[i].getName());
					newButton.setHeight(80);
					newButton.setWidth(80);
					newButton.setTextSize(15);
					if (suggestedTop[i].getName() == "NONAME"){
						newButton.setVisibility(View.GONE);
					}
					else{
						buttonInRow += 1;
					}
					currentRow.addView(newButton);
					
					final ChampionAttributes currentChampion = allAvailableChampions[i];
					newButton.setOnClickListener(new View.OnClickListener(){
						@Override
				        public void onClick(View v){
							if (buttonFlags[0] == 1){
								teambuilder.setOurTeam(0, currentChampion);
								top.setText(currentChampion.getName());
							}
							else if (buttonFlags[1] == 1){
								teambuilder.setOurTeam(1, currentChampion);
								jungle.setText(currentChampion.getName());
							}
							else if (buttonFlags[2] == 1){
								teambuilder.setOurTeam(2, currentChampion);
								middle.setText(currentChampion.getName());
							}
							else if (buttonFlags[3] == 1){
								teambuilder.setOurTeam(3, currentChampion);
								adc.setText(currentChampion.getName());
							}
							else if (buttonFlags[4] == 1){
								teambuilder.setOurTeam(4, currentChampion);
								support.setText(currentChampion.getName());
							}
							buttonFlags[0] = -1;
							buttonFlags[1] = -1;
							buttonFlags[2] = -1;
							buttonFlags[3] = -1;
							buttonFlags[4] = -1;
							newButton.setVisibility(View.GONE);
				        }
					});
				}
			}
		});
        
        // button Top
        top.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				buttonFlags[0] = 1;
				
				buttonFlags[1] = -1;
				buttonFlags[2] = -1;
				buttonFlags[3] = -1;
				buttonFlags[4] = -1;
				ChampionAttributes emptyChampion = new ChampionAttributes(); 
				teambuilder.setOurTeam(0, emptyChampion);
				top.setText("Top");
				suggestChampion.performClick();
			}
		});
        
        // button Jungle
        jungle.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				buttonFlags[1] = 1;
				
				buttonFlags[0] = -1;
				buttonFlags[2] = -1;
				buttonFlags[3] = -1;
				buttonFlags[4] = -1;
				ChampionAttributes emptyChampion = new ChampionAttributes(); 
				teambuilder.setOurTeam(1, emptyChampion);
				jungle.setText("Jungle");
				suggestChampion.performClick();
			}
		});
        
        // button Middle
        middle.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				buttonFlags[2] = 1;
				
				buttonFlags[0] = -1;
				buttonFlags[1] = -1;
				buttonFlags[3] = -1;
				buttonFlags[4] = -1;
				ChampionAttributes emptyChampion = new ChampionAttributes(); 
				teambuilder.setOurTeam(2, emptyChampion);
				middle.setText("Middle");
				suggestChampion.performClick();
			}
		});
        
        // button ADC
        adc.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				buttonFlags[3] = 1;
				
				buttonFlags[0] = -1;
				buttonFlags[1] = -1;
				buttonFlags[2] = -1;
				buttonFlags[4] = -1;
				ChampionAttributes emptyChampion = new ChampionAttributes(); 
				teambuilder.setOurTeam(3, emptyChampion);
				adc.setText("ADC");
				suggestChampion.performClick();
			}
		});
        
        // button Support
        support.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				buttonFlags[4] = 1;
				
				buttonFlags[0] = -1;
				buttonFlags[1] = -1;
				buttonFlags[2] = -1;
				buttonFlags[3] = -1;
				ChampionAttributes emptyChampion = new ChampionAttributes(); 
				teambuilder.setOurTeam(4, emptyChampion);
				support.setText("Support");
				suggestChampion.performClick();
			}	
		});
    }

	@Override
	public void onBackPressed() {
	    super.onBackPressed();
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
