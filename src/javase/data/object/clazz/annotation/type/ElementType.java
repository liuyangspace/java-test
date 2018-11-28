package javase.data.object.clazz.annotation.type;

/**
 * @see java.lang.annotation.ElementType
 */
public enum ElementType {
    TYPE , // Class, interface (including annotation type), or enum declaration
    FIELD , // Field declaration (includes enum constants)
    METHOD , // Method declaration
    PARAMETER , // Formal parameter declaration
    CONSTRUCTOR , // Constructor declaration
    LOCAL_VARIABLE , // Local variable declaration
    ANNOTATION_TYPE , // Annotation type declaration
    PACKAGE , // Package declaration
    TYPE_PARAMETER , // Type parameter declaration
    TYPE_USE , // Use of a type
    MODULE // Module declaration.

}
