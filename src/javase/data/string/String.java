package javase.data.string;

import java.io.ObjectStreamField;
import java.io.UnsupportedEncodingException;
import java.lang.Object;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.stream.IntStream;

/**
 * 字符型常量:
 *  字符型常量是用单引号括起来的一个字符，如'a'、'A'。
 *  Java提供的转义字符，以反斜杠（\）开头(它表示Unicode集，而不仅仅是ASCII集):
 *      \ddd    1到3位8进制数据所表示的字符(ddd)
 *      \udddd  1到4位16进制数所表示的字符(dddd)
 *      \'      单引号字符
 *      \\      反斜杠字符
 *      \r      回车
 *      \n      换行
 *      \f      走纸换页
 *      \t      横向跳格
 *      \b      退格
 * 字符型变量:
 *  字符型变量的类型为char，它在机器中占16位，其范围为0～65535。
 * 字符串常量
 *  Java的字符串常量是用双引号括起来的一串字符，如"Hello world!\n"。
 *  Java中的字符串常量是作为String类的一个对象(String类提供了很多方便的对字符串操作的方法。)。
 *
 *  public char c = 'a';//指定变量c为char型，且赋初值为'a'
 *  public char chars[]={'a','b','c'};
 *  String s=new String(chars);
 * @see java.lang.String
 */
class /* final */ String implements java.io.Serializable, Comparable<java.lang.String>, CharSequence
{

    //private final byte[] value;
    //private final byte coder;
    private int hash; // Default to 0
    private static final long serialVersionUID = -6849794470754667710L;
    static final boolean COMPACT_STRINGS;
    static { COMPACT_STRINGS = true; }
    private static final ObjectStreamField[] serialPersistentFields = new ObjectStreamField[0];

    public java.lang.String string = "";

    // 构造
    public java.lang.String String() { return string;}
    public java.lang.String String(char value[]) { return new java.lang.String(value);}
    public java.lang.String String(char value[], int offset, int count) { return new java.lang.String(value,offset,count);}
    public java.lang.String String(byte ascii[], int hibyte){ return new java.lang.String(ascii,hibyte); }
    public java.lang.String String(byte ascii[], int hibyte, int offset, int count) { return new java.lang.String(ascii,hibyte,offset,count);}
    public java.lang.String String(byte bytes[]){return new java.lang.String(bytes);}
    public java.lang.String String(byte bytes[], int offset, int length, java.lang.String charsetName)throws UnsupportedEncodingException { return new java.lang.String(bytes,offset,length,charsetName); }
    public java.lang.String String(byte bytes[], int offset, int length, Charset charset){return new java.lang.String(bytes,offset,length,charset);}
    public java.lang.String String(byte bytes[], int offset, int length) {return new java.lang.String(bytes,offset,length);}
    public java.lang.String String(byte bytes[], Charset charset){return new java.lang.String(bytes,charset);}
    public java.lang.String String(byte bytes[], java.lang.String charsetName)throws UnsupportedEncodingException{return new java.lang.String(bytes,charsetName);}
    public java.lang.String String(java.lang.String original) { return new java.lang.String(original); }
    public java.lang.String String(int codePoints[], int offset, int count) { return new java.lang.String(codePoints,offset,count); }
    public java.lang.String String(java.lang.StringBuffer buffer){return new java.lang.String(buffer);}
    public java.lang.String String(java.lang.StringBuilder builder){return new java.lang.String(builder);}

