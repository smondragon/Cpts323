package project1;

public class Main {

	public static void main(String[] args) throws Exception {
		ReadRssFeed feed = new ReadRssFeed();
		feed.connect();
		feed.readFeeds();
	
		new Main(); // will run the other code
		
	}
	ReadRssFeed feed = new ReadRssFeed();
	
	public Main() {
	
		try {
			feed.connect();
			feed.readFeeds();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//readRssFeed.setUrl("http://alerts.weather.gov/cap/us.php?x=0");
	}
}
