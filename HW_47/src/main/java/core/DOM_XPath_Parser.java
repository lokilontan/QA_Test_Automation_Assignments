package core;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;


public class DOM_XPath_Parser {
	public static void main(String[] args) throws Exception, ParserConfigurationException {
		String xmlurl = "http://alex.academy/ebay.xml";
		
		DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
		DocumentBuilder b = f.newDocumentBuilder();
		Document doc = b.parse(xmlurl);
		doc.getDocumentElement().normalize();
		
		XPath x = XPathFactory.newInstance().newXPath();
		
		String element = x.compile("//server/orig-kw").evaluate(doc);
		System.out.println("Key Word: " + element);
		
		element = x.compile("//server/engine").evaluate(doc);
		System.out.println("Engine: " + element);
		
		element = x.compile("//server/kadu-version").evaluate(doc);
		System.out.println("Version: " + element);
	
		element = x.compile("//response-time").evaluate(doc);
		System.out.println("Response Time: " + element);
		
		element = x.compile("//deals[@count='10']/@count").evaluate(doc);

		
		System.out.println("Number of deals: " + element);
	}
}
