
module java.language {
    requires java.base;
    requires java.desktop;
    requires dom4j;
    requires jaxen;
    requires junit;
    //exports jdk.internal.math to java.base;
    //uses sun.util.spi.CalendarProvider;
    //provides java.nio.file.spi.FileSystemProvider with jdk.internal.jrtfs.JrtFileSystemProvider;
    //uses jdk.nio.zipfs.ZipFileSystemProvider;

    //exports sun.reflect.generics.repository to java.language;
    exports language;
}