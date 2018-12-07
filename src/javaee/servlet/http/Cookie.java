package javaee.servlet.http;

/**
 * Cookie
 * 组成：
 *  name
 *      标识cookie
 *  value
 *  age：
 *      0 删除文件及缓存
 *      -1 删除文件
 *  path
 *      作用路径，标识cookie
 *  domain
 *      作用域名，标识cookie
 * 操作：
 *  增
 *  删
 *  改
 *  查
 *
 *
 * @see javax.servlet.http.Cookie
 */
public class Cookie extends javax.servlet.http.Cookie{

    public Cookie(String name, String value) { super(name, value); }

    public void setComment(String purpose) { super.setComment(purpose); }
    public String getComment() { return super.getComment(); }

    public void setDomain(String pattern) { super.setDomain(pattern); }
    public String getDomain() { return super.getDomain(); }

    public void setMaxAge(int expiry) { super.setMaxAge(expiry); }
    public int getMaxAge() { return super.getMaxAge(); }

    public void setPath(String uri) { super.setPath(uri); }
    public String getPath() { return super.getPath(); }

    public void setSecure(boolean flag) { super.setSecure(flag); }
    public boolean getSecure() { return super.getSecure(); }

    public void setValue(String newValue) { super.setValue(newValue); }
    public String getValue() { return super.getValue(); }

    public void setHttpOnly(boolean httpOnly) { super.setHttpOnly(httpOnly); }
    public boolean isHttpOnly() { return super.isHttpOnly(); }

    public String getName() { return super.getName(); }

    public void setVersion(int v) { super.setVersion(v); }
    public int getVersion() { return super.getVersion(); }

    public Object clone() { return super.clone(); }

}
