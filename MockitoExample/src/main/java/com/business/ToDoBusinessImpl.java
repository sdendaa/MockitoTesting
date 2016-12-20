package com.business;

import java.util.ArrayList;
import java.util.List;

import com.service.ToDOService;
//ToDoBusinessImpl is System Under Test(SUT)
//toDoService dependency
public class ToDoBusinessImpl {
	private ToDOService toDoService;

	public ToDoBusinessImpl(ToDOService toDoService) {
		
		this.toDoService = toDoService;
	}
	
	public List<String> retrieveToDosRelatedTOSpring(String user){
		List<String> filterToDos = new ArrayList<String>();
		List<String> toDos = toDoService.retrieveToDos(user);
		for(String toDo: toDos){
			if(toDo.contains("Spring")){
				filterToDos.add(toDo);
			}
		}
		return filterToDos;
	}
}
