package com.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void letsMockListSizeMethod() {
		List<?> listMocked = mock(List.class);
		when(listMocked.size()).thenReturn(2);
		assertEquals(2, listMocked.size());
		assertEquals(2, listMocked.size());
		assertEquals(2, listMocked.size());
		
	}
	@Test
	public void letsMockListSize_ReturnMultipleValues() {
		List<?> listMocked = mock(List.class);
		when(listMocked.size()).thenReturn(2).thenReturn(3).thenReturn(1);
		assertEquals(2, listMocked.size());
		assertEquals(3, listMocked.size());
		assertEquals(1, listMocked.size());
	}
	//Argument Matcher
	@Test
	public void letsMockListValue() {
		List<String> listMocked = mock(List.class);
		when(listMocked.get(0)).thenReturn("Tola");
		assertEquals("Tola", listMocked.get(0));
		assertEquals(null, listMocked.get(1));
		
	}
	@Test
	public void letsMockListAnyInt() {
		List<String> listMocked = mock(List.class);
		when(listMocked.get(anyInt())).thenReturn("Tola");
		assertEquals("Tola", listMocked.get(10));
		
	}
	@Test
	public void letsMockListNull() {
		List<String> listMocked = mock(List.class);
		
		assertEquals(null, listMocked.get(0));
		assertEquals(null, listMocked.get(1));
		
	}
	@Test(expected =RuntimeException.class)
	public void letsMockList_throwAnException() {
		List<String> listMocked = mock(List.class);
		when(listMocked.get(anyInt())).thenThrow(new 
				RuntimeException("something went wrong"));
		listMocked.get(0);
		
	}
}
