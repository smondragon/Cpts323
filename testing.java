package groupProject;

import java.util.ArrayList;
import java.util.List;

import gov.nasa.worldwindx.examples.ApplicationTemplate;
import groupProject.Balloons.AppFrame;
//import groupProject.Polygons.AppFrame;

public class testing {

	public static void main(String[] args) {
		
		List<Alert> alerts = new ArrayList<Alert>();
		
		alerts = ParseXMLFile.parseXML("http://alerts.weather.gov/cap/il.php?x=1");
			
		
		
	
	}

}
