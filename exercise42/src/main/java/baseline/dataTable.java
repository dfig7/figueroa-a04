package baseline;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

//create a class for each employee
public class dataTable {

    private ArrayList<Employee> data = new ArrayList<>();

    //opens file
    //in while loop if "," is found, splits the line into arrays
        //add the employee data to an employee class and add data to data ArrayList
    public void readData() throws FileNotFoundException{
        File file = new File("./data/exercise42_input.txt");
        Scanner input = new Scanner(file);

        while (input.hasNextLine()) {
            String[] sep = input.nextLine().split(",");
            data.add(new Employee(sep[0], sep[1], sep[2]));
        }

    }

    //method that prints the employee's data, parsed to fit the table
    public void printData() {
        System.out.printf("Last        First       Salary%n----------------------------------%n");
        for(Employee counter: data){
            System.out.printf("%-12s %-12s %-12s%n", counter.getLastName(),counter.getFirstName(),counter.getSalary());
        }
    }

    //get data method
    public ArrayList<Employee> getData(){
        return data;
    }
}

    /*
    //Create method that opens and reads input file
        //split lines by the "," and place each string in [row][column]
        //create a 2 dimensional array to store each string
     //after each line use <nextLine()>, after row is finished
    //catch FileNotFoundException
    public ArrayList readAndStore() throws FileNotFoundException{
        File file = new File("./data/exercise42_input.txt");
        Scanner input = new Scanner(file);

        ArrayList<String> data = new ArrayList<>();

        while(input.hasNextLine()){

        }


    }

    //Create print method that prints the table into output file
    //catch FileNotFoundException

}
*/