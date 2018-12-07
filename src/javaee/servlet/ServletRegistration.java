package javaee.servlet;

import javax.servlet.MultipartConfigElement;
import javax.servlet.Registration;
import javax.servlet.ServletSecurityElement;
import java.util.Collection;
import java.util.Set;

/**
 * TODO SERVLET3 - Add comments
 * @see javax.servlet.ServletRegistration
 */
public interface ServletRegistration extends javax.servlet.ServletRegistration {

    public Set<String> addMapping(String... urlPatterns);
    public Collection<String> getMappings();
    public String getRunAsRole();

    public static interface Dynamic
            extends javax.servlet.ServletRegistration, Registration.Dynamic {
        public void setLoadOnStartup(int loadOnStartup);
        public Set<String> setServletSecurity(ServletSecurityElement constraint);
        public void setMultipartConfig(MultipartConfigElement multipartConfig);
        public void setRunAsRole(String roleName);
    }

}
