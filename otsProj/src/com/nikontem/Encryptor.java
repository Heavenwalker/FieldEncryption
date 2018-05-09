package com.nikontem;

import java.util.List;

public abstract class Encryptor {
    List<String> configFields;
    List<String> dataFields;

    public Encryptor(List<String> configFields, List<String> dataFields) {
        this.configFields = configFields;
        this.dataFields = dataFields;
    }



    public abstract  String Encryptor();

    public abstract String getCipher();

    public List<String> getDataFields() {
        return dataFields;
    }

    public List<String> getConfigFields() {
        return configFields;
    }
}
