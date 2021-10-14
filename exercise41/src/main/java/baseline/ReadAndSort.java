package baseline;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ReadAndSort {

    //Create reads method the input text file
    //Method places all names in an arrayList
    //catch FileNotFoundException)
    public ArrayList ReadNames() throws FileNotFoundException{
        File file = new File("./data/exercise41_input.txt");
        Scanner input = new Scanner(file);

        ArrayList<String> names = new ArrayList<>();

        while (input.hasNextLine())
            names.add(input.nextLine());

        return names;
    }



    //Create sort method that sorts all names
        //arrayList has a command method called <.sort> in which it sorts all in list
        //catch IOException e
    public void SortNames(ArrayList<String> names) throws IOException {
        Collections.sort(names);
        File output = new File("./data/exercise41_output.txt");
        FileWriter myWriter = new FileWriter(output);
        PrintWriter print_line = new PrintWriter(myWriter);

        print_line.printf("Total of %d names%n-----------------%n", names.size());
        for (String counter: names){
            print_line.println(counter);
        }
        print_line.close();
    }

}
