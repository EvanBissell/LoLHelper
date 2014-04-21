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

public class UltimateBravery extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ultimate_bravery);



	int champIcon,viktorItem,item1,item2,item3,item4,item5,item6;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		items.runMain();
		
		Button rand = (Button)findViewById(R.id.btnRandom);
		rand.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View v)
			{

				
				
				
				champIcon = getChampionIcon(); //champion selector
				viktorItem = items.getViktorItem();
				item1 = items.getBoots();
				item2 = items.getItems();
				item3 = items.getItems();
				item4 = items.getItems();
				item5 = items.getItems();
				item6 = items.getItems();
				
				ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
				ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
				ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
				ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
				ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
				ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
				ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);

			
				switch (item1){
				case 0: imageView1.setImageResource(R.drawable.ionianbootsoflucidity);
						break;
				case 1: imageView1.setImageResource(R.drawable.berserkergreaves);
						break;
				case 2:	imageView1.setImageResource(R.drawable.mercurytreads);
						break;
				case 3:	imageView1.setImageResource(R.drawable.bootsofmobility);
						break;
				case 4:	imageView1.setImageResource(R.drawable.ninjatabi);
						break;
				case 5:	imageView1.setImageResource(R.drawable.bootsofswiftness);
						break;
				case 6:	imageView1.setImageResource(R.drawable.sorcerersshoes);
						break;
				default:
						imageView1.setImageResource(R.drawable.headofkhazix);
				}
				
				switch (item2) {
				case 7: imageView2.setImageResource(R.drawable.guardianangel);
						break;
				case 8: imageView2.setImageResource(R.drawable.infinityedge);
						break;
				case 9: imageView2.setImageResource(R.drawable.mejaissoulstealer);
						break;
				case 10: imageView2.setImageResource(R.drawable.rabadonsdeathcap);
						break;
				case 11: imageView2.setImageResource(R.drawable.swordoftheoccult);
						break;
				case 12: imageView2.setImageResource(R.drawable.thornmail);
						break;
				case 13: imageView2.setImageResource(R.drawable.warmogsarmor);
						break;
				case 14: imageView2.setImageResource(R.drawable.abyssalscepter);
						break;
				case 15: imageView2.setImageResource(R.drawable.frozenmallet);
						break;
				case 16: imageView2.setImageResource(R.drawable.guinsoosrageblade);
						break;
				case 17: imageView2.setImageResource(R.drawable.lastwhisper);
						break;
				case 18: imageView2.setImageResource(R.drawable.runaanshurricane);
						break;
				case 19: imageView2.setImageResource(R.drawable.rylaiscrystalscepter);
						break;
				case 20: imageView2.setImageResource(R.drawable.sunfirecape);
						break;
				case 21: imageView2.setImageResource(R.drawable.swordofthedivine);
						break;
				case 22: imageView2.setImageResource(R.drawable.voidstaff);
						break;
				case 23: imageView2.setImageResource(R.drawable.witsend);
						break;
				case 24: imageView2.setImageResource(R.drawable.bansheesveil);
						break;
				case 25: imageView2.setImageResource(R.drawable.deathfiregrasp);
						break;
				case 26: imageView2.setImageResource(R.drawable.thebloodthirster);
						break;
				case 27: imageView2.setImageResource(R.drawable.mercurialscimitar);
						break;
				case 28: imageView2.setImageResource(R.drawable.ohmwrecker);
						break;
				case 29: imageView2.setImageResource(R.drawable.rubysightstone);
						break;
				case 30: imageView2.setImageResource(R.drawable.spiritoftheancientgolem);
						break;
				case 31: imageView2.setImageResource(R.drawable.spiritoftheelderlizard);
						break;
				case 32: imageView2.setImageResource(R.drawable.spiritofthespectralwraith);
						break;
				case 33: imageView2.setImageResource(R.drawable.zhonyashourglass);
						break;
				case 34: imageView2.setImageResource(R.drawable.athenesunholygrail);
						break;
				case 35: imageView2.setImageResource(R.drawable.atmasimpaler);
						break;
				case 36: imageView2.setImageResource(R.drawable.bannerofcommand);
						break;
				case 37: imageView2.setImageResource(R.drawable.theblackcleaver);
						break;
				case 38: imageView2.setImageResource(R.drawable.talismanofascension);
						break;
				case 39: imageView2.setImageResource(R.drawable.trinityforce);
						break;
				case 40: imageView2.setImageResource(R.drawable.executionerscalling);
						break;
				case 41: imageView2.setImageResource(R.drawable.faceofthemountain);	
						break;
				case 42: imageView2.setImageResource(R.drawable.frostqueensclaim);
						break;
				case 43: imageView2.setImageResource(R.drawable.frozenheart);
						break;
				case 44: imageView2.setImageResource(R.drawable.iceborngauntlet);
						break;
				case 45: imageView2.setImageResource(R.drawable.liandrystorment);
						break;
				case 46: imageView2.setImageResource(R.drawable.lichbane);
						break;
				case 47: imageView2.setImageResource(R.drawable.locketoftheironsolari);
						break;
				case 48: imageView2.setImageResource(R.drawable.mawofthemalmortius);
						break;
				case 49: imageView2.setImageResource(R.drawable.mikaelscrucible);
						break;
				case 50: imageView2.setImageResource(R.drawable.morellonomicon);
						break;
				case 51: imageView2.setImageResource(R.drawable.nashorstooth);
						break;
				case 52: imageView2.setImageResource(R.drawable.phantomdancer);
						break;
				case 53: imageView2.setImageResource(R.drawable.randuinsomen);
						break;
				case 54: imageView2.setImageResource(R.drawable.ravenoushydra);
						break;
				case 55: imageView2.setImageResource(R.drawable.rodofages);
						break;
				case 56: imageView2.setImageResource(R.drawable.spiritvisage);
						break;
				case 57: imageView2.setImageResource(R.drawable.statikkshiv);
						break;
				case 58: imageView2.setImageResource(R.drawable.twinshadows);
						break;
				case 59: imageView2.setImageResource(R.drawable.willoftheancients);
						break;
				case 60: imageView2.setImageResource(R.drawable.youmuusghostblade);
						break;
				case 61: imageView2.setImageResource(R.drawable.zekesherald);
						break;
				case 62: imageView2.setImageResource(R.drawable.zephyr);
						break;
				case 63: imageView2.setImageResource(R.drawable.feralflare);
						break;
				case 64: imageView2.setImageResource(R.drawable.bladeoftheruinedking);
						break;
				case 65: imageView2.setImageResource(R.drawable.hextechgunblade);
						break;
				case 66: imageView2.setImageResource(R.drawable.muramana);
						break;
				case 67: imageView2.setImageResource(R.drawable.seraphsembrace);
						break;
				default: imageView2.setImageResource(R.drawable.headofkhazix);
						break;
			}

			switch (item3) {
				case 7: imageView3.setImageResource(R.drawable.guardianangel);
						break;
				case 8: imageView3.setImageResource(R.drawable.infinityedge);
						break;
				case 9: imageView3.setImageResource(R.drawable.mejaissoulstealer);
						break;
				case 10: imageView3.setImageResource(R.drawable.rabadonsdeathcap);
						break;
				case 11: imageView3.setImageResource(R.drawable.swordoftheoccult);
						break;
				case 12: imageView3.setImageResource(R.drawable.thornmail);
						break;
				case 13: imageView3.setImageResource(R.drawable.warmogsarmor);
						break;
				case 14: imageView3.setImageResource(R.drawable.abyssalscepter);
						break;
				case 15: imageView3.setImageResource(R.drawable.frozenmallet);
						break;
				case 16: imageView3.setImageResource(R.drawable.guinsoosrageblade);
						break;
				case 17: imageView3.setImageResource(R.drawable.lastwhisper);
						break;
				case 18: imageView3.setImageResource(R.drawable.runaanshurricane);
						break;
				case 19: imageView3.setImageResource(R.drawable.rylaiscrystalscepter);
						break;
				case 20: imageView3.setImageResource(R.drawable.sunfirecape);
						break;
				case 21: imageView3.setImageResource(R.drawable.swordofthedivine);
						break;
				case 22: imageView3.setImageResource(R.drawable.voidstaff);
						break;
				case 23: imageView3.setImageResource(R.drawable.witsend);
						break;
				case 24: imageView3.setImageResource(R.drawable.bansheesveil);
						break;
				case 25: imageView3.setImageResource(R.drawable.deathfiregrasp);
						break;
				case 26: imageView3.setImageResource(R.drawable.thebloodthirster);
						break;
				case 27: imageView3.setImageResource(R.drawable.mercurialscimitar);
						break;
				case 28: imageView3.setImageResource(R.drawable.ohmwrecker);
						break;
				case 29: imageView3.setImageResource(R.drawable.rubysightstone);
						break;
				case 30: imageView3.setImageResource(R.drawable.spiritoftheancientgolem);
						break;
				case 31: imageView3.setImageResource(R.drawable.spiritoftheelderlizard);
						break;
				case 32: imageView3.setImageResource(R.drawable.spiritofthespectralwraith);
						break;
				case 33: imageView3.setImageResource(R.drawable.zhonyashourglass);
						break;
				case 34: imageView3.setImageResource(R.drawable.athenesunholygrail);
						break;
				case 35: imageView3.setImageResource(R.drawable.atmasimpaler);
						break;
				case 36: imageView3.setImageResource(R.drawable.bannerofcommand);
						break;
				case 37: imageView3.setImageResource(R.drawable.theblackcleaver);
						break;
				case 38: imageView3.setImageResource(R.drawable.talismanofascension);
						break;
				case 39: imageView3.setImageResource(R.drawable.trinityforce);
						break;
				case 40: imageView3.setImageResource(R.drawable.executionerscalling);
						break;
				case 41: imageView3.setImageResource(R.drawable.faceofthemountain);	
						break;
				case 42: imageView3.setImageResource(R.drawable.frostqueensclaim);
						break;
				case 43: imageView3.setImageResource(R.drawable.frozenheart);
						break;
				case 44: imageView3.setImageResource(R.drawable.iceborngauntlet);
						break;
				case 45: imageView3.setImageResource(R.drawable.liandrystorment);
						break;
				case 46: imageView3.setImageResource(R.drawable.lichbane);
						break;
				case 47: imageView3.setImageResource(R.drawable.locketoftheironsolari);
						break;
				case 48: imageView3.setImageResource(R.drawable.mawofthemalmortius);
						break;
				case 49: imageView3.setImageResource(R.drawable.mikaelscrucible);
						break;
				case 50: imageView3.setImageResource(R.drawable.morellonomicon);
						break;
				case 51: imageView3.setImageResource(R.drawable.nashorstooth);
						break;
				case 52: imageView3.setImageResource(R.drawable.phantomdancer);
						break;
				case 53: imageView3.setImageResource(R.drawable.randuinsomen);
						break;
				case 54: imageView3.setImageResource(R.drawable.ravenoushydra);
						break;
				case 55: imageView3.setImageResource(R.drawable.rodofages);
						break;
				case 56: imageView3.setImageResource(R.drawable.spiritvisage);
						break;
				case 57: imageView3.setImageResource(R.drawable.statikkshiv);
						break;
				case 58: imageView3.setImageResource(R.drawable.twinshadows);
						break;
				case 59: imageView3.setImageResource(R.drawable.willoftheancients);
						break;
				case 60: imageView3.setImageResource(R.drawable.youmuusghostblade);
						break;
				case 61: imageView3.setImageResource(R.drawable.zekesherald);
						break;
				case 62: imageView3.setImageResource(R.drawable.zephyr);
						break;
				case 63: imageView3.setImageResource(R.drawable.feralflare);
						break;
				case 64: imageView3.setImageResource(R.drawable.bladeoftheruinedking);
						break;
				case 65: imageView3.setImageResource(R.drawable.hextechgunblade);
						break;
				case 66: imageView3.setImageResource(R.drawable.muramana);
						break;
				case 67: imageView3.setImageResource(R.drawable.seraphsembrace);
						break;
				default: imageView3.setImageResource(R.drawable.headofkhazix);
						break;
			}

			switch (item4) {
				case 7: imageView4.setImageResource(R.drawable.guardianangel);
						break;
				case 8: imageView4.setImageResource(R.drawable.infinityedge);
						break;
				case 9: imageView4.setImageResource(R.drawable.mejaissoulstealer);
						break;
				case 10: imageView4.setImageResource(R.drawable.rabadonsdeathcap);
						break;
				case 11: imageView4.setImageResource(R.drawable.swordoftheoccult);
						break;
				case 12: imageView4.setImageResource(R.drawable.thornmail);
						break;
				case 13: imageView4.setImageResource(R.drawable.warmogsarmor);
						break;
				case 14: imageView4.setImageResource(R.drawable.abyssalscepter);
						break;
				case 15: imageView4.setImageResource(R.drawable.frozenmallet);
						break;
				case 16: imageView4.setImageResource(R.drawable.guinsoosrageblade);
						break;
				case 17: imageView4.setImageResource(R.drawable.lastwhisper);
						break;
				case 18: imageView4.setImageResource(R.drawable.runaanshurricane);
						break;
				case 19: imageView4.setImageResource(R.drawable.rylaiscrystalscepter);
						break;
				case 20: imageView4.setImageResource(R.drawable.sunfirecape);
						break;
				case 21: imageView4.setImageResource(R.drawable.swordofthedivine);
						break;
				case 22: imageView4.setImageResource(R.drawable.voidstaff);
						break;
				case 23: imageView4.setImageResource(R.drawable.witsend);
						break;
				case 24: imageView4.setImageResource(R.drawable.bansheesveil);
						break;
				case 25: imageView4.setImageResource(R.drawable.deathfiregrasp);
						break;
				case 26: imageView4.setImageResource(R.drawable.thebloodthirster);
						break;
				case 27: imageView4.setImageResource(R.drawable.mercurialscimitar);
						break;
				case 28: imageView4.setImageResource(R.drawable.ohmwrecker);
						break;
				case 29: imageView4.setImageResource(R.drawable.rubysightstone);
						break;
				case 30: imageView4.setImageResource(R.drawable.spiritoftheancientgolem);
						break;
				case 31: imageView4.setImageResource(R.drawable.spiritoftheelderlizard);
						break;
				case 32: imageView4.setImageResource(R.drawable.spiritofthespectralwraith);
						break;
				case 33: imageView4.setImageResource(R.drawable.zhonyashourglass);
						break;
				case 34: imageView4.setImageResource(R.drawable.athenesunholygrail);
						break;
				case 35: imageView4.setImageResource(R.drawable.atmasimpaler);
						break;
				case 36: imageView4.setImageResource(R.drawable.bannerofcommand);
						break;
				case 37: imageView4.setImageResource(R.drawable.theblackcleaver);
						break;
				case 38: imageView4.setImageResource(R.drawable.talismanofascension);
						break;
				case 39: imageView4.setImageResource(R.drawable.trinityforce);
						break;
				case 40: imageView4.setImageResource(R.drawable.executionerscalling);
						break;
				case 41: imageView4.setImageResource(R.drawable.faceofthemountain);	
						break;
				case 42: imageView4.setImageResource(R.drawable.frostqueensclaim);
						break;
				case 43: imageView4.setImageResource(R.drawable.frozenheart);
						break;
				case 44: imageView4.setImageResource(R.drawable.iceborngauntlet);
						break;
				case 45: imageView4.setImageResource(R.drawable.liandrystorment);
						break;
				case 46: imageView4.setImageResource(R.drawable.lichbane);
						break;
				case 47: imageView4.setImageResource(R.drawable.locketoftheironsolari);
						break;
				case 48: imageView4.setImageResource(R.drawable.mawofthemalmortius);
						break;
				case 49: imageView4.setImageResource(R.drawable.mikaelscrucible);
						break;
				case 50: imageView4.setImageResource(R.drawable.morellonomicon);
						break;
				case 51: imageView4.setImageResource(R.drawable.nashorstooth);
						break;
				case 52: imageView4.setImageResource(R.drawable.phantomdancer);
						break;
				case 53: imageView4.setImageResource(R.drawable.randuinsomen);
						break;
				case 54: imageView4.setImageResource(R.drawable.ravenoushydra);
						break;
				case 55: imageView4.setImageResource(R.drawable.rodofages);
						break;
				case 56: imageView4.setImageResource(R.drawable.spiritvisage);
						break;
				case 57: imageView4.setImageResource(R.drawable.statikkshiv);
						break;
				case 58: imageView4.setImageResource(R.drawable.twinshadows);
						break;
				case 59: imageView4.setImageResource(R.drawable.willoftheancients);
						break;
				case 60: imageView4.setImageResource(R.drawable.youmuusghostblade);
						break;
				case 61: imageView4.setImageResource(R.drawable.zekesherald);
						break;
				case 62: imageView4.setImageResource(R.drawable.zephyr);
						break;
				case 63: imageView4.setImageResource(R.drawable.feralflare);
						break;
				case 64: imageView4.setImageResource(R.drawable.bladeoftheruinedking);
						break;
				case 65: imageView4.setImageResource(R.drawable.hextechgunblade);
						break;
				case 66: imageView4.setImageResource(R.drawable.muramana);
						break;
				case 67: imageView4.setImageResource(R.drawable.seraphsembrace);
						break;
				default: imageView4.setImageResource(R.drawable.headofkhazix);
						break;
			}

			switch (item5) {
				case 7: imageView5.setImageResource(R.drawable.guardianangel);
						break;
				case 8: imageView5.setImageResource(R.drawable.infinityedge);
						break;
				case 9: imageView5.setImageResource(R.drawable.mejaissoulstealer);
						break;
				case 10: imageView5.setImageResource(R.drawable.rabadonsdeathcap);
						break;
				case 11: imageView5.setImageResource(R.drawable.swordoftheoccult);
						break;
				case 12: imageView5.setImageResource(R.drawable.thornmail);
						break;
				case 13: imageView5.setImageResource(R.drawable.warmogsarmor);
						break;
				case 14: imageView5.setImageResource(R.drawable.abyssalscepter);
						break;
				case 15: imageView5.setImageResource(R.drawable.frozenmallet);
						break;
				case 16: imageView5.setImageResource(R.drawable.guinsoosrageblade);
						break;
				case 17: imageView5.setImageResource(R.drawable.lastwhisper);
						break;
				case 18: imageView5.setImageResource(R.drawable.runaanshurricane);
						break;
				case 19: imageView5.setImageResource(R.drawable.rylaiscrystalscepter);
						break;
				case 20: imageView5.setImageResource(R.drawable.sunfirecape);
						break;
				case 21: imageView5.setImageResource(R.drawable.swordofthedivine);
						break;
				case 22: imageView5.setImageResource(R.drawable.voidstaff);
						break;
				case 23: imageView5.setImageResource(R.drawable.witsend);
						break;
				case 24: imageView5.setImageResource(R.drawable.bansheesveil);
						break;
				case 25: imageView5.setImageResource(R.drawable.deathfiregrasp);
						break;
				case 26: imageView5.setImageResource(R.drawable.thebloodthirster);
						break;
				case 27: imageView5.setImageResource(R.drawable.mercurialscimitar);
						break;
				case 28: imageView5.setImageResource(R.drawable.ohmwrecker);
						break;
				case 29: imageView5.setImageResource(R.drawable.rubysightstone);
						break;
				case 30: imageView5.setImageResource(R.drawable.spiritoftheancientgolem);
						break;
				case 31: imageView5.setImageResource(R.drawable.spiritoftheelderlizard);
						break;
				case 32: imageView5.setImageResource(R.drawable.spiritofthespectralwraith);
						break;
				case 33: imageView5.setImageResource(R.drawable.zhonyashourglass);
						break;
				case 34: imageView5.setImageResource(R.drawable.athenesunholygrail);
						break;
				case 35: imageView5.setImageResource(R.drawable.atmasimpaler);
						break;
				case 36: imageView5.setImageResource(R.drawable.bannerofcommand);
						break;
				case 37: imageView5.setImageResource(R.drawable.theblackcleaver);
						break;
				case 38: imageView5.setImageResource(R.drawable.talismanofascension);
						break;
				case 39: imageView5.setImageResource(R.drawable.trinityforce);
						break;
				case 40: imageView5.setImageResource(R.drawable.executionerscalling);
						break;
				case 41: imageView5.setImageResource(R.drawable.faceofthemountain);	
						break;
				case 42: imageView5.setImageResource(R.drawable.frostqueensclaim);
						break;
				case 43: imageView5.setImageResource(R.drawable.frozenheart);
						break;
				case 44: imageView5.setImageResource(R.drawable.iceborngauntlet);
						break;
				case 45: imageView5.setImageResource(R.drawable.liandrystorment);
						break;
				case 46: imageView5.setImageResource(R.drawable.lichbane);
						break;
				case 47: imageView5.setImageResource(R.drawable.locketoftheironsolari);
						break;
				case 48: imageView5.setImageResource(R.drawable.mawofthemalmortius);
						break;
				case 49: imageView5.setImageResource(R.drawable.mikaelscrucible);
						break;
				case 50: imageView5.setImageResource(R.drawable.morellonomicon);
						break;
				case 51: imageView5.setImageResource(R.drawable.nashorstooth);
						break;
				case 52: imageView5.setImageResource(R.drawable.phantomdancer);
						break;
				case 53: imageView5.setImageResource(R.drawable.randuinsomen);
						break;
				case 54: imageView5.setImageResource(R.drawable.ravenoushydra);
						break;
				case 55: imageView5.setImageResource(R.drawable.rodofages);
						break;
				case 56: imageView5.setImageResource(R.drawable.spiritvisage);
						break;
				case 57: imageView5.setImageResource(R.drawable.statikkshiv);
						break;
				case 58: imageView5.setImageResource(R.drawable.twinshadows);
						break;
				case 59: imageView5.setImageResource(R.drawable.willoftheancients);
						break;
				case 60: imageView5.setImageResource(R.drawable.youmuusghostblade);
						break;
				case 61: imageView5.setImageResource(R.drawable.zekesherald);
						break;
				case 62: imageView5.setImageResource(R.drawable.zephyr);
						break;
				case 63: imageView5.setImageResource(R.drawable.feralflare);
						break;
				case 64: imageView5.setImageResource(R.drawable.bladeoftheruinedking);
						break;
				case 65: imageView5.setImageResource(R.drawable.hextechgunblade);
						break;
				case 66: imageView5.setImageResource(R.drawable.muramana);
						break;
				case 67: imageView5.setImageResource(R.drawable.seraphsembrace);
						break;
				default: imageView5.setImageResource(R.drawable.headofkhazix);
						break;
			}
				
			switch (item6) {
				case 7: imageView6.setImageResource(R.drawable.guardianangel);
						break;
				case 8: imageView6.setImageResource(R.drawable.infinityedge);
						break;
				case 9: imageView6.setImageResource(R.drawable.mejaissoulstealer);
						break;
				case 10: imageView6.setImageResource(R.drawable.rabadonsdeathcap);
						break;
				case 11: imageView6.setImageResource(R.drawable.swordoftheoccult);
						break;
				case 12: imageView6.setImageResource(R.drawable.thornmail);
						break;
				case 13: imageView6.setImageResource(R.drawable.warmogsarmor);
						break;
				case 14: imageView6.setImageResource(R.drawable.abyssalscepter);
						break;
				case 15: imageView6.setImageResource(R.drawable.frozenmallet);
						break;
				case 16: imageView6.setImageResource(R.drawable.guinsoosrageblade);
						break;
				case 17: imageView6.setImageResource(R.drawable.lastwhisper);
						break;
				case 18: imageView6.setImageResource(R.drawable.runaanshurricane);
						break;
				case 19: imageView6.setImageResource(R.drawable.rylaiscrystalscepter);
						break;
				case 20: imageView6.setImageResource(R.drawable.sunfirecape);
						break;
				case 21: imageView6.setImageResource(R.drawable.swordofthedivine);
						break;
				case 22: imageView6.setImageResource(R.drawable.voidstaff);
						break;
				case 23: imageView6.setImageResource(R.drawable.witsend);
						break;
				case 24: imageView6.setImageResource(R.drawable.bansheesveil);
						break;
				case 25: imageView6.setImageResource(R.drawable.deathfiregrasp);
						break;
				case 26: imageView6.setImageResource(R.drawable.thebloodthirster);
						break;
				case 27: imageView6.setImageResource(R.drawable.mercurialscimitar);
						break;
				case 28: imageView6.setImageResource(R.drawable.ohmwrecker);
						break;
				case 29: imageView6.setImageResource(R.drawable.rubysightstone);
						break;
				case 30: imageView6.setImageResource(R.drawable.spiritoftheancientgolem);
						break;
				case 31: imageView6.setImageResource(R.drawable.spiritoftheelderlizard);
						break;
				case 32: imageView6.setImageResource(R.drawable.spiritofthespectralwraith);
						break;
				case 33: imageView6.setImageResource(R.drawable.zhonyashourglass);
						break;
				case 34: imageView6.setImageResource(R.drawable.athenesunholygrail);
						break;
				case 35: imageView6.setImageResource(R.drawable.atmasimpaler);
						break;
				case 36: imageView6.setImageResource(R.drawable.bannerofcommand);
						break;
				case 37: imageView6.setImageResource(R.drawable.theblackcleaver);
						break;
				case 38: imageView6.setImageResource(R.drawable.talismanofascension);
						break;
				case 39: imageView6.setImageResource(R.drawable.trinityforce);
						break;
				case 40: imageView6.setImageResource(R.drawable.executionerscalling);
						break;
				case 41: imageView6.setImageResource(R.drawable.faceofthemountain);	
						break;
				case 42: imageView6.setImageResource(R.drawable.frostqueensclaim);
						break;
				case 43: imageView6.setImageResource(R.drawable.frozenheart);
						break;
				case 44: imageView6.setImageResource(R.drawable.iceborngauntlet);
						break;
				case 45: imageView6.setImageResource(R.drawable.liandrystorment);
						break;
				case 46: imageView6.setImageResource(R.drawable.lichbane);
						break;
				case 47: imageView6.setImageResource(R.drawable.locketoftheironsolari);
						break;
				case 48: imageView6.setImageResource(R.drawable.mawofthemalmortius);
						break;
				case 49: imageView6.setImageResource(R.drawable.mikaelscrucible);
						break;
				case 50: imageView6.setImageResource(R.drawable.morellonomicon);
						break;
				case 51: imageView6.setImageResource(R.drawable.nashorstooth);
						break;
				case 52: imageView6.setImageResource(R.drawable.phantomdancer);
						break;
				case 53: imageView6.setImageResource(R.drawable.randuinsomen);
						break;
				case 54: imageView6.setImageResource(R.drawable.ravenoushydra);
						break;
				case 55: imageView6.setImageResource(R.drawable.rodofages);
						break;
				case 56: imageView6.setImageResource(R.drawable.spiritvisage);
						break;
				case 57: imageView6.setImageResource(R.drawable.statikkshiv);
						break;
				case 58: imageView6.setImageResource(R.drawable.twinshadows);
						break;
				case 59: imageView6.setImageResource(R.drawable.willoftheancients);
						break;
				case 60: imageView6.setImageResource(R.drawable.youmuusghostblade);
						break;
				case 61: imageView6.setImageResource(R.drawable.zekesherald);
						break;
				case 62: imageView6.setImageResource(R.drawable.zephyr);
						break;
				case 63: imageView6.setImageResource(R.drawable.feralflare);
						break;
				case 64: imageView6.setImageResource(R.drawable.bladeoftheruinedking);
						break;
				case 65: imageView6.setImageResource(R.drawable.hextechgunblade);
						break;
				case 66: imageView6.setImageResource(R.drawable.muramana);
						break;
				case 67: imageView6.setImageResource(R.drawable.seraphsembrace);
						break;
				default: imageView6.setImageResource(R.drawable.headofkhazix);
						break;
			}
			
			switch(champIcon){
				case 0: imageView7.setImageResource(R.drawable.aatrox);
					break;
				case 1: imageView7.setImageResource(R.drawable.ahri);
					break;
				case 2: imageView7.setImageResource(R.drawable.akali);
					break;
				case 3: imageView7.setImageResource(R.drawable.alistar);
					break;
				case 4:	imageView7.setImageResource(R.drawable.amumu);
					break;
				case 5: imageView7.setImageResource(R.drawable.anivia);
					break;
				case 6:	imageView7.setImageResource(R.drawable.annie);
					break;
				case 7: imageView7.setImageResource(R.drawable.ashe);
					break;
				case 8: imageView7.setImageResource(R.drawable.blitzcrank);
					break;
				case 9:	imageView7.setImageResource(R.drawable.brand);
					break;
				case 10:imageView7.setImageResource(R.drawable.caitlyn);
					break;
				case 11:imageView7.setImageResource(R.drawable.cassiopeia);
					break;
				case 12:imageView7.setImageResource(R.drawable.chogath);
					break;
				case 13:imageView7.setImageResource(R.drawable.corki);
					break;
				case 14:imageView7.setImageResource(R.drawable.darius);
					break;
				case 15:imageView7.setImageResource(R.drawable.diana);
					break;
				case 16:imageView7.setImageResource(R.drawable.drmundo);
					break;
				case 17:imageView7.setImageResource(R.drawable.draven);
					break;
				case 18:imageView7.setImageResource(R.drawable.elise);
					break;
				case 19:imageView7.setImageResource(R.drawable.evelynn);
					break;
				case 20:imageView7.setImageResource(R.drawable.ezreal);
					break;
				case 21:imageView7.setImageResource(R.drawable.fiddlesticks);
					break;
				case 22:imageView7.setImageResource(R.drawable.fiora);
					break;
				case 23:imageView7.setImageResource(R.drawable.fizz);
					break;
				case 24:imageView7.setImageResource(R.drawable.galio);
					break;
				case 25:imageView7.setImageResource(R.drawable.gangplank);
					break;
				case 26:imageView7.setImageResource(R.drawable.garen);
					break;
				case 27:imageView7.setImageResource(R.drawable.gragas);
					break;
				case 28:imageView7.setImageResource(R.drawable.graves);
					break;
				case 29:imageView7.setImageResource(R.drawable.hecarim);
					break;
				case 30:imageView7.setImageResource(R.drawable.heimerdinger);
					break;
				case 31:imageView7.setImageResource(R.drawable.irelia);
					break;
				case 32:imageView7.setImageResource(R.drawable.janna);
					break;
				case 33:imageView7.setImageResource(R.drawable.jarvaniv);
					break;
				case 34:imageView7.setImageResource(R.drawable.jax);
					break;
				case 35:imageView7.setImageResource(R.drawable.jayce);
					break;
				case 36:imageView7.setImageResource(R.drawable.jinx);
					break;
				case 37:imageView7.setImageResource(R.drawable.karma);
					break;
				case 38:imageView7.setImageResource(R.drawable.karthus);
					break;
				case 39:imageView7.setImageResource(R.drawable.kassadin);
					break;
				case 40:imageView7.setImageResource(R.drawable.katarina);
					break;
				case 41:imageView7.setImageResource(R.drawable.kayle);
					break;
				case 42:imageView7.setImageResource(R.drawable.kennen);
					break;
				case 43:imageView7.setImageResource(R.drawable.khazix);
					break;
				case 44:imageView7.setImageResource(R.drawable.kogmaw);
					break;
				case 45:imageView7.setImageResource(R.drawable.leblanc);
					break;
				case 46:imageView7.setImageResource(R.drawable.leesin);
					break;
				case 47:imageView7.setImageResource(R.drawable.leona);
					break;
				case 48:imageView7.setImageResource(R.drawable.lissandra);
					break;
				case 49:imageView7.setImageResource(R.drawable.lucian);
					break;
				case 50:imageView7.setImageResource(R.drawable.lulu);
					break;
				case 51:imageView7.setImageResource(R.drawable.lux);
					break;
				case 52:imageView7.setImageResource(R.drawable.malphite);
					break;
				case 53:imageView7.setImageResource(R.drawable.malzahar);
					break;
				case 54:imageView7.setImageResource(R.drawable.maokai);
					break;
				case 55:imageView7.setImageResource(R.drawable.masteryi);
					break;
				case 56:imageView7.setImageResource(R.drawable.missfortune);
					break;
				case 57:imageView7.setImageResource(R.drawable.mordekaiser);
					break;
				case 58:imageView7.setImageResource(R.drawable.morgana);
					break;
				case 59:imageView7.setImageResource(R.drawable.nami);
					break;
				case 60:imageView7.setImageResource(R.drawable.nasus);
					break;
				case 61:imageView7.setImageResource(R.drawable.nautilus);
					break;
				case 62:imageView7.setImageResource(R.drawable.nidalee);
					break;
				case 63:imageView7.setImageResource(R.drawable.nocturne);
					break;
				case 64:imageView7.setImageResource(R.drawable.nunu);
					break;
				case 65:imageView7.setImageResource(R.drawable.olaf);
					break;
				case 66:imageView7.setImageResource(R.drawable.orianna);
					break;
				case 67:imageView7.setImageResource(R.drawable.pantheon);
					break;
				case 68:imageView7.setImageResource(R.drawable.poppy);
					break;
				case 69:imageView7.setImageResource(R.drawable.quinn);
					break;
				case 70:imageView7.setImageResource(R.drawable.rammus);
					break;
				case 71:imageView7.setImageResource(R.drawable.renekton);
					break;
				case 72:imageView7.setImageResource(R.drawable.rengar);
					break;
				case 73:imageView7.setImageResource(R.drawable.riven);
					break;
				case 74:imageView7.setImageResource(R.drawable.rumble);
					break;
				case 75:imageView7.setImageResource(R.drawable.ryze);
					break;
				case 76:imageView7.setImageResource(R.drawable.sejuani);
					break;
				case 77:imageView7.setImageResource(R.drawable.shaco);
					break;
				case 78:imageView7.setImageResource(R.drawable.shen);
					break;
				case 79:imageView7.setImageResource(R.drawable.shyvana);
					break;
				case 80:imageView7.setImageResource(R.drawable.singed);
					break;
				case 81:imageView7.setImageResource(R.drawable.sion);
					break;
				case 82:imageView7.setImageResource(R.drawable.sivir);
					break;
				case 83:imageView7.setImageResource(R.drawable.skarner);
					break;
				case 84:imageView7.setImageResource(R.drawable.sona);
					break;
				case 85:imageView7.setImageResource(R.drawable.soraka);
					break;
				case 86:imageView7.setImageResource(R.drawable.swain);
					break;
				case 87:imageView7.setImageResource(R.drawable.syndra);
					break;
				case 88:imageView7.setImageResource(R.drawable.talon);
					break;
				case 89:imageView7.setImageResource(R.drawable.taric);
					break;
				case 90:imageView7.setImageResource(R.drawable.teemo);
					break;
				case 91:imageView7.setImageResource(R.drawable.thresh);
					break;
				case 92:imageView7.setImageResource(R.drawable.tristana);
					break;
				case 93:imageView7.setImageResource(R.drawable.trundle);
					break;
				case 94:imageView7.setImageResource(R.drawable.tryndamere);
					break;
				case 95:imageView7.setImageResource(R.drawable.twistedfate);
					break;
				case 96:imageView7.setImageResource(R.drawable.twitch);
					break;
				case 97:imageView7.setImageResource(R.drawable.udyr);
					break;
				case 98:imageView7.setImageResource(R.drawable.urgot);
					break;
				case 99:imageView7.setImageResource(R.drawable.varus);
					break;
				case 100:	imageView7.setImageResource(R.drawable.vayne);
						break;
				case 101:	imageView7.setImageResource(R.drawable.veigar);
						break;
				case 102:	imageView7.setImageResource(R.drawable.velkoz);
						break;
				case 103:	imageView7.setImageResource(R.drawable.vi);
						break;
				case 104:	imageView7.setImageResource(R.drawable.viktor);
						if(viktorItem == 0){
								imageView2.setImageResource(R.drawable.hexcoredeath);
						}else if(viktorItem == 1){
								imageView2.setImageResource(R.drawable.hexcoregravity);
						}else{
								imageView2.setImageResource(R.drawable.hexcorepower);
						}
							break;
				case 105:	imageView7.setImageResource(R.drawable.vladimir);
						break;
				case 106:	imageView7.setImageResource(R.drawable.volibear);
						break;
				case 107:	imageView7.setImageResource(R.drawable.warwick);
						break;
				case 108:	imageView7.setImageResource(R.drawable.wukong);
						break;
				case 109:	imageView7.setImageResource(R.drawable.xerath);
						break;
				case 110:	imageView7.setImageResource(R.drawable.xinzhao);
						break;
				case 111:	imageView7.setImageResource(R.drawable.yasuo);
						break;
				case 112:	imageView7.setImageResource(R.drawable.yorick);
						break;
				case 113:	imageView7.setImageResource(R.drawable.zac);
						break;
				case 114:	imageView7.setImageResource(R.drawable.zed);
						break;
				case 115:	imageView7.setImageResource(R.drawable.ziggs);
						break;
				case 116:	imageView7.setImageResource(R.drawable.zilean);
						break;
				case 117:	imageView7.setImageResource(R.drawable.zyra);
						break;
				default:	break;
			}
			
				

			}
		});
		



		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}
	
	

	
	//Method to get random champion. High must be 1 higher than the desired index
	//VALID INDEXES ARE 0 TO 117
	public static int getChampionIcon(){
		Random r = new Random();
		int Low = 0;
		int High = 118;
		int R = r.nextInt(High-Low) + Low;
		return R;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ultimate_bravery, menu);
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

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(
					R.layout.fragment_ultimate_bravery, container, false);
			return rootView;
		}
	}

}
