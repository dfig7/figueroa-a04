package baseline;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class dataTableTest {

    @Test
    void readData() {
        dataTable x = new dataTable();
        try{
            x.readData();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ArrayList<Employee> expected = new ArrayList<>();
        ArrayList<Employee> actual = x.getData();

        expected.add(new Employee("Ling","Mai","55900"));
        expected.add(new Employee("Johnson","Jim","56500"));
        expected.add(new Employee("Jones","Aaron","46000"));
        expected.add(new Employee("Jones","Chris","34500"));
        expected.add(new Employee("Swift","Geoffrey","14200"));
        expected.add(new Employee("Xiong","Fong","65000"));
        expected.add(new Employee("Zarnecki","Sabrina","51500"));

        assertEquals(actual, expected);


    }

    @Test
    void printData() {
    }
}