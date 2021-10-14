package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Diego Figueroa
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Solution41 {
    public static void main(String[] args) {
        //call ReadAndSort class
        ReadAndSort x = new ReadAndSort();
        ArrayList<String> names = new ArrayList<>();
        //try to read file
        //catch FileNotFoundException)
        try{
            names = x.ReadNames();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //try to sort and write file
        // catch IOException e

        try{
            x.SortNames(names);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
