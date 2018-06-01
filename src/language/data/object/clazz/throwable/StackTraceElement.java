package language.data.object.clazz.throwable;

import java.lang.Throwable;
import java.util.Objects;

/**
 * An element in a stack trace, as returned by {@link
 * Throwable#getStackTrace()}.
 *
 * @see java.lang.StackTraceElement
 */
public /* final */ class StackTraceElement implements java.io.Serializable
{
    // For STEs constructed using the public constructors, this field is not used.
    private transient Class<?> declaringClassObject;
    // Normally initialized by VM
    private String classLoaderName;
    private String moduleName;
    private String moduleVersion;
    private String declaringClass;
    private String methodName;
    private String fileName;
    private int    lineNumber;
    private byte   format = 0; // Default to show all

    public StackTraceElement(String declaringClass, String methodName, String fileName, int lineNumber) {
        this(null, null, null, declaringClass, methodName, fileName, lineNumber);
    }
    public StackTraceElement(String classLoaderName,
                             String moduleName, String moduleVersion,
                             String declaringClass, String methodName,
                             String fileName, int lineNumber) {
        this.classLoaderName = classLoaderName;
        this.moduleName      = moduleName;
        this.moduleVersion   = moduleVersion;
        this.declaringClass  = Objects.requireNonNull(declaringClass, "Declaring class is null");
        this.methodName      = Objects.requireNonNull(methodName, "Method name is null");
        this.fileName        = fileName;
        this.lineNumber      = lineNumber;
    }

    public String getFileName() {
        return fileName;
    }
    public int getLineNumber() {
        return lineNumber;
    }
    public String getModuleName() {
        return moduleName;
    }
    public String getModuleVersion() {
        return moduleVersion;
    }
    public String getClassLoaderName() {
        return classLoaderName;
    }
    public String getClassName() {
        return declaringClass;
    }
    public String getMethodName() {
        return methodName;
    }
    public boolean isNativeMethod() {
        return lineNumber == -2;
    }
    public String toString() {return super.toString();}
    public boolean equals(Object obj) {return super.equals(obj);}
    public int hashCode() {return super.hashCode();}
}
