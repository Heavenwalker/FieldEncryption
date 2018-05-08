package com.nikontem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParseDataTxt extends ParseDoc {
    private String filePath = getPath();
    private File dataFile = new File(filePath);
    private List<String> fields = new ArrayList<String>();

    public ParseDataTxt(String path) {
        super(path);
    }

    @Override
    public void parseFile() {

        emptyFile(dataFile);

        try (Scanner newScan = new Scanner(dataFile).useDelimiter("\t")) {
            while(newScan.hasNext()){
                fields.add(newScan.next());
            }
            newScan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(fields.get(4));

    }

    @Override
    List<String> getFields() {
        return null;
    }
}
