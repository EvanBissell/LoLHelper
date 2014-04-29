package com.fourfoureight.lolhelper.General_Info;

public class BuildDatabase {
	private BuildInfo database[];
	
	public BuildDatabase(String type){
		database = new BuildInfo[118];
		
		if(type.equals("Top")){
			buildtop();
		} else if(type.equals("Mid")){
			buildmid();
		} else if(type.equals("ADC")){
			buildadc();
		} else if(type.equals("Support")){
			buildsupp();
		} else {
			buildjung();
		}
	}
	
	private void buildtop(){
		//Aatrox
		database[0] = new BuildInfo();
		database[0].setStart("yellowtrinket", "rejuvenationbead", "healthpotion", "stealthward");
		database[0].setRush("vampiricscepter", "mercurytreads", "ravenoushydra");
		database[0].setAsNeeded("warmogsarmor", "randuinsomen", "spiritvisage", "bladeoftheruinedking");
		
		//Ahri
		database[1] = new BuildInfo();

		//Akali
		database[2] = new BuildInfo();

		//Alistar
		database[3] = new BuildInfo();

		//Amumu
		database[4] = new BuildInfo();

		//Anivia
		database[5] = new BuildInfo();

		//Annie
		database[6] = new BuildInfo();

		//Ashe
		database[7] = new BuildInfo();

		//Blitzcrank
		database[8] = new BuildInfo();

		//Brand
		database[9] = new BuildInfo();

		//Caitlyn
		database[10] = new BuildInfo();
		
		//Cassiopeia
		database[11] = new BuildInfo();

		//Cho'Gath
		database[12] = new BuildInfo();

		//Corki
		database[13] = new BuildInfo();

		//Darius
		database[14] = new BuildInfo();

		//Diana
		database[15] = new BuildInfo();

		//Dr. Mundo
		database[16] = new BuildInfo();

		//Draven
		database[17] = new BuildInfo();

		//Elise
		database[18] = new BuildInfo();

		//Evelynn
		database[19] = new BuildInfo();

		//Ezreal
		database[20] = new BuildInfo();

		//Fiddlesticks
		database[21] = new BuildInfo();

		//Fiora
		database[22] = new BuildInfo();

		//Fizz
		database[23] = new BuildInfo();

		//Galio
		database[24] = new BuildInfo();

		//Gangplank
		database[25] = new BuildInfo();

		//Garen
		database[26] = new BuildInfo();

		//Gragas
		database[27] = new BuildInfo();

		//Graves
		database[28] = new BuildInfo();

		//Hecarim
		database[29] = new BuildInfo();

		//Heimerdinger
		database[30] = new BuildInfo();

		//Irelia
		database[31] = new BuildInfo();

		//Janna
		database[32] = new BuildInfo();

		//J4
		database[33] = new BuildInfo();

		//Jax
		database[34] = new BuildInfo();

		//Jayce
		database[35] = new BuildInfo();

		//Jinx
		database[36] = new BuildInfo();

		//Karma
		database[37] = new BuildInfo();

		//Karthus
		database[38] = new BuildInfo();

		//Kassadin
		database[39] = new BuildInfo();

		//Katarina
		database[40] = new BuildInfo();

		//Kayle
		database[41] = new BuildInfo();

		//Kennen
		database[42] = new BuildInfo();

		//Kha'Zix
		database[43] = new BuildInfo();

		//Kog'Maw
		database[44] = new BuildInfo();

		//LeBlanc
		database[45] = new BuildInfo();

		//Lee Sin
		database[46] = new BuildInfo();

		//Leona
		database[47] = new BuildInfo();

		//Lissandra
		database[48] = new BuildInfo();

		//Lucian
		database[49] = new BuildInfo();

		//Lulu
		database[50] = new BuildInfo();

		//Lux
		database[51] = new BuildInfo();

		//Malphite
		database[52] = new BuildInfo();
		
		//Malzahar
		database[53] = new BuildInfo();

		//Maokai
		database[54] = new BuildInfo();

		//Master Yi
		database[55] = new BuildInfo();

		//Miss Fortune
		database[56] = new BuildInfo();

		//Mordekaiser
		database[57] = new BuildInfo();

		//Morgana
		database[58] = new BuildInfo();

		//Nami
		database[59] = new BuildInfo();

		//Nasus
		database[60] = new BuildInfo();

		//Nautilus
		database[61] = new BuildInfo();

		//Nidalee
		database[62] = new BuildInfo();

		//Nocturne
		database[63] = new BuildInfo();

		//Nunu
		database[64] = new BuildInfo();

		//Olaf
		database[65] = new BuildInfo();

		//Orianna
		database[66] = new BuildInfo();

		//Pantheon
		database[67] = new BuildInfo();

		//Poppy
		database[68] = new BuildInfo();

		//Quinn
		database[69] = new BuildInfo();

		//Rammus
		database[70] = new BuildInfo();

		//Renekton
		database[71] = new BuildInfo();

		//Rengar
		database[72] = new BuildInfo();

		//Riven
		database[73] = new BuildInfo();

		//Rumble
		database[74] = new BuildInfo();

		//Ryze
		database[75] = new BuildInfo();

		//Sejuani
		database[76] = new BuildInfo();

		//Shaco
		database[77] = new BuildInfo();

		//Shen
		database[78] = new BuildInfo();

		//Shyvana
		database[79] = new BuildInfo();

		//Singed
		database[80] = new BuildInfo();

		//Sion
		database[81] = new BuildInfo();

		//Sivir
		database[82] = new BuildInfo();

		//Skarner
		database[83] = new BuildInfo();

		//Sona
		database[84] = new BuildInfo();

		//Soraka
		database[85] = new BuildInfo();

		//Swain
		database[86] = new BuildInfo();

		//Syndra
		database[87] = new BuildInfo();

		//Talon
		database[88] = new BuildInfo();

		//Taric
		database[89] = new BuildInfo();

		//Teemo
		database[90] = new BuildInfo();

		//Thresh
		database[91] = new BuildInfo();

		//Tristana
		database[92] = new BuildInfo();

		//Trundle
		database[93] = new BuildInfo();

		//Tryndamere
		database[94] = new BuildInfo();

		//Twisted Fate
		database[95] = new BuildInfo();

		//Twitch
		database[96] = new BuildInfo();

		//Udyr
		database[97] = new BuildInfo();

		//Urgot
		database[98] = new BuildInfo();

		//Varus
		database[99] = new BuildInfo();

		//Vayne
		database[100] = new BuildInfo();

		//Veigar
		database[101] = new BuildInfo();

		//Vel'Koz
		database[102] = new BuildInfo();

		//Vi
		database[103] = new BuildInfo();

		//Viktor
		database[104] = new BuildInfo();

		//Vladimir
		database[105] = new BuildInfo();

		//Volibear
		database[106] = new BuildInfo();

		//Warwick
		database[107] = new BuildInfo();

		//Wukong
		database[108] = new BuildInfo();

		//Xerath
		database[109] = new BuildInfo();

		//Xin Zhao
		database[110] = new BuildInfo();

		//Yasuo
		database[111] = new BuildInfo();

		//Yorick
		database[112] = new BuildInfo();

		//Zac
		database[113] = new BuildInfo();

		//Zed
		database[114] = new BuildInfo();

		//Ziggs
		database[115] = new BuildInfo();

		//Zilean
		database[116] = new BuildInfo();

		//Zyra
		database[117] = new BuildInfo();		
	}
	
