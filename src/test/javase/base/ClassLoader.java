package test.javase.base;

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

    @Test
    public void myLoader(){
        // System.out.println(System.getProperty("sun.boot.class.path"));
        MyClassLoader myClassLoader = new MyClassLoader();
        Object object = myClassLoader.findClass("my.Test");

    }

    class MyClassLoader extends java.lang.ClassLoader {

        public Class findClass(String name) {
            byte[] b = loadClassData(name);
            return defineClass(name, b, 0, b.length);
        }

        private byte[] loadClassData(String name) {
            byte[] classData = new byte[1024];
            // load the class data from the connection
            System.err.println("loader class "+name);
            return null;
        }



    }

}
