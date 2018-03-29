package language.data.number;

/**
 * @see java.lang.Number
 * 整型:
 * 整型常量有3种表示方法：
 *  十进制整数: 如24、-36、33。
 *  八进制整数: 以0开头，如0121表示十进制数81，-012表示十进制数-10。
 *  十六进制整数: 以0x或0X开头，如0x121表示十进制数290，-0X11表示十进制数-17。
 *  long型:数字后加L或l，例：123L表示一个长整数，它在机器中占64位（默认int型占32位）。
 * 整型变量：
 *  byte    1(字节) 8(位)
 *  short   2 字节) 16(位)
 *  int     4(字节) 32(位)
 *  long    8(字节) 64(位)
 *  e.g:
 *  byte a = 3; //指定变量a为byte型
 *  short b = 04; //指定变量b为short型
 *  int c = 0x5; //指定变量c为int型
 *  long l = 61; //指定变量l为long型
 *  浮点型（实型）:
 * 浮点型常量:
 *  十进制数形式，由数字和小数点组成，且必须有小数点，如0.123、.123、123.或123.0。
 *  科学记数法形式，如1.23e3或123E3，其中e或E之前必须有数，且e或E后面的指数必须为整数。
 *  浮点型常量在机器中占64位，具有double型的值。对于float型的值，要在数字后加f或F，如12.3F，它在机器中占32位，且表示精度较低。
 * 浮点型变量:
 *  float   4(字节) 32(位) 4e-038~3.4e+038
 *  double  8(字节) 64(位) 1.7e-308~1.7e308
 *  e.g:
 *  float e = 33.3f;//指定变量a为float型
 *  double f = 44.4;//指定变量b为double型
 */
abstract class Number extends java.lang.Number
{
    public abstract int intValue();
    public abstract long longValue();
    public abstract float floatValue();
    public abstract double doubleValue();

    public byte byteValue() {
        return (byte)intValue();
    }
    public short shortValue() {
        return (short)intValue();
    }

    /** use serialVersionUID from JDK 1.0.2 for interoperability */
    private static final long serialVersionUID = -8742448824652078965L;
}
