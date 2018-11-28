package javase.data.string.base64;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/**
 * This class consists exclusively of static methods for obtaining
 * encoders and decoders for the Base64 encoding scheme. The
 * implementation of this class supports the following types of Base64
 * as specified in
 * <a href="http://www.ietf.org/rfc/rfc4648.txt">RFC 4648</a> and
 * <a href="http://www.ietf.org/rfc/rfc2045.txt">RFC 2045</a>.
 *
 * @see java.util.Base64
 */
public class Base64 {

    public static java.util.Base64.Encoder getEncoder(){ return java.util.Base64.getEncoder(); }
    public static java.util.Base64.Encoder getUrlEncoder(){ return java.util.Base64.getUrlEncoder(); }
    public static java.util.Base64.Encoder getMimeEncoder(){ return java.util.Base64.getMimeEncoder(); }
    public static java.util.Base64.Encoder getMimeEncoder(int lineLength, byte[] lineSeparator){ return java.util.Base64.getMimeEncoder(lineLength,lineSeparator); }

    public static java.util.Base64.Decoder getDecoder(){ return java.util.Base64.getDecoder(); }
    public static java.util.Base64.Decoder getUrlDecoder(){ return java.util.Base64.getUrlDecoder(); }
    public static java.util.Base64.Decoder getMimeDecoder(){ return java.util.Base64.getMimeDecoder(); }

    public static class Encoder{
        java.util.Base64.Encoder $this;

        public byte[] encode(byte[] src){return $this.encode(src);}
        public int encode(byte[] src, byte[] dst){return $this.encode(src,dst);}
        public String encodeToString(byte[] src){return $this.encodeToString(src);}
        public ByteBuffer encode(ByteBuffer buffer){return $this.encode(buffer);}
        public OutputStream wrap(OutputStream os){return $this.wrap(os);}
        public java.util.Base64.Encoder withoutPadding(){return $this.withoutPadding();}
    }

    public static class Decoder {
        java.util.Base64.Decoder $this;

        public byte[] decode(byte[] src){return $this.decode(src);}
        public byte[] decode(String src){return $this.decode(src);}
        public int decode(byte[] src, byte[] dst){return $this.decode(src,dst);}
        public ByteBuffer decode(ByteBuffer buffer){return $this.decode(buffer);}
        public InputStream wrap(InputStream is){return $this.wrap(is);}

    }
}
