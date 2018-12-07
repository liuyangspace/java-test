package javaee.servlet.filter;

import javax.servlet.DispatcherType;
import javax.servlet.Registration;
import java.util.Collection;
import java.util.EnumSet;

/**
 * TODO SERVLET3 - Add comments
 *
 * @see javax.servlet.FilterRegistration
 */
public interface FilterRegistration extends javax.servlet.FilterRegistration{

    public void addMappingForServletNames( EnumSet<DispatcherType> dispatcherTypes, boolean isMatchAfter, String... servletNames);
    public Collection<String> getServletNameMappings();
    public void addMappingForUrlPatterns( EnumSet<DispatcherType> dispatcherTypes, boolean isMatchAfter, String... urlPatterns);
    public Collection<String> getUrlPatternMappings();
    public static interface Dynamic extends javax.servlet.FilterRegistration, Registration.Dynamic {/* No additional methods */ }

}
