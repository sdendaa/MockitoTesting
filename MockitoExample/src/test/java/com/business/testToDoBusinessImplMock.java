package com.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.service.ToDOService;

public class testToDoBusinessImplMock {

	@Test
	public void testRetrieveToDosRelatedToSpring_usingMock() {
		
		ToDOService toDoServiceMock = mock(ToDOService.class);
		List<String> toDos = Arrays.asList("Learn Spring MVC", "Learn Spring", 
											"learn to Dance");
		when(toDoServiceMock.retrieveToDos("Dummy")).thenReturn(toDos);
		
		ToDoBusinessImpl todoBusiness = new ToDoBusinessImpl(toDoServiceMock);
		List<String> filterTodos = 
				todoBusiness.retrieveToDosRelatedTOSpring("Dummy");
		assertEquals(2, filterTodos.size());
	}
	
	@Test
	public void testRetrieveToDosRelatedToSpring_WithEmpty() {
		
		ToDOService toDoServiceMock = mock(ToDOService.class);
		List<String> toDos = Arrays.asList();
		when(toDoServiceMock.retrieveToDos("Dummy")).thenReturn(toDos);
		
		ToDoBusinessImpl todoBusiness = new ToDoBusinessImpl(toDoServiceMock);
		List<String> filterTodos = 
				todoBusiness.retrieveToDosRelatedTOSpring("Dummy");
		assertEquals(0, filterTodos.size());
	}
	@Test
	public void testRetrieveToDosRelatedToSpring_NoSpring() {
		
		ToDOService toDoServiceMock = mock(ToDOService.class);
		List<String> toDos = Arrays.asList("Learn ORM MVC", "Learn Java", 
				"learn to Dance");
		when(toDoServiceMock.retrieveToDos("Dummy")).thenReturn(toDos);
		
		ToDoBusinessImpl todoBusiness = new ToDoBusinessImpl(toDoServiceMock);
		List<String> filterTodos = 
				todoBusiness.retrieveToDosRelatedTOSpring("Dummy");
		assertEquals(0, filterTodos.size());
	}
	
}