	private void buildmid(){
		//Aatrox
		database[0] = new BuildInfo();

		//Ahri
		database[1] = new BuildInfo();

		//Akali
		database[2] = new BuildInfo();

		//Alistar
		database[3] = new BuildInfo();

		//Amumu
		database[4] = new BuildInfo();

		//Anivia
		database[5] = new BuildInfo();

		//Annie
		database[6] = new BuildInfo();

		//Ashe
		database[7] = new BuildInfo();

		//Blitzcrank
		database[8] = new BuildInfo();

		//Brand
		database[9] = new BuildInfo();

		//Caitlyn
		database[10] = new BuildInfo();
		
		//Cassiopeia
		database[11] = new BuildInfo();

		//Cho'Gath
		database[12] = new BuildInfo();

		//Corki
		database[13] = new BuildInfo();

		//Darius
		database[14] = new BuildInfo();

		//Diana
		database[15] = new BuildInfo();

		//Dr. Mundo
		database[16] = new BuildInfo();

		//Draven
		database[17] = new BuildInfo();

		//Elise
		database[18] = new BuildInfo();

		//Evelynn
		database[19] = new BuildInfo();

		//Ezreal
		database[20] = new BuildInfo();

		//Fiddlesticks
		database[21] = new BuildInfo();

		//Fiora
		database[22] = new BuildInfo();

		//Fizz
		database[23] = new BuildInfo();

		//Galio
		database[24] = new BuildInfo();

		//Gangplank
		database[25] = new BuildInfo();

		//Garen
		database[26] = new BuildInfo();

		//Gragas
		database[27] = new BuildInfo();

		//Graves
		database[28] = new BuildInfo();

		//Hecarim
		database[29] = new BuildInfo();

		//Heimerdinger
		database[30] = new BuildInfo();

		//Irelia
		database[31] = new BuildInfo();

		//Janna
		database[32] = new BuildInfo();

		//J4
		database[33] = new BuildInfo();

		//Jax
		database[34] = new BuildInfo();

		//Jayce
		database[35] = new BuildInfo();

		//Jinx
		database[36] = new BuildInfo();

		//Karma
		database[37] = new BuildInfo();

		//Karthus
		database[38] = new BuildInfo();

		//Kassadin
		database[39] = new BuildInfo();

		//Katarina
		database[40] = new BuildInfo();

		//Kayle
		database[41] = new BuildInfo();

		//Kennen
		database[42] = new BuildInfo();

		//Kha'Zix
		database[43] = new BuildInfo();

		//Kog'Maw
		database[44] = new BuildInfo();

		//LeBlanc
		database[45] = new BuildInfo();

		//Lee Sin
		database[46] = new BuildInfo();

		//Leona
		database[47] = new BuildInfo();

		//Lissandra
		database[48] = new BuildInfo();

		//Lucian
		database[49] = new BuildInfo();

		//Lulu
		database[50] = new BuildInfo();

		//Lux
		database[51] = new BuildInfo();

		//Malphite
		database[52] = new BuildInfo();
		
		//Malzahar
		database[53] = new BuildInfo();

		//Maokai
		database[54] = new BuildInfo();

		//Master Yi
		database[55] = new BuildInfo();

		//Miss Fortune
		database[56] = new BuildInfo();

		//Mordekaiser
		database[57] = new BuildInfo();

		//Morgana
		database[58] = new BuildInfo();

		//Nami
		database[59] = new BuildInfo();

		//Nasus
		database[60] = new BuildInfo();

		//Nautilus
		database[61] = new BuildInfo();

		//Nidalee
		database[62] = new BuildInfo();

		//Nocturne
		database[63] = new BuildInfo();

		//Nunu
		database[64] = new BuildInfo();

		//Olaf
		database[65] = new BuildInfo();

		//Orianna
		database[66] = new BuildInfo();

		//Pantheon
		database[67] = new BuildInfo();

		//Poppy
		database[68] = new BuildInfo();

		//Quinn
		database[69] = new BuildInfo();

		//Rammus
		database[70] = new BuildInfo();

		//Renekton
		database[71] = new BuildInfo();

		//Rengar
		database[72] = new BuildInfo();

		//Riven
		database[73] = new BuildInfo();

		//Rumble
		database[74] = new BuildInfo();

		//Ryze
		database[75] = new BuildInfo();

		//Sejuani
		database[76] = new BuildInfo();

		//Shaco
		database[77] = new BuildInfo();

		//Shen
		database[78] = new BuildInfo();

		//Shyvana
		database[79] = new BuildInfo();

		//Singed
		database[80] = new BuildInfo();

		//Sion
		database[81] = new BuildInfo();

		//Sivir
		database[82] = new BuildInfo();

		//Skarner
		database[83] = new BuildInfo();

		//Sona
		database[84] = new BuildInfo();

		//Soraka
		database[85] = new BuildInfo();

		//Swain
		database[86] = new BuildInfo();

		//Syndra
		database[87] = new BuildInfo();

		//Talon
		database[88] = new BuildInfo();

		//Taric
		database[89] = new BuildInfo();

		//Teemo
		database[90] = new BuildInfo();

		//Thresh
		database[91] = new BuildInfo();

		//Tristana
		database[92] = new BuildInfo();

		//Trundle
		database[93] = new BuildInfo();

		//Tryndamere
		database[94] = new BuildInfo();

		//Twisted Fate
		database[95] = new BuildInfo();

		//Twitch
		database[96] = new BuildInfo();

		//Udyr
		database[97] = new BuildInfo();

		//Urgot
		database[98] = new BuildInfo();

		//Varus
		database[99] = new BuildInfo();

		//Vayne
		database[100] = new BuildInfo();

		//Veigar
		database[101] = new BuildInfo();

		//Vel'Koz
		database[102] = new BuildInfo();

		//Vi
		database[103] = new BuildInfo();

		//Viktor
		database[104] = new BuildInfo();

		//Vladimir
		database[105] = new BuildInfo();

		//Volibear
		database[106] = new BuildInfo();

		//Warwick
		database[107] = new BuildInfo();

		//Wukong
		database[108] = new BuildInfo();

		//Xerath
		database[109] = new BuildInfo();

		//Xin Zhao
		database[110] = new BuildInfo();

		//Yasuo
		database[111] = new BuildInfo();

		//Yorick
		database[112] = new BuildInfo();

		//Zac
		database[113] = new BuildInfo();

		//Zed
		database[114] = new BuildInfo();

		//Ziggs
		database[115] = new BuildInfo();

		//Zilean
		database[116] = new BuildInfo();

		//Zyra
		database[117] = new BuildInfo();		
	}
	
	private void buildadc(){
		//Aatrox
		database[0] = new BuildInfo();

		//Ahri
		database[1] = new BuildInfo();

		//Akali
		database[2] = new BuildInfo();

		//Alistar
		database[3] = new BuildInfo();

		//Amumu
		database[4] = new BuildInfo();

		//Anivia
		database[5] = new BuildInfo();

		//Annie
		database[6] = new BuildInfo();

		//Ashe
		database[7] = new BuildInfo();

		//Blitzcrank
		database[8] = new BuildInfo();

		//Brand
		database[9] = new BuildInfo();

		//Caitlyn
		database[10] = new BuildInfo();
		
		//Cassiopeia
		database[11] = new BuildInfo();

		//Cho'Gath
		database[12] = new BuildInfo();

		//Corki
		database[13] = new BuildInfo();

		//Darius
		database[14] = new BuildInfo();

		//Diana
		database[15] = new BuildInfo();

		//Dr. Mundo
		database[16] = new BuildInfo();

		//Draven
		database[17] = new BuildInfo();

		//Elise
		database[18] = new BuildInfo();

		//Evelynn
		database[19] = new BuildInfo();

		//Ezreal
		database[20] = new BuildInfo();

		//Fiddlesticks
		database[21] = new BuildInfo();

		//Fiora
		database[22] = new BuildInfo();

		//Fizz
		database[23] = new BuildInfo();

		//Galio
		database[24] = new BuildInfo();

		//Gangplank
		database[25] = new BuildInfo();

		//Garen
		database[26] = new BuildInfo();

		//Gragas
		database[27] = new BuildInfo();

		//Graves
		database[28] = new BuildInfo();

		//Hecarim
		database[29] = new BuildInfo();

		//Heimerdinger
		database[30] = new BuildInfo();

		//Irelia
		database[31] = new BuildInfo();

		//Janna
		database[32] = new BuildInfo();

		//J4
		database[33] = new BuildInfo();

		//Jax
		database[34] = new BuildInfo();

		//Jayce
		database[35] = new BuildInfo();

		//Jinx
		database[36] = new BuildInfo();

		//Karma
		database[37] = new BuildInfo();

		//Karthus
		database[38] = new BuildInfo();

		//Kassadin
		database[39] = new BuildInfo();

		//Katarina
		database[40] = new BuildInfo();

		//Kayle
		database[41] = new BuildInfo();

		//Kennen
		database[42] = new BuildInfo();

		//Kha'Zix
		database[43] = new BuildInfo();

		//Kog'Maw
		database[44] = new BuildInfo();

		//LeBlanc
		database[45] = new BuildInfo();

		//Lee Sin
		database[46] = new BuildInfo();

		//Leona
		database[47] = new BuildInfo();

		//Lissandra
		database[48] = new BuildInfo();

		//Lucian
		database[49] = new BuildInfo();

		//Lulu
		database[50] = new BuildInfo();

		//Lux
		database[51] = new BuildInfo();

		//Malphite
		database[52] = new BuildInfo();
		
		//Malzahar
		database[53] = new BuildInfo();

		//Maokai
		database[54] = new BuildInfo();

		//Master Yi
		database[55] = new BuildInfo();

		//Miss Fortune
		database[56] = new BuildInfo();

		//Mordekaiser
		database[57] = new BuildInfo();

		//Morgana
		database[58] = new BuildInfo();

		//Nami
		database[59] = new BuildInfo();

		//Nasus
		database[60] = new BuildInfo();

		//Nautilus
		database[61] = new BuildInfo();

		//Nidalee
		database[62] = new BuildInfo();

		//Nocturne
		database[63] = new BuildInfo();

		//Nunu
		database[64] = new BuildInfo();

		//Olaf
		database[65] = new BuildInfo();

		//Orianna
		database[66] = new BuildInfo();

		//Pantheon
		database[67] = new BuildInfo();

		//Poppy
		database[68] = new BuildInfo();

		//Quinn
		database[69] = new BuildInfo();

		//Rammus
		database[70] = new BuildInfo();

		//Renekton
		database[71] = new BuildInfo();

		//Rengar
		database[72] = new BuildInfo();

		//Riven
		database[73] = new BuildInfo();

		//Rumble
		database[74] = new BuildInfo();

		//Ryze
		database[75] = new BuildInfo();

		//Sejuani
		database[76] = new BuildInfo();

		//Shaco
		database[77] = new BuildInfo();

		//Shen
		database[78] = new BuildInfo();

		//Shyvana
		database[79] = new BuildInfo();

		//Singed
		database[80] = new BuildInfo();

		//Sion
		database[81] = new BuildInfo();

		//Sivir
		database[82] = new BuildInfo();

		//Skarner
		database[83] = new BuildInfo();

		//Sona
		database[84] = new BuildInfo();

		//Soraka
		database[85] = new BuildInfo();

		//Swain
		database[86] = new BuildInfo();

		//Syndra
		database[87] = new BuildInfo();

		//Talon
		database[88] = new BuildInfo();

		//Taric
		database[89] = new BuildInfo();

		//Teemo
		database[90] = new BuildInfo();

		//Thresh
		database[91] = new BuildInfo();

		//Tristana
		database[92] = new BuildInfo();

		//Trundle
		database[93] = new BuildInfo();

		//Tryndamere
		database[94] = new BuildInfo();

		//Twisted Fate
		database[95] = new BuildInfo();

		//Twitch
		database[96] = new BuildInfo();

		//Udyr
		database[97] = new BuildInfo();

		//Urgot
		database[98] = new BuildInfo();

		//Varus
		database[99] = new BuildInfo();

		//Vayne
		database[100] = new BuildInfo();

		//Veigar
		database[101] = new BuildInfo();

		//Vel'Koz
		database[102] = new BuildInfo();

		//Vi
		database[103] = new BuildInfo();

		//Viktor
		database[104] = new BuildInfo();

		//Vladimir
		database[105] = new BuildInfo();

		//Volibear
		database[106] = new BuildInfo();

		//Warwick
		database[107] = new BuildInfo();

		//Wukong
		database[108] = new BuildInfo();

		//Xerath
		database[109] = new BuildInfo();

		//Xin Zhao
		database[110] = new BuildInfo();

		//Yasuo
		database[111] = new BuildInfo();

		//Yorick
		database[112] = new BuildInfo();

		//Zac
		database[113] = new BuildInfo();

		//Zed
		database[114] = new BuildInfo();

		//Ziggs
		database[115] = new BuildInfo();

		//Zilean
		database[116] = new BuildInfo();

		//Zyra
		database[117] = new BuildInfo();		
	}
	
