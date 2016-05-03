package groupProject;

import java.util.ArrayList;
import java.util.List;

import gov.nasa.worldwindx.examples.ApplicationTemplate;
import groupProject.Balloons.AppFrame;
//import groupProject.Polygons.AppFrame;

public class testing {

	// THIS WORKS FOR SPLITTING 
	public static void main(String[] args) {
		SplitAlertPolygon split = new SplitAlertPolygon();
		Alert alert = new Alert();
		// Below is dummy data.
		alert.setPolygon("38.5,-87.223");
		split.getPoints(alert.getPolygon(), alert);
		
		System.out.println(alert.getPoint1());
		System.out.println(alert.getPoint2());
			
		
		
	
	}

}
