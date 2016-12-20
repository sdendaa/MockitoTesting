package com.service;

import java.util.List;

//Create ToDoServiceStub
//test ToDoBusinessImpl using ToDOServiceStub
public interface ToDOService {
	
	public List<String> retrieveToDos(String user);

}
