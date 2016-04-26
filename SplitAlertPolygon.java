package groupProject;

public class SplitAlertPolygon {

	public static void main(String[] args){
		
	
	Alert alert = new Alert();
	
	Alert.setPolygon("38.56,-87.23 38.53,-87.29 38.55,-87.36 38.54,-87.44 38.51,-87.44 38.5,-87.29 38.52,-87.22 38.56,-87.23");
	
	String parts[] = Alert.getPolygon().split(" ");
	String part1 = parts[0];
	String part2 = parts[1];
	String part3 = parts[2];
	String part4 = parts[3];
	String part5 = parts[4];
	String part6 = parts[5];
	String part7 = parts[6];
	String part8 = parts[7];
	
	System.out.println(part1);
	System.out.println(part2);
	System.out.println(part3);
	System.out.println(part4);
	System.out.println(part5);
	System.out.println(part6);
	System.out.println(part7);
	System.out.println(part8);
	
	/*
	String part3 = parts[2];
	String part4 = parts[3];
	String part5 = parts[4];
	String part6 = parts[5];
	String part7 = parts[6];
	String part8 = parts[7];
	String part9 = parts[8];
	*/
	
	
	}
}
