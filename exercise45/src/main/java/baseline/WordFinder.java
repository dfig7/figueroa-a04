package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WordFinder {
    //String fileText
    public String fileText = "";

    //method getText
    public String getText() {
        //return fileText
        return fileText;
    }

    //method readFile
    public void readFile() throws FileNotFoundException {
        //reads file by looping through each line and storing into fileText
        File file = new File("./data/exercise45_input.txt");
        Scanner input = new Scanner(file);

        while(input.hasNextLine()){
            fileText += input.nextLine()+"\n";
        }
    }

    //method replaceText
    public void replaceText() {
        //method replaces instances of utilize to use
        //replaceAll command
        fileText = fileText.replace("utilize", "use");
    }

    public void createOutput(String fileName) throws IOException {
        File file = new File("./data/"+fileName+".txt");
        FileWriter fileWriter = new FileWriter(file);

        fileWriter.write(getText());
        fileWriter.close();
    }

}
