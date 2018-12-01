package test.javaee.jsp.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ForEach extends SimpleTagSupport {
    private Iterator iterator;
    private int start;
    private int end;
    private int step;
    private String var;

    public void setIn(Object in) {
        if(in instanceof List){
            iterator = ((List) in).iterator();
        }else if(in instanceof Map){
            iterator = ((Map) in).entrySet().iterator();
        }else if(in instanceof Object[]){
            iterator = Arrays.asList((Object[])in).iterator();
        }
    }

    public void setIterator(Iterator iterator) {
        this.iterator = iterator;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public void setVar(String var) {
        this.var = var;
    }

    public void doTag() throws JspException, IOException {
        if(iterator == null){
            for (int i = start; i <= end; i=i+step) {
                getJspContext().setAttribute(var,i);
                getJspBody().invoke(getJspContext().getOut());
            }
        }else {
            while (iterator.hasNext()){
                getJspContext().setAttribute(var,iterator.next());
                getJspBody().invoke(getJspContext().getOut());
            }
        }
    }

}
