/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp3;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;

import java.io.FileWriter;
/**
 *
 * @author Hatto
 */
public class FileHandler {
    private String filepath ;
    private int fileSizeInkb ;
    private int numberOflines ;
    private  ArrayList <String> fileContent;
    public FileHandler (String filepath) throws FileNotFoundException{
    this.filepath= filepath  ;
    File file = new File(filepath);
     if (file.exists()) {
            System.out.println("Le chemin existe : " + filepath);
            this.fileSizeInkb=0;
            this.numberOflines=0;
            this.fileContent = new ArrayList<>();
            this.readFile();
           
     } else {
            System.out.println("Le chemin n'existe pas : " + filepath);
        }
    }
     private void readFile() throws FileNotFoundException{
       
      File myObj = new File(filepath);
      Scanner myReader = new Scanner(myObj);
      while(myReader.hasNextLine()){
          String data = myReader.nextLine();
           this.numberOflines += 1 ;
           this.fileContent.add(data);
      }
      this.fileSizeInkb = (int) myObj.length()/1024;
    } 
    public  ArrayList<String> findLinesWithPattern(String pattern) {
        ArrayList<String> linesWithPattern = new ArrayList<>();
        for (String line : fileContent) {
            if (line.contains(pattern)) {
                linesWithPattern.add(line);
            }
        }
        return linesWithPattern;
    }

    void reverseString(int lineIndexToReverse) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void removeDuplicates(int lineIndexToRemoveDuplicates) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String CompareStrings1(String str1, String str2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String CompareStrings3(String str5, String str6) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String CompareStrings2(String str7, String str8) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public class StringComparator {

    
    public static boolean compareStrings1(String str1, String str2) {
        return str1.equals(str2);
    }

    
    public static boolean compareStrings2(String str1, String str2) {
        return str1 == str2 ;
    }

    
    public static boolean compareStrings3(String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }
  

    public void reverseString(int lineIndex) {
        if (lineIndex >= 0 && lineIndex < numberOflines) {
            String line = fileContent.get(lineIndex);
            StringBuilder rev = new StringBuilder(line);
            rev.reverse();
            fileContent.set(lineIndex, rev.toString());
            
        } else {
            System.out.println("Indice de la ligne non inversée ");
        }
    }

    public void removeDuplicates(int lineIndex) {
        if (lineIndex >= 0 && lineIndex < numberOflines) {
            String line = fileContent.get(lineIndex);
            StringBuilder clean = new StringBuilder();
            for (int i = 0; i < line.length(); i++) {
                char Char = line.charAt(i);
                if (clean.indexOf(String.valueOf(Char)) == -1) {
                    clean.append(Char);
                }
            }
            fileContent.set(lineIndex, clean.toString());
           
        } else {
            System.out.println("Indice invalide ");
        }
    }
    }
}
         
     

