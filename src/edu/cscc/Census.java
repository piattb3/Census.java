package edu.cscc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Census {
    /**
     *
     * @param fname = file name
     * @return = returns array nameList
     */
    public static Surname[] loadCensusData(String fname) {
        // Keep track of line number in input file
        int line = 0;
        // New array nameList has 100 spaces because we only want the first 100 lines of the CSV file.
        Surname[] namelist = new Surname[100];
        File file = new File(fname);
        try {
            // Use scanner to read data from file into application
            Scanner in = new Scanner(file);
            // Use Delimiter to break data by new line elements
            in.useDelimiter("\n");
            // While loop to run while there is data yet to input
            while (in.hasNext() && line<100) {
                // Declare variables with data types used in file data
                String name;
                int rank;
                int count;
                double proportion;
                // Array splitString receives information and splits it apart on comma values
                String[] splitString = in.next().split(",");
                // Assign values of array positions to variables, determined through comma splits
                name = splitString[0];
                rank = Integer.parseInt(splitString[1]);
                count = Integer.parseInt(splitString[2]);
                proportion = Double.parseDouble(splitString[3]);
                Surname s = new Surname(name, rank, count, proportion);
                namelist[line] = s;
                // Use count++ to increase value of the line and move onto the next line of data.
                line ++;
            }
            // Exception prints error message
        }
        catch(Exception e){
            errorMessage();
        }
        return namelist;
    }
    public static void errorMessage(){
        System.out.println("Error, please try again.");
    }

}
