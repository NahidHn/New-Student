/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew.student;

import com.sun.corba.se.impl.orbutil.closure.Constant;
import com.sun.org.apache.bcel.internal.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class StudentlistJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        String decision = null ;
        do {
            System.out.println("1. Show all student");
            System.out.println("2. Show random student");
            System.out.println("3. Show number of students");
            System.out.println("4. Add a student");
            System.out.println("5. Find a student");

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter option(1-5):");
            int option = sc.nextInt();

            if (option == 1) {
                File file;
                file = new File(Constants.TEXT_FILE_NAME);
                BufferedReader br = null;
                try {
                    br = new BufferedReader(new FileReader(file));
                } catch (FileNotFoundException ex) {
                    System.out.println("Exception : " + ex.toString());
                }
                String st;
                while ((st = br.readLine()) != null) {
                    if (st.equals("")) {
                        continue;
                    }
                    System.out.println(st);
                }
            }
            
            
             
        }while(decision.equals("Y") ||decision.equals("y"));
      
    }

    public static int randInt(int min, int max) {
        Random rand = new Random();

        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    public static int getNumberOfStudent() throws IOException {
        File file;
        file = new File(Constants.TEXT_FILE_NAME);
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException ex) {
            System.out.println("Exception : " + ex.toString());
        }
        String st;
        int count = 0;
        while ((st = br.readLine()) != null) {
            if (st.equals("")) {
                continue;
            }
            count = count + 1;
        }
        return count;
    }

}
