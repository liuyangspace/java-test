package test.javaee.jsp.tag;


import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTag;
import java.io.IOException;

public class Compare implements SimpleTag {
    private PageContext pageContext;
    private int var1;

    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }

    private int var2;

    @Override
    public void setJspContext(JspContext pc) {
        this.pageContext = (PageContext) pc;
    }

    @Override
    public void doTag() throws JspException, IOException {
        if(var1>var2){
            pageContext.getOut().print(var1+" 大于 "+var2);
        }else if (var1==var2){
            pageContext.getOut().print(var1+" 等于 "+var2);
        }else {
            pageContext.getOut().print(var1+" 小于 "+var2);
        }
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
