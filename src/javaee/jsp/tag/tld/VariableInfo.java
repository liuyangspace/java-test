package javaee.jsp.tag.tld;

/**
 * @see javax.servlet.jsp.tagext.VariableInfo
 */
public class VariableInfo extends javax.servlet.jsp.tagext.VariableInfo{

    public VariableInfo(String varName, String className, boolean declare, int scope) {
        super(varName, className, declare, scope);
    }

    public String getVarName(){ return super.getVarName(); }
    public String getClassName(){ return super.getClassName(); }
    public boolean getDeclare(){ return super.getDeclare(); }
    public int getScope(){ return super.getScope(); }

}
