package com.nikontem;

import java.util.ArrayList;
import java.util.Map;

public class EncryptionFactory {
    private String encryptionMethod;
    private Map<String, ArrayList> crossedFields;

    public EncryptionFactory(String encryptionMethod, Map<String, ArrayList> crossedFields) {
        this.encryptionMethod = encryptionMethod;
        this.crossedFields = crossedFields;
    }

    Encryptor encryptor = null;

    public Encryptor EncryptMethod (){
        if (encryptionMethod.equals("AES")){
            encryptor = new AESEncryption(crossedFields);
            encryptor.Encrypt();
        }
        return encryptor;
    }


}
