package core;
import java.io.IOException;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;
public class SAX_Parser extends DefaultHandler {
	public static void main(String[] args) throws SAXException, ParserConfigurationException, IOException {
		String xmlurl = "http://alex.academy/ebay.xml";
		SAXParserFactory f = SAXParserFactory.newInstance();
		SAXParser sax_parser = f.newSAXParser();
		DefaultHandler handler = new DefaultHandler() {
			boolean orig_kw = false;
			boolean engine = false;
			boolean kadu_version = false;
			boolean response_time = false;
			
		public void startElement(String uri, String localName, String qName, Attributes attributes)throws SAXException {
			if(qName.equals("orig-kw")) {orig_kw = true;}
			if(qName.equals("engine")) {engine = true;}
			if(qName.equals("kadu-version")) {kadu_version = true;}
			if(qName.equals("response-time")) {response_time = true;}
			if(qName.equals("deals")) { 
				String dc = attributes.getValue("count");
	         System.out.println("Number of Deals : " + dc);}}
		public void endElement(String uri, String localName, String qName) throws SAXException{}
		public void characters(char ch[], int start, int length) throws SAXException {
			if (orig_kw) {String kw = new String(ch, start, length);
			System.out.println("Key Word: " + kw); orig_kw = false;}
			if (engine) {String eng = new String(ch, start, length);
			System.out.println("Engine: " + eng); engine = false;}
			if (kadu_version) {String kv = new String(ch, start, length);
			System.out.println("Version: " + kv); kadu_version = false;}
			if (response_time) {String rt = new String(ch, start, length);
			System.out.println("Response Time: " + rt); response_time = false;}
			
		}
					
		};
		sax_parser.parse(xmlurl, handler);
	}
}
