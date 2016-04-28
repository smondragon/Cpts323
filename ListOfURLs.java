package groupProject;

import java.util.ArrayList;
import java.util.List;

// Last updated 4/28/2016, 12:03 a.m.

public class ListOfURLs {

	public String url;
	public String error = "Not a U.S. state.";
	
	public String getUrl() {
		return url;
	}

	String urlList(String inputURL) {
		
		String alabama = "http://alerts.weather.gov/cap/al.php?x=1";
		String alaska = "http://alerts.weather.gov/cap/ak.php?x=1";
		String arizona = "http://alerts.weather.gov/cap/az.php?x=1";
		String arkansas = "http://alerts.weather.gov/cap/ar.php?x=1";
		String california = "http://alerts.weather.gov/cap/ca.php?x=1";
		String colorado = "http://alerts.weather.gov/cap/co.php?x=1";
		String connecticut = "http://alerts.weather.gov/cap/ct.php?x=1";
		String delaware = "http://alerts.weather.gov/cap/de.php?x=1";
		String florida = "http://alerts.weather.gov/cap/fl.php?x=1";
		String georgia = "http://alerts.weather.gov/cap/ga.php?x=1";
		String hawaii = "http://alerts.weather.gov/cap/hi.php?x=1";
		String idaho = "http://alerts.weather.gov/cap/id.php?x=1";
		String illinois = "http://alerts.weather.gov/cap/il.php?x=1";
		String indiana = "http://alerts.weather.gov/cap/in.php?x=1";
		String iowa = "http://alerts.weather.gov/cap/ia.php?x=1";
		String kansas = "http://alerts.weather.gov/cap/ks.php?x=1";
		String kentucky = "http://alerts.weather.gov/cap/ky.php?x=1";
		String louisiana = "http://alerts.weather.gov/cap/la.php?x=1";
		String maine = "http://alerts.weather.gov/cap/me.php?x=1";
		String maryland = "http://alerts.weather.gov/cap/md.php?x=1";
		String massachusetts = "http://alerts.weather.gov/cap/ma.php?x=1";
		String michigan = "http://alerts.weather.gov/cap/mi.php?x=1";
		String minnesota = "http://alerts.weather.gov/cap/mn.php?x=1";
		String mississippi = "http://alerts.weather.gov/cap/ms.php?x=1";
		String missouri = "http://alerts.weather.gov/cap/mo.php?x=1";
		String montana = "http://alerts.weather.gov/cap/mt.php?x=1";
		String nevada = "http://alerts.weather.gov/cap/nv.php?x=1";
		String nebraska = "http://alerts.weather.gov/cap/ne.php?x=1";
		String newHampshire = "http://alerts.weather.gov/cap/nh.php?x=1";
		String newJersey = "http://alerts.weather.gov/cap/nj.php?x=1";
		String newMexico = "http://alerts.weather.gov/cap/nm.php?x=1";
		String newYork = "http://alerts.weather.gov/cap/ny.php?x=1";
		String northCarolina = "http://alerts.weather.gov/cap/nc.php?x=1";
		String northDakota = "http://alerts.weather.gov/cap/nd.php?x=1";
		String ohio = "http://alerts.weather.gov/cap/oh.php?x=1";
		String oklahoma = "http://alerts.weather.gov/cap/ok.php?x=1";
		String oregon = "http://alerts.weather.gov/cap/or.php?x=1";
		String pennsylvania = "http://alerts.weather.gov/cap/pa.php?x=1";
		String rhodeIsland = "http://alerts.weather.gov/cap/ri.php?x=1";
		String southCarolina = "http://alerts.weather.gov/cap/sc.php?x=1";
		String southDakota = "http://alerts.weather.gov/cap/sd.php?x=1";
		String tennessee = "http://alerts.weather.gov/cap/tn.php?x=1";
		String texas = "http://alerts.weather.gov/cap/tx.php?x=1";
		String utah = "http://alerts.weather.gov/cap/ut.php?x=1";
		String vermont = "http://alerts.weather.gov/cap/vt.php?x=1";
		String virginia = "http://alerts.weather.gov/cap/va.php?x=1";
		String washington = "http://alerts.weather.gov/cap/wa.php?x=1";
		String westVirginia = "http://alerts.weather.gov/cap/wv.php?x=1";
		String wisconsin = "http://alerts.weather.gov/cap/wi.php?x=1";
		String wyoming = "http://alerts.weather.gov/cap/wy.php?x=1";
		
		/*List<String> urls = new ArrayList<String>(50);
		
		urls.add(alabama);
		urls.add(alaska);
		urls.add(arizona);
		urls.add(arkansas);
		urls.add(california);
		urls.add(colorado);
		urls.add(connecticut);
		urls.add(delaware);
		urls.add(florida);
		urls.add(georgia);
		urls.add(hawaii);
		urls.add(idaho);
		urls.add(illinois);
		urls.add(indiana);
		urls.add(iowa);
		urls.add(kansas);
		urls.add(kentucky);
		urls.add(louisiana);
		urls.add(maine);
		urls.add(maryland);
		urls.add(massachusetts);
		urls.add(michigan);
		urls.add(minnesota);
		urls.add(mississippi);
		urls.add(missouri);
		urls.add(montana);
		urls.add(nevada);
		urls.add(nebraska);
		urls.add(newHampshire);
		urls.add(newJersey);
		urls.add(newMexico);
		urls.add(newYork);
		urls.add(northCarolina);
		urls.add(northDakota);
		urls.add(ohio);
		urls.add(oklahoma);
		urls.add(oregon);
		urls.add(pennsylvania);
		urls.add(rhodeIsland);
		urls.add(southCarolina);
		urls.add(southDakota);
		urls.add(tennessee);
		urls.add(texas);
		urls.add(utah);
		urls.add(vermont);
		urls.add(virginia);
		urls.add(washington);
		urls.add(westVirginia);
		urls.add(wisconsin);
		urls.add(wyoming);
		*/
		
		if(inputURL=="alabama"||inputURL=="Alabama")
		{
			return alabama;
		}
		if(inputURL=="alaska"||inputURL=="Alaska")
		{
			return alaska;
		}
		if(inputURL=="arizona"||inputURL=="Arizona")
		{
			return arizona;
		}
		if(inputURL=="arkansas"||inputURL=="Arkansas")
		{
			return arkansas;
		}
		if(inputURL=="california"||inputURL=="California")
		{
			return california;
		}
		if(inputURL=="colorado"||inputURL=="Colorado")
		{
			return colorado;
		}
		if(inputURL=="connecticut"||inputURL=="Connecticut")
		{
			return connecticut;
		}
		if(inputURL=="delaware"||inputURL=="Delaware")
		{
			return delaware;
		}
		if(inputURL=="florida"||inputURL=="Florida")
		{
			return florida;
		}
		if(inputURL=="georgia"||inputURL=="Georgia")
		{
			return georgia;
		}
		if(inputURL=="hawaii"||inputURL=="Hawaii")
		{
			return hawaii;
		}
		if(inputURL=="idaho"||inputURL=="Idaho")
		{
			return arkansas;
		}
		if(inputURL=="illinois"||inputURL=="Illinois")
		{
			return illinois;
		}
		if(inputURL=="indiana"||inputURL=="Indiana")
		{
			return indiana;
		}
		if(inputURL=="iowa"||inputURL=="Iowa")
		{
			return iowa;
		}
		if(inputURL=="kansas"||inputURL=="Kansas")
		{
			return kansas;
		}
		if(inputURL=="kentucky"||inputURL=="Kentucky")
		{
			return kentucky;
		}
		if(inputURL=="louisiana"||inputURL=="Louisiana")
		{
			return louisiana;
		}
		if(inputURL=="maine"||inputURL=="Maine")
		{
			return maine;
		}
		if(inputURL=="maryland"||inputURL=="Maryland")
		{
			return maryland;
		}
		if(inputURL=="massachusetts"||inputURL=="Massachusetts")
		{
			return massachusetts;
		}
		if(inputURL=="michigan"||inputURL=="Michigan")
		{
			return michigan;
		}
		if(inputURL=="minnesota"||inputURL=="Minnesota")
		{
			return minnesota;
		}
		if(inputURL=="mississippi"||inputURL=="Mississippi")
		{
			return mississippi;
		}
		if(inputURL=="missouri"||inputURL=="Missouri")
		{
			return missouri;
		}
		if(inputURL=="montana"||inputURL=="Montana")
		{
			return montana;
		}
		if(inputURL=="nevada"||inputURL=="Nevada")
		{
			return nevada;
		}
		if(inputURL=="nebraska"||inputURL=="Nebraska")
		{
			return nebraska;
		}
		if(inputURL=="new hampshire"||inputURL=="New Hampshire")
		{
			return newHampshire;
		}
		if(inputURL=="new jersey"||inputURL=="New Jersey")
		{
			return newJersey;
		}
		if(inputURL=="new mexico"||inputURL=="New Mexico")
		{
			return newMexico;
		}
		if(inputURL=="new york"||inputURL=="New York")
		{
			return newYork;
		}
		if(inputURL=="north carolina"||inputURL=="North Carolina")
		{
			return northCarolina;
		}
		if(inputURL=="north dakota"||inputURL=="North Dakota")
		{
			return northDakota;
		}
		if(inputURL=="ohio"||inputURL=="Ohio")
		{
			return ohio;
		}
		if(inputURL=="oklahoma"||inputURL=="Oklahoma")
		{
			return oklahoma;
		}
		if(inputURL=="oregon"||inputURL=="Oregon")
		{
			return oregon;
		}
		if(inputURL=="pennsylvania"||inputURL=="Pennsylvania")
		{
			return pennsylvania;
		}
		if(inputURL=="rhode island"||inputURL=="Rhode Island")
		{
			return rhodeIsland;
		}
		if(inputURL=="south carolina"||inputURL=="South Carolina")
		{
			return southCarolina;
		}
		if(inputURL=="south dakota"||inputURL=="South Dakota")
		{
			return southDakota;
		}
		if(inputURL=="tennessee"||inputURL=="Tennessee")
		{
			return tennessee;
		}
		if(inputURL=="texas"||inputURL=="Texas")
		{
			return texas;
		}
		if(inputURL=="utah"||inputURL=="Utah")
		{
			return utah;
		}
		if(inputURL=="vermont"||inputURL=="Vermont")
		{
			return vermont;
		}
		if(inputURL=="virginia"||inputURL=="Virginia")
		{
			return virginia;
		}
		if(inputURL=="washington"||inputURL=="Washington")
		{
			return washington;
		}
		if(inputURL=="west virginia"||inputURL=="West Virginia")
		{
			return westVirginia;
		}
		if(inputURL=="wisconsin"||inputURL=="Wisconsin")
		{
			return wisconsin;
		}
		if(inputURL=="wyoming"||inputURL=="Wyoming")
		{
			return wyoming;
		}
		else
			return error;
	}
}
