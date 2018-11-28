package javase.util.data.format.xml.jaxp.parsers;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilderFactory;

/**
 * Defines the API to obtain DOM Document instances from an XML
 * document. Using this class, an application programmer can obtain a
 * {@link Document} from XML.<p>
 * An instance of this class can be obtained from the
 * {@link DocumentBuilderFactory#newDocumentBuilder()} method.
 *
 * @see javax.xml.parsers.DocumentBuilder
 */
public abstract class DocumentBuilder extends javax.xml.parsers.DocumentBuilder
{
    protected DocumentBuilder () { }
    public void reset() {super.reset();}

}
