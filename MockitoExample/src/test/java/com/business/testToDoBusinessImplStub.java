package com.business;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.service.ToDOService;
import com.service.ToDoServiceStub;

public class testToDoBusinessImplStub {

	@Test
	public void testRetrieveToDosRelatedToSpring_usingStub() {
		
		ToDOService toDoServiceStub = new ToDoServiceStub();
		ToDoBusinessImpl todoBusiness = new ToDoBusinessImpl(toDoServiceStub);
		List<String> filterTodos = todoBusiness.retrieveToDosRelatedTOSpring("Dummy");
		assertEquals(2, filterTodos.size());
	}

}
