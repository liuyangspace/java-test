
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
    //exports jdk.internal.math to java.base;
    //uses sun.util.spi.CalendarProvider;
    //provides java.nio.file.spi.FileSystemProvider with jdk.internal.jrtfs.JrtFileSystemProvider;
    //uses jdk.nio.zipfs.ZipFileSystemProvider;

    //exports sun.reflect.generics.repository to java.javase;
    exports javase;
}