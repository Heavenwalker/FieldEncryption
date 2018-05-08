package com.nikontem;

import java.util.List;
import java.util.Scanner;

public class FileReader {

    private String configFile = ""; //This can only be txt
    private String toEncrypt = ""; //This can't be txt
    private String outputFile = ""; // txt or same as "toEncrypt" data file ?
    private String fileType;
    private List<String> encyptFields;
    private TypeCheck typeChecker = new TypeCheck();
    private DocFactory docker = new DocFactory();
    private ParseDoc docparser;
    Scanner scanner = new Scanner(System.in);

    public void specifyData() {

    }


    public void specifyOutput() {

    }


    public boolean noFileName(String fileName) {
        if (fileName.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public List<String> specifyConfig() {


        System.out.println("Specify the config file");
        configFile = scanner.nextLine();

        while (noFileName(configFile) || !typeChecker.getFileExtension(configFile).equals("txt")) {
            System.out.println("You did not specify a file name, or it's not in a txt format.");
            configFile = scanner.nextLine();
        }

        docparser = docker.readDocument("config", configFile);
        encyptFields = docparser.getFields();
        return encyptFields;
    }


//            if (toEncrypt.isEmpty()){
//                System.out.println("Specify input file");
//                toEncrypt = scanner.nextLine();
//                fileType = typeChecker.getFileExtension(toEncrypt);
//            }
//
//            if (outputFile.isEmpty()){
//                System.out.println("Specify the output file");
//                outputFile = scanner.nextLine();
//                fileType = typeChecker.getFileExtension(outputFile);
//            }


    public String geConfigFile() {
        return configFile;
    }

    public String getToEncrypt() {
        return toEncrypt;
    }

    public String getOutputFile() {
        return outputFile;
    }
}


