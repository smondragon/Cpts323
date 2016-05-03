package project1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

public class ReadRssFeed {
	private URL url;
	private HttpURLConnection httpconnection;
	SyndFeedInput input;
	SyndFeed feed;
	List entries;
	Iterator itEntries;
	
	public void connect() throws Exception{
		url = new URL("http://alerts.weather.gov/cap/us.php?x=0");
		httpconnection = (HttpURLConnection)url.openConnection();
	}
	
	public void readFeeds() throws Exception, FeedException, IOException{
		input = new SyndFeedInput();
		feed = input.build(new XmlReader(httpconnection));
		entries = feed.getEntries();
		itEntries = entries.iterator();
		
		while(itEntries.hasNext()){
			SyndEntry entry = (SyndEntry) itEntries.next();
			/*System.out.println("Title : " + entry.getTitle());
			System.out.println("Link: " + entry.getLink());
			System.out.println("Description: " + entry.getDescription());
			*/
			System.out.println(entry.getTitle());
		}
	}
	
	
}
