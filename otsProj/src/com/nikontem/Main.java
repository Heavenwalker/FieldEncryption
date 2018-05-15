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
        Encryptor encryptor;

        configFields = readInput.specifyConfigFile();
        dataFields = readInput.specifyDataFile();
        encryptMethod=readInput.encryptionType();
        crossFields = new CrossFields(configFields,dataFields);
        crossedFields = crossFields.getCrossedFields();

        encryptionFactory = new EncryptionFactory(encryptMethod,crossedFields);
        encryptor = encryptionFactory.EncryptMethod();
        crossedFields=encryptor.getMap();
        anonymizeData = new AnonymizeData(crossedFields,dataFields);

        for (String [] e : anonymizeData.getCypherFields()){
            System.out.println(Arrays.toString(e));
        }


        /*To do
        Merge anonymized data with initial dataField.

        Writer class (output file(call to TypeCheck),crossedFields)

         */

        //System.out.println(Arrays.asList(crossedFields));


    }
}
