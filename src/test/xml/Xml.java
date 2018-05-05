package test.xml;

import org.dom4j.Text;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


import javax.xml.parsers.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileWriter;
import java.io.IOException;

public class Xml {

    public static void main(String[] args) throws Exception {
        System.out.println("##################################### jsaxDomTest");
        jsaxDomTest();
        System.out.println("##################################### jsaxSaxTest");
        jsaxSaxTest();
        System.out.println("##################################### dom4jSaxTest");
        dom4jSaxTest();
    }

    public static void jsaxDomTest() throws Exception {
        /** @see javax.xml.parsers  JAXP DOM解析 */
        DocumentBuilderFactory xmlBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder xmlBuilder = xmlBuilderFactory.newDocumentBuilder();
        Document document = xmlBuilder.parse("src/test/xml/xml.xml");
        System.out.println(document);
        System.out.println(document.getDocumentElement());
        System.out.println(document.getXmlVersion());
        System.out.println(document.getElementsByTagName("book"));
        System.out.println(document.getFirstChild().getChildNodes());
        Element book = (Element)document.getElementsByTagName("book").item(0);
        System.out.println(book);
        System.out.println(book.getAttributes().getNamedItem("category"));

        /** DOM修改 */
        Node title = book.getElementsByTagName("title").item(0);
        System.out.println(title.getTextContent());
        title.setTextContent("this is test");
        book.removeChild(book.getElementsByTagName("author").item(0));
        book.appendChild(document.createElement("test"));

        /** @see javax.xml.transform  DOM持久化 */
        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformer = factory.newTransformer();
        transformer.transform(new DOMSource(document),new StreamResult("src/test/xml/result.xml"));
    }

    public static void jsaxSaxTest() throws Exception {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = saxParserFactory.newSAXParser();
        saxParser.parse("src/test/xml/xml.xml",new DefaultHandler(){
            public void startDocument () throws SAXException {
                System.out.println("startDocument ：");
            }
            public void characters (char ch[], int start, int length) throws SAXException {
                System.out.println(new String(ch,start,length));
                //System.out.println(ch.toString().substring(start,length-1));
            }
        });
    }

    public static void dom4jSaxTest() throws Exception {
        /** @see  dom4 解析 */
        SAXReader saxReader = new SAXReader();
        org.dom4j.Document document = saxReader.read("src/test/xml/xml.xml");
        org.dom4j.Element element = document.getRootElement();
        for (java.util.Iterator iterable = element.elementIterator();iterable.hasNext();){
            org.dom4j.Element element1 = (org.dom4j.Element) (iterable.next());
            System.out.println(element1.getName());
            System.out.println(element1.attributeValue("category"));
            /** 添加 */
            element1.add(org.dom4j.DocumentHelper.createElement("test"));
            element1.elements().forEach((element2)->{
                org.dom4j.Element element3 = (org.dom4j.Element)element2;
                System.out.println(element3.getName());
                /** 修改 */
                if("price".equals(element3.getName())){
                    element3.setText("00");
                }
                /** 删除 */
                if("year".equals(element3.getName())){
                    element3.getParent().remove(element3);
                }
            });
        }
        // Xpath
        System.out.println(document.selectNodes("//book"));

        /** @see 持久化 */
        XMLWriter xmlWriter = new XMLWriter(new FileWriter("src/test/xml/dom4j.xml"));
        xmlWriter.write(element);
        xmlWriter.close();
    }
}
