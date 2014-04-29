package com.fourfoureight.lolhelper;

import com.fourfoureight.lolhelper.General_Info.BuildDatabase;

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
import android.widget.ImageView;

public class BuildGuides extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_build);
		
		Intent intent = getIntent();
        String message = intent.getStringExtra(BuildScreen.EXTRA_MESSAGE);
		String type = intent.getStringExtra(BuildScreen.TYPE);
		BuildDatabase database = new BuildDatabase(type);
		
		int i;
			if(message.equals("Aatrox")){
                i = 0;
 			}else if(message.equals("Ahri")){
                i = 1;
        	}else if(message.equals("Akali")){
                i = 2;
        	}else if(message.equals("Alistar")){
        		i = 3;
        	}else if(message.equals("Amumu")){
        		i = 4;
        	}else if(message.equals("Anivia")){
        		i = 5;
        	}else if(message.equals("Annie")){
        		i = 6;
        	}else if(message.equals("Ashe")){
                i = 7;
        	}else if(message.equals("Blitzcrank")){
                i = 8;
        	}else if(message.equals("Brand")){
                i = 9;
        	}else if(message.equals("Caitlyn")){
        		i = 10;
        	}else if(message.equals("Cassiopeia")){
        		i = 11;
        	}else if(message.equals("Cho Gath")){
        		i = 12;
        	}else if(message.equals("Corki")){
        		i = 13;
        	}else if(message.equals("Darius")){
        		i = 14;
        	}else if(message.equals("Diana")){
        		i = 15;
        	}else if(message.equals("Dr. Mundo")){
        		i = 16;
        	}else if(message.equals("Draven")){
        		i = 17;
        	}else if(message.equals("Elise")){
        		i = 18;
        	}else if(message.equals("Evelynn")){
        		i = 19;
        	}else if(message.equals("Ezreal")){
        		i = 20;
        	}else if(message.equals("Fiddlesticks")){
        		i = 21;
        	}else if(message.equals("Fiora")){
        		i = 22;
        	}else if(message.equals("Fizz")){
        		i = 23;
        	}else if(message.equals("Galio")){
        		i = 24;
        	}else if(message.equals("Gangplank")){
        		i = 25;
        	}else if(message.equals("Garen")){
        		i = 26;
        	}else if(message.equals("Gragas")){
        		i = 27;
        	}else if(message.equals("Graves")){
        		i = 28;
        	}else if(message.equals("Hecarim")){
        		i = 29;
        	}else if(message.equals("Heimerdinger")){
        		i = 30;
        	}else if(message.equals("Irelia")){
        		i = 31;
        	}else if(message.equals("Janna")){
        		i = 32;
        	}else if(message.equals("Jarvan IV")){
        		i = 33;
        	}else if(message.equals("Jax")){
        		i = 34;
        	}else if(message.equals("Jayce")){
        		i = 35;
        	}else if(message.equals("Jinx")){
        		i = 36;
        	}else if(message.equals("Karma")){
        		i = 37;
        	}else if(message.equals("Karthus")){
        		i = 38;
        	}else if(message.equals("Kassadin")){
        		i = 39;
        	}else if(message.equals("Katarina")){
        		i = 40;
        	}else if(message.equals("Kayle")){
        		i = 41;
        	}else if(message.equals("Kennen")){
        		i = 42;
        	}else if(message.equals("Kha Zix")){
        		i = 43;
        	}else if(message.equals("Kog Maw")){
        		i = 44;
        	}else if(message.equals("LeBlanc")){
        		i = 45;
        	}else if(message.equals("Lee Sin")){
        		i = 46;
        	}else if(message.equals("Leona")){
        		i = 47;
        	}else if(message.equals("Lissandra")){
        		i = 48;
        	}else if(message.equals("Lucian")){
        		i = 49;
        	}else if(message.equals("Lulu")){
        		i = 50;
        	}else if(message.equals("Lux")){
        		i = 51;
        	}else if(message.equals("Malphite")){
        		i = 52;
        	}else if(message.equals("Malzahar")){
        		i = 53;
        	}else if(message.equals("Maokai")){
        		i = 54;
        	}else if(message.equals("Master Yi")){
        		i = 55;
        	}else if(message.equals("Miss Fortune")){
        		i = 56;
        	}else if(message.equals("Mordekaiser")){
        		i = 57;
        	}else if(message.equals("Morgana")){
        		i = 58;
        	}else if(message.equals("Nami")){
        		i = 59;
        	}else if(message.equals("Nasus")){
        		i = 60;
        	}else if(message.equals("Nautilus")){
        		i = 61;
        	}else if(message.equals("Nidalee")){
        		i = 62;
        	}else if(message.equals("Nocturne")){
        		i = 63;
        	}else if(message.equals("Nunu")){
        		i = 64;
        	}else if(message.equals("Olaf")){
        		i = 65;
        	}else if(message.equals("Orianna")){
        		i = 66;
        	}else if(message.equals("Pantheon")){
        		i = 67;
        	}else if(message.equals("Poppy")){
        		i = 68;
        	}else if(message.equals("Quinn")){
        		i = 69;
        	}else if(message.equals("Rammus")){
        		i = 70;
        	}else if(message.equals("Renekton")){
        		i = 71;
        	}else if(message.equals("Rengar")){
        		i = 72;
        	}else if(message.equals("Riven")){
        		i = 73;
        	}else if(message.equals("Rumble")){
        		i = 74;
        	}else if(message.equals("Ryze")){
        		i = 75;
        	}else if(message.equals("Sejuani")){
        		i = 76;
        	}else if(message.equals("Shaco")){
        		i = 77;
        	}else if(message.equals("Shen")){
        		i = 78;
        	}else if(message.equals("Shyvana")){
        		i = 79;
        	}else if(message.equals("Singed")){
        		i = 80;
        	}else if(message.equals("Sion")){
        		i = 81;
        	}else if(message.equals("Sivir")){
        		i = 82;
        	}else if(message.equals("Skarner")){
        		i = 83;
        	}else if(message.equals("Sona")){
        		i = 84;
        	}else if(message.equals("Soraka")){
        		i = 85;
        	}else if(message.equals("Swain")){
        		i = 86;
        	}else if(message.equals("Syndra")){
        		i = 87;
        	}else if(message.equals("Talon")){
        		i = 88;
        	}else if(message.equals("Taric")){
        		i = 89;
        	}else if(message.equals("Teemo")){
        		i = 90;
        	}else if(message.equals("Thresh")){
        		i = 91;
        	}else if(message.equals("Tristana")){
        		i = 92;
        	}else if(message.equals("Trundle")){
        		i = 93;
        	}else if(message.equals("Tryndamere")){
        		i = 94;
        	}else if(message.equals("Twisted Fate")){
        		i = 95;
        	}else if(message.equals("Twitch")){
        		i = 96;
        	}else if(message.equals("Udyr")){
        		i = 97;
        	}else if(message.equals("Urgot")){
        		i = 98;
        	}else if(message.equals("Varus")){
        		i = 99;
        	}else if(message.equals("Vayne")){
        		i = 100;
        	}else if(message.equals("Veigar")){
        		i = 101;
        	}else if(message.equals("Vel Koz")){
        		i = 102;
        	}else if(message.equals("Vi")){
        		i = 103;
        	}else if(message.equals("Viktor")){
        		i = 104;
        	}else if(message.equals("Vladimir")){
        		i = 105;
        	}else if(message.equals("Volibear")){
        		i = 106;
        	}else if(message.equals("Warwick")){
        		i = 107;
        	}else if(message.equals("Wukong")){
        		i = 108;
        	}else if(message.equals("Xerath")){
        		i = 109;
        	}else if(message.equals("Xin Zhao")){
        		i = 110;
        	}else if(message.equals("Yasuo")){
        		i = 111;
        	}else if(message.equals("Yorick")){
        		i = 112;
        	}else if(message.equals("Zac")){
        		i = 113;
        	}else if(message.equals("Zed")){
        		i = 114;
        	}else if(message.equals("Ziggs")){
        		i = 115;
        	}else if(message.equals("Zilean")){
        		i = 116;
        	}else{
        		i=117;
        	}
		
		int resID;
		ImageView[] views = {
				(ImageView) findViewById(R.id.imageViewStart1),
				(ImageView) findViewById(R.id.imageViewStart2),
				(ImageView) findViewById(R.id.imageViewStart3),
				(ImageView) findViewById(R.id.imageViewStart4),
				(ImageView) findViewById(R.id.imageViewRush1),
				(ImageView) findViewById(R.id.imageViewRush2),
				(ImageView) findViewById(R.id.imageViewRush3),
				(ImageView) findViewById(R.id.imageViewRush4),
				(ImageView) findViewById(R.id.imageViewAsNeeded1),
				(ImageView) findViewById(R.id.imageViewAsNeeded2),
				(ImageView) findViewById(R.id.imageViewAsNeeded3),
				(ImageView) findViewById(R.id.imageViewAsNeeded4),
				(ImageView) findViewById(R.id.imageViewAsNeeded5)};
		for(int j=0; j<4; j++){
			resID = getResources().getIdentifier(database.getDatabase()[i].getStart()[j], "drawable", getPackageName());
			views[j].setImageResource(resID);
		}
		for(int j=0; j<4; j++){
			resID = getResources().getIdentifier(database.getDatabase()[i].getRush()[j], "drawable", getPackageName());
			views[j+4].setImageResource(resID);
		}
		for(int j=0; j<5; j++){
			resID = getResources().getIdentifier(database.getDatabase()[i].getAsNeeded()[j], "drawable", getPackageName());
			views[j+8].setImageResource(resID);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.build_guides, menu);
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
