package edu.cscc;

import java.io.File;
import java.util.Scanner;

public class Census {
    public static void errorMessage(){
        System.out.println("Error, file name not found or wrong data type. Please try again.");
    }

    public static Surname[] loadCensusData(String fname) {
        int line = 0; // Keep track of line number in input file
        Surname[] namelist = new Surname[100];
        File file = new File(fname);
        try {
            Scanner in = new Scanner(file);
            in.useDelimiter("\n");
            while (in.hasNext()) {

                String name = "";
                int rank = 0;
                int count = 0;
                double proportion = 0d;
                String[] splitString = in.next().split(",");
                name = splitString[0];
                rank = Integer.parseInt(splitString[1]);
                count = Integer.parseInt(splitString[2]);
                proportion = Double.parseDouble(splitString[3]);
                Surname s = new Surname(name, rank, count, proportion);
                namelist[line] = s;
                line ++;
            }
        } catch(Exception e){
            errorMessage();
        }
        return namelist;
    }

}
