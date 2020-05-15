package test.javase.security;

import javase.data.string.base64.Base64;
import org.junit.Test;

import java.security.MessageDigest;

public class Security {
    @Test
    public void md5() throws Exception{
        String str = "test123456";
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = messageDigest.digest(str.getBytes());
        System.out.println(new String(bytes));
    }

    @Test
    public void base64(){
        String str = "test123456";
        byte[] bytes = Base64.getEncoder().encode(str.getBytes());
        System.out.println(new String(bytes));
    }

}
