package language.extension.system;

/**
 * @see java.lang.Compiler
 */
@Deprecated(since="9", forRemoval=true)
public class Compiler {
    private Compiler() {}               // don't make instances
    public static boolean compileClass(Class<?> clazz) { return false; }
    public static boolean compileClasses(String string) { return false; }
    public static Object command(Object any) { return null; }
    public static void enable() { }
    public static void disable() { }
}
