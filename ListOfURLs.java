package groupProject;

import java.util.ArrayList;
import java.util.List;

// Last updated 4/29/2016, 2:29 a.m.

public class ListOfURLs {

	boolean checkAlabama = false;
	boolean checkAlaska = false;
	boolean checkArizona = false;
	boolean checkArkansas = false;
	boolean checkCalifornia = false;
	boolean checkColorado = false;
	boolean checkConnecticut = false;
	boolean checkDelaware = false;
	boolean checkFlorida = false;
	boolean checkGeorgia = false;
	boolean checkHawaii = false;
	boolean checkIdaho = false;
	boolean checkIllinois = false;
	boolean checkIndiana = false;
	boolean checkIowa = false;
	boolean checkKansas = false;
	boolean checkKentucky = false;
	boolean checkLouisiana = false;
	boolean checkMaine = false;
	boolean checkMaryland = false;
	boolean checkMassachusetts = false;
	boolean checkMichigan = false;
	boolean checkMinnesota = false;
	boolean checkMississippi = false;
	boolean checkMissouri = false;
	boolean checkMontana = false;
	boolean checkNebraska = false;
	boolean checkNevada = false;
	boolean checkNewHampshire = false;
	boolean checkNewJersey = false;
	boolean checkNewMexico = false;
	boolean checkNewYork = false;
	boolean checkNorthCarolina = false;
	boolean checkNorthDakota = false;
	boolean checkOhio = false;
	boolean checkOklahoma = false;
	boolean checkOregon = false;
	boolean checkPennsylvania = false;
	boolean checkRhodeIsland = false;
	boolean checkSouthCarolina = false;
	boolean checkSouthDakota = false;
	boolean checkTennessee = false;
	boolean checkTexas = false;
	boolean checkUtah = false;
	boolean checkVermont = false;
	boolean checkVirginia = false;
	boolean checkWashington = false;
	boolean checkWestVirginia = false;
	boolean checkWisconsin = false;
	boolean checkWyoming = false;
			
	final String alabama = "http://alerts.weather.gov/cap/al.php?x=1";
	final String alaska = "http://alerts.weather.gov/cap/ak.php?x=1";
	final String arizona = "http://alerts.weather.gov/cap/az.php?x=1";
	final String arkansas = "http://alerts.weather.gov/cap/ar.php?x=1";
	final String california = "http://alerts.weather.gov/cap/ca.php?x=1";
	final String colorado = "http://alerts.weather.gov/cap/co.php?x=1";
	final String connecticut = "http://alerts.weather.gov/cap/ct.php?x=1";
	final String delaware = "http://alerts.weather.gov/cap/de.php?x=1";
	final String florida = "http://alerts.weather.gov/cap/fl.php?x=1";
	final String georgia = "http://alerts.weather.gov/cap/ga.php?x=1";
	final String hawaii = "http://alerts.weather.gov/cap/hi.php?x=1";
	final String idaho = "http://alerts.weather.gov/cap/id.php?x=1";
	final String illinois = "http://alerts.weather.gov/cap/il.php?x=1";
	final String indiana = "http://alerts.weather.gov/cap/in.php?x=1";
	final String iowa = "http://alerts.weather.gov/cap/ia.php?x=1";
	final String kansas = "http://alerts.weather.gov/cap/ks.php?x=1";
	final String kentucky = "http://alerts.weather.gov/cap/ky.php?x=1";
	final String louisiana = "http://alerts.weather.gov/cap/la.php?x=1";
	final String maine = "http://alerts.weather.gov/cap/me.php?x=1";
	final String maryland = "http://alerts.weather.gov/cap/md.php?x=1";
	final String massachusetts = "http://alerts.weather.gov/cap/ma.php?x=1";
	final String michigan = "http://alerts.weather.gov/cap/mi.php?x=1";
	final String minnesota = "http://alerts.weather.gov/cap/mn.php?x=1";
	final String mississippi = "http://alerts.weather.gov/cap/ms.php?x=1";
	final String missouri = "http://alerts.weather.gov/cap/mo.php?x=1";
	final String montana = "http://alerts.weather.gov/cap/mt.php?x=1";
	final String nebraska = "http://alerts.weather.gov/cap/ne.php?x=1";
	final String nevada = "http://alerts.weather.gov/cap/nv.php?x=1";
	final String newHampshire = "http://alerts.weather.gov/cap/nh.php?x=1";
	final String newJersey = "http://alerts.weather.gov/cap/nj.php?x=1";
	final String newMexico = "http://alerts.weather.gov/cap/nm.php?x=1";
	final String newYork = "http://alerts.weather.gov/cap/ny.php?x=1";
	final String northCarolina = "http://alerts.weather.gov/cap/nc.php?x=1";
	final String northDakota = "http://alerts.weather.gov/cap/nd.php?x=1";
	final String ohio = "http://alerts.weather.gov/cap/oh.php?x=1";
	final String oklahoma = "http://alerts.weather.gov/cap/ok.php?x=1";
	final String oregon = "http://alerts.weather.gov/cap/or.php?x=1";
	final String pennsylvania = "http://alerts.weather.gov/cap/pa.php?x=1";
	final String rhodeIsland = "http://alerts.weather.gov/cap/ri.php?x=1";
	final String southCarolina = "http://alerts.weather.gov/cap/sc.php?x=1";
	final String southDakota = "http://alerts.weather.gov/cap/sd.php?x=1";
	final String tennessee = "http://alerts.weather.gov/cap/tn.php?x=1";
	final String texas = "http://alerts.weather.gov/cap/tx.php?x=1";
	final String utah = "http://alerts.weather.gov/cap/ut.php?x=1";
	final String vermont = "http://alerts.weather.gov/cap/vt.php?x=1";
	final String virginia = "http://alerts.weather.gov/cap/va.php?x=1";
	final String washington = "http://alerts.weather.gov/cap/wa.php?x=1";
	final String westVirginia = "http://alerts.weather.gov/cap/wv.php?x=1";
	final String wisconsin = "http://alerts.weather.gov/cap/wi.php?x=1";
	final String wyoming = "http://alerts.weather.gov/cap/wy.php?x=1";
	
