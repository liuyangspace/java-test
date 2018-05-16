
module java.language {
    requires java.base;
    requires java.desktop;
    requires dom4j;
    requires jaxen;
    //exports jdk.internal.math to java.base;
    //uses sun.util.spi.CalendarProvider;
    //provides java.nio.file.spi.FileSystemProvider with jdk.internal.jrtfs.JrtFileSystemProvider;

    //exports sun.reflect.generics.repository to java.language;
    exports language;
}