package com.nikontem;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String[]> configFields = new ArrayList<String[]>();
        List<String[]> dataFields = new ArrayList<String[]>();
        ReadInput readInput = new ReadInput();
        List<String> set = new ArrayList<>();


        configFields = readInput.specifyConfigFile();
        dataFields = readInput.specifyDataFile();

        for (String e : configFields.get(0)){
            System.out.println(e);

            for (int i =0; i<dataFields.get(0).length; i++) {
                if (dataFields.get(0)[i].equals(e)) {

                    set.add(e);
                }
            }
        }
        System.out.println(set);

    }
}
