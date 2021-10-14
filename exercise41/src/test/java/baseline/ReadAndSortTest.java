package baseline;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ReadAndSortTest {

    @Test
    void readNames() {
        ReadAndSort x = new ReadAndSort();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> expected = new ArrayList<>();
        try{
            names = x.ReadNames();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String> actual = names;

        expected.add("Ling, Mai");
        expected.add("Johnson, Jim");
        expected.add("Zarnecki, Sabrina");
        expected.add("Jones, Chris");
        expected.add("Jones, Aaron");
        expected.add("Swift, Geoffrey");
        expected.add("Xiong, Fong");

        assertEquals(actual, expected);


    }

    @Test
    void sortNames() {
        ReadAndSort x = new ReadAndSort();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> actual = new ArrayList<>();

        try{
            names = x.ReadNames();
            x.SortNames(names);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        actual = names;

        expected.add("Johnson, Jim");
        expected.add("Jones, Aaron");
        expected.add("Jones, Chris");
        expected.add("Ling, Mai");
        expected.add("Swift, Geoffrey");
        expected.add("Xiong, Fong");
        expected.add("Zarnecki, Sabrina");

        assertEquals(actual, expected);
    }

}