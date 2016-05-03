package groupProject;

public class SplitAlertPolygon {

	// Splits the alert.Polygon data field into two different points and sets the
	// two points to them.
	public void getPoints(String polygon, Alert alert)
	{
		String parts[] = polygon.split(" ");
		String part1 = parts[0];

		String moreParts[] = part1.split(",");
		
		String more1 = moreParts[0];
		String more2 = moreParts[1];
		
		alert.setPoint1(Double.valueOf(more1));
		alert.setPoint2(Double.valueOf(more2));
			
	}
}
