package groupProject;

// Last updated 4/28/2016 - 12:03 a.m.

public class Alert {

	private static String type;
	private static String severity;
	private static String polygon;	
	private static String effective;
	private static String expires;
	private static String description;
	
	public static String getType() {
		return type;
	}
	public static void setType(String type) {
		Alert.type = type;
	}
	public static String getPolygon() {
		return polygon;
	}
	public static void setPolygon(String polygon) {
		Alert.polygon = polygon;
	}
	public static String getSeverity() {
		return severity;
	}
	public static void setSeverity(String severity) {
		Alert.severity = severity;
	}
	public static String getEffective() {
		return effective;
	}
	public static void setEffective(String effective) {
		Alert.effective = effective;
	}
	public static String getExpires() {
		return expires;
	}
	public static void setExpires(String expires) {
		Alert.expires = expires;
	}
	public static String getDescription() {
		return description;
	}
	public static void setDescription(String description) {
		Alert.description = description;
	}

	
}
