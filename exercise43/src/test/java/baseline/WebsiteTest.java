package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteTest {

    @Test
    void makeIndexHTML() {
        Website x = new Website();
        x.startingPath = "C:/Users/diego/Desktop/UCF Fall 21'/COP3223/assignment04/exercise43/";
        x.siteName = "diego";

        String actual = x.makeIndexHTML();
        String expected = "C:/Users/diego/Desktop/UCF Fall 21'/COP3223/assignment04/exercise43/diego/index.html";

        assertEquals(actual, expected);
    }

    @Test
    void makeFolder() {
        Website x = new Website();
        x.startingPath = "C:/Users/diego/Desktop/UCF Fall 21'/COP3223/assignment04/exercise43/";
        x.siteName = "diego";
        String actual = "";
        try {
            actual = x.makeIndexHTML();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String expected = "C:/Users/diego/Desktop/UCF Fall 21'/COP3223/assignment04/exercise43/diego";
        assertEquals(actual, expected);
    }

    @Test
    void makeJavaFolder() {
        Website x = new Website();
        x.startingPath = "C:/Users/diego/Desktop/UCF Fall 21'/COP3223/assignment04/exercise43/";
        x.siteName = "diego";

        String actual = x.makeIndexHTML();
        String expected = "C:/Users/diego/Desktop/UCF Fall 21'/COP3223/assignment04/exercise43/diego/js/";

        assertEquals(actual, expected);
    }

    @Test
    void makeCSSFolder() {
        Website x = new Website();
        x.startingPath = "C:/Users/diego/Desktop/UCF Fall 21'/COP3223/assignment04/exercise43/";
        x.siteName = "diego";

        String actual = x.makeIndexHTML();
        String expected = "C:/Users/diego/Desktop/UCF Fall 21'/COP3223/assignment04/exercise43/diego/css/";

        assertEquals(actual, expected);
    }
}