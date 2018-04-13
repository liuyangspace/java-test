package language.data.object.classtype.annotation.type;

/**
 * Annotation retention policy.
 *
 * @see java.lang.annotation.RetentionPolicy
 */

public enum RetentionPolicy {
    SOURCE , // 在编译阶段丢弃。Annotations are to be discarded by the compiler.
    CLASS , // 在类加载的时候丢弃。Annotations are to be recorded in the class file by the compiler but need not be retained by the VM at run time.
    RUNTIME //  始终不会丢弃，运行期也保留该注解，因此可以使用反射机制读取该注解的信息。Annotations are to be recorded in the class file by the compiler and retained by the VM at run time, so they may be read reflectively.
}
