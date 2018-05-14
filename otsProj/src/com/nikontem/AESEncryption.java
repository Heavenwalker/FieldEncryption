package com.nikontem;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.util.*;
import javax.xml.bind.DatatypeConverter;


public class AESEncryption extends Encryptor {
    private Map<String,ArrayList> hashmaps = new HashMap<>();

    public AESEncryption(Map<String, ArrayList> crossedFields) {
        super(crossedFields);
    }

    @Override
    Map<String, ArrayList> Encrypt() {
        String key = "Bar12345Bar12345";
        try {
            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");
            ArrayList<String> tempEncode = new ArrayList<>();

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec);

           System.out.println(Arrays.asList(crossedFields));
//            for (Map.Entry<String, ArrayList> entry : crossedFields.entrySet()) {
//
//                System.out.println(Arrays.asList(entry));
//
////                for (int i = 0; i < entry.getValue().size(); i++) {
////
////                    byte[] encrypted = cipher.doFinal(entry.getValue().get(i).toString().getBytes());
////                    tempEncode.add(DatatypeConverter.printBase64Binary(encrypted));
////                   // System.out.println(Arrays.asList(entry.getKey() + " is " + entry.getValue().get(i) + " encypted it is " + DatatypeConverter.printBase64Binary(encrypted)));
////                }
////                hashmaps.put(entry.getKey(),tempEncode);
////                crossedFields.entrySet().remove(entry.getKey());
////                System.out.println(Arrays.asList(crossedFields));
//
//
//
//            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return  hashmaps;
    }

    @Override
    Map<String, ArrayList> getMap() {
        return Encrypt();
    }
}
