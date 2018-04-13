package language.data.object.classtype.annotation.throwable;

/**
 * Thrown when the annotation parser attempts to read an annotation
 * from a class file and determines that the annotation is malformed.
 *
 * @see java.lang.annotation.AnnotationFormatError
 * @see     java.lang.reflect.AnnotatedElement
 */
public class AnnotationFormatError extends Error
{
    private static final long serialVersionUID = -4256701562333669892L;

    public AnnotationFormatError(String message) {
        super(message);
    }
    public AnnotationFormatError(String message, Throwable cause) {
        super(message, cause);
    }
    public AnnotationFormatError(Throwable cause) {
        super(cause);
    }

}
