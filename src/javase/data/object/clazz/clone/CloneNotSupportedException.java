package javase.data.object.clazz.clone;

/**
 * @see java.lang.Cloneable
 * @see     java.lang.Object#clone()
 */
public class CloneNotSupportedException extends Exception {
    private static final long serialVersionUID = 5195511250079656443L;

    /**
     * Constructs a <code>CloneNotSupportedException</code> with no detail message.
     */
    public CloneNotSupportedException() {
        super();
    }

    /**
     * Constructs a <code>CloneNotSupportedException</code> with the specified detail message.
     *
     * @param   s   the detail message.
     */
    public CloneNotSupportedException(String s) {
        super(s);
    }
}
