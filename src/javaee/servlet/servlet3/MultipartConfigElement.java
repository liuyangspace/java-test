package javaee.servlet.servlet3;

import javax.servlet.annotation.MultipartConfig;

/**
 * TODO SERVLET3 - Add comments
 *
 * @see javax.servlet.MultipartConfigElement
 */
public class MultipartConfigElement extends javax.servlet.MultipartConfigElement{

    public MultipartConfigElement(String location) {super(location);}
    public MultipartConfigElement(String location, long maxFileSize, long maxRequestSize, int fileSizeThreshold) {super(location,maxFileSize,maxRequestSize,fileSizeThreshold);}
    public MultipartConfigElement(MultipartConfig annotation) {super(annotation);}

    public String getLocation() { return super.getLocation(); }
    public long getMaxFileSize() { return super.getMaxFileSize(); }
    public long getMaxRequestSize() { return super.getMaxRequestSize(); }
    public int getFileSizeThreshold() { return super.getFileSizeThreshold(); }

}
