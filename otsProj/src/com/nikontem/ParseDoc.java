package com.nikontem;

import java.util.List;


public abstract class ParseDoc {

    private String path;


    public ParseDoc(String path) {
        this.path = path;
    }

    abstract void parseFile();

    abstract List<String> getFields();

    public String getPath() {
        return path;
    }
}

