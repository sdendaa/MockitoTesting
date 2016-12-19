package junit.entity;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {
	StringHelper help;
	
	@Before
	public void setUp(){
		help = new StringHelper();
	}
	
	@Test
	public void testTruncateAInFirst2Positions_One() {
		assertEquals("ABC", help.truncateAInFirst2Positions("AAABC"));
		
	}
	@Test
	public void testTruncateAInFirst2Positions_Two() {
		
		assertEquals("DC", help.truncateAInFirst2Positions("ADC"));
	}
	@Test
	public void testTruncateAInFirst2Positions_Three() {
		
		assertEquals("DCEA", help.truncateAInFirst2Positions("DCEA"));
	}
	@Test
	public void testTruncateAInFirst2Positions_Four() {
		
		assertEquals("DCE", help.truncateAInFirst2Positions("DCE"));
	}
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_One() {
		
		assertEquals(false, help.areFirstAndLastTwoCharactersTheSame("A"));
	}
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_Two() {
		
		assertTrue(help.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_Three() {
		
		assertEquals(true, help.areFirstAndLastTwoCharactersTheSame("AB"));
	}
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_Four() {
		
		assertFalse(help.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_Five() {
		
		assertFalse( help.areFirstAndLastTwoCharactersTheSame("A"));
	}

}
