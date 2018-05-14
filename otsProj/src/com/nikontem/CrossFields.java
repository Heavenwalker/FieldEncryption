package com.nikontem;

import java.util.*;

public class CrossFields {

    private List<String []> configFields;
    private List<String []> dataFields;
    private Map<String, List<String>>crossedFields = new HashMap<>();

    public CrossFields(List<String[]> configFields, List<String[]> dataFields) {
        this.configFields = configFields;
        this.dataFields = dataFields;
    }




//    configFields = readInput.specifyConfigFile();
//    dataFields = readInput.specifyDataFile();
//    crossedFields= new CrossFields(configFields,dataFields);


    private Map<String, List<String>> CrossOver(){
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
                if (dataFields.get(0)[Integer.parseInt(crossindex.get(i))].equals(dataColumn[Integer.parseInt(crossindex.get(i))])){
                }
                else{
                    tempArray.add(dataColumn[Integer.parseInt(crossindex.get(i))]);
                }
            }

            crossedFields.put(dataFields.get(0)[Integer.parseInt(crossindex.get(i))],tempArray);
        }

        System.out.println(Arrays.asList(crossedFields));

        return crossedFields;
    }

    public Map<String, List<String>> getCrossedFields() {
        return CrossOver();
    }

}
