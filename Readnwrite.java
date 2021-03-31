/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readnwrite;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author sande
 */
public class Readnwrite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter input file name");
        String filename = scan.nextLine();
        File f = new File(filename);
        Scanner infile = new Scanner(f);
        FileWriter fw = new FileWriter("output.txt");
        PrintWriter pw = new PrintWriter(fw);
        String commas = "";
        while (infile.hasNextLine()){
            String alphabet = infile.nextLine();
            pw.println();
            for (int i = 0; i < alphabet.length(); i++){
                if (alphabet.charAt(i) == ','){
                    commas = commas + alphabet.charAt(i);
                } else {
                    pw.print(alphabet.charAt(i));
                }
            }
        }
        System.out.println("Detected " + commas.length() + " commas.");
        pw.close(); 
        infile.close();
    }
    
}
