
module java.language {
    requires java.base;
    requires java.desktop;
    requires dom4j;
    requires jaxen;
    requires junit;
    requires servlet.api;
    requires jsp.api;
    requires java.naming;
    requires java.sql;
    requires mysql.connector.java;
    requires catalina;
    // requires java.mail;
    requires el.api;
    requires tomcat.coyote;
    // requires java.activation;
    //exports jdk.internal.math to java.base;
    //uses sun.util.spi.CalendarProvider;
    //provides java.nio.file.spi.FileSystemProvider with jdk.internal.jrtfs.JrtFileSystemProvider;
    //uses jdk.nio.zipfs.ZipFileSystemProvider;

    //exports sun.reflect.generics.repository to java.javase;
    exports javase;
}