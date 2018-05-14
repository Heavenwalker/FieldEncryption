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
        EncryptionFactory encryptionFactory ;
        AnonymizeData anonymizeData;

        configFields = readInput.specifyConfigFile();
        dataFields = readInput.specifyDataFile();
        encryptMethod=readInput.encryptionType();
        crossFields = new CrossFields(configFields,dataFields);
        crossFields.getCrossedFields();

        encryptionFactory = new EncryptionFactory(encryptMethod,crossedFields);
        crossedFields = encryptionFactory.EncryptMethod().getMap();
        anonymizeData = new AnonymizeData(crossedFields,dataFields);
        anonymizeData.mergeData();

        /*To do
        Merge anonymized data with initial dataField.

        Writer class (output file(call to TypeCheck),crossedFields)

         */

        //System.out.println(Arrays.asList(crossedFields));


    }
}
