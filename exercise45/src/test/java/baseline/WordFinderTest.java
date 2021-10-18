package baseline;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class WordFinderTest {

    @Test
    void replaceText() throws FileNotFoundException {
        WordFinder x = new WordFinder();
        x.readFile();
        x.replaceText();
       String actual = x.getText();

       String expected ="One should never use the word \"use\" in writing. Use \"use\" instead.\nFor example, \"She uses an IDE to write her Java programs\" instead of \"She\nuses an IDE to write her Java programs\"."+"\n";
       assertEquals(actual, expected);
    }
}