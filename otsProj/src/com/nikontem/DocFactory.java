package com.nikontem;

public class DocFactory {
    public void readDocument(String type, String path){
        ParseDoc parser =null;

        if (type.equals("tsv")){
            parser = new ParseTsv(path);
            parser.parseFile();
        }

    }
}