	private void buildsupp(){
		//Aatrox
		database[0] = new BuildInfo();
		database[0].setStart("yellowtrinket", "rejuvenationbead", "stealthward", "healthpotion");
		database[0].setRush("avariceblade", "mercurytreads", "rubysightstone");
		database[0].setAsNeeded("spiritvisage", "aegisofthelegion", "hexdrinker", "mawofthemalmortius", "youmuusghostblade");

		//Ahri
		database[1] = new BuildInfo();
		database[1].setStart("yellowtrinket", "spellthiefsedge", "stealthward");
		database[1].setRush("chaliceofharmony", "rubysightstone", "bootsofmobility", "liandrystorment");
		database[1].setAsNeeded("mikaelscrucible","deathfiregrasp", "morellonomicon", "zhonyashourglass","rylaiscrystalscepter");
		
		//Akali
		database[2] = new BuildInfo();

		//Alistar
		database[3] = new BuildInfo();
		database[3].setStart("yellowtrinket", "ancientcoin", "stealthward", "healthpotion");
		database[3].setRush("rubysightstone", "bootsofmobility", "iceborngauntlet");
		database[3].setAsNeeded("mikaelscrucible", "locketoftheironsolari", "talismanofascension", "randuinsomen", "spiritvisage");

		//Amumu
		database[4] = new BuildInfo();
		database[4].setStart("yellowtrinket", "relicshield", "stealthward", "healthpotion");
		database[4].setRush("abyssalscepter", "sunfirecape", "bootsofmobility");
		database[4].setAsNeeded("rylaiscrystalscepter", "randuinsomen", "zhonyashourglass", "locketoftheironsolari", "talismanofascension");
		
		//Anivia
		database[5] = new BuildInfo();
		database[5].setStart("yellowtrinket", "spellthiefsedge", "stealthward", "healthpotion");
		database[5].setRush("chaliceofharmony", "rubysightstone", "sorcerersshoes");
		database[5].setAsNeeded("athenesunholygrail", "rabadonsdeathcap", "zhonyashourglass", "abyssalscepter", "liandrystorment");

		//Annie
		database[6] = new BuildInfo();
		database[6].setStart("yellowtrinket", "ancientcoin", "healthpotion");
		database[6].setRush("chaliceofharmony", "rubysightstone", "bootsofmobility");
		database[6].setAsNeeded("talismanofascension", "rabadonsdeathcap", "mikaelscrucible", "deathfiregrasp");

		//Ashe
		database[7] = new BuildInfo();
		database[7].setStart("yellowtrinket", "ancientcoin", "stealthward", "healthpotion");
		database[7].setRush("tearofthegoddess", "talismanofascension", "berserkergreaves");
		database[7].setAsNeeded("manamune", "locketoftheironsolari", "theblackcleaver", "infinityedge");

		//Blitzcrank
		database[8] = new BuildInfo();
		database[8].setStart("yellowtrinket", "relicshield", "stealthward", "healthpotion");
		database[8].setRush("rubysightstone", "talismanofascension", "ninjatabi");
		database[8].setAsNeeded("twinshadows", "sunfirecape", "iceborngauntlet", "locketoftheironsolari", "bansheesveil");

		//Brand
		database[9] = new BuildInfo();
		database[9].setStart("yellowtrinket", "spellthiefsedge", "stealthward", "healthpotion");
		database[9].setRush("rubysightstone", "frostqueensclaim", "rylaiscrystalscepter", "bootsofmobility");
		database[9].setAsNeeded("rabadonsdeathcap", "voidstaff", "randuinsomen", "liandrystorment", "locketoftheironsolari");
		
		//Caitlyn
		database[10] = new BuildInfo();
		database[10].setStart("yellowtrinket", "ancientcoin", "stealthward", "healthpotion");
		database[10].setRush("vampiricscepter", "rubysightstone", "berserkergreaves");
		database[10].setAsNeeded("frozenmallet", "talismanofascension", "bladeoftheruinedking", "zephyr");
		
		//Cassiopeia
		database[11] = new BuildInfo();
		database[11].setStart("yellowtrinket", "spellthiefsedge", "stealthward", "healthpotion");
		database[11].setRush("rubysightstone", "liandrystorment", "rylaiscrystalscepter", "sorcerersshoes");
		database[11].setAsNeeded("abyssalscepter", "athenesunholygrail", "seraphsembrace", "rodofages", "zhonyashourglass");

		//Cho'Gath
		database[12] = new BuildInfo();
		database[12].setStart("yellowtrinket", "spellthiefsedge", "stealthward", "healthpotion");
		database[12].setRush("rubysightstone", "mercurytreads", "talismanofascension");
		database[12].setAsNeeded("spiritvisage", "warmogsarmor", "randuinsomen", "rodofages", "abyssalscepter");

		//Corki
		database[13] = new BuildInfo();

		//Darius
		database[14] = new BuildInfo();
		database[14].setStart("yellowtrinket", "relicshield", "stealthward", "healthpotion");
		database[14].setRush("rubysightstone", "bootsofswiftness", "faceofthemountain");
		database[14].setAsNeeded("spiritvisage", "randuinsomen", "guardianangel", "warmogsarmor", "trinityforce");
		
		//Diana
		database[15] = new BuildInfo();

		//Dr. Mundo
		database[16] = new BuildInfo();
		database[16].setStart("yellowtrinket", "relicshield", "stealthward", "healthpotion");
		database[16].setRush("rubysightstone", "spiritvisage", "ninjatabi", "sunfirecape");
		database[16].setAsNeeded("locketoftheironsolari", "bansheesveil", "faceofthemountain", "warmogsarmor", "liandrystorment");

		//Draven
		database[17] = new BuildInfo();

		//Elise
		database[18] = new BuildInfo();
		database[18].setStart("yellowtrinket", "doransshield", "healthpotion");
		database[18].setRush("rubysightstone", "bootsofmobility", "frostqueensclaim", "liandrystorment");
		database[18].setAsNeeded("morellonomicon", "rylaiscrystalscepter", "mikaelscrucible", "locketoftheironsolari", "abyssalscepter");
		
		//Evelynn
		database[19] = new BuildInfo();
		database[19].setStart("yellowtrinket", "ancientcoin", "stealthward", "healthpotion");
		database[19].setRush("bootsofmobility", "frostqueensclaim", "rylaiscrystalscepter");
		database[19].setAsNeeded("catalysttheprotector", "rodofages", "abyssalscepter", "locketoftheironsolari", "talismanofascension");

		//Ezreal
		database[20] = new BuildInfo();
		database[20].setStart("yellowtrinket", "relicshield", "stealthward", "healthpotion");
		database[20].setRush("rubysightstone", "ionianbootsoflucidity", "atmasimpaler");
		database[20].setAsNeeded("trinityforce", "locketoftheironsolari", "faceofthemountain", "zekesherald");

		//Fiddlesticks
		database[21] = new BuildInfo();
		database[21].setStart("redtrinket", "ancientcoin", "stealthward");
		database[21].setRush("rubysightstone", "talismanofascension", "bootsofmobility");
		database[21].setAsNeeded("locketoftheironsolari", "twinshadows", "spiritvisage", "abyssalscepter", "zhonyashourglass");

		//Fiora
		database[22] = new BuildInfo();

		//Fizz
		database[23] = new BuildInfo();
		database[23].setStart("yellowtrinket", "doransring", "healthpotion");
		database[23].setRush("rylaiscrystalscepter", "bladeoftheruinedking", "mercurytreads");
		database[23].setAsNeeded("warmogsarmor", "sunfirecape", "frozenheart", "spiritvisage");
		
		//Galio
		database[24] = new BuildInfo();
		database[24].setStart("yellowtrinket", "ancientcoin", "healthpotion");
		database[24].setRush("chaliceofharmony", "rubysightstone", "mercurytreads");
		database[24].setAsNeeded("athenesunholygrail", "abyssalscepter", "talismanofascension", "sunfirecape");

		//Gangplank
		database[25] = new BuildInfo();
		database[25].setStart("yellowtrinket", "ancientcoin", "stealthward", "healthpotion");
		database[25].setRush("avariceblade", "rubysightstone", "mercurytreads");
		database[25].setAsNeeded("talismanofascension", "locketoftheironsolari", "atmasimpaler", "frozenmallet", "warmogsarmor");
		
		//Garen
		database[26] = new BuildInfo();
		database[26].setStart("yellowtrinket", "ancientcoin", "stealthward", "healthpotion");
		database[26].setRush("avariceblade", "ninjatabi", "sunfirecape", "rubysightstone");
		database[26].setAsNeeded("warmogsarmor", "talismanofascension", "atmasimpaler");

		//Gragas
		database[27] = new BuildInfo();
		database[27].setStart("yellowtrinket", "spellthiefsedge", "stealthward");
		database[27].setRush("frostqueensclaim", "rubysightstone", "bootsofmobility");
		database[27].setAsNeeded("athenesunholygrail", "morellonomicon", "rylaiscrystalscepter", "twinshadows");

		//Graves
		database[28] = new BuildInfo();

		//Hecarim
		database[29] = new BuildInfo();
		database[29].setStart("yellowtrinket", "doransshield", "healthpotion");
		database[29].setRush("rubysightstone", "thornmail", "ninjatabi");
		database[29].setAsNeeded("talismanofascension", "warmogsarmor", "bansheesveil");

		//Heimerdinger
		database[30] = new BuildInfo();
		database[30].setStart("yellowtrinket", "ancientcoin", "stealthward", "healthpotion");
		database[30].setRush("rubysightstone", "bootsofmobility", "talismanofascension");
		database[30].setAsNeeded("abyssalscepter", "morellonomicon", "rabadonsdeathcap", "rylaiscrystalscepter", "zhonyashourglass");

		//Irelia
		database[31] = new BuildInfo();
		database[31].setStart("yellowtrinket", "doransshield", "healthpotion");
		database[31].setRush("rubysightstone", "ninjatabi");
		database[31].setAsNeeded("bladeoftheruinedking", "trinityforce", "statikkshiv");

		//Janna
		database[32] = new BuildInfo();
		database[32].setStart("yellowtrinket", "ancientcoin", "stealthward", "healthpotion");
		database[32].setRush("rubysightstone", "talismanofascension", "mercurytreads");
		database[32].setAsNeeded("mikaelscrucible", "locketoftheironsolari", "morellonomicon", "rabadonsdeathcap");
		
		//J4
		database[33] = new BuildInfo();
		database[33].setStart("redtrinket", "ancientcoin", "stealthward", "healthpotion");
		database[33].setRush("rubysightstone", "vampiricscepter", "bootsofmobility", "theblackcleaver");
		database[33].setAsNeeded("locketoftheironsolari", "faceofthemountain", "randuinsomen", "iceborngauntlet", "zekesherald");

		//Jax
		database[34] = new BuildInfo();
		
		//Jayce
		database[35] = new BuildInfo();
		database[35].setStart("yellowtrinket", "ancientcoin", "stealthward", "healthpotion");
		database[35].setRush("rubysightstone", "ionianbootsoflucidity");
		database[35].setAsNeeded("locketoftheironsolari", "zekesherald", "talismanofascension", "theblackcleaver", "randuinsomen");

		//Jinx
		database[36] = new BuildInfo();

		//Karma
		database[37] = new BuildInfo();
		database[37].setStart("yellowtrinket", "ancientcoin", "stealthward", "healthpotion");
		database[37].setRush("rubysightstone", "bootsofmobility", "talismanofascension");
		database[37].setAsNeeded("mikaelscrucible", "locketoftheironsolari", "liandrystorment", "rabadonsdeathcap", "morellonomicon");
		
		//Karthus
		database[38] = new BuildInfo();
		database[38].setStart("yellowtrinket", "ancientcoin", "stealthward", "healthpotion");
		database[38].setRush("nomadsmedallion", "tearofthegoddess", "sorcerersshoes");
		database[38].setAsNeeded("rodofages", "rabadonsdeathcap", "voidstaff", "zhonyashourglass", "talismanofascension");
		
		//Kassadin
		database[39] = new BuildInfo();
		database[39].setStart("yellowtrinket", "relicshield", "healthpotion");
		database[39].setRush("tearofthegoddess", "catalysttheprotector", "rabadonsdeathcap", "bootsofswiftness");
		database[39].setAsNeeded("rodofages", "rylaiscrystalscepter", "archangelsstaff", "zhonyashourglass");

		//Katarina
		database[40] = new BuildInfo();

		//Kayle
		database[41] = new BuildInfo();
		database[41].setStart("yellowtrinket", "spellthiefsedge", "stealthward", "healthpotion");
		database[41].setRush("rubysightstone", "ionianbootsoflucidity", "nashorstooth", "morellonomicon");
		database[41].setAsNeeded("mikaelscrucible", "lichbane", "voidstaff", "liandrystorment", "abyssalscepter");

		//Kennen
		database[42] = new BuildInfo();
		database[42].setStart("yellowtrinket", "doransshield", "stealthward");
		database[42].setRush("rylaiscrystalscepter", "rubysightstone", "ninjatabi");
		database[42].setAsNeeded("randuinsomen", "locketoftheironsolari", "liandrystorment", "talismanofascension", "abyssalscepter");

		//Kha'Zix
		database[43] = new BuildInfo();

		//Kog'Maw
		database[44] = new BuildInfo();

		//LeBlanc
		database[45] = new BuildInfo();
		database[45].setStart("yellowtrinket", "crystallineflask", "stealthward", "healthpotion");
		database[45].setRush("nomadsmedallion", "rubysightstone", "deathfiregrasp");
		database[45].setAsNeeded("sorcerersshoes", "talismanofascension", "rabadonsdeathcap", "zhonyashourglass", "morellonomicon");

		//Lee Sin
		database[46] = new BuildInfo();
		database[46].setStart("yellowtrinket", "relicshield", "stealthward", "healthpotion");
		database[46].setRush("rubysightstone", "bootsofmobility", "faceofthemountain");
		database[46].setAsNeeded("locketoftheironsolari", "randuinsomen", "theblackcleaver", "zekesherald");

		//Leona
		database[47] = new BuildInfo();
		database[47].setStart("yellowtrinket", "relicshield", "stealthward", "healthpotion");
		database[47].setRush("rubysightstone", "targonsbrace", "mercurytreads");
		database[47].setAsNeeded("talismanofascension", "faceofthemountain", "locketoftheironsolari", "frozenheart", "bansheesveil");

		//Lissandra
		database[48] = new BuildInfo();
		database[48].setStart("yellowtrinket", "spellthiefsedge", "stealthward", "healthpotion");
		database[48].setRush("frostqueensclaim", "rubysightstone", "zhonyashourglass", "sorcerersshoes");
		database[48].setAsNeeded("abyssalscepter", "guardianangel", "frozenheart", "liandrystorment", "deathfiregrasp");

		//Lucian
		database[49] = new BuildInfo();

		//Lulu
		database[50] = new BuildInfo();
		database[50].setStart("yellowtrinket", "spellthiefsedge", "stealthward", "healthpotion");
		database[50].setRush("rubysightstone", "sorcerersshoes", "mikaelscrucible");
		database[50].setAsNeeded("lichbane", "morellonomicon", "locketoftheironsolari", "bansheesveil", "zhonyashourglass");
		
		//Lux
		database[51] = new BuildInfo();
		database[51].setStart("yellowtrinket", "spellthiefsedge", "stealthward", "healthpotion");
		database[51].setRush("frostqueensclaim", "sorcerersshoes", "rubysightstone");
		database[51].setAsNeeded("twinshadows", "zekesherald", "mikaelscrucible", "rabadonsdeathcap", "zhonyashourglass");
		
		//Malphite
		database[52] = new BuildInfo();
		database[52].setStart("yellowtrinket", "doransshield", "healthpotion");
		database[52].setRush("rubysightstone", "sorcerersshoes", "frozenheart");
		database[52].setAsNeeded("talismanofascension", "abyssalscepter", "randuinsomen", "locketoftheironsolari", "liandrystorment");
		
		//Malzahar
		database[53] = new BuildInfo();

		//Maokai
		database[54] = new BuildInfo();
		database[54].setStart("yellowtrinket", "ancientcoin", "stealthward", "healthpotion");
		database[54].setRush("rubysightstone", "mercurytreads", "spiritvisage");
		database[54].setAsNeeded("talismanofascension", "randuinsomen", "locketoftheironsolari", "iceborngauntlet", "athenesunholygrail");
		
		//Master Yi
		database[55] = new BuildInfo();
		
		//Miss Fortune
		database[56] = new BuildInfo();

		//Mordekaiser
		database[57] = new BuildInfo();

		//Morgana
		database[58] = new BuildInfo();
		database[58].setStart("redtrinket", "spellthiefsedge", "stealthward");
		database[58].setRush("rubysightstone", "mercurytreads", "zhonyashourglass");
		database[58].setAsNeeded("frostqueensclaim", "rodofages", "liandrystorment", "rabadonsdeathcap", "abyssalscepter");

		//Nami
		database[59] = new BuildInfo();
		database[59].setStart("yellowtrinket", "ancientcoin", "stealthward", "healthpotion");
		database[59].setRush("rubysightstone", "chaliceofharmony", "bootsofmobility");
		database[59].setAsNeeded("talismanofascension", "mikaelscrucible", "locketoftheironsolari", "bansheesveil");

		//Nasus
		database[60] = new BuildInfo();
		database[60].setStart("yellowtrinket", "relicshield", "stealthward", "healthpotion");
		database[60].setRush("rubysightstone", "bootsofswiftness", "frozenheart", "locketoftheironsolari");
		database[60].setAsNeeded("frozenmallet", "spiritvisage", "sunfirecape", "warmogsarmor", "randuinsomen");

		//Nautilus
		database[61] = new BuildInfo();
		database[61].setStart("yellowtrinket", "relicshield", "stealthward", "healthpotion");
		database[61].setRush("rubysightstone", "ninjatabi", "faceofthemountain");
		database[61].setAsNeeded("locketoftheironsolari", "randuinsomen", "spiritvisage");

		//Nidalee
		database[62] = new BuildInfo();
		database[62].setStart("yellowtrinket", "spellthiefsedge", "stealthward", "manapotion");
		database[62].setRush("rubysightstone", "frostqueensclaim", "bootsofmobility");
		database[62].setAsNeeded("rabadonsdeathcap", "bannerofcommand", "voidstaff", "lichbane", "rylaiscrystalscepter");

		//Nocturne
		database[63] = new BuildInfo();

		//Nunu
		database[64] = new BuildInfo();
		database[64].setStart("yellowtrinket", "ancientcoin", "stealthward", "healthpotion");
		database[64].setRush("rubysightstone", "bootsofmobility", "talismanofascension");
		database[64].setAsNeeded("randuinsomen", "spiritvisage", "locketoftheironsolari", "sunfirecape");

		//Olaf
		database[65] = new BuildInfo();

		//Orianna
		database[66] = new BuildInfo();
		database[66].setStart("yellowtrinket", "spellthiefsedge", "stealthward", "healthpotion");
		database[66].setRush("athenesunholygrail", "frostqueensclaim", "mercurytreads");
		database[66].setAsNeeded("locketoftheironsolari", "rylaiscrystalscepter", "liandrystorment", "twinshadows", "zhonyashourglass");

		//Pantheon
		database[67] = new BuildInfo();
		database[67].setStart("yellowtrinket", "crystallineflask", "stealthward", "healthpotion");
		database[67].setRush("theblackcleaver", "lastwhisper", "mercurytreads");
		database[67].setAsNeeded("randuinsomen", "spiritvisage", "thebloodthirster");

		//Poppy
		database[68] = new BuildInfo();
		database[68].setStart("yellowtrinket", "ancientcoin", "healthpotion");
		database[68].setRush("sheen", "rubysightstone", "ionianbootsoflucidity");
		database[68].setAsNeeded("trinityforce", "hextechgunblade", "talismanofascension", "frozenheart", "bladeoftheruinedking");

		//Quinn
		database[69] = new BuildInfo();

		//Rammus
		database[70] = new BuildInfo();
		database[70].setStart("redtrinket", "ancientcoin", "stealthward");
		database[70].setRush("rubysightstone", "bootsofmobility", "talismanofascension", "sunfirecape");
		database[70].setAsNeeded("randuinsomen", "thornmail", "locketoftheironsolari", "spiritvisage", "warmogsarmor");

		//Renekton
		database[71] = new BuildInfo();

		//Rengar
		database[72] = new BuildInfo();
		database[72].setStart("yellowtrinket", "relicshield", "stealthward", "healthpotion");
		database[72].setRush("rubysightstone", "bootsofmobility", "zekesherald", "tiamat");
		database[72].setAsNeeded("spiritvisage", "sunfirecape", "ravenoushydra", "infinityedge", "blackcleaver");

		//Riven
		database[73] = new BuildInfo();
		database[73].setStart("yellowtrinket", "ancientcoin", "stealthward", "healthpotion");
		database[73].setRush("thebrutalizer", "ravenoushydra", "ninjatabi");
		database[73].setAsNeeded("talismanofascension", "thebloodthirster", "theblackcleaver", "lastwhisper");

		//Rumble
		database[74] = new BuildInfo();
		database[74].setStart("yellowtrinket", "ancientcoin", "stealthward", "healthpotion");
		database[74].setRush("doransshield", "sorcerersshoes", "rylaiscrystalscepter", "locketoftheironsolari");
		database[74].setAsNeeded("zhonyashourglass", "abyssalscepter", "randuinsomen", "rabadonsdeathcap", "liandrystorment");

		//Ryze
		database[75] = new BuildInfo();

		//Sejuani
		database[76] = new BuildInfo();

		//Shaco
		database[77] = new BuildInfo();
		database[77].setStart("yellowtrinket", "ancientcoin", "stealthward", "healthpotion");
		database[77].setRush("rubysightstone", "bootsofmobility", "frostqueensclaim");
		database[77].setAsNeeded("frostqueensclaim", "zhonyashourglass", "rabadonsdeathcap", "mikaelscrucible", "lichbane");
				
		//Shen
		database[78] = new BuildInfo();
		database[78].setStart("yellowtrinket", "relicshield", "stealthward", "healthpotion");
		database[78].setRush("rubysightstone", "mercurytreads", "faceofthemountain");
		database[78].setAsNeeded("locketoftheironsolari", "warmogsarmor", "spiritvisage", "randuinsomen", "bansheesveil");

		//Shyvana
		database[79] = new BuildInfo();

		//Singed
		database[80] = new BuildInfo();
		database[80].setStart("yellowtrinket", "relicshield", "stealthward", "healthpotion");
		database[80].setRush("archangelsstaff", "rylaiscrystalscepter", "liandrystorment");
		database[80].setAsNeeded("randuinsomen", "spiritvisage", "warmogsarmor", "thornmail");
		
		//Sion
		database[81] = new BuildInfo();
		database[81].setStart("yellowtrinket", "ancientcoin", "stealthward", "healthpotion");
		database[81].setRush("voidstaff", "mercurytreads", "rubysightstone");
		database[81].setAsNeeded("talismanofascension", "lichbane", "iceborngauntlet", "abyssalscepter", "rylaiscrystalscepter");

		//Sivir
		database[82] = new BuildInfo();

		//Skarner
		database[83] = new BuildInfo();

		//Sona
		database[84] = new BuildInfo();
		database[84].setStart("yellowtrinket", "ancientcoin", "stealthward", "healthpotion");
		database[84].setRush("rubysightstone", "ionianbootsoflucidity", "talismanofascension", "mikaelscrucible");
		database[84].setAsNeeded("locketoftheironsolari", "randuinsomen", "rabadonsdeathcap", "lichbane", "frozenheart");

		//Soraka
		database[85] = new BuildInfo();
		database[85].setStart("redtrinket", "ancientcoin", "stealthward", "healthpotion");
		database[85].setRush("rubysightstone", "bootsofmobility", "talismanofascension", "locketoftheironsolari");
		database[85].setAsNeeded("mikaelscrucible", "randuinsomen", "rylaiscrystalscepter", "liandrystorment", "morellonomicon");
		
		//Swain
		database[86] = new BuildInfo();
		database[86].setStart("yellowtrinket", "spellthiefsedge", "stealthward");
		database[86].setRush("rodofages", "hauntingguise", "sorcerersshoes", "rylaiscrystalscepter");
		database[86].setAsNeeded("liandrystorment", "rabadonsdeathcap", "zhonyashourglass", "spiritvisage");

		//Syndra
		database[87] = new BuildInfo();
		database[87].setStart("yellowtrinket", "ancientcoin", "stealthward", "healthpotion");
		database[87].setRush("chaliceofharmony", "sorcerersshoes", "talismanofascension", "rubysightstone");
		database[87].setAsNeeded("athenesunholygrail", "voidstaff", "liandrystorment", "locketoftheironsolari", "rylaiscrystalscepter");

		//Talon
		database[88] = new BuildInfo();
		database[88].setStart("redtrinket", "relicshield", "stealthward", "manapotion");
		database[88].setRush("frozenheart", "ionianbootsoflucidity", "warmogsarmor");
		database[88].setAsNeeded("spiritvisage", "randuinsomen", "locketoftheironsolari", "theblackcleaver", "youmuusghostblade");

		//Taric
		database[89] = new BuildInfo();
		database[89].setStart("yellowtrinket", "relicshield", "stealthward", "healthpotion");
		database[89].setRush("targonsbrace", "rubysightstone", "bootsofmobility");
		database[89].setAsNeeded("frozenheart", "faceofthemountain", "mikaelscrucible", "locketoftheironsolari", "talismanofascension");

		//Teemo
		database[90] = new BuildInfo();
		database[90].setStart("yellowtrinket", "spellthiefsedge", "stealthward", "healthpotion");
		database[90].setRush("sorcerersshoes", "rabadonsdeathcap", "nashorstooth");
		database[90].setAsNeeded("voidstaff", "liandrystorment", "zhonyashourglass", "frostqueensclaim", "runaanshurricane");

		//Thresh
		database[91] = new BuildInfo();
		database[91].setStart("yellowtrinket", "ancientcoin", "stealthward", "healthpotion");
		database[91].setRush("rubysightstone", "bootsofmobility", "talismanofascension");
		database[91].setAsNeeded("locketoftheironsolari", "mikaelscrucible", "sunfirecape", "abyssalscepter", "randuinsomen");

		//Tristana
		database[92] = new BuildInfo();

		//Trundle
		database[93] = new BuildInfo();
		database[93].setStart("yellowtrinket", "ancientcoin", "stealthward", "healthpotion");
		database[93].setRush("rubysightstone", "zekesherald", "talismanofascension", "bootsofmobility");
		database[93].setAsNeeded("iceborngauntlet", "frozenmallet", "randuinsomen", "warmogsarmor", "bladeoftheruinedking");

		//Tryndamere
		database[94] = new BuildInfo();
		database[94].setStart("yellowtrinket", "relicshield", "stealthward", "healthpotion");
		database[94].setRush("targonsbrace", "ionianbootsoflucidity", "rubysightstone");
		database[94].setAsNeeded("locketoftheironsolari", "faceofthemountain", "randuinsomen", "frozenmallet", "zekesherald");

		//Twisted Fate
		database[95] = new BuildInfo();
		database[95].setStart("yellowtrinket", "spellthiefsedge", "stealthward", "healthpotion");
		database[95].setRush("frostqueensclaim", "bootsofmobility", "rubysightstone");
		database[95].setAsNeeded("zephyr", "youmuusghostblade", "rylaiscrystalscepter");

		//Twitch
		database[96] = new BuildInfo();

		//Udyr
		database[97] = new BuildInfo();
		database[97].setStart("yellowtrinket", "ancientcoin", "stealthward", "healthpotion");
		database[97].setRush("rubysightstone", "mercurytreads", "nomadsmedallion");
		database[97].setAsNeeded("talismanofascension", "iceborngauntlet", "locketoftheironsolari", "randuinsomen", "bansheesveil");

		//Urgot
		database[98] = new BuildInfo();
		database[98].setStart("yellowtrinket", "doransshield", "healthpotion");
		database[98].setRush("rubysightstone", "kindlegem", "mercurytreads", "talismanofascension");
		database[98].setAsNeeded("locketoftheironsolari", "frozenmallet", "zekesherald", "frozenheart", "mikaelscrucible");

		//Varus
		database[99] = new BuildInfo();

		//Vayne
		database[100] = new BuildInfo();

		//Veigar
		database[101] = new BuildInfo();
		database[101].setStart("yellowtrinket", "doransring", "healthpotion");
		database[101].setRush("rubysightstone", "ionianbootsoflucidity", "deathfiregrasp");
		database[101].setAsNeeded("voidstaff", "rabadonsdeathcap", "talismanofascension", "zhonyashourglass", "guardianangel");

		//Vel'Koz
		database[102] = new BuildInfo();
		database[102].setStart("yellowtrinket", "spellthiefsedge", "healthpotion");
		database[102].setRush("frostqueensclaim", "athenesunholygrail");
		database[102].setAsNeeded("zhonyashourglass", "rylaiscrystalscepter", "iceborngauntlet", "abyssalscepter");

		//Vi
		database[103] = new BuildInfo();
		database[103].setStart("yellowtrinket", "ancientcoin", "stealthward", "healthpotion");
		database[103].setRush("rubysightstone", "thebrutalizer", "mercurytreads");
		database[103].setAsNeeded("frozenmallet", "theblackcleaver", "locketoftheironsolari", "thebloodthirster");

		//Viktor
		database[104] = new BuildInfo();
		database[104].setStart("yellowtrinket", "spellthiefsedge", "stealthward", "healthpotion");
		database[104].setRush("viktor4", "rubysightstone", "bootsofmobility");
		database[104].setAsNeeded("athenesunholygrail", "rylaiscrystalscepter", "frostqueensclaim");

		//Vladimir
		database[105] = new BuildInfo();

		//Volibear
		database[106] = new BuildInfo();
		database[106].setStart("yellowtrinket", "relicshield", "healthpotion");
		database[106].setRush("rubysightstone", "ninjatabi", "faceofthemountain");
		database[106].setAsNeeded("randuinsomen", "sunfirecape", "spiritvisage", "warmogsarmor");

		//Warwick
		database[107] = new BuildInfo();
		database[107].setStart("redtrinket", "ancientcoin", "stealthward", "healthpotion");
		database[107].setRush("nomadsmedallion", "witsend", "bootsofmobility", "bladeoftheruinedking");
		database[107].setAsNeeded("frozenmallet", "spiritvisage", "sunfirecape", "talismanofascension", "locketoftheironsolari");
				
		//Wukong
		database[108] = new BuildInfo();

		//Xerath
		database[109] = new BuildInfo();

		//Xin Zhao
		database[110] = new BuildInfo();

		//Yasuo
		database[111] = new BuildInfo();
		database[111].setStart("yellowtrinket", "relicshield", "stealthward", "healthpotion");
		database[111].setRush("targonsbrace", "mercurytreads", "rubysightstone", "statikkshiv");
		database[111].setAsNeeded("trinityforce", "ravenoushydra", "randuinsomen", "frozenmallet", "bansheesveil");

		//Yorick
		database[112] = new BuildInfo();

		//Zac
		database[113] = new BuildInfo();
		database[113].setStart("yellowtrinket", "relicshield", "stealthward");
		database[113].setRush("aegisofthelegion", "rubysightstone", "spiritvisage", "mercurytreads");
		database[113].setAsNeeded("faceofthemountain", "warmogsarmor", "locketoftheironsolari", "abyssalscepter", "rylaiscrystalscepter");

		//Zed
		database[114] = new BuildInfo();

		//Ziggs
		database[115] = new BuildInfo();
		database[115].setStart("yellowtrinket", "ancientcoin", "stealthward", "healthpotion");
		database[115].setRush("rubysightstone", "sorcerersshoes", "talismanofascension", "lichbane");
		database[115].setAsNeeded("athenesunholygrail", "rabadonsdeathcap", "rylaiscrystalscepter", "liandrystorment", "voidstaff");

		//Zilean
		database[116] = new BuildInfo();
		database[116].setStart("redtrinket", "crystallineflask", "stealthward", "healthpotion");
		database[116].setRush("chaliceofharmony", "bootsofmobility", "rubysightstone");
		database[116].setAsNeeded("talismanofascension", "mikaelscrucible", "locketoftheironsolari");

		//Zyra
		database[117] = new BuildInfo();
		database[117].setStart("yellowtrinket", "spellthiefsedge", "healthpotion");
		database[117].setRush("rubysightstone", "ionianbootsoflucidity", "liandrystorment");
		database[117].setAsNeeded("frostqueensclaim", "rylaiscrystalscepter", "zhonyashourglass", "rabadonsdeathcap");
	}
	
