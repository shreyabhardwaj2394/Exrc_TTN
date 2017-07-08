
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;


/**
 * Created by Shreya on 7/8/2017.
 */
public class SaxParsing {
    public static void main(String[] args) throws ParserConfigurationException, SAXException {
        SAXParserFactory factory=SAXParserFactory.newInstance();
        SAXParser saxParser=factory.newSAXParser();

        DefaultHandler handler=new DefaultHandler(){
            boolean id = false;
            boolean name = false;
            boolean company = false;
            boolean number = false;

            public void startElement(String uri, String localName,String qName,
                                     Attributes attributes) throws SAXException {

                System.out.println("Start Element :" + qName);

                if (qName.equalsIgnoreCase("ID")) {
                    id = true;
                }

                if (qName.equalsIgnoreCase("NAME")) {
                    name = true;
                }

                if (qName.equalsIgnoreCase("COMPANY")) {
                    company = true;
                }

                if (qName.equalsIgnoreCase("NUMBER")) {
                    number = true;
                }

            }

            public void endElement(String uri, String localName,
                                   String qName) throws SAXException {

                System.out.println("End Element :" + qName);

            }

            public void characters(char ch[], int start, int length) throws SAXException {

                if (id) {
                    System.out.println("ID : " + new String(ch, start, length));
                    id = false;
                }

                if (name) {
                    System.out.println("Name : " + new String(ch, start, length));
                    name = false;
                }

                if (company) {
                    System.out.println("Company : " + new String(ch, start, length));
                    company = false;
                }

                if (number) {
                    System.out.println("Number : " + new String(ch, start, length));
                    number= false;
                }

            }
        };
        try {
            saxParser.parse("..\\xnl_JSON_exercise\\xmlTest",handler);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