	List<String> urlList(){
		List<String> urls = new ArrayList<String>(50);
	
		if(checkAlabama==true)
		{
			urls.add(alabama);
		}
		if(checkAlaska==true)
		{
			urls.add(alaska);
		}
		if(checkArizona==true)
		{
			urls.add(arizona);
		}
		if(checkArkansas==true)
		{
			urls.add(arkansas);
		}
		if(checkCalifornia==true)
		{
			urls.add(california);
		}
		if(checkColorado==true)
		{
			urls.add(colorado);
		}
		if(checkConnecticut==true)
		{
			urls.add(connecticut);
		}
		if(checkDelaware==true)
		{
			urls.add(delaware);
		}
		if(checkFlorida==true)
		{
			urls.add(florida);
		}
		if(checkGeorgia==true)
		{
			urls.add(georgia);
		}
		if(checkHawaii==true)
		{
			urls.add(hawaii);
		}
		if(checkIdaho==true)
		{
			urls.add(idaho);
		}
		if(checkIllinois==true)
		{
			urls.add(illinois);
		}
		if(checkIndiana==true)
		{
			urls.add(indiana);
		}
		if(checkIowa==true)
		{
			urls.add(iowa);
		}
		if(checkKansas==true)
		{
			urls.add(kansas);
		}
		if(checkKentucky==true)
		{
			urls.add(kentucky);
		}
		if(checkLouisiana==true)
		{
			urls.add(louisiana);
		}
		if(checkMaine==true)
		{
			urls.add(maine);
		}
		if(checkMaryland==true)
		{
			urls.add(maryland);
		}
		if(checkMassachusetts==true)
		{
			urls.add(massachusetts);
		}
		if(checkMichigan==true)
		{
			urls.add(michigan);
		}
		if(checkMinnesota==true)
		{
			urls.add(minnesota);
		}
		if(checkMississippi==true)
		{
			urls.add(mississippi);
		}
		if(checkMissouri==true)
		{
			urls.add(missouri);
		}
		if(checkMontana==true)
		{
			urls.add(montana);
		}
		if(checkNevada==true)
		{
			urls.add(nevada);
		}
		if(checkNebraska==true)
		{
			urls.add(nebraska);
		}
		if(checkNewHampshire==true)
		{
			urls.add(newHampshire);
		}
		if(checkNewJersey==true)
		{
			urls.add(newJersey);
		}
		if(checkNewMexico==true)
		{
			urls.add(newMexico);
		}
		if(checkNewYork==true)
		{
			urls.add(newYork);
		}
		if(checkNorthCarolina==true)
		{
			urls.add(northCarolina);
		}
		if(checkNorthDakota==true)
		{
			urls.add(northDakota);
		}
		if(checkOhio==true)
		{
			urls.add(ohio);
		}
		if(checkOklahoma==true)
		{
			urls.add(oklahoma);
		}
		if(checkOregon==true)
		{
			urls.add(oregon);
		}
		if(checkPennsylvania==true)
		{
			urls.add(pennsylvania);
		}
		if(checkRhodeIsland==true)
		{
			urls.add(rhodeIsland);
		}
		if(checkSouthCarolina==true)
		{
			urls.add(southCarolina);
		}
		if(checkSouthDakota==true)
		{
			urls.add(southDakota);
		}
		if(checkTennessee==true)
		{
			urls.add(tennessee);
		}
		if(checkTexas==true)
		{
			urls.add(texas);
		}
		if(checkUtah==true)
		{
			urls.add(utah);
		}
		if(checkVermont==true)
		{
			urls.add(vermont);
		}
		if(checkVirginia==true)
		{
			urls.add(virginia);
		}
		if(checkWashington==true)
		{
			urls.add(washington);
		}
		if(checkWestVirginia==true)
		{
			urls.add(westVirginia);	
		}
		if(checkWisconsin==true)
		{
			urls.add(wisconsin);
		}
		if(checkWyoming==true)
		{
			urls.add(wyoming);
		}
		
		return urls;
	}
}
