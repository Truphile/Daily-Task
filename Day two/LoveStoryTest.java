import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoveStoryTest {

	@Test
	public void testThatGetFirstPetalsTakesInInput() {	
		LoveStory love = new LoveStory();			
		int result = love.getFirstPetals(4);		
		assertEquals(result,4);				
	}

	@Test
	public void testThatGetSecondPetalsTakesInInput() {	
		LoveStory love = new LoveStory();			
		int result = love.getSecondPetals(7);		
		assertEquals(result,7);				
	}


}