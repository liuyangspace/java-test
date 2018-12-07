package javaee.servlet.servlet3;

import java.util.Map;
import java.util.Set;

/**
 * Common interface for the registration of Filters and Servlets.
 * @since Servlet 3.0
 * @see javax.servlet.Registration
 */
public interface Registration extends javax.servlet.Registration {

    public String getName();
    public String getClassName();
    public boolean setInitParameter(String name, String value);
    public String getInitParameter(String name);
    public Set<String> setInitParameters(Map<String,String> initParameters);
    public Map<String, String> getInitParameters();

    public interface Dynamic extends javax.servlet.Registration {
        // Mark this Servlet/Filter as supported asynchronous processing.
        public void setAsyncSupported(boolean isAsyncSupported);
    }
}
