package test.javaee.jsp.tag;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTag;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Date implements SimpleTag {

    private PageContext pageContext;

    @Override
    public void setJspContext(JspContext pc) {
        System.out.println("setJspContext");
        System.out.println(pc);
        this.pageContext = (PageContext) pc;
    }

    @Override
    public void doTag() throws JspException, IOException {
        System.out.println("doTag");
        this.pageContext.getOut().print((new SimpleDateFormat("YYYY-MM-dd HH:mm:ss")).format(new java.util.Date()));
    }

    @Override
    public void setParent(JspTag parent) {

    }

    @Override
    public JspTag getParent() {
        return null;
    }

    @Override
    public void setJspBody(JspFragment jspBody) {

    }
}
