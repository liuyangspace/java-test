package test.javaee.jsp.tag;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTag;
import java.io.IOException;
import java.util.Scanner;

public class FileReader implements SimpleTag {
    private PageContext pageContext;
    private String url;



    @Override
    public void doTag() throws JspException, IOException {
        Scanner scanner = new Scanner(pageContext.getServletContext().getResourceAsStream(this.url),"UTF-8");
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            line = line.replaceAll("<","&lt;");
            line = line.replaceAll(">","&gt;");
            pageContext.getOut().println(line+"<br/>");
        }
    }

    public void setUrl(String url) {
        this.url = url;
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
        this.pageContext = (PageContext) pc;
    }

    @Override
    public void setJspBody(JspFragment jspBody) {

    }
}
