import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Created by Shreya on 7/8/2017.
 */
public class DomParser {
    public static void main(String[] args) {
        try {

            File fXmlFile = new File("..\\xnl_JSON_exercise\\xmlTest");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("employee");

            System.out.println("----------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    System.out.println("Staff id : " + eElement.getElementsByTagName("id").item(0).getTextContent());
                    System.out.println("Name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
                    System.out.println("Company : " + eElement.getElementsByTagName("company").item(0).getTextContent());
                    System.out.println("Number : " + eElement.getElementsByTagName("number").item(0).getTextContent());

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