	private void buildjung(){
		//Aatrox
		database[0] = new BuildInfo();
		database[0].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[0].setRush("wriggleslantern", "guardianangel", "bootsofmobility", "bladeoftheruinedking");
		database[0].setAsNeeded("spiritvisage", "warmogsarmor", "randuinsomen", "ravenoushydra", "swordofthedivine");

		//Ahri
		database[1] = new BuildInfo();
		database[1].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[1].setRush("wriggleslantern", "bootsofmobility", "rabadonsdeathcap");
		database[1].setAsNeeded("sheen", "zeal", "trinityforce", "hextechgunblade");

		//Akali
		database[2] = new BuildInfo();
		database[2].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[2].setRush("hextechgunblade", "sorcerersshoes", "zhonyashourglass");
		database[2].setAsNeeded("rabadonsdeathcap", "lichbane", "voidstaff", "rylaiscrystalscepter", "abyssalscepter");

		//Alistar
		database[3] = new BuildInfo();
		database[3].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[3].setRush("iceborngauntlet", "bootsofmobility", "spiritoftheancientgolem", "spectrescowl");
		database[3].setAsNeeded("guardianangel", "zekesherald", "athenesunholygrail", "twinshadows");

		//Amumu
		database[4] = new BuildInfo();
		database[4].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[4].setRush("bootsofmobility", "sunfirecape", "locketoftheironsolari");
		database[4].setAsNeeded("spiritoftheancientgolem", "abyssalscepter", "frozenheart", "randuinsomen");

		//Anivia
		database[5] = new BuildInfo();

		//Annie
		database[6] = new BuildInfo();
		database[6].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[6].setRush("bootsofmobility", "rabadonsdeathcap", "spiritofthespectralwraith");
		database[6].setAsNeeded("liandrystorment", "rylaiscrystalscepter", "voidstaff", "zhonyashourglass", "lichbane");

		//Ashe
		database[7] = new BuildInfo();
		database[7].setStart("yellowtrinket", "huntersmachete", "healthpotion");
		database[7].setRush("spiritoftheelderlizard", "liandrystorment", "bootsofmobility");
		database[7].setAsNeeded("iceborngauntlet", "theblackcleaver", "mawofmalmortius", "guinsoosrageblade", "zekesherald");
		
		//Blitzcrank
		database[8] = new BuildInfo();
		database[8].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[8].setRush("wriggleslantern", "bootsofmobility", "tearofthegoddess");
		database[8].setAsNeeded("thebrutalizer", "trinityforce", "manamune", "theblackcleaver", "frozenheart");
		
		//Brand
		database[9] = new BuildInfo();
		database[9].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[9].setRush("spiritofthespectralwraith", "bootsofmobility", "liandrystorment");
		database[9].setAsNeeded("rabadonsdeathcap", "rylaiscrystalscepter", "voidstaff", "abyssalscepter");
		
		//Caitlyn
		database[10] = new BuildInfo();
		
		//Cassiopeia
		database[11] = new BuildInfo();
		database[11].setStart("yellowtrinket", "huntersmachete", "healthpotion");
		database[11].setRush("archangelsstaff", "rabadonsdeathcap", "spiritofthespectralwraith", "bootsofswiftness");
		database[11].setAsNeeded("lichbane", "rylaiscrystalscepter", "liandrystorment", "deathfiregrasp");
		
		//Cho'Gath
		database[12] = new BuildInfo();
		database[12].setStart("yellowtrinket", "huntersmachete", "healthpotion");
		database[12].setRush("spiritoftheancientgolem", "ninjatabi", "frozenheart");
		database[12].setAsNeeded("abyssalscepter", "randuinsomen", "spiritvisage", "witsend");
		
		//Corki
		database[13] = new BuildInfo();
		database[13].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[13].setRush("spiritoftheelderlizard", "vampiricscepter", "bootsofswiftness");
		database[13].setAsNeeded("theblackcleaver", "thebloodthirster", "warmogsarmor", "iceborngauntlets", "trinityforce");

		//Darius
		database[14] = new BuildInfo();
		database[14].setStart("yellowtrinket", "huntersmachete", "healthpotion");
		database[14].setRush("spiritoftheelderlizard", "bootsofmobility");
		database[14].setAsNeeded("sunfirecape", "frozenmallet", "warmogsarmor", "randuinsomen");

		//Diana
		database[15] = new BuildInfo();
		database[15].setStart("yellowtrinket", "huntersmachete", "healthpotion");
		database[15].setRush("sorcerersshoes","spiritofthespectralwraith", "lichbane");
		database[15].setAsNeeded("zhonyashourglass", "rabadonsdeathcap", "nashorstooth");

		//Dr. Mundo
		database[16] = new BuildInfo();
		database[16].setStart("yellowtrinket", "huntersmachete", "healthpotion");
		database[16].setRush("ninjatabi", "spiritoftheancientgolem");
		database[16].setAsNeeded("spiritvisage", "sunfirecape", "randuinsomen", "warmogsarmor");
		
		//Draven
		database[17] = new BuildInfo();
		database[17].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[17].setRush("madredsrazors", "bootsofmobility", "wriggleslantern");
		database[17].setAsNeeded("thebloodthirster", "trinityforce", "infinityedge", "phantomdancer", "guardianangel");

		//Elise
		database[18] = new BuildInfo();
		database[18].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[18].setRush("spiritofthepectralwraith", "sorcerersshoes", "liandrystorment");
		database[18].setAsNeeded("sunfirecape", "spiritvisage", "randuinsomen", "rylaiscrystalscepter", "frozenheart");

		//Evelynn
		database[19] = new BuildInfo();
		database[19].setStart("yellowtrinket", "huntersmachete", "healthpotion");
		database[19].setRush("spiritofthespectralwraith", "sorcerersshoes", "deathfiregrasp");
		database[19].setAsNeeded("voidstaff", "zhonyashourglass", "rabadonsdeathcap", "abyssalscepter");
		

		//Ezreal
		database[20] = new BuildInfo();
		database[20].setStart("yellowtrinket", "huntersmachete", "healthpotion");
		database[20].setRush("spiritoftheelderlizard", "ionianbootsoflucidity");
		database[20].setAsNeeded("trinityforce", "thebloodthirster", "lastwhisper", "manamune", "iceborngauntlet");

		//Fiddlesticks
		database[21] = new BuildInfo();
		database[21].setStart("redtrinket", "doransring", "stealthward");
		database[21].setRush("bootsofmobility", "zhonyashourglass", "rabadonsdeathcap");
		database[21].setAsNeeded("spiritofthespectralwraith", "voidstaff", "rylaiscrystalscepter", "liandrystorment");

		//Fiora
		database[22] = new BuildInfo();
		database[22].setStart("yellowtrinket", "huntersmachete", "healthpotion");
		database[22].setRush("wriggleslantern", "mercurytreads", "thebrutalizer");
		database[22].setAsNeeded("thebloodthirster", "ravenoushydra", "lastwhisper", "youmuusghostblade");

		//Fizz
		database[23] = new BuildInfo();
		database[23].setStart("yellowtrinket", "huntersmachete", "healthpotion");
		database[23].setRush("bootsofmobility", "iceborngauntlet");
		database[23].setAsNeeded("spiritoftheancientgolem", "locketoftheironsolari", "abyssalscepter", "lichbane");

		//Galio
		database[24] = new BuildInfo();
		database[24].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[24].setRush("bootsofmobility", "spiritoftheancientgolem", "iceborngauntlet");
		database[24].setAsNeeded("spiritvisage", "rodofages", "rylaiscrystalscepter", "warmogsarmor", "sunfirecape");

		//Gangplank
		database[25] = new BuildInfo();
		database[25].setStart("yellowtrinket", "huntersmachete", "healthpotion");
		database[25].setRush("mercurytreads", "spiritoftheelderlizard", "hexdrinker");
		database[25].setAsNeeded("trinityforce", "mawofmalmortius", "ravenoushydra", "randuinsomen", "lastwhisper");

		//Garen
		database[26] = new BuildInfo();
		database[26].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[26].setRush("mercurytreads", "spiritoftheancientgolem", "spiritvisage", "sunfirecape");
		database[26].setAsNeeded("locketoftheironsolari", "randuinsomen", "thornmail", "zekesherald");

		//Gragas
		database[27] = new BuildInfo();
		database[27].setStart("yellowtrinket", "huntersmachete", "healthpotion");
		database[27].setRush("spiritofthespectralwraith", "sorcerersshoes");
		database[27].setAsNeeded("liandrystorment", "voidstaff", "randuinsomen", "bansheesveil", "athenesunholygrail");

		//Graves
		database[28] = new BuildInfo();
		database[28].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[28].setRush("wriggleslantern", "thebloodthirster", "berserkergreaves", "bladeoftheruinedking");
		database[28].setAsNeeded("frozenmallet", "runaanshurricane", "infinityedge", "phantomdancer", "theblackcleaver");
		
		//Hecarim
		database[29] = new BuildInfo();
		database[29].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[29].setRush("spiritoftheelderlizard", "bootsofswiftness", "iceborngauntlet", "spiritvisage");
		database[29].setAsNeeded("randuinsomen", "locketoftheironsolari", "sunfirecape", "trinityforce");

		//Heimerdinger
		database[30] = new BuildInfo();
		database[30].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[30].setRush("sorcerersshoes", "rylaiscrystalscepter", "abyssalscepter");
		database[30].setAsNeeded("zhonyashourglass", "rabadonsdeathcap", "voidstaff", "athenesunholygrail");

		//Irelia
		database[31] = new BuildInfo();
		database[31].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[31].setRush("wriggleslantern", "bootsofswiftness", "bilgewatercutlass", "zephyr");
		database[31].setAsNeeded("bladeoftheruinedking", "trinityforce", "ravenoushydra", "theblackcleaver");

		//Janna
		database[32] = new BuildInfo();
		database[32].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[32].setRush("spiritoftheelderlizard", "bootsofmobility", "zephyr");
		database[32].setAsNeeded("zhonyashourglass", "nashorstooth", "iceborngauntlet");
		
		//J4
		database[33] = new BuildInfo();
		database[33].setStart("yellowtrinket", "huntersmachete", "healthpotion");
		database[33].setRush("spiritoftheancientgolem", "bootsofmobility", "tiamat");
		database[33].setAsNeeded("randuinsomen", "ravenoushydra", "locketoftheironsolari", "spiritvisage");

		//Jax
		database[34] = new BuildInfo();
		database[34].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[34].setRush("mercurytreads", "wriggleslantern", "bilgewatercutlass", "trinityforce");
		database[34].setAsNeeded("frozenheart", "mawofmalmortius", "hextechgunblade");

		//Jayce
		database[35] = new BuildInfo();
		database[35].setStart("yellowtrinket", "huntersmachete", "healthpotion");
		database[35].setRush("mercurytreads", "frozenheart", "hexdrinker");
		database[35].setAsNeeded("lastwhisper", "randuinsomen", "mawofmalmorius", "trinityforce");

		//Jinx
		database[36] = new BuildInfo();
		database[36].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[36].setRush("spiritoftheelderlizard", "berserkergreaves", "phantomdancer", "lastwhisper");
		database[36].setAsNeeded("thebloodthirster", "guardianangel", "infinityedge", "frozenmallet");

		//Karma
		database[37] = new BuildInfo();
		database[37].setStart("yellowtrinket", "huntersmachete", "healthpotion");
		database[37].setRush("sorcerersshoes", "liandrystorment", "spiritofthespectralwraith");
		database[37].setAsNeeded("athenesunholygrail", "zhonyashourglass", "rabadonsdeathcap", "rylaiscrystalscepter");

		//Karthus
		database[38] = new BuildInfo();
		database[38].setStart("yellowtrinket", "huntersmachete", "healthpotion");
		database[38].setRush("spiritofthespectralwraith", "sorcerersshoes", "rodofages", "zhonyashourglass");
		database[38].setAsNeeded("voidstaff", "rabadonsdeathcap", "rylaiscrystalscepter", "deathfiregrasp", "liandrystorment");

		//Kassadin
		database[39] = new BuildInfo();
		database[39].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[39].setRush("spiritstone", "sorcerersshoes", "archangelsstaff");
		database[39].setAsNeeded("rodofages", "rabadonsdeathcap", "voidstaff", "zhonyashourglass");

		//Katarina
		database[40] = new BuildInfo();
		database[40].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[40].setRush("spiritoftheelderlizard", "sorcerersshoes", "liandrystorment");
		database[40].setAsNeeded("rylaiscrystalscepter", "sunfirecape", "zhonyashourglass", "rabadonsdeathcap");

		//Kayle
		database[41] = new BuildInfo();
		database[41].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[41].setRush("wriggleslantern", "sorcerersshoes", "nashorstooth", "rabadonsdeathcap");
		database[41].setAsNeeded("lichbane", "zephyr", "feralflare", "voidstaff");
		
		//Kennen
		database[42] = new BuildInfo();
		database[42].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[42].setRush("berserkergreaves", "wriggleslantern", "phantomdancer");
		database[42].setAsNeeded("trinityforce", "thebloodthirster", "frozenmallet", "infinityedge");

		//Kha'Zix
		database[43] = new BuildInfo();
		database[43].setStart("yellowtrinket", "huntersmachete", "healthpotion");
		database[43].setRush("mercurytreads", "spiritoftheelderlizard");
		database[43].setAsNeeded("mawofmalmortius", "randuinsomen", "lastwhisper", "guardianangel");
		
		//Kog'Maw
		database[44] = new BuildInfo();

		//LeBlanc
		database[45] = new BuildInfo();
		database[45].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[45].setRush("wriggleslantern", "mercurytreads", "lichbane");
		database[45].setAsNeeded("athenesunholygrail", "zhonyashourglass", "warmogsarmor", "rylaiscrystalscepter");

		//Lee Sin
		database[46] = new BuildInfo();
		database[46].setStart("yellowtrinket", "huntersmachete", "healthpotion");
		database[46].setRush("mercurytreads", "spiritoftheelderlizard", "tiamat");
		database[46].setAsNeeded("lastwhisper", "theblackcleaver", "rubysightstone", "randuinsomen", "locketoftheironsolari");

		//Leona
		database[47] = new BuildInfo();
		database[47].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[47].setRush("sheen", "sunfirecape", "bootsofmobility", "spiritoftheancientgolem");
		database[47].setAsNeeded("iceborngauntlet", "trinityforce", "mawofmalmortius", "randuinsomen", "wriggleslantern");

		//Lissandra
		database[48] = new BuildInfo();
		database[48].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[48].setRush("spiritofthespectralwraith", "sorcerersshoes", "zhonyashourglass", "rabadonsdeathcap");
		database[48].setAsNeeded("morellonomicon", "voidstaff", "rylaiscrystalscepter", "liandrystorment");

		//Lucian
		database[49] = new BuildInfo();

		//Lulu
		database[50] = new BuildInfo();
		database[50].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[50].setRush("spiritstone", "avariceblade", "ionianbootsoflucidity");
		database[50].setAsNeeded("runaanshurricane", "zephyr", "spiritoftheelderlizard", "witsend", "staikkshiv");
		
		//Lux
		database[51] = new BuildInfo();
		database[51].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[51].setRush("sorcerersshoes", "fiendishcodex", "rabadonsdeathcap");
		database[51].setAsNeeded("morellonomicon", "rylaiscrystalscepter", "voidstaff", "abyssalscepter");

		//Malphite
		database[52] = new BuildInfo();
		database[52].setStart("yellowtrinket", "huntersmachete", "healthpotion");
		database[52].setRush("ninjatabi", "spiriteoftheancientgolem");
		database[52].setAsNeeded("locketoftheironsolari", "randuinomen", "abyssalscepter", "frozenmallet");
		
		//Malzahar
		database[53] = new BuildInfo();
		database[53].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[53].setRush("spiritstone", "bootsofmobility", "archangelsstaff", "spiritofthespectralwraith");
		database[53].setAsNeeded("rodofages", "rabadonsdeathcap", "liandrystorment", "zhonyashourglass", "rylaiscrystalscepter");

		//Maokai
		database[54] = new BuildInfo();
		database[54].setStart("yellowtrinket", "huntersmachete", "healthpotion");
		database[54].setRush("bootsofmobility", "spiritoftheancientgolem", "locketoftheironsolari");
		database[54].setAsNeeded("frozenheart", "randuinsomen", "abyssalscepter");

		//Master Yi
		database[55] = new BuildInfo();
		database[55].setStart("yellowtrinket", "huntersmachete", "healthpotion");
		database[55].setRush("wriggleslantern", "bootsofmobility", "youmuusghostblade", "infinityedge");
		database[55].setAsNeeded("bladeoftheruinedking", "feralflare", "guardianangel");

		//Miss Fortune
		database[56] = new BuildInfo();
		database[56].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[56].setRush("rabadonsdeathcap", "bootsofmobility", "spiritoftheelderlizard");
		database[56].setAsNeeded("lichbane", "trinityforce", "guardianangel", "warmogsarmor", "hextechgunblade");

		//Mordekaiser
		database[57] = new BuildInfo();
		database[57].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[57].setRush("spiritoftheancientgolem", "bootsofswiftness", "sunfirecape");
		database[57].setAsNeeded("frozenheart", "bansheesveil", "voidstaff");

		//Morgana
		database[58] = new BuildInfo();
		database[58].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[58].setRush("spiritofthespectralwraith", "sorcerersshoes", "zhonyashourglass");
		database[58].setAsNeeded("rylaiscrystalscepter", "spiritvisage", "rodofages", "deathfiregrasp", "liandrystorment");

		//Nami
		database[59] = new BuildInfo();
		database[59].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[59].setRush("spiritofthespectralwraith", "sorcerersshoes", "rodofages");
		database[59].setAsNeeded("rabadonsdeathcap", "liandrystorment", "morellonomicon", "zhonyashourglass");

		//Nasus
		database[60] = new BuildInfo();
		database[60].setStart("yellowtrinket", "huntersmachete", "healthpotion");
		database[60].setRush("bootsofswiftness", "spiritoftheancientgolem", "spiritvisage");
		database[60].setAsNeeded("randuinsomen", "iceborngauntlet", "warmogsarmor", "locketoftheironsolari");

		//Nautilus
		database[61] = new BuildInfo();
		database[61].setStart("yellowtrinket", "huntersmachete", "healthpotion");
		database[61].setRush("bootsofmobility", "spiritoftheancientgolem");
		database[61].setAsNeeded("locketoftheironsolari", "randuinsomen", "witsend");

		//Nidalee
		database[62] = new BuildInfo();
		database[62].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[62].setRush("archangelsstaff", "sorcerersshoes", "rabadonsdeathcap");
		database[62].setAsNeeded("voidstaff", "morellonomicon", "zhonhashourglass", "lichbane");

		//Nocturne
		database[63] = new BuildInfo();
		database[63].setStart("yellowtrinket", "huntersmachete", "healthpotion");
		database[63].setRush("wriggleslantern", "mercurytreads", "bladeoftheruinedking");
		database[63].setAsNeeded("randuinsomen", "bansheesveil", "lastwhisper", "frozenmallet");

		//Nunu
		database[64] = new BuildInfo();
		database[64].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[64].setRush("spiritoftheancientgolem", "bootsofmobility", "locketoftheironsolari");
		database[64].setAsNeeded("spiritvisage", "randuinsomen", "sunfirecape");

		//Olaf
		database[65] = new BuildInfo();
		database[65].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[65].setRush("wriggleslantern", "thebrutalizer", "mercurytreads", "locketoftheironsolari");
		database[65].setAsNeeded("warmogsarmor", "randuinsomen", "frozenheart", "frozenmallet");
		
		//Orianna
		database[66] = new BuildInfo();

		//Pantheon
		database[67] = new BuildInfo();
		database[67].setStart("yellowtrinket", "huntersmachete", "healthpotion");
		database[67].setRush("bootsofmobility", "spiritoftheelderlizard", "thebrutalizer");
		database[67].setAsNeeded("theblackcleaver", "locketoftheironsolari", "randuinsomen", "bladeoftheruinedking");

		//Poppy
		database[68] = new BuildInfo();
		database[68].setStart("yellowtrinket", "huntersmachete", "healthpotion");
		database[68].setRush("trinityforce", "spiritoftheelderlizard", "bootsofmobility");
		database[68].setAsNeeded("ravenoushydra", "hextechgunblade", "randuinsomen", "thebloodthirster");

		//Quinn
		database[69] = new BuildInfo();
		database[69].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[69].setRush("spiritoftheelderlizard", "bootsofmobility", "bladeoftheruinedking");
		database[69].setAsNeeded("frozenmallet", "lastwhisper", "mercurialscimitar", "thebloodthirster");

		//Rammus
		database[70] = new BuildInfo();
		database[70].setStart("yellowtrinket", "huntersmachete", "healthpotion");
		database[70].setRush("spiritoftheancientgolem", "ninjatabi", "sunfirecape");
		database[70].setAsNeeded("bansheesveil", "randuinsomen", "thornmail");

		//Renekton
		database[71] = new BuildInfo();
		database[71].setStart("yellowtrinket", "huntersmachete", "healthpotion");
		database[71].setRush("spiritoftheelderlizard", "bootsofmobility", "sunfirecape");
		database[71].setAsNeeded("spiritvisage", "randuinsomen", "warmogsarmor", "mawofmalmortius", "thornmail");

		//Rengar
		database[72] = new BuildInfo();
		database[72].setStart("yellowtrinket", "huntersmachete", "healthpotion");
		database[72].setRush("mercurytreads", "ravenoushydra", "bonetoothnecklace");
		database[72].setAsNeeded("lastwhisper", "randuinsomen", "mawofmalmortius", "spiritvisage", "guardianangel");

		//Riven
		database[73] = new BuildInfo();
		database[73].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[73].setRush("thebrutalizer", "spiritoftheelderlizard", "mercurytreads");
		database[73].setAsNeeded("ravenoushydra", "lastwhisper", "guardianangel", "theblackcleaver");

		//Rumble
		database[74] = new BuildInfo();
		database[74].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[74].setRush("spiritofthespectralwraith", "sorcerersshoes", "zhonyashourglass");
		database[74].setAsNeeded("abyssalscepter", "rabadonsdeathcap", "liandrystorment", "randuinsomen", "rylaiscrystalscepter");

		//Ryze
		database[75] = new BuildInfo();
		database[75].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[75].setRush("spiritofthespectralwraith", "sorcerersshoes", "archangelsstaff");
		database[75].setAsNeeded("athenesunholygrail", "abyssalsscepter", "zhonyashourglass", "randuinsomen", "iceborngauntlet");

		//Sejuani
		database[76] = new BuildInfo();
		database[76].setStart("yellowtrinket", "huntersmachete", "healthpotion");
		database[76].setRush("spiritoftheancientgolem", "ninjatabi", "liandrystorment", "randuinsomen");
		database[76].setAsNeeded("spiritvisage", "sunfirecape", "guardianangel", "locketoftheironsolari", "frozenheart");

		//Shaco
		database[77] = new BuildInfo();
		database[77].setStart("redtrinket", "doransblade");
		database[77].setRush("doransblade", "berserkergreaves", "statikkshiv");
		database[77].setAsNeeded("bladeoftheruinedking", "infinityedge", "lastwhisper", "phantomdancer");
		
		//Shen
		database[78] = new BuildInfo();
		database[78].setStart("yellowtrinket", "huntersmachete", "healthpotion");
		database[78].setRush("madredsrazors", "ninjatabi", "sunfirecape");
		database[78].setAsNeeded("warmogsarmor", "witsend", "randuinsomen", "bladeoftheruinedking");

		//Shyvana
		database[79] = new BuildInfo();
		database[79].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[79].setRush("ninjatabi", "spiritoftheancientgolem", "bladeoftheruinedking");
		database[79].setAsNeeded("sunfirecape", "randuinsomen", "locketoftheironsolari", "trinityforce", "spiritvisage");

		//Singed
		database[80] = new BuildInfo();
		database[80].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[80].setRush("ninjatabi", "spiritoftheancientgolem", "rylaiscrystalscepter");
		database[80].setAsNeeded("thornmail", "bansheesveil", "liandrystorment", "randuinsomen", "abyssalscepter");

		//Sion
		database[81] = new BuildInfo();
		database[81].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[81].setRush("avariceblade", "berserkergreaves", "vampiricscepter", "ravenoushydra");
		database[81].setAsNeeded("warmogsarmor", "infinityedge", "randuinsomen", "atmasimpaler", "zephyr");

		//Sivir
		database[82] = new BuildInfo();
		database[82].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[82].setRush("berserkergreaves", "wriggleslantern");
		database[82].setAsNeeded("infinityedge", "phantomdancer", "thebloodthirster", "theblackcleaver");

		//Skarner
		database[83] = new BuildInfo();
		database[83].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[83].setRush("spiritoftheancientgolem", "bootsofmobility", "iceborngauntlet");
		database[83].setAsNeeded("sunfirecape", "witsend", "randuinsomen", "frozenheart", "trinityforce");

		//Sona
		database[84] = new BuildInfo();
		
		//Soraka
		database[85] = new BuildInfo();
		database[85].setStart("yellowtrinket", "doransring", "healthpotion");
		database[85].setRush("tearofthegoddess", "mercurytreads", "archangelsstaff");
		database[85].setAsNeeded("bansheesveil", "locketoftheironsolari", "mikaelscrucible");

		//Swain
		database[86] = new BuildInfo();

		//Syndra
		database[87] = new BuildInfo();
		database[87].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[87].setRush("spiritstone", "sorcerersshoes", "athenesunholygrail");
		database[87].setAsNeeded("spiritofthespectralwraith", "rabadonsdeathcap", "zhonyashourglass", "liandrystorment", "voidstaff");

		//Talon
		database[88] = new BuildInfo();
		database[88].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[88].setRush("spiritoftheelderlizard", "bootsofmobility", "tearofthegoddess", "vampiricscepter");
		database[88].setAsNeeded("ravenoushydra", "theblackcleaver", "thebloodthirster", "spiritvisage", "lastwhisper");

		//Taric
		database[89] = new BuildInfo();
		database[89].setStart("redtrinket", "huntersmachete", "healthpotion");
		database[89].setRush("spiritoftheancientgolem", "ninjatabi", "manamune");
		database[89].setAsNeeded("bilgewatercutlass", "hextechgunblade", "zhonyashourglass", "frozenheart", "locketoftheironsolari");
		
		//Teemo
		database[90] = new BuildInfo();
		database[90].setStart("yellowtrinket", "huntersmachete", "healthpotion");
		database[90].setRush("wriggleslantern", "sorcerersshoes", "nashorstooth");
		database[90].setAsNeeded("runaanashurricane", "rabadonsdeathcap", "liandrystorment", "lichbane");
		
		//Thresh
		database[91] = new BuildInfo();

		//Tristana
		database[92] = new BuildInfo();

		//Trundle
		database[93] = new BuildInfo();

		//Tryndamere
		database[94] = new BuildInfo();

		//Twisted Fate
		database[95] = new BuildInfo();

		//Twitch
		database[96] = new BuildInfo();

		//Udyr
		database[97] = new BuildInfo();

		//Urgot
		database[98] = new BuildInfo();

		//Varus
		database[99] = new BuildInfo();

		//Vayne
		database[100] = new BuildInfo();

		//Veigar
		database[101] = new BuildInfo();

		//Vel'Koz
		database[102] = new BuildInfo();

		//Vi
		database[103] = new BuildInfo();

		//Viktor
		database[104] = new BuildInfo();

		//Vladimir
		database[105] = new BuildInfo();

		//Volibear
		database[106] = new BuildInfo();

		//Warwick
		database[107] = new BuildInfo();

		//Wukong
		database[108] = new BuildInfo();

		//Xerath
		database[109] = new BuildInfo();

		//Xin Zhao
		database[110] = new BuildInfo();

		//Yasuo
		database[111] = new BuildInfo();

		//Yorick
		database[112] = new BuildInfo();

		//Zac
		database[113] = new BuildInfo();

		//Zed
		database[114] = new BuildInfo();

		//Ziggs
		database[115] = new BuildInfo();

		//Zilean
		database[116] = new BuildInfo();

		//Zyra
		database[117] = new BuildInfo();		
	}
	
	public BuildInfo[] getDatabase(){
		return database;
	}
}
