package com.nikontem;

//Call the appropriate parser class based on the file's extension

import java.util.ArrayList;
import java.util.List;

public class DocFactory {
    public ParseDoc readDocument(String type, String path){
        ParseDoc parser =null;

        if (type.equals("config")){

            parser = new ParseConfig(path);
            parser.parseFile();
        }

        if(type.equals("txt")){
            parser = new ParseDataTxt(path);
            parser.parseFile();
        }


        return parser;

    }

    public  FileWriter writeToFile(String type, String path, List<String[]> anonymizedData){
        FileWriter fileWriter = null;

        if (type.equals("txt")){
            fileWriter = new TxtWriter(path,anonymizedData);

        }

        return fileWriter;
    }
}
