package javaee.bean;

import java.beans.IntrospectionException;
import java.lang.reflect.Method;

public class PropertyDescriptor extends java.beans.PropertyDescriptor {

    public PropertyDescriptor(String propertyName, Class<?> beanClass) throws IntrospectionException {
        super(propertyName, beanClass);
    }

    public PropertyDescriptor(String propertyName, Class<?> beanClass, String readMethodName, String writeMethodName) throws IntrospectionException {
        super(propertyName, beanClass, readMethodName, writeMethodName);
    }

    public PropertyDescriptor(String propertyName, Method readMethod, Method writeMethod) throws IntrospectionException {
        super(propertyName, readMethod, writeMethod);
    }
}
