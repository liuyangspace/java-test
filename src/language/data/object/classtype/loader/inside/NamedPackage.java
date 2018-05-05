package language.data.object.classtype.loader.inside;

/**
 * A NamedPackage represents a package by name in a specific module.
 *
 * A class loader will automatically create NamedPackage for each
 * package when a class is defined.  Package object is lazily
 * defined until Class::getPackage, Package::getPackage(s), or
 * ClassLoader::getDefinedPackage(s) method is called.
 *
 * NamedPackage allows ClassLoader to keep track of the runtime
 * packages with minimal footprint and avoid constructing Package
 * object.
 *
 * @see java.lang.NamedPackage
 */
public class NamedPackage //extends java.lang.NamedPackage
{
}
