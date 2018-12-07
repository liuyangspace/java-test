package javaee.servlet.descriptor;

import javax.servlet.descriptor.JspPropertyGroupDescriptor;
import javax.servlet.descriptor.TaglibDescriptor;
import java.util.Collection;

/**
 * @since Servlet 3.0
 * TODO SERVLET3 - Add comments
 * @see javax.servlet.descriptor.JspConfigDescriptor
 */
public interface JspConfigDescriptor {
    public Collection<TaglibDescriptor> getTaglibs();
    public Collection<JspPropertyGroupDescriptor> getJspPropertyGroups();
}
