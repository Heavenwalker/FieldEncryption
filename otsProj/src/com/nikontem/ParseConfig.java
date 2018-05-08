package com.nikontem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class ParseConfig extends ParseDoc {
    public ParseConfig(String path) {
        super(path);
    }

    private String filePath = getPath();
    private File configFile = new File(filePath);
    private List<String> fields = new ArrayList<String>();




    @Override
    public void parseFile() {

        emptyFile(configFile);

        try (Scanner newScan = new Scanner(configFile)) {
            while(newScan.hasNext()){
                fields.add(newScan.next());
            }
            newScan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    @Override
    public List<String> getFields() {
        return fields;
    }

}

