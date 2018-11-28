package test.javase.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;

/**
 * @see java.util.Properties
 */
public class Properties {
    public static void main(String[] args) throws IOException {
        java.util.Properties properties= new java.util.Properties();
        URL path = Properties.class.getResource("data/property.properties");
        properties.load(new FileInputStream(path.toString()));
        properties.getProperty("name","tom");
    }
}
