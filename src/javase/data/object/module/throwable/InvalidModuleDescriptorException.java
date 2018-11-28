package javase.data.object.module.throwable;

/**
 * hrown when reading a module descriptor and the module descriptor is found
 * to be malformed or otherwise cannot be interpreted as a module descriptor.
 *
 * @see java.lang.module.InvalidModuleDescriptorException
 */
public class InvalidModuleDescriptorException extends RuntimeException
{
    private static final long serialVersionUID = 4863390386809347380L;
    public InvalidModuleDescriptorException() {}
    public InvalidModuleDescriptorException(String msg) {
        super(msg);
    }
}
