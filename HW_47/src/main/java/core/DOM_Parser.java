package core;

import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class DOM_Parser {
public static void main(String[] args) throws Exception, ParserConfigurationException {
	String xml = "http://alex.academy/ebay.xml";
	DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
	DocumentBuilder b = f.newDocumentBuilder();
	Document doc = b.parse(xml);
	doc.getDocumentElement().normalize();
	NodeList n1 = doc.getElementsByTagName("kadu-response");
	for (int i=0; i<n1.getLength(); i++) {Node n = n1.item(i);
	if(n.getNodeType() == Node.ELEMENT_NODE) {Element e = (Element) n;
	System.out.println("Kew Word: " + e.getElementsByTagName("orig-kw").item(0).getChildNodes().item(0).getNodeValue());
	System.out.println("Engine: " + e.getElementsByTagName("engine").item(0).getChildNodes().item(0).getNodeValue());
	System.out.println("Version: " + e.getElementsByTagName("kadu-version").item(0).getChildNodes().item(0).getNodeValue());
	System.out.println("Response Time: " + e.getElementsByTagName("response-time").item(0).getChildNodes().item(0).getNodeValue());
	}}
	NodeList nList = doc.getElementsByTagName("deals");
	Node n = nList.item(0);
	if (n.getNodeType() == Node.ELEMENT_NODE) {Element eElement = (Element) n; 
	System.out.println("Number of Deals: " + eElement.getAttribute("count"));}
	
}
}
