package com.in28minutes.MockitoDemo1.serviceimpl;

import java.util.List;

import com.in28minutes.MockitoDemo1.service.TodoService;

public class TodoServiceImpl {

	private TodoService todoservice;

	public TodoServiceImpl(TodoService todoservice) {
		super();
		this.todoservice = todoservice;
	}
	/*
	 * public List<String> retrieveTodosRelatedToSpring(String user){ return list }
	 */
}
