
package core;
import java.io.*;
import java.net.*;
import javax.xml.stream.*;

public class StAX_Parser {
	public static void main(String[] args) throws XMLStreamException, IOException {
		URL xmlurl = new URL("http://alex.academy/ebay.xml");
		InputStream in = xmlurl.openStream();
		String ok = "orig-kw";
		String eng = "engine";
		String kv = "kadu-version";
		String rt = "response-time";
		String dc = "deals";
		XMLInputFactory f = XMLInputFactory.newInstance();
		XMLStreamReader reader = f.createXMLStreamReader(in);
		int eventType = reader.getEventType();
		while (reader.hasNext()) {eventType=reader.next();
		if (eventType == XMLStreamReader.START_ELEMENT) {
			if (reader.getLocalName() == ok) {System.out.println("Key Word: " + reader.getElementText());}
			if (reader.getLocalName() == eng) {System.out.println("Engine: " + reader.getElementText());}
			if (reader.getLocalName() == kv) {System.out.println("Version: " + reader.getElementText());}
			if (reader.getLocalName() == rt) {System.out.println("Response Time: " + reader.getElementText());}
			if (reader.getLocalName() == dc) {System.out.println("Number of deals: " + reader.getAttributeValue(null, "count"));}	
		}
		}	
	}
}
