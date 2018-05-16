package com.nikontem;


import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
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
        dataFields = anonymizeData.getCypherFields();
        try {
            readInput.specifyOutput(dataFields);
        } catch (IOException e) {
            e.printStackTrace();
        }



        /*To do
        Merge anonymized data with initial dataField.

        Writer class (output file(call to TypeCheck),crossedFields)

         */

        //System.out.println(Arrays.asList(crossedFields));


    }
}
