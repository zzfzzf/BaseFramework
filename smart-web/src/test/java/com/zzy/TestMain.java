package com.zzy;

/**
 * Created by Administrator on 2017/3/22.
 */
import sun.security.provider.MD5;

import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class TestMain {

    public static void main(String[] args) throws Exception {
    	Map<String,Object> map = new HashMap<String,Object>();
    	map.put("a", new A());
        System.out.println(map.get("a") instanceof B);


    }

}
class A {
	
}
class B {
	
}