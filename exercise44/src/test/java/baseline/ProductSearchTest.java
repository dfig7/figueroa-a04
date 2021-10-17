package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductSearchTest {

    @Test
    void readData() {
        ProductSearch y = new ProductSearch();
        boolean actual = y.readData();
        boolean expected = true;

        assertEquals(actual, expected);
    }

    @Test
    void findProductTrue() {
        ProductSearch x = new ProductSearch();
        x.readData();

        boolean actual = x.findProduct("Thing");
        boolean expected = true;

        assertEquals(actual, expected);

    }

    @Test
    void findProductFalse() {
        ProductSearch x = new ProductSearch();
        x.readData();

        boolean actual = x.findProduct("boo");
        boolean expected = false;

        assertEquals(actual, expected);

    }
}