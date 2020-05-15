package test.javaee.servlet.listener;

import javax.servlet.ServletContextEvent;

public class MyContextListener implements javax.servlet.ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Context Start");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Context Stop");
    }

}
