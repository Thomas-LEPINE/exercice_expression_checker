import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    final Main main = new Main();

    @Test
    void chaine1Test() {
        String test = "(aaa(bbbbb[cccccc]))";
        assertTrue(main.testChaine(test));
    }

    @Test
    void chaine2Test() {
        String test = "(a[aa(bbbbbcccccc]))";
        assertFalse(main.testChaine(test));
    }

    @Test
    void chaine3Test() {
        String test = "(aaa[)";
        assertFalse(main.testChaine(test));
    }

    @Test
    void chaine4Test() {
        String test = "cc(aaa[bbbbb]cc[aaa]ccccc)dddd";
        assertTrue(main.testChaine(test));
    }
}