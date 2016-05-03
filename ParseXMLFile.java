package groupProject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import gov.nasa.worldwindx.examples.ApplicationTemplate;
import groupProject.Balloons.AppFrame;

// Last updated 4/26/2016ish

public class ParseXMLFile
{ 
	// Following code mostly from http://theoryapp.com/parse-xml-using-dom-in-java/
   /* public static void main(String[] args)
    {*/
	
	static List<Alert> parseXML(String url){
		List<Alert> alerts = new ArrayList<Alert>();
        String url2 = "http://alerts.weather.gov/cap/il.php?x=1";   
        try
        {
        	
        	
        	
            DocumentBuilderFactory f = 
                    DocumentBuilderFactory.newInstance();
            DocumentBuilder b = f.newDocumentBuilder();
            Document doc = b.parse(url);
 
            doc.getDocumentElement().normalize();
            //System.out.println ("Root element: " + 
                       // doc.getDocumentElement().getNodeName());
       
            // loop through each item
            NodeList items = doc.getElementsByTagName("entry");
            for (int i = 0; i < items.getLength(); i++)
            {
                Node n = items.item(i);
                if (n.getNodeType() != Node.ELEMENT_NODE)
                    continue;
                Element e = (Element) n;
 
                Alert alert = new Alert();
                
                // get the "title elem" in this item (only one)
                NodeList titleList = 
                                e.getElementsByTagName("title");
                Element titleElem = (Element) titleList.item(0);
                
                // get the "text node" in the title (only one)
                Node titleNode = titleElem.getChildNodes().item(0);

                
                // makes alert's type the title
                alert.setType(titleNode.getNodeValue());
                
                // get and print the latitude/longitude values
                NodeList polygonList = 
                		e.getElementsByTagName("cap:polygon");
                Element polygonElem = (Element) polygonList.item(0);
                
             
                // makes alert's polygon region this
                alert.setPolygon(polygonElem.getChildNodes().item(0).getNodeValue());
                
                // get and print the severity
                
                NodeList severityList = 
                		e.getElementsByTagName("cap:severity");
                Element severityElem = (Element) severityList.item(0);
                
  
                alert.setSeverity(severityElem.getChildNodes().item(0).getNodeValue());
                
                NodeList effectiveList = 
                		e.getElementsByTagName("cap:effective");
                Element effectiveElem = (Element) effectiveList.item(0);
                

                alert.setEffective(effectiveElem.getChildNodes().item(0).getNodeValue());
                
                NodeList expiresList = 
                		e.getElementsByTagName("cap:expires");
                Element expiresElem = (Element) expiresList.item(0);
                

                alert.setExpires(expiresElem.getChildNodes().item(0).getNodeValue());
                
                
                NodeList sumList = 
                		e.getElementsByTagName("summary");
                Element sumElem = (Element) sumList.item(0);
                
                alert.setSummary(sumElem.getChildNodes().item(0).getNodeValue());
                
                // something wrong with the below?
                //System.out.println(descElem.getChildNodes().item(0).getNodeValue());
               
                /*
                // get and print the urgency
                
                NodeList urgencyList = 
                		e.getElementsByTagName("cap:urgency");
                Element urgencyElem = (Element) urgencyList.item(0);
                
                System.out.println(urgencyElem.getChildNodes().item(0).getNodeValue());
                */
                
                System.out.println("THISISANALERT");
                System.out.println("type - " + alert.getType());
                System.out.println("polygons - " + alert.getPolygon());
                System.out.println("severity - " + alert.getSeverity());
                System.out.println("effective - " + alert.getEffective());
                System.out.println("expires - " + alert.getExpires());
                System.out.println("summary - " + alert.getSummary());
                
                alerts.add(alert);
            }
         
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return alerts;
    }

}