    // 长度
    public int length(){ return string.length(); }// 字符串的长度
    // 字符 转换
    public char charAt(int index){ return string.charAt(index); }// 截取一个字符
    public int indexOf(int ch){return string.indexOf(ch);}
    public int indexOf(java.lang.String str){return string.indexOf(str);}
    public int indexOf(int ch, int fromIndex){return string.indexOf(ch,fromIndex);}
    public int indexOf(java.lang.String str, int fromIndex){return string.indexOf(str,fromIndex);}
    public int lastIndexOf(int ch){return string.lastIndexOf(ch);}
    public int lastIndexOf(java.lang.String str){return string.lastIndexOf(str);}
    public int lastIndexOf(int ch, int fromIndex){return string.lastIndexOf(ch,fromIndex);}
    public int lastIndexOf(java.lang.String str, int fromIndex){return string.lastIndexOf(str,fromIndex);}
    public IntStream chars(){return string.chars(); }
    public IntStream codePoints(){return string.codePoints(); }
    public char[] toCharArray(){return string.toCharArray(); }
    // 比较
    public boolean equals(Object anObject) {return string.equals(anObject);}
    public boolean contentEquals(CharSequence sb){return string.contentEquals(sb);}
    public boolean contentEquals(java.lang.StringBuffer sb){return string.contentEquals(sb);}
    public boolean equalsIgnoreCase(java.lang.String anotherString){return string.equalsIgnoreCase(anotherString);}
    public int compareTo(java.lang.String anotherString){return string.compareTo(anotherString);}
    public int compareToIgnoreCase(java.lang.String str){return string.compareToIgnoreCase(str);}
    public boolean regionMatches(int toffset, java.lang.String other, int ooffset, int len){return string.regionMatches(toffset,other,ooffset,len);}
    public boolean regionMatches(boolean ignoreCase, int toffset,java.lang.String other, int ooffset, int len){return string.regionMatches(ignoreCase,toffset,other,ooffset,len);}
    public boolean isEmpty() {return string.isEmpty();} // 是否空
    // 前后缀
    public boolean startsWith(java.lang.String prefix) {return string.startsWith(prefix);}
    public boolean startsWith(java.lang.String prefix, int toffset) {return string.startsWith(prefix,toffset);}
    public boolean endsWith(java.lang.String suffix){return string.endsWith(suffix);}
    // 摘要
    public int hashCode(){return string.hashCode();}
    // 截取 转换(字节) 剪切
    public void getChars(int srcBegin, int srcEnd, char dst[], int dstBegin){ string.getChars(srcBegin,srcEnd,dst,dstBegin); }//
    public void getBytes(int srcBegin, int srcEnd, byte dst[], int dstBegin){ string.getBytes(srcBegin,srcEnd,dst,dstBegin); }//
    public byte[] getBytes(java.lang.String charsetName)throws UnsupportedEncodingException {return string.getBytes(charsetName);}
    public byte[] getBytes(Charset charset) { return string.getBytes(charset); }
    public int codePointAt(int index){ return string.codePointAt(index); }// 获得指定位置处的字符
    public int codePointBefore(int index){ return string.codePointBefore(index); }
    public int codePointCount(int beginIndex, int endIndex){ return string.codePointCount(beginIndex,endIndex); }
    public int offsetByCodePoints(int index, int codePointOffset){ return string.offsetByCodePoints(index,codePointOffset); }
    public java.lang.String substring(int beginIndex){return string.substring(beginIndex);}
    public java.lang.String substring(int beginIndex, int endIndex){return string.substring(beginIndex,endIndex);}
    public java.lang.CharSequence subSequence(int beginIndex, int endIndex){return string.subSequence(beginIndex,endIndex);}
    public java.lang.String concat(java.lang.String str) {return string.concat(str);}
    public java.lang.String trim() {return string.trim();}
    // 正则 替换 匹配
    public java.lang.String replace(char oldChar, char newChar){return string.replace(oldChar,newChar);}
    public java.lang.String replace(CharSequence target, CharSequence replacement){return string.replace(target,replacement);}
    public java.lang.String replaceFirst(java.lang.String regex, java.lang.String replacement){return string.replaceFirst(regex,replacement);}
    public java.lang.String replaceAll(java.lang.String regex, java.lang.String replacement){return string.replaceAll(regex,replacement);}
    public boolean matches(java.lang.String regex){return string.matches(regex);}
    // 包含 大小写
    public boolean contains(CharSequence s){return string.contains(s);}
    public java.lang.String toLowerCase(){return string.toLowerCase();}
    public java.lang.String toLowerCase(Locale locale){return string.toLowerCase(locale);}
    public java.lang.String toUpperCase(){return string.toUpperCase();}
    public java.lang.String toUpperCase(Locale locale){return string.toUpperCase(locale);}
    // 分割 拼接 数组转换
    public java.lang.String[] split(java.lang.String regex){return string.split(regex);}
    public java.lang.String[] split(java.lang.String regex, int limit){return string.split(regex,limit);}
    public static java.lang.String join(CharSequence delimiter, CharSequence... elements){return java.lang.String.join(delimiter,elements);}
    public static java.lang.String join(CharSequence delimiter,Iterable<? extends CharSequence> elements){return java.lang.String.join(delimiter,elements);}
    // 转换 格式化
    public java.lang.String toString(){return string.toString();}
    public static java.lang.String format(java.lang.String format, Object... args){return java.lang.String.format(format,args);}
    public static java.lang.String format(Locale l, java.lang.String format, Object... args) {return java.lang.String.format(l,format,args);}
    // 类型比较
    public static java.lang.String valueOf(Object obj){return java.lang.String.valueOf(obj);}
    public static java.lang.String valueOf(char data[]){return java.lang.String.valueOf(data);}
    public static java.lang.String valueOf(char data[], int offset, int count){return java.lang.String.valueOf(data,offset,count);}
    public static java.lang.String valueOf(boolean b){return java.lang.String.valueOf(b);}
    public static java.lang.String valueOf(char c){return java.lang.String.valueOf(c);}
    public static java.lang.String valueOf(int i){return java.lang.String.valueOf(i);}
    public static java.lang.String valueOf(long l){return java.lang.String.valueOf(l);}
    public static java.lang.String valueOf(float f){return java.lang.String.valueOf(f);}
    public static java.lang.String valueOf(double d){return java.lang.String.valueOf(d);}
    public static java.lang.String copyValueOf(char data[]){return java.lang.String.copyValueOf(data);}
    public static java.lang.String copyValueOf(char data[], int offset, int count){return java.lang.String.copyValueOf(data,offset,count);}

    public static void main(java.lang.String[] args)
    {
        System.out.print("JAVA LanguageStatement\\DataType\\String");
        java.lang.String $str = "你好，时间！";
        System.out.print("\nlength():"+$str.length());
        System.out.print("\ncharAt(0):"+$str.charAt(0));
        System.out.print("\ncharAt(1):"+$str.charAt(1));
        System.out.print("\ncodePointAt(1):"+$str.codePointAt(1));
        System.out.print("\nindexOf(String):"+$str.indexOf("时间"));
        System.out.print("\nlastIndexOf(String):"+$str.lastIndexOf("时间"));
        System.out.print("\nsubstring(String):"+$str.substring(1,4));
        System.out.print("\nreplace(String):"+$str.replace("时间","世界"));
    }
}
