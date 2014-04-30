package com.fourfoureight.lolhelper;

import com.fourfoureight.lolhelper.*;
import com.fourfoureight.lolhelper.General_Info.*;
import com.fourfoureight.lolhelper.Stats.*;

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
import android.widget.TextView;
import android.os.Build;

public class ItemInfo extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_item_info);
		
		

		//
		// Kitae's Bloodrazor and Mana Manipulator have been removed since the creation of this database. They will be inaccessible by our app.
		//

		
		
		
	             
	             int i = 0;
	             
	             items.runMain();
	             
	             Intent intent = getIntent();
	             String message = intent.getStringExtra(Items.EXTRA_MESSAGE);
	     		
	             
	             ImageView icon = (ImageView) findViewById(R.id.icon);
	             

	     			if(message.equals("Abyssal Scepter")){
	                    i = 0;
	     			}else if(message.equals("Aegis of the Legion")){
	                    i = 1;
	            	}else if(message.equals("Aether Wisp")){
	                    i = 2;
	            	}else if(message.equals("Amplifying Tome")){
	            		i = 3;
	            	}else if(message.equals("Ancient Coin")){
	            		i = 4;
	            	}else if(message.equals("Archangels Staff")){
	            		i = 5;
	            	}else if(message.equals("Athenes Unholy Grail")){
	            		i = 6;
	            	}else if(message.equals("Atmas Impaler")){
	                    i = 7;
	            	}else if(message.equals("Augment: Death")){
	                    i = 8;
	            	}else if(message.equals("Augment: Gravity")){
	                    i = 9;
	            	}else if(message.equals("Augment: Power")){
	            		i = 10;
	            	}else if(message.equals("B.F. Sword")){
	            		i = 11;
	            	}else if(message.equals("Banner of Command")){
	            		i = 12;
	            	}else if(message.equals("Banshees Veil")){
	            		i = 13;
	            	}else if(message.equals("Berserkers Greaves")){
	            		i = 14;
	            	}else if(message.equals("Bilgewater Cutlass")){
	            		i = 15;
	            	}else if(message.equals("Blackfire Torch")){
	            		i = 16;
	            	}else if(message.equals("Blade of the Ruined King")){
	            		i = 17;
	            	}else if(message.equals("Blasting Wand")){
	            		i = 18;
	            	}else if(message.equals("Bonetooth Necklace (Blue)")){
	            		i = 19;
	            	}else if(message.equals("Bonetooth Necklace (Green)")){
	            		i = 20;
	            	}else if(message.equals("Bonetooth Necklace (Red)")){
	            		i = 21;
	            	}else if(message.equals("Bonetooth Necklace (Yellow)")){
	            		i = 22;
	            	}else if(message.equals("Boots of Mobility")){
	            		i = 23;
	            	}else if(message.equals("Boots of Speed")){
	            		i = 24;
	            	}else if(message.equals("Boots of Swiftness")){
	            		i = 25;
	            	}else if(message.equals("Brawlers Gloves")){
	            		i = 26;
	            	}else if(message.equals("Catalyst the Protector")){
	            		i = 27;
	            	}else if(message.equals("Chain Vest")){
	            		i = 28;
	            	}else if(message.equals("Chalice of Harmony")){
	            		i = 29;
	            	}else if(message.equals("Cloak of Agility")){
	            		i = 30;
	            	}else if(message.equals("Cloth Armor")){
	            		i = 31;
	            	}else if(message.equals("Crystalline Flask")){
	            		i = 32;
	            	}else if(message.equals("Dagger")){
	            		i = 33;
	            	}else if(message.equals("Deathfire Grasp")){
	            		i = 34;
	            	}else if(message.equals("Dervish Blade")){
	            		i = 35;
	            	}else if(message.equals("Dorans Blade")){
	            		i = 36;
	            	}else if(message.equals("Dorans Ring")){
	            		i = 37;
	            	}else if(message.equals("Dorans Shield")){
	            		i = 38;
	            	}else if(message.equals("Elixir of Brilliance")){
	            		i = 39;
	            	}else if(message.equals("Elixir of Fortitude")){
	            		i = 40;
	            	}else if(message.equals("Enchantment: Alacrity")){
	            		i = 41;
	            	}else if(message.equals("Enchantment: Captain")){
	            		i = 42;
	            	}else if(message.equals("Enchantment: Distortion")){
	            		i = 43;
	            	}else if(message.equals("Enchantment: Furor")){
	            		i = 44;
	            	}else if(message.equals("Enchantment: Homeguard")){
	            		i = 45;
	            	}else if(message.equals("Entropy")){
	            		i = 46;
	            	}else if(message.equals("Executioner�s Calling")){
	            		i = 47;
	            	}else if(message.equals("Explorers Ward")){
	            		i = 48;
	            	}else if(message.equals("Face of the Mountain")){
	            		i = 49;
	            	}else if(message.equals("Faerie Charm")){
	            		i = 50;
	            	}else if(message.equals("Farsight Orb")){
	            		i = 51;
	            	}else if(message.equals("Feral Flare")){
	            		i = 52;
	            	}else if(message.equals("Fiendish Codex")){
	            		i = 53;
	            	}else if(message.equals("Forbidden Idol")){
	            		i = 54;
	            	}else if(message.equals("Frost Queens Claim")){
	            		i = 55;
	            	}else if(message.equals("Frostfang")){
	            		i = 56;
	            	}else if(message.equals("Frozen Heart")){
	            		i = 57;
	            	}else if(message.equals("Frozen Mallet")){
	            		i = 58;
	            	}else if(message.equals("Giants Belt")){
	            		i = 59;
	            	}else if(message.equals("Glacial Shroud")){
	            		i = 60;
	            	}else if(message.equals("Greater Stealth Totem")){
	            		i = 61;
	            	}else if(message.equals("Greater Vision Totem")){
	            		i = 62;
	            	}else if(message.equals("Grezs Spectral Lantern")){
	            		i = 63;
	            	}else if(message.equals("Guardian Angel")){
	            		i = 64;
	            	}else if(message.equals("Guardians Horn")){
	            		i = 65;
	            	}else if(message.equals("Guinsoos Rageblade")){
	            		i = 66;
	            	}else if(message.equals("Haunting Guise")){
	            		i = 67;
	            	}else if(message.equals("Head of KhaZix")){
	            		i = 68;
	            	}else if(message.equals("Health Potion")){
	            		i = 69;
	            	}else if(message.equals("Hexdrinker")){
	            		i = 70;
	            	}else if(message.equals("Hextech Gunblade")){
	            		i = 71;
	            	}else if(message.equals("Hextech Sweeper")){
	            		i = 72;
	            	}else if(message.equals("Hunters Machete")){
	            		i = 73;
	            	}else if(message.equals("Iceborn Gauntlet")){
	            		i = 74;
	            	}else if(message.equals("Ichor of Illumination")){
	            		i = 75;
	            	}else if(message.equals("Ichor of Rage")){
	            		i = 76;
	            	}else if(message.equals("Infinity Edge")){
	            		i = 77;
	            	}else if(message.equals("Ionian Boots of Lucidity")){
	            		i = 78;
	            	}else if(message.equals("Kindlegem")){
	            		i = 79;
	            	}else if(message.equals("Kitaes Bloodrazor")){ //inaccessible
	            		i = 80;
	            	}else if(message.equals("Last Whisper")){
	            		i = 81;
	            	}else if(message.equals("Liandrys Torment")){
	            		i = 82;
	            	}else if(message.equals("Lich Bane")){
	            		i = 83;
	            	}else if(message.equals("Locket of the Iron Solari")){
	            		i = 84;
	            	}else if(message.equals("Long Sword")){
	            		i = 85;
	            	}else if(message.equals("Lord Van Damms Pillager")){
	            		i = 86;
	            	}else if(message.equals("Madreds Razors")){
	            		i = 87;
	            	}else if(message.equals("Mana Manipulator")){ //inaccessible
	            		i = 88;
	            	}else if(message.equals("Mana Potion")){
	            		i = 89;
	            	}else if(message.equals("Manamune")){
	            		i = 90;
	            	}else if(message.equals("Maw of Malmortius")){
	            		i = 91;
	            	}else if(message.equals("Mejais Soulstealer")){
	            		i = 92;
	            	}else if(message.equals("Mercurial Scimitar")){
	            		i = 93;
	            	}else if(message.equals("Mercurys Treads")){
	            		i = 94;
	            	}else if(message.equals("Mikaels Crucible")){
	            		i = 95;
	            	}else if(message.equals("Moonflair Spellblade")){
	            		i = 96;
	            	}else if(message.equals("Morellonomicon")){
	            		i = 97;
	            	}else if(message.equals("Muramana")){
	            		i = 98;
	            	}else if(message.equals("Nashors Tooth")){
	            		i = 99;
	            	}else if(message.equals("Needlessly Large Rod")){
	            		i = 100;
	            	}else if(message.equals("Negatron Cloak")){
	            		i = 101;
	            	}else if(message.equals("Ninja Tabi")){
	            		i = 102;
	            	}else if(message.equals("Nomads Medallion")){
	            		i = 103;
	            	}else if(message.equals("Null-Magic Mantle")){
	            		i = 104;
	            	}else if(message.equals("Odyns Veil")){
	            		i = 105;
	            	}else if(message.equals("Ohmwrecker")){
	            		i = 106;
	            	}else if(message.equals("Oracles Extract")){
	            		i = 107;
	            	}else if(message.equals("Oracles Lens")){
	            		i = 108;
	            	}else if(message.equals("Orb of Winter")){
	            		i = 109;
	            	}else if(message.equals("Overlords Bloodmail")){
	            		i = 110;
	            	}else if(message.equals("Phage")){
	            		i = 111;
	            	}else if(message.equals("Phantom Dancer")){
	            		i = 112;
	            	}else if(message.equals("Pickaxe")){
	            		i = 113;
	            	}else if(message.equals("Poro-Snax")){
	            		i = 114;
	            	}else if(message.equals("Prospectors Blade")){
	            		i = 115;
	            	}else if(message.equals("Prospectors Ring")){
	            		i = 116;
	            	}else if(message.equals("Quicksilver Sash")){
	            		i = 117;
	            	}else if(message.equals("Rabadons Deathcap")){
	            		i = 118;
	            	}else if(message.equals("Randuins Omen")){
	            		i = 119;
	            	}else if(message.equals("Ravenous Hydra")){
	            		i = 120;
	            	}else if(message.equals("Recurve Bow")){
	            		i = 121;
	            	}else if(message.equals("Rejuvenation Bead")){
	            		i = 122;
	            	}else if(message.equals("Relic Shield")){
	            		i = 123;
	            	}else if(message.equals("Rod of Ages")){
	            		i = 124;
	            	}else if(message.equals("Ruby Crystal")){
	            		i = 125;
	            	}else if(message.equals("Ruby Sightstone")){
	            		i = 126;
	            	}else if(message.equals("Runaans Hurricane")){
	            		i = 127;
	            	}else if(message.equals("Rylais Crystal Scepter")){
	            		i = 128;
	            	}else if(message.equals("Sanguine Blade")){
	            		i = 129;
	            	}else if(message.equals("Sapphire Crystal")){
	            		i = 130;
	            	}else if(message.equals("Scrying Orb")){
	            		i = 131;
	            	}else if(message.equals("Seekers Armguard")){
	            		i = 132;
	            	}else if(message.equals("Seraphs Embrace")){
	            		i = 133;
	            	}else if(message.equals("Sheen")){
	            		i = 134;
	            	}else if(message.equals("Sightstone")){
	            		i = 135;
	            	}else if(message.equals("Sorcerers Shoes")){
	            		i = 136;
	            	}else if(message.equals("Spectres Cowl")){
	            		i = 137;
	            	}else if(message.equals("Spellthiefs Edge")){
	            		i = 138;
	            	}else if(message.equals("Spirit of the Ancient Golem")){
	            		i = 139;
	            	}else if(message.equals("Spirit of the Elder Lizard")){
	            		i = 140;
	            	}else if(message.equals("Spirit of the Spectral Wraith")){
	            		i = 141;
	            	}else if(message.equals("Spirit Stone")){
	            		i = 142;
	            	}else if(message.equals("Spirit Visage")){
	            		i = 143;
	            	}else if(message.equals("Statikk Shiv")){
	            		i = 144;
	            	}else if(message.equals("Stealth Ward")){
	            		i = 145;
	            	}else if(message.equals("Stinger")){
	            		i = 146;
	            	}else if(message.equals("Sunfire Cape")){
	            		i = 147;
	            	}else if(message.equals("Sweeping Lens")){
	            		i = 148;
	            	}else if(message.equals("Sword of the Divine")){
	            		i = 149;
	            	}else if(message.equals("Sword of the Occult")){
	            		i = 150;
	            	}else if(message.equals("Talisman of Ascension")){
	            		i = 151;
	            	}else if(message.equals("Targons Brace")){
	            		i = 152;
	            	}else if(message.equals("Tear of the Goddess")){
	            		i = 153;
	            	}else if(message.equals("The Black Cleaver")){
	            		i = 154;
	            	}else if(message.equals("The Bloodthrister")){
	            		i = 155;
	            	}else if(message.equals("The Brutalizer")){
	            		i = 156;
	            	}else if(message.equals("The Hex Core")){
	            		i = 157;
	            	}else if(message.equals("The Lightbringer")){
	            		i = 158;
	            	}else if(message.equals("Thornmail")){
	            		i = 159;
	            	}else if(message.equals("Tiamat")){
	            		i = 160;
	            	}else if(message.equals("Total Biscuit of Rejuvenation")){
	            		i = 161;
	            	}else if(message.equals("Trinity Force")){
	            		i = 162;
	            	}else if(message.equals("Twin Shadows")){
	            		i = 163;
	            	}else if(message.equals("Vampiric Scepter")){
	            		i = 164;
	            	}else if(message.equals("Vision Ward")){
	            		i = 165;
	            	}else if(message.equals("Void Staff")){
	            		i = 166;
			}else if(message.equals("Wardens Mail")){
				i = 167;
	            	}else if(message.equals("Warding Totem")){
	            		i = 168;
	            	}else if(message.equals("Warmogs Armor")){
	            		i = 169;
	            	}else if(message.equals("Wicked Hatchet")){
	            		i = 170;
	            	}else if(message.equals("Will of the Ancients")){
	            		i = 171;
	            	}else if(message.equals("Wits End")){
	            		i = 172;
	            	}else if(message.equals("Wooglets Witchcap")){
	            		i = 173;
	            	}else if(message.equals("Wriggles Lantern")){
	            		i = 174;
	            	}else if(message.equals("Youmuus Ghostblade")){
	            		i = 175;
	            	}else if(message.equals("Zeal")){
	            		i = 176;
	            	}else if(message.equals("Zekes Herald")){
	            		i = 177;
	            	}else if(message.equals("Zephyr")){
	            		i = 178;
	            	}else{
	            		i = 179;
	            	}
				     				
	     			switch(i){
	     			case 0: icon.setImageResource(R.drawable.abyssalscepter);
	     					break;
	     			case 1: icon.setImageResource(R.drawable.aegisofthelegion);
							break;
	     			case 2: icon.setImageResource(R.drawable.aetherwisp);
							break;
	     			case 3: icon.setImageResource(R.drawable.amplifyingtome);
							break;
	     			case 4: icon.setImageResource(R.drawable.ancientcoin);
	     					break;
	     			case 5: icon.setImageResource(R.drawable.archangelsstaff);
	     					break;
	     			case 6: icon.setImageResource(R.drawable.athenesunholygrail);
	     					break;
	     			case 7: icon.setImageResource(R.drawable.atmasimpaler);
	     					break;
	     			case 8: icon.setImageResource(R.drawable.viktor2);
	     					break;
	     			case 9: icon.setImageResource(R.drawable.viktor4);
	     					break;
	     			case 10: icon.setImageResource(R.drawable.viktor6);
	     					break;
	     			case 11: icon.setImageResource(R.drawable.bfsword);
	     					break;
	     			case 12: icon.setImageResource(R.drawable.bannerofcommand);
	     					break;
	     			case 13: icon.setImageResource(R.drawable.bansheesveil);
							break;
	     			case 14: icon.setImageResource(R.drawable.berserkergreaves);
	     					break;						
	     			case 15: icon.setImageResource(R.drawable.bilgewatercutlass);
							break;						
	     			case 16: icon.setImageResource(R.drawable.blackfiretorch);
							break;						
	     			case 17: icon.setImageResource(R.drawable.bladeoftheruinedking);
							break;						
	     			case 18: icon.setImageResource(R.drawable.blastingwand);
							break;						
	     			case 19: icon.setImageResource(R.drawable.bonetoothnecklaceblue1);
							break;						
	     			case 20: icon.setImageResource(R.drawable.bonetoothnecklacegreen1);
							break;						
	     			case 21: icon.setImageResource(R.drawable.bonetoothnecklacered1);
							break;						
	     			case 22: icon.setImageResource(R.drawable.bonetoothnecklaceyellow1);
							break;						
	     			case 23: icon.setImageResource(R.drawable.bootsofmobility);
							break;						
	     			case 24: icon.setImageResource(R.drawable.bootsofspeed);
							break;						
	     			case 25: icon.setImageResource(R.drawable.bootsofswiftness);
							break;						
	     			case 26: icon.setImageResource(R.drawable.brawlersgloves);
							break;						
	     			case 27: icon.setImageResource(R.drawable.catalysttheprotector);
							break;						
	     			case 28: icon.setImageResource(R.drawable.chainvest);
							break;						
	     			case 29: icon.setImageResource(R.drawable.chaliceofharmony);
							break;						
	     			case 30: icon.setImageResource(R.drawable.cloakofagility);
							break;						
	     			case 31: icon.setImageResource(R.drawable.clotharmor);
							break;						
	     			case 32: icon.setImageResource(R.drawable.crystallineflask);
							break;						
	     			case 33: icon.setImageResource(R.drawable.dagger);
							break;						
	     			case 34: icon.setImageResource(R.drawable.deathfiregrasp);
							break;						
	     			case 35: icon.setImageResource(R.drawable.dervishblade);
							break;						
	     			case 36: icon.setImageResource(R.drawable.doransblade);
							break;						
	     			case 37: icon.setImageResource(R.drawable.doransring);
							break;
	     			case 38: icon.setImageResource(R.drawable.doransshield);
							break;
	     			case 39: icon.setImageResource(R.drawable.elixirofbrilliance);
							break;     	
	     			case 40: icon.setImageResource(R.drawable.elixiroffortitude);
							break;     	
	     			case 41: icon.setImageResource(R.drawable.alacrity);
							break;     	
	     			case 42: icon.setImageResource(R.drawable.captain);
							break;     	
	     			case 43: icon.setImageResource(R.drawable.distortion);
							break;     	
	     			case 44: icon.setImageResource(R.drawable.furor);
							break;     	
	     			case 45: icon.setImageResource(R.drawable.homeguard);
							break;     	
	     			case 46: icon.setImageResource(R.drawable.entropy);
							break;     	
	     			case 47: icon.setImageResource(R.drawable.executionerscalling);
							break;     	
	     			case 48: icon.setImageResource(R.drawable.explorersward);
							break;     	
	     			case 49: icon.setImageResource(R.drawable.faceofthemountain);
							break;     	
	     			case 50: icon.setImageResource(R.drawable.faeriecharm);
							break;     	
	     			case 51: icon.setImageResource(R.drawable.farsightorb);
							break;     	
	     			case 52: icon.setImageResource(R.drawable.feralflare);
							break;     	
	     			case 53: icon.setImageResource(R.drawable.fiendishcodex);
							break;     	
	     			case 54: icon.setImageResource(R.drawable.forbiddenidol);
							break;     	
	     			case 55: icon.setImageResource(R.drawable.frostqueensclaim);
							break;     	
	     			case 56: icon.setImageResource(R.drawable.frostfang);
							break;     	
	     			case 57: icon.setImageResource(R.drawable.frozenheart);
							break;     	
	     			case 58: icon.setImageResource(R.drawable.frozenmallet);
							break;     	
	     			case 59: icon.setImageResource(R.drawable.giantsbelt);
							break;     	
	     			case 60: icon.setImageResource(R.drawable.glacialshroud);
							break;     	
	     			case 61: icon.setImageResource(R.drawable.greaterstealthtotem);
							break;     	
	     			case 62: icon.setImageResource(R.drawable.greatervisiontotem);
							break;     	
	     			case 63: icon.setImageResource(R.drawable.grezsspectrallantern);
							break;     	
	     			case 64: icon.setImageResource(R.drawable.guardianangel);
							break;     	
	     			case 65: icon.setImageResource(R.drawable.guardianshorn);
							break;     	
	     			case 66: icon.setImageResource(R.drawable.guinsoosrageblade);
							break;     	
	     			case 67: icon.setImageResource(R.drawable.hauntingguise);
							break;     	
	     			case 68: icon.setImageResource(R.drawable.headofkhazix);
							break;     	
	     			case 69: icon.setImageResource(R.drawable.healthpotion);
							break;     	
	     			case 70: icon.setImageResource(R.drawable.hexdrinker);
							break;     	
	     			case 71: icon.setImageResource(R.drawable.hextechgunblade);
							break;     	
	     			case 72: icon.setImageResource(R.drawable.hextechsweeper);
							break;     	
	     			case 73: icon.setImageResource(R.drawable.huntersmachete);
							break;     	
	     			case 74: icon.setImageResource(R.drawable.iceborngauntlet);
							break;     	
	     			case 75: icon.setImageResource(R.drawable.ichorofillumination);
							break;     	
	     			case 76: icon.setImageResource(R.drawable.ichorofrage);
							break;     	
	     			case 77: icon.setImageResource(R.drawable.infinityedge);
							break; 		
	     			case 78: icon.setImageResource(R.drawable.ionianbootsoflucidity);
							break;     			
	     			case 79: icon.setImageResource(R.drawable.kindlegem);
							break;     			
	     			case 80: icon.setImageResource(R.drawable.kindlegem);
							break;     			
	     			case 81: icon.setImageResource(R.drawable.lastwhisper);
							break;     			
	     			case 82: icon.setImageResource(R.drawable.liandrystorment);
							break;     			
	     			case 83: icon.setImageResource(R.drawable.lichbane);
							break;     			
	     			case 84: icon.setImageResource(R.drawable.locketoftheironsolari);
							break;     			
	     			case 85: icon.setImageResource(R.drawable.longsword);
							break;     			
	     			case 86: icon.setImageResource(R.drawable.lordvandammspillager);
							break;     			
	     			case 87: icon.setImageResource(R.drawable.madredsrazors);
							break;     			
	     			case 88: icon.setImageResource(R.drawable.madredsrazors);
							break;     			
	     			case 89: icon.setImageResource(R.drawable.manapotion);
							break;     			
	     			case 90: icon.setImageResource(R.drawable.manamune);
							break;     			
	     			case 91: icon.setImageResource(R.drawable.mawofthemalmortius);
							break;     			
	     			case 92: icon.setImageResource(R.drawable.mejaissoulstealer);
							break;     			
	     			case 93: icon.setImageResource(R.drawable.mercurialscimitar);
							break;     			
	     			case 94: icon.setImageResource(R.drawable.mercurytreads);
							break;     			
	     			case 95: icon.setImageResource(R.drawable.mikaelscrucible);
							break;     			
	     			case 96: icon.setImageResource(R.drawable.moonflairspellblade);
							break;     			
	     			case 97: icon.setImageResource(R.drawable.morellonomicon);
							break;     			
	     			case 98: icon.setImageResource(R.drawable.muramana);
							break;     			
	     			case 99: icon.setImageResource(R.drawable.nashorstooth);
							break;     			
	     			case 100: icon.setImageResource(R.drawable.needlesslylargerod);
							break;     			
	     			case 101: icon.setImageResource(R.drawable.negatroncloak);
							break;     			
	     			case 102: icon.setImageResource(R.drawable.ninjatabi);
							break;     			
	     			case 103: icon.setImageResource(R.drawable.nomadsmedallion);
							break;     			
	     			case 104: icon.setImageResource(R.drawable.nullmagicmantle);
							break;     			
	     			case 105: icon.setImageResource(R.drawable.odynsveil);
							break;     			
	     			case 106: icon.setImageResource(R.drawable.ohmwrecker);
							break;     			
	     			case 107: icon.setImageResource(R.drawable.oraclesextract);
							break;     			
	     			case 108: icon.setImageResource(R.drawable.oracleslens);
							break;     			
	     			case 109: icon.setImageResource(R.drawable.orbofwinter);
							break;     			
	     			case 110: icon.setImageResource(R.drawable.overlordsbloodmail);
							break;     			
	     			case 111: icon.setImageResource(R.drawable.phage);
							break;     			
	     			case 112: icon.setImageResource(R.drawable.phantomdancer);
							break;     			
	     			case 113: icon.setImageResource(R.drawable.pickaxe);
							break;     			
	     			case 114: icon.setImageResource(R.drawable.porosnax);
							break;     			
	     			case 115: icon.setImageResource(R.drawable.prospectorsblade);
							break;     			
	     			case 116: icon.setImageResource(R.drawable.prospectorsring);
							break;     			
	     			case 117: icon.setImageResource(R.drawable.quicksilversash);
							break;     	
	     			case 118: icon.setImageResource(R.drawable.rabadonsdeathcap);
	     					break;     	
	     			case 119: icon.setImageResource(R.drawable.randuinsomen);
	     					break;     	
	     			case 120: icon.setImageResource(R.drawable.ravenoushydra);
	     					break;   
	     			case 121: icon.setImageResource(R.drawable.recurvebow);
						break;  
	     			case 122: icon.setImageResource(R.drawable.rejuvenationbead);
						break;   
	     			case 123: icon.setImageResource(R.drawable.relicshield);
						break;   
	     			case 124: icon.setImageResource(R.drawable.rodofages);
						break;
	     			case 125: icon.setImageResource(R.drawable.rubycrystal);
						break;  
	     			case 126: icon.setImageResource(R.drawable.rubysightstone);
						break;   
	     			case 127: icon.setImageResource(R.drawable.runaanshurricane);
						break;   
	     			case 128: icon.setImageResource(R.drawable.rylaiscrystalscepter);
						break; 
	     			case 129: icon.setImageResource(R.drawable.sanguineblade);
						break;
	     			case 130: icon.setImageResource(R.drawable.sapphirecrystal);
						break;   
	     			case 131: icon.setImageResource(R.drawable.scryingorb);
	     				break;
	     			case 132: icon.setImageResource(R.drawable.seekersarmguard);
	 					break;
	     			case 133: icon.setImageResource(R.drawable.seraphsembrace);
	 					break;
	     			case 134: icon.setImageResource(R.drawable.sheen);
	 					break;
	     			case 135: icon.setImageResource(R.drawable.sightstone);
	 					break;
	     			case 136: icon.setImageResource(R.drawable.sorcerersshoes);
	 					break;
	     			case 137: icon.setImageResource(R.drawable.spectrescowl);
	 					break;
	     			case 138: icon.setImageResource(R.drawable.spellthiefsedge);
	 					break;
	     			case 139: icon.setImageResource(R.drawable.spiritoftheancientgolem);
	 					break;
	     			case 140: icon.setImageResource(R.drawable.spiritoftheelderlizard);
	 					break;
	     			case 141: icon.setImageResource(R.drawable.spiritofthespectralwraith);
	 					break;
	     			case 142: icon.setImageResource(R.drawable.spiritstone);
	 					break;
	     			case 143: icon.setImageResource(R.drawable.spiritvisage);
	 					break;
	     			case 144: icon.setImageResource(R.drawable.statikkshiv);
	 					break;
	     			case 145: icon.setImageResource(R.drawable.stealthward);
	 					break;
	     			case 146: icon.setImageResource(R.drawable.stinger);
	     				break;
	     			case 147: icon.setImageResource(R.drawable.sunfirecape);
	 					break;
	     			case 148: icon.setImageResource(R.drawable.sweepinglens);
	 					break;
	     			case 149: icon.setImageResource(R.drawable.swordofthedivine);
	     				break;
	     			case 150: icon.setImageResource(R.drawable.swordoftheoccult);
	 					break;
	     			case 151: icon.setImageResource(R.drawable.talismanofascension);
	 					break;
	     			case 152: icon.setImageResource(R.drawable.targonsbrace);
	 					break;
	     			case 153: icon.setImageResource(R.drawable.tearofthegoddess);
	 					break;
	     			case 154: icon.setImageResource(R.drawable.theblackcleaver);
	 					break;
	     			case 155: icon.setImageResource(R.drawable.thebloodthirster);
	 					break;
	     			case 156: icon.setImageResource(R.drawable.thebrutalizer);
	 					break;
	     			case 157: icon.setImageResource(R.drawable.hexcore);
	 					break;
	     			case 158: icon.setImageResource(R.drawable.thelightbringer);
	 					break;
	     			case 159: icon.setImageResource(R.drawable.thornmail);
	 					break;
	     			case 160: icon.setImageResource(R.drawable.tiamat);
	 					break;
	     			case 161: icon.setImageResource(R.drawable.totalbiscuitofrejuvenation);
	 					break;
	     			case 162: icon.setImageResource(R.drawable.trinityforce);
	 					break;
	     			case 163: icon.setImageResource(R.drawable.twinshadows);
	 					break;
	     			case 164: icon.setImageResource(R.drawable.vampiricscepter);
	 					break;
	     			case 165: icon.setImageResource(R.drawable.visionward);
	 					break;
	     			case 166: icon.setImageResource(R.drawable.voidstaff);
	 					break;
	     			case 167: icon.setImageResource(R.drawable.wardensmail);
	 					break;
	     			case 168: icon.setImageResource(R.drawable.wardingtotem);
	 					break;
	     			case 169: icon.setImageResource(R.drawable.warmogsarmor);
	 					break;
	     			case 170: icon.setImageResource(R.drawable.wickedhatchet);
	 					break;
	     			case 171: icon.setImageResource(R.drawable.willoftheancients);
	 					break;
	     			case 172: icon.setImageResource(R.drawable.witsend);
	 					break;
	     			case 173: icon.setImageResource(R.drawable.woogletswitchcap);
	 					break;
	     			case 174: icon.setImageResource(R.drawable.wriggleslantern);
	 					break;
	     			case 175: icon.setImageResource(R.drawable.youmuusghostblade);
	 					break;
	     			case 176: icon.setImageResource(R.drawable.zeal);
	 					break;
	     			case 177: icon.setImageResource(R.drawable.zekesherald);
	 					break;
	     			case 178: icon.setImageResource(R.drawable.zephyr);
	 					break;
	     			case 179: icon.setImageResource(R.drawable.zhonyashourglass);
						break;
					default: break;
	     			}


	     			String name = items.getName(items.itemsArray[i]);
	     			String availability = items.getAvailability(items.itemsArray[i]);
	     			String tier = items.getTier(items.itemsArray[i]);
	     			String stats = items.getStats(items.itemsArray[i]);
	     			String passive1 = items.getPassive1(items.itemsArray[i]);
	     			String passive2 = items.getPassive2(items.itemsArray[i]);
	     			String passive3 = items.getPassive3(items.itemsArray[i]);
	     			String passive4 = items.getPassive4(items.itemsArray[i]);
	     			String passive5 = items.getPassive5(items.itemsArray[i]);
	     			String menu = items.getMenu(items.itemsArray[i]);
	     			String itemCost = items.getItemCost(items.itemsArray[i]);
	     			String sellValue = items.getSellValue(items.itemsArray[i]);

	     			

	     			
	     			
	     			TextView nameText = (TextView)findViewById(R.id.nameDis);
	     			TextView availabilityText = (TextView)findViewById(R.id.availabilityDis);
	     			TextView tierText = (TextView)findViewById(R.id.tierDis);
	     			TextView statsText = (TextView)findViewById(R.id.statsDis);
	     			TextView passive1Text = (TextView)findViewById(R.id.passive1Dis);
	     			TextView passive2Text = (TextView)findViewById(R.id.passive2Dis);
	     			TextView passive3Text = (TextView)findViewById(R.id.passive3Dis);
	     			TextView passive4Text = (TextView)findViewById(R.id.passive4Dis);
	     			TextView passive5Text = (TextView)findViewById(R.id.passive5Dis);
	     			TextView menuText = (TextView)findViewById(R.id.menuDis);
	     			TextView itemCostText = (TextView)findViewById(R.id.costDis);
	     			TextView sellValueText = (TextView)findViewById(R.id.sellDis);
	     		
	     			
	     			
	     			//Setting Text for TextViews
	     			nameText.setText(name);
	     			availabilityText.setText("Availability: \n" + availability);
	     			tierText.setText("Tier: \n" + tier);
	     			statsText.setText("Stats: \n" + stats);
	     			passive1Text.setText(passive1);
	     			passive2Text.setText(passive2);
	     			passive3Text.setText(passive3);
	     			passive4Text.setText(passive4);
	     			passive5Text.setText(passive5);
	     			menuText.setText("Menu: \n" + menu);
	     			itemCostText.setText("Cost: \n" + itemCost);
	     			sellValueText.setText("Sell Value: \n" + sellValue);
	     			
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.item_info, menu);
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
