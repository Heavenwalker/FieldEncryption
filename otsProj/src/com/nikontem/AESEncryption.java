package com.nikontem;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class AESEncryption extends Encryptor {

    public AESEncryption(Map<String, ArrayList> crossedFields) {
        super(crossedFields);
    }

    @Override
    void Encrypt() {
        String key = "Bar12345Bar12345";
        try {
                SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                cipher.init(Cipher.ENCRYPT_MODE, skeySpec);

                byte[] encrypted = cipher.doFinal();
            }catch (Exception ex) {
                ex.printStackTrace();
            }

    }

    @Override
    List<String[]> getMap() {
        return null;
    }
}
