package groupProject;

// Last updated 4/28/2016 - 12:03 a.m.

public class Alert {
	
	private String type;
	private String severity;
	private String polygon;	
	private String effective;
	private String expires;
	private String description;
	private String summary;
	private double point1;
	private double point2;
	
	public String getType() {
		return type;
	}
	public void setType(String inputType) {
		type = inputType;
	}
	public String getPolygon() {
		return polygon;
	}
	public void setPolygon(String inputPolygon) {
		polygon = inputPolygon;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String inputSeverity) {
		severity = inputSeverity;
	}
	public String getEffective() {
		return effective;
	}
	public void setEffective(String inputEffective) {
		effective = inputEffective;
	}
	public String getExpires() {
		return expires;
	}
	public void setExpires(String inputExpires) {
		expires = inputExpires;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String inputDescription) {
		description = inputDescription;
	}
	
	public String getSummary() {
		return summary;
	}
	public void setSummary(String inputSummary) {
		summary = inputSummary;
	}
	public double getPoint1() {
		return point1;
	}
	public void setPoint1(double point1) {
		this.point1 = point1;
	}
	public double getPoint2() {
		return point2;
	}
	public void setPoint2(double point2) {
		this.point2 = point2;
	}

	
}
