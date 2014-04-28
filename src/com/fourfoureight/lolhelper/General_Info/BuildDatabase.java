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
