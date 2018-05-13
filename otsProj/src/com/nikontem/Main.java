package com.nikontem;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String[]> configFields = new ArrayList<>();
        List<String[]> dataFields = new ArrayList<>();
        String encryptMethod;
        Map<String, ArrayList> crossedFields = new HashMap<>();
        ReadInput readInput = new ReadInput();
        CrossFields crossFields;


        configFields = readInput.specifyConfigFile();
        dataFields = readInput.specifyDataFile();
        encryptMethod=readInput.encryptionType();
        readInput.encryptionType();
        crossFields = new CrossFields(configFields,dataFields);
        crossedFields = crossFields.getCrossedFields();


        System.out.println(Arrays.asList(crossedFields));

    }
}
