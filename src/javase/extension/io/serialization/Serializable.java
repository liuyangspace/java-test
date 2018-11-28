package javase.extension.io.serialization;

/**
 * Serializability of a class is enabled by the class implementing the
 * java.data.Serializable interface. Classes that do not implement this
 * interface will not have any of their state serialized or
 * deserialized.
 *
 * @see java.io.ObjectOutputStream
 * @see java.io.ObjectInputStream
 * @see java.io.ObjectOutput
 * @see java.io.ObjectInput
 * @see java.io.Externalizable
 * @since   1.1
 */
public interface Serializable extends java.io.Serializable
{
}
