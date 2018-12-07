package javaee.servlet.http;

/**
 * Configures the session cookies used by the web application associated with
 * the ServletContext from which this SessionCookieConfig was obtained.
 *
 * @see javax.servlet.SessionCookieConfig
 */
public interface SessionCookieConfig extends javax.servlet.SessionCookieConfig{

    public void setName(String name);
    public String getName();

    public void setDomain(String domain);
    public String getDomain();

    public void setPath(String path);
    public String getPath();

    public void setComment(String comment);
    public String getComment();

    public void setHttpOnly(boolean httpOnly);
    public boolean isHttpOnly();

    public void setSecure(boolean secure);
    public boolean isSecure();

    public void setMaxAge(int MaxAge);
    public int getMaxAge();

}
