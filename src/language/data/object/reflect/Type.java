package language.data.object.reflect;

public interface Type extends java.lang.reflect.Type
{
    default String getTypeName() {
        return toString();
    }
}
