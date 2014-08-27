package net.yeelink.yahooweather;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("http://weather.yahooapis.com/forecastrss?w=2502265&u=c");
			Node currentCondition = doc.getElementsByTagName("yweather:condition").item(0);
			
			System.out.println("当前天气：" + currentCondition.getAttributes().getNamedItem("text").getNodeValue());
			System.out.println("当前天气：" + WeatherConditions.getCondition(Integer.parseInt(currentCondition.getAttributes().getNamedItem("code").getNodeValue())));
			System.out.println("当前温度：" + currentCondition.getAttributes().getNamedItem("temp").getNodeValue() + "摄氏度");
			System.out.println("发布时间：" + currentCondition.getAttributes().getNamedItem("date").getNodeValue());
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
		
	}

}
