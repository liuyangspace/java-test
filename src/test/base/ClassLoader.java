package test.base;

import org.junit.Test;

public class ClassLoader {
    @Test
    public void loader(){
        System.out.println(String.class.getClassLoader());
        System.out.println(ClassLoader.class.getClassLoader());
        System.out.println(ClassLoader.class.getClassLoader().getParent());
        System.out.println(ClassLoader.class.getClassLoader().getParent().getParent());
        //System.out.println(ZipFileSystemProvider.class.getClassLoader());
    }
}
