package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Diego Figueroa
 */


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Solution45 {
    //main
    public static void main(String[] args) throws IOException {
        final Scanner input = new Scanner(System.in);

        //creates WordFinder
        WordFinder x = new WordFinder();
        //replaces instances
        x.readFile();
        x.replaceText();
        //get Text
        System.out.printf("WHat will be the output file? ");
        String newFileName = input.nextLine();
        x.createOutput(newFileName);
    }


}
