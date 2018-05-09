package com.nikontem;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.util.List;


public class AESEncryption extends Encryptor {

    public AESEncryption(List<String> configFields, List<String> dataFields) {
        super(configFields, dataFields);
    }

    @Override
    public String Encryptor() {
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
    public String getCipher() {
        return null;
    }
}
