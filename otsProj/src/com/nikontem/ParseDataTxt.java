package com.nikontem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ParseDataTxt extends ParseDoc {
    private String filePath = getPath();
    private File dataFile = new File(filePath);
    private List<String []> fields = new ArrayList<String []>();

    private HashMap dict = new HashMap<String, ArrayList<String>>();

    public ParseDataTxt(String path) {
        super(path);
    }

    @Override
    public void parseFile() {

        emptyFile(dataFile);

        try (Scanner newScan = new Scanner(dataFile).useDelimiter("\\t|\\n")) {
            String[] nextLine;
            while (newScan.hasNext()) {
                nextLine = newScan.nextLine().split("\\t");
                fields.add(nextLine);
                // System.out.println("findDelimiter is " + findDelimiter + " at " + fields.size());
            }
            newScan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        String[] col;
//        for(String[] fild : fields) {
//            System.out.println(fild[0]);
//
//
//        }

//        col = fields.get(0)[0].split("\n");



        /* THIS SHOULD BE USED IN THE ENCRYPTING CLASS*/

//        private int rows;
//        private int columns;
//        private String[][] dataFields;
//        rows = fields.size();
//        columns = fields.get(0).split("\t").length;
//        dataFields = new String[rows][columns];
//
//
//        for (int i = 0; i < fields.size(); i++) {
//            String[] dataValues = fields.get(i).split("\t");
//            dataFields[i] = new String[dataValues.length];
//            for (int columns = 0; columns < dataValues.length; columns++) {
//
//                String singleValue = dataValues[columns];
//                dataFields[i][columns] = singleValue;
//
//            }
//
//        }
//
//
//        System.out.println(dataFields.ge);
    }

    @Override
    public List<String[]> getFields() {
        return fields;
    }
}
