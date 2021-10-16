package baseline;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Diego Figueroa
 */

public class Solution43 {
    public static void main(String[] args) throws IOException {
        final Scanner input = new Scanner(System.in);

        String siteName = "";
        String siteAuthor = "";
        String java = "n";
        String css = "n";
        String sitePath = "";


        //create website
        Website solution = new Website();


        //ask user for name of site
        //store in siteName
        System.out.printf("Site name: ");
        siteName = input.nextLine();

        solution.siteName = siteName;

        //ask user for name of author
        //store in siteAuthor
        System.out.printf("Author: ");
        siteAuthor = input.nextLine();

        solution.siteAuthor = siteAuthor;

        //ask user if want folder for javascript
        //answer is in char --> can either be y || Y || yes
        System.out.printf("Do you want a folder for JavaScript? ");
        java = input.nextLine();

        //ask user if want folder for CSS
        //answer is in char --> can either be y || Y || yes
        System.out.printf("Do you want a folder for CSS? ");
        css = input.nextLine();

        //create website
        sitePath = "C:/Users/diego/Desktop/UCF Fall 21'/COP3223/assignment04/exercise43/";
        solution.startingPath = sitePath;

        System.out.printf("Created: " + solution.makeFolder()+"%n");
        System.out.printf("Created: "+ solution.makeIndexHTML()+"%n");

        if (java.equals("y") || java.equals("Y") || java.equals("yes")) {
            System.out.printf("Created: " + solution.makeJavaFolder() + "%n");
        }

        if (css.equals("y") || css.equals("Y") || css.equals("yes")) {
            System.out.printf("Created: " + solution.makeCSSFolder()+"%n");
        }

        //generate an index.html file
        //place siteName inside <title> tag
        //place siteAuthor inside <meta> tag
        input.close();
    }

}
