package test.javaee.servlet.listener;


import javax.servlet.http.HttpSessionBindingEvent;

public class SessionAttributeListener implements javax.servlet.http.HttpSessionAttributeListener {

    public void attributeAdded(HttpSessionBindingEvent se) {
        String sessionName = se.getName();
    }

    public void attributeRemoved(HttpSessionBindingEvent se) {

    }

    public void attributeReplaced(HttpSessionBindingEvent se) {
        String sessionName = se.getName();
        Object oldValus = se.getValue();
        Object newValue = se.getSession().getAttribute(sessionName);
    }

}
