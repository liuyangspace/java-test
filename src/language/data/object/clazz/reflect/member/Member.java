package language.data.object.clazz.reflect.member;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Member is an interface that reflects identifying information about
 * a single member (a field or a method) or a constructor.
 *
 * @see java.lang.Class
 * @see Field
 * @see Method
 * @see Constructor
 * @see java.lang.reflect.Member;
 */
public interface Member extends java.lang.reflect.Member{
    public Class<?> getDeclaringClass();
    public String getName();
    public int getModifiers();
    public boolean isSynthetic();
}
