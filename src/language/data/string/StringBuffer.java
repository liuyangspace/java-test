package language.data.string;

import java.lang.CharSequence;
import java.lang.String;

/**
 * 多线程安全的 可变长度的 字符串（相对于 {@link java.lang.String} 字符串变动资源开销小 ）
 *
 * @see java.lang.StringBuffer
 */
public /* final */ class StringBuffer /* extends AbstractStringBuilder */ implements java.io.Serializable, CharSequence
{
    private transient String toStringCache;
    static final long serialVersionUID = 3388685877147921107L;

    private java.lang.StringBuffer $this;

    public StringBuffer() { $this = new java.lang.StringBuffer(); }
    public StringBuffer(int capacity) { $this = new java.lang.StringBuffer(capacity); }
    public StringBuffer(String str) { $this = new java.lang.StringBuffer(str); }
    public StringBuffer(CharSequence seq) { $this = new java.lang.StringBuffer(seq); }

    public synchronized int length() {
        return $this.length();
    }
    public synchronized int capacity() { return $this.capacity(); }
    public synchronized void ensureCapacity(int minimumCapacity) { $this.ensureCapacity(minimumCapacity); }
    public synchronized void trimToSize() {
        $this.trimToSize();
    }

    public synchronized void setLength(int newLength) {$this.setLength(newLength);}
    public synchronized char charAt(int index) {
        return $this.charAt(index);
    }

    public synchronized int codePointAt(int index) {
        return $this.codePointAt(index);
    }
    public synchronized int codePointBefore(int index) {
        return $this.codePointBefore(index);
    }
    public synchronized int codePointCount(int beginIndex, int endIndex) {return $this.codePointCount(beginIndex,endIndex);}
    public synchronized int offsetByCodePoints(int index, int codePointOffset) { return $this.offsetByCodePoints(index, codePointOffset); }

    public synchronized void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) { $this.getChars(srcBegin, srcEnd, dst, dstBegin); }
    public synchronized void setCharAt(int index, char ch) { $this.setCharAt(index, ch); }

    public synchronized java.lang.StringBuffer append(Object obj) {return $this.append(obj);}
    public synchronized java.lang.StringBuffer append(String str) {return $this.append(str);}
    public synchronized java.lang.StringBuffer append(java.lang.StringBuffer sb) {return $this.append(sb);}
    public synchronized java.lang.StringBuffer append(CharSequence s) {return $this.append(s);}
    public synchronized java.lang.StringBuffer append(CharSequence s, int start, int end) {return $this.append(s,start,end);}
    public synchronized java.lang.StringBuffer append(char[] str) {return $this.append(str);}
    public synchronized java.lang.StringBuffer append(char[] str, int offset, int len) {return $this.append(str,offset,len);}
    public synchronized java.lang.StringBuffer append(boolean b) {return $this.append(b);}
    public synchronized java.lang.StringBuffer append(char c) {return $this.append(c);}
    public synchronized java.lang.StringBuffer append(int i) {return $this.append(i);}
    public synchronized java.lang.StringBuffer append(long lng) {return $this.append(lng);}
    public synchronized java.lang.StringBuffer append(float f) {return $this.append(f);}
    public synchronized java.lang.StringBuffer append(double d) {return $this.append(d);}
    public synchronized java.lang.StringBuffer appendCodePoint(int codePoint) {return $this.appendCodePoint(codePoint);}

    public synchronized java.lang.StringBuffer delete(int start, int end) {return $this.delete(start,end);}
    public synchronized java.lang.StringBuffer deleteCharAt(int index) {return $this.deleteCharAt(index);}

    public synchronized java.lang.StringBuffer replace(int start, int end, String str) {return $this.replace(start,end,str);}
    public synchronized String substring(int start) {
        return $this.substring(start);
    }
    public synchronized CharSequence subSequence(int start, int end) {
        return $this.subSequence(start, end);
    }
    public synchronized String substring(int start, int end) {
        return $this.substring(start, end);
    }

    public synchronized java.lang.StringBuffer insert(int index, char[] str, int offset, int len){return $this.insert(index,str,offset,len);}
    public synchronized java.lang.StringBuffer insert(int offset, Object obj) {return $this.insert(offset,obj);}
    public synchronized java.lang.StringBuffer insert(int offset, String str) {return $this.insert(offset,str);}
    public synchronized java.lang.StringBuffer insert(int offset, char[] str) {return $this.insert(offset,str);}
    public synchronized java.lang.StringBuffer insert(int offset, CharSequence s) {return $this.insert(offset,s);}
    public synchronized java.lang.StringBuffer insert(int dstOffset, CharSequence s, int start, int end) {return $this.insert(dstOffset,s,start,end);}
    public java.lang.StringBuffer insert(int offset, boolean b) {return $this.insert(offset,b);}
    public synchronized java.lang.StringBuffer insert(int offset, char c) {return $this.insert(offset,c);}
    public java.lang.StringBuffer insert(int offset, int i) {return $this.insert(offset,i);}
    public java.lang.StringBuffer insert(int offset, long i) {return $this.insert(offset,i);}
    public java.lang.StringBuffer insert(int offset, float i) {return $this.insert(offset,i);}
    public java.lang.StringBuffer insert(int offset, double i) {return $this.insert(offset,i);}

    public int indexOf(String str) {return $this.indexOf(str);}
    public synchronized int indexOf(String str, int fromIndex) {
        return $this.indexOf(str, fromIndex);
    }
    public int lastIndexOf(String str) {return $this.lastIndexOf(str);}
    public synchronized int lastIndexOf(String str, int fromIndex) {
        return $this.lastIndexOf(str, fromIndex);
    }
    public synchronized java.lang.StringBuffer reverse() {return $this.reverse();}
    public synchronized String toString() {return $this.toString();}

    public static void main(java.lang.String[] args)
    {
        System.out.println((new StringBuffer()).getClass());
    }
}
