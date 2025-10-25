import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordsSplitTest {

   
    @Test
    void testNormalSentence() {
	Splitter splitter = new Splitter();

        String sentence = "i love programming";
        String[] expected = {"i", "love", "programming"};
        assertArrayEquals(expected, splitter.splitWords(sentence));
    }

    @Test
    void testMultipleSpacesInSentence() {
	Splitter splitter = new Splitter();

        String sentence = "  leading space and  multiple   spaces  ";
        String[] expected = {"leading", "space", "and", "multiple", "spaces"};
        assertArrayEquals(expected, splitter.splitWords(sentence));
    }

    @Test
    void testEmptyStringInSetence() {
	Splitter splitter = new Splitter();

        String sentence = "";
        String[] expected = {};
        assertArrayEquals(expected, splitter.splitWords(sentence));
    }

    @Test
    void testNoSpacesInSentence() {
	Splitter splitter = new Splitter();

        String sentence = "singleword";
        String[] expected = {"singleword"};
        assertArrayEquals(expected, splitter.splitWords(sentence));
    }

    }
