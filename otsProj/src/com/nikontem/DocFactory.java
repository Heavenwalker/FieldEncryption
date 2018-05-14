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
}
