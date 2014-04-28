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
		database[11].setRush("rubysightstone", "liandrystorment", "rylaiscrystalscepter", "sorcerorsshoes");
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
		database[19].setStart("yellowtrinket", "faeriecharm", "stealthward", "healthpotion");
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
		database[23].setRush("rylaiscrystalscepter", "bladeoftheruinedking");
		database[23].setAsNeeded("warmogsarmor", "sunfirecape", "frozenheart", "spiritvisage");
		
		//Galio
		database[24] = new BuildInfo();
		database[24].setStart("yellowtrinket", "ancientcoin", "healthpotion");
		database[24].setRush("chaliceofharmony", "rubysightstone", "mercurystreads");
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
	
	private void buildjung(){
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
	
	public BuildInfo[] getDatabase(){
		return database;
	}
}
