package net.yeelink.yahooweather;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("http://weather.yahooapis.com/forecastrss?w=2502265&u=c");
			System.out.print(doc.getElementsByTagName("yweather:condition").item(0).getAttributes().getNamedItem("text").getNodeValue());
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WeatherConditions wc = new WeatherConditions();
		System.out.println(wc.getCondition(0));
	}

}
