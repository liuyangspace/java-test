
module java.language {
    requires java.base;
    requires java.desktop;
    //exports jdk.internal.math to java.base;
    //uses sun.util.spi.CalendarProvider;
    //provides java.nio.file.spi.FileSystemProvider with jdk.internal.jrtfs.JrtFileSystemProvider;

    exports language;
}