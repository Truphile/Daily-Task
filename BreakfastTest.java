import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BreakfastTest {

	@Test
	public void testThatAWordIsCollected() {	
		Breakfast breakfast = new Breakfast();			
		String result = breakfast.getSentence("God is good.");		
		assertEquals(result, "God is good.");				

	}


	@Test
	public void testThatASentenceIsCollectedAndConvertedToUpperCase() {	
		Breakfast breakfast = new Breakfast();			
		String result = breakfast.convert("God is good.");		
		assertEquals(result, "GOD IS GOOD.");				

	}

}