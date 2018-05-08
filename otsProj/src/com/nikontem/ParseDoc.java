package com.nikontem;
import java.util.List;
import java.io.File;

public abstract class ParseDoc {
    private List<String> fields;
    private String path;


    public ParseDoc(String path) {
        this.path = path;
    }

    public abstract void parseFile();

    public List<String> getFields() {
        return fields;
    }

    public String getPath() {
        return path;
    }
}

