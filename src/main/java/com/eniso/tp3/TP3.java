/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp3;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author Hatto
 */
public class TP3 {

    public static void main(String[] args) throws FileNotFoundException {
        FileHandler fileHandler = new FileHandler ("file.log");
        int lineIndexToReverse=1;
        fileHandler.reverseString(lineIndexToReverse);
        int  lineIndexToRemoveDuplicates=2;
        fileHandler.removeDuplicates(lineIndexToRemoveDuplicates);
        String pattern="epoch";
        ArrayList<String> linesWithPattern=fileHandler.findLinesWithPattern( pattern );
        String str1="hello";
        String str2="Hello";
        System.out.println("comparaison avec equals :"+fileHandler.CompareStrings1(str1,str2));
       String str5="hello";
        String str6="HELLO";
         System.out.println("comparaison avec equalsIgnoreCase :"+fileHandler.CompareStrings3(str5,str6));
          String str7="hello";
        String str8="hello";
         System.out.println("comparaison avec == :"+fileHandler.CompareStrings2(str7,str8));
         System.out.println("comparaison avec == :"+fileHandler.CompareStrings2(new String ("hello"),"hello"));
         
       System.out.println("comparaison avec == :"+fileHandler.CompareStrings2(new String ("hello"),new String ("hello")));  
        System.out.println("ligne contenant le motif '"+pattern+"':"+linesWithPattern.get(0));  

        
        
        
String key = "secret";
String plaintext "Hell, World";
XORCipher xorcipher = new XORCipher (key);
String encryptedtext xorCipher encrypt (plaintext);
System.out.println("texte chiffré : " + encryptedText);
String decryptedtext xorCipher.decrypt (encryptedText);
System.out.println("Texte dechiftra: "+ decryptedText);
        
    }
}
 