package javase.data.object.clazz.reflect.member.field;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Type;

/**
 * A {@code Field} provides information about, and dynamic access to, a
 * single field of a class or an interface.  The reflected field may
 * be a class (static) field or an instance field.
 *
 * @see java.lang.reflect.Field
 * @see java.lang.reflect.Member
 * @see java.lang.Class
 * @see java.lang.Class#getFields()
 * @see java.lang.Class#getField(String)
 * @see java.lang.Class#getDeclaredFields()
 * @see java.lang.Class#getDeclaredField(String)
 */
public class Field // extends AccessibleObject implements Member
{
    java.lang.reflect.Field $this;

    // get set 指定对象上的该字段的值
    public Object get(Object obj) throws IllegalArgumentException, IllegalAccessException {return $this.get(obj);}
    public boolean getBoolean(Object obj) throws IllegalArgumentException, IllegalAccessException {return $this.getBoolean(obj);}
    public byte getByte(Object obj) throws IllegalArgumentException, IllegalAccessException {return $this.getByte(obj);}
    public char getChar(Object obj) throws IllegalArgumentException, IllegalAccessException {return $this.getChar(obj);}
    public short getShort(Object obj) throws IllegalArgumentException, IllegalAccessException {return $this.getShort(obj);}
    public int getInt(Object obj) throws IllegalArgumentException, IllegalAccessException {return $this.getInt(obj);}
    public long getLong(Object obj) throws IllegalArgumentException, IllegalAccessException {return $this.getLong(obj);}
    public float getFloat(Object obj) throws IllegalArgumentException, IllegalAccessException {return $this.getFloat(obj);}
    public double getDouble(Object obj) throws IllegalArgumentException, IllegalAccessException {return $this.getDouble(obj);}

    public void set(Object obj, Object value) throws IllegalArgumentException, IllegalAccessException { $this.set(obj,value); }
    public void setBoolean(Object obj, boolean z) throws IllegalArgumentException, IllegalAccessException { $this.setBoolean(obj,z); }
    public void setByte(Object obj, byte b) throws IllegalArgumentException, IllegalAccessException { $this.setByte(obj,b); }
    public void setChar(Object obj, char c) throws IllegalArgumentException, IllegalAccessException { $this.setChar(obj,c); }
    public void setShort(Object obj, short s) throws IllegalArgumentException, IllegalAccessException { $this.setShort(obj,s); }
    public void setInt(Object obj, int i) throws IllegalArgumentException, IllegalAccessException { $this.setInt(obj,i); }
    public void setLong(Object obj, long l) throws IllegalArgumentException, IllegalAccessException { $this.setLong(obj,l); }
    public void setFloat(Object obj, float f) throws IllegalArgumentException, IllegalAccessException { $this.setFloat(obj,f); }
    public void setDouble(Object obj, double d) throws IllegalArgumentException, IllegalAccessException { $this.setDouble(obj,d); }
    //
    public String getName(){return $this.getName();}
    public int getModifiers(){return $this.getModifiers();}
    public Class<?> getType(){return $this.getType();}
    public Type getGenericType() {return $this.getGenericType();}

    public boolean isEnumConstant(){return $this.isEnumConstant();}
    public boolean isSynthetic(){return $this.isSynthetic();}

    public void setAccessible(boolean flag) {$this.setAccessible(flag);}
    public Class<?> getDeclaringClass(){return $this.getDeclaringClass();}

    public boolean equals(Object obj) {return $this.equals(obj);}
    public int hashCode(){return $this.hashCode();}
    public String toString(){return $this.toString();}
    public String toGenericString(){return $this.toGenericString();}
    // Annotation
    public <T extends Annotation> T getAnnotation(Class<T> annotationClass) { return $this.getAnnotation(annotationClass); }
    public <T extends Annotation> T[] getAnnotationsByType(java.lang.Class<T> annotationClass) {return $this.getAnnotationsByType(annotationClass);}
    public Annotation[] getDeclaredAnnotations() {return $this.getDeclaredAnnotations();}
    public AnnotatedType getAnnotatedType() {return $this.getAnnotatedType();}
}
