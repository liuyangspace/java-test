package language.data.object.clazz.reflect.throwable;

/**
 * Thrown when an application tries to access a type using a string
 * representing the type's name, but no definition for the type with
 * the specified name can be found.   This exception differs from
 * {@link ClassNotFoundException} in that {@code ClassNotFoundException} is a
 * checked exception, whereas this exception is unchecked.
 *
 * @see     java.lang.TypeNotPresentException
 */
public class TypeNotPresentException extends RuntimeException {
    private static final long serialVersionUID = -5101214195716534496L;

    private String typeName;

    /**
     * Constructs a {@code TypeNotPresentException} for the named type
     * with the specified cause.
     *
     * @param typeName the fully qualified name of the unavailable type
     * @param cause the exception that was thrown when the system attempted to
     *    load the named type, or {@code null} if unavailable or inapplicable
     */
    public TypeNotPresentException(String typeName, Throwable cause) {
        super("Type " + typeName + " not present", cause);
        this.typeName = typeName;
    }

    /**
     * Returns the fully qualified name of the unavailable type.
     *
     * @return the fully qualified name of the unavailable type
     */
    public String typeName() { return typeName;}
}
