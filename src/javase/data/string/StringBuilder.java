package javase.data.string;

import java.lang.CharSequence;
import java.lang.String;
import java.lang.StringBuffer;

/**
 * 非多线程安全的 可变长度的 字符串（相对于 {@link java.lang.String} 字符串变动资源开销小 ）
 *
 * @see java.lang.StringBuilder
 */
public /* final */ class StringBuilder /* extends AbstractStringBuilder */ implements java.io.Serializable, CharSequence
{
    byte[] value;
    byte coder;
    int count;
    private java.lang.StringBuilder $this;

    public StringBuilder() {
        $this = new java.lang.StringBuilder();
    }
    public StringBuilder(int capacity) {
        $this = new java.lang.StringBuilder(capacity);
    }
    public StringBuilder(String str) { $this = new java.lang.StringBuilder(str); }
    public StringBuilder(CharSequence seq) { $this = new java.lang.StringBuilder(seq); }
    public StringBuilder append(Object obj) { return new StringBuilder($this.append(obj).toString()); }
    public StringBuilder append(String str) { return new StringBuilder($this.append(str).toString()); }
    public StringBuilder append(StringBuffer sb) { return new StringBuilder($this.append(sb).toString()); }
    public StringBuilder append(CharSequence s) { return new StringBuilder($this.append(s).toString()); }
    public StringBuilder append(CharSequence s, int start, int end) { return new StringBuilder($this.append(s,start,end).toString()); }
    public StringBuilder append(char[] str) { return new StringBuilder($this.append(str).toString()); }
    public StringBuilder append(char[] str, int offset, int len) { return new StringBuilder($this.append(str,offset,len).toString()); }
    public StringBuilder append(boolean b) { return new StringBuilder($this.append(b).toString()); }
    public StringBuilder append(char c) { return new StringBuilder($this.append(c).toString()); }
    public StringBuilder append(int i) { return new StringBuilder($this.append(i).toString()); }
    public StringBuilder append(long lng) { return new StringBuilder($this.append(lng).toString()); }
    public StringBuilder append(float f) { return new StringBuilder($this.append(f).toString()); }
    public StringBuilder append(double d) { return new StringBuilder($this.append(d).toString()); }
    public StringBuilder appendCodePoint(int codePoint) {return new StringBuilder($this.appendCodePoint(codePoint).toString());}
    public StringBuilder delete(int start, int end) {return new StringBuilder($this.delete(start,end).toString());}
    public StringBuilder deleteCharAt(int index) {return new StringBuilder($this.deleteCharAt(index).toString());}
    public StringBuilder replace(int start, int end, String str) {return new StringBuilder($this.replace(start,end,str).toString());}
    public StringBuilder insert(int index, char[] str, int offset, int len) {return new StringBuilder($this.insert(index,str,offset,len).toString());}
    public StringBuilder insert(int offset, Object obj) {return new StringBuilder($this.insert(offset,obj).toString());}
    public StringBuilder insert(int offset, String str) {return new StringBuilder($this.insert(offset,str).toString());}
    public StringBuilder insert(int offset, char[] str) {return new StringBuilder($this.insert(offset,str).toString());}
    public StringBuilder insert(int dstOffset, CharSequence s) {return new StringBuilder($this.insert(dstOffset,s).toString());}
    public StringBuilder insert(int dstOffset, CharSequence s, int start, int end) {return new StringBuilder($this.insert(dstOffset,s,start,end).toString());}
    public StringBuilder insert(int offset, boolean b) {return new StringBuilder($this.insert(offset,b).toString());}
    public StringBuilder insert(int offset, char c) {return new StringBuilder($this.insert(offset,c).toString());}
    public StringBuilder insert(int offset, int i) {return new StringBuilder($this.insert(offset,i).toString());}
    public StringBuilder insert(int offset, long l) {return new StringBuilder($this.insert(offset,l).toString());}
    public StringBuilder insert(int offset, float f) {return new StringBuilder($this.insert(offset,f).toString());}
    public StringBuilder insert(int offset, double d) {return new StringBuilder($this.insert(offset,d).toString());}
    public StringBuilder reverse() { return new StringBuilder($this.reverse().toString()); }
    public int indexOf(String str) {
        return $this.indexOf(str);
    }
    public int indexOf(String str, int fromIndex){ return $this.indexOf(str,fromIndex); }
    public int lastIndexOf(String str){ return $this.indexOf(str); }
    public int lastIndexOf(String str, int fromIndex){ return $this.indexOf(str,fromIndex); }
    public String toString() {return $this.toString();}

    public int length() {
        return $this.length();
    }
    public char charAt(int index) {return $this.charAt(index);}
    public CharSequence subSequence(int start, int end) {return $this.subSequence(start,end);}

    public static void main(java.lang.String[] args) { System.out.println((new javase.data.string.StringBuilder()).getClass()); }

}
