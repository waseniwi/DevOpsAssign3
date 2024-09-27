package assign3.unit.test.Assign3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {
	
		//Positive
	
	 @Test
	    public void testJohnFriends() {
	        String[] expected = {"Mike", "Sara", "Kate"};
	        String[] actual = App.getFriends("John");
	        assertArrayEquals(expected, actual, "Johns friends should be: Mike, Sara, Kate");
	    }
	
	 @Test
	    public void testCaseSensitivity() {
	        String[] expected = {};
	        String[] actual = App.getFriends("john");
	        assertArrayEquals(expected, actual, "Testing for case-sesitivity");
	        
	    }
	 
	 
	 	//Negative
	 
	 @Test
	    public void testWrongInput() {
	        String[] expected = {};
	        String[] actual = App.getFriends("Michael");
	        assertArrayEquals(expected, actual, "Michael is N/A, function should return empty string");
	    }
	 
	 @Test
	    public void testSpecialCharactersInput() {
	        String[] expected = {};
	        String[] actual = App.getFriends("@John!");
	        assertArrayEquals(expected, actual, "Special characters should not differ from ordinary wrong input, empty string array is expected");
	    }
}