package com.nikontem;

import java.util.Scanner;

public class FileReader {
    private String fieldFile=""; //This can only be txt
    private String toEncrypt=""; //This can't be txt
    private String outputFile=""; // txt or same as "toEncrypt" data file ?
    private String fileType;
    private TypeCheck typeChecker = new TypeCheck();
    private DocFactory docker = new DocFactory();

    public void fileScanner() {
        Scanner scanner = new Scanner(System.in);


        while( fieldFile.isEmpty() && toEncrypt.isEmpty() && outputFile.isEmpty())
            if (fieldFile.isEmpty()) {
                System.out.println("Specify the config file");
                fieldFile = scanner.nextLine();
                fileType = typeChecker.getFileExtension(fieldFile);
                scanner.close();
                docker.readDocument(fileType, fieldFile);
                //scanner.next();

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
    }

    public String getFieldFile() {
        return fieldFile;
    }

    public String getToEncrypt() {
        return toEncrypt;
    }

    public String getOutputFile() {
        return outputFile;
    }
}
