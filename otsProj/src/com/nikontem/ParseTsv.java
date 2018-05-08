package com.nikontem;

import java.io.*;
import com.univocity.parsers.tsv.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

public class ParseTsv extends ParseDoc {
    public ParseTsv(String path) {
        super(path);
    }




    @Override
    public void parseFile() {

        File f = new File(getPath());
        TsvParserSettings settings = new TsvParserSettings();

        settings.getFormat().setLineSeparator("\r\n");
        TsvParser parser = new TsvParser(settings);
        ArrayList<String[]> rows = new ArrayList<String[]>();
        List<String[]> row=parser.parseAll(f);
        System.out.println(row.size());
        for( int i=0 ; i<row.size(); i ++){
            System.out.println(Arrays.toString(row.get(0)));
        }




    }
}
