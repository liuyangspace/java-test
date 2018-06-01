package language.data.object.clazz.reflect.type;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;

/**
 * TypeVariable is the common superinterface for type variables of kinds.
 * A type variable is created the first time it is needed by a reflective
 * method, as specified in this package.
 *
 * @see java.lang.reflect.TypeVariable
 */
public interface TypeVariable<D extends GenericDeclaration> extends java.lang.reflect.TypeVariable,Type, AnnotatedElement
{
    Type[] getBounds();//获得泛型的上限，若未明确声明上边界则默认为Object
    D getGenericDeclaration();//获取声明该类型变量实体(即获得类、方法或构造器名)
    String getName();//获取声明该类型变量实体(即获得类、方法或构造器名)
    AnnotatedType[] getAnnotatedBounds();
}
