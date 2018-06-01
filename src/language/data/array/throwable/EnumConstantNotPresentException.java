package language.data.array.throwable;

/**
 * @see java.lang.EnumConstantNotPresentException
 */
public class EnumConstantNotPresentException extends RuntimeException {
    private static final long serialVersionUID = -6046998521960521108L;

    /**
     * The type of the missing enum constant.
     */
    private Class<? extends Enum> enumType;

    /**
     * The name of the missing enum constant.
     */
    private String constantName;

    /**
     * Constructs an {@code EnumConstantNotPresentException} for the
     * specified constant.
     *
     * @param enumType the type of the missing enum constant
     * @param constantName the name of the missing enum constant
     */
    public EnumConstantNotPresentException(Class<? extends Enum> enumType,
                                           String constantName) {
        super(enumType.getName() + "." + constantName);
        this.enumType = enumType;
        this.constantName  = constantName;
    }

    /**
     * Returns the type of the missing enum constant.
     *
     * @return the type of the missing enum constant
     */
    public Class<? extends Enum> enumType() { return enumType; }

    /**
     * Returns the name of the missing enum constant.
     *
     * @return the name of the missing enum constant
     */
    public String constantName() { return constantName; }
}

