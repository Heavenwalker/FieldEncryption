package com.nikontem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CrossFields {

    private List<String []> configFields;
    private List<String []> dataFields;
    private Map<String, ArrayList> crossedFields = new HashMap<>();

    public CrossFields(List<String[]> configFields, List<String[]> dataFields) {
        this.configFields = configFields;
        this.dataFields = dataFields;
    }




//    configFields = readInput.specifyConfigFile();
//    dataFields = readInput.specifyDataFile();
//    crossedFields= new CrossFields(configFields,dataFields);


    private Map<String, ArrayList> CrossOver(){
        List<String> crossindex = new ArrayList<>();

        for(String e : configFields.get(0)){
            for (int i = 0; i< dataFields.get(0).length; i++){
                if(dataFields.get(0)[i].equals(e)){
                    crossindex.add(Integer.toString(i));
                }
            }
        }

        for(int i=0; i<crossindex.size(); i++){
            ArrayList<String> tempArray = new ArrayList<>();
            for(String[] dataColumn: dataFields){
                if (dataFields.get(0)[i].equals(dataColumn[i])){}
                else{
                    tempArray.add(dataColumn[i]);
                }
            }
            crossedFields.put(dataFields.get(0)[i],tempArray);
        }



        return crossedFields;
    }

    public Map<String, ArrayList> getCrossedFields() {
        return CrossOver();
    }

}
