package javaee.jsp.tag.tld;

/**
 * @see javax.servlet.jsp.tagext.ValidationMessage
 */
public class ValidationMessage extends javax.servlet.jsp.tagext.ValidationMessage{

    public ValidationMessage(String id, String message) {
        super(id, message);
    }

    public String getId(){ return super.getId(); }
    public String getMessage(){ return super.getMessage(); }


}
