package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Diego Figueroa
 */

import java.io.FileNotFoundException;

public class Solution42 {

    //method that reads the file and stores data into Employee class
    //use a while loop to store all names in an ArrayList
    public static void main(String[] args) {
        dataTable x = new dataTable();

        try{
            x.readData();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try{
            x.printData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //have a method that prints every employee
    //String(counter: data)
        //use method in employee class that prints employees parsed




}

    /*
    //call Employee
    //try to read file
    //catch FileNotFoundException

    //try to print to output file
    //catch FileNotFoundException
*/