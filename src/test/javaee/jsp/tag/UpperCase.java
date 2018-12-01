package test.javaee.jsp.tag;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTag;
import java.io.IOException;
import java.io.StringWriter;

public class UpperCase implements SimpleTag {
    private JspContext pc;
    private JspFragment jspBody;

    @Override
    public void doTag() throws JspException, IOException {
        //PrintWriter printWriter = new PrintWriter();
        //BufferedWriter bufferedWriter = new BufferedWriter(pc.getOut());
        StringWriter stringWriter = new StringWriter();
        jspBody.invoke(stringWriter);
        pc.getOut().print(stringWriter.toString().toUpperCase());
    }

    @Override
    public void setParent(JspTag parent) {

    }

    @Override
    public JspTag getParent() {
        return null;
    }

    @Override
    public void setJspContext(JspContext pc) {
        this.pc = pc;
    }

    @Override
    public void setJspBody(JspFragment jspBody) {
        this.jspBody = jspBody;
    }
}
