package com.service;

import java.util.Arrays;
import java.util.List;

import com.service.ToDOService;

public class ToDoServiceStub implements ToDOService {

	public List<String> retrieveToDos(String user) {
		// TODO Auto-generated method stub
		return Arrays.asList("Learn Spring MVC", "Learn Spring", "learn to Dance");
	}

}
