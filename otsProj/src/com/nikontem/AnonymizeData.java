package com.nikontem;

import java.util.*;

public class AnonymizeData {

    Map<String, ArrayList> encryptedData = new HashMap<>();
    List<String[]> cypherFields = new ArrayList<>();

    public AnonymizeData(Map<String, ArrayList> encryptedData, List<String[]> cypherFields) {
        this.encryptedData = encryptedData;
        this.cypherFields = cypherFields;
    }

   public void mergeData() {

        for (Map.Entry<String, ArrayList> entry : encryptedData.entrySet()) {
            for (int i = 0; i< cypherFields.get(0).length; i++){
                if(cypherFields.get(0)[i].equals(entry.getKey())){
                    //System.out.println(cypherFields.get(0)[i]);
                    for (String[] fields: cypherFields){
                        for (int j = 0; j<entry.getValue().size(); j++){
                            if (cypherFields.get(0)[i].equals(fields[i])){}
                            else {

                                fields[i] = entry.getValue().get(j).toString();
                               // System.out.println(Arrays.toString(fields));
                                break;
                            }
                        }

                    }
                }
            }
        }



    }

    public Map<String, ArrayList> getEncryptedData() {
        return encryptedData;
    }
}
