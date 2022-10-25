package com.brian.springboot.mysecondwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ToDoService {
	private static List<Todo> toDoList = new ArrayList<>();
	
	private static int todosCount = 0;
	static {
		toDoList.add(new Todo(++todosCount, "brian", "Learn AWS", LocalDate.now().plusYears(1), false));
		toDoList.add(new Todo(++todosCount, "brian", "Learn ML", LocalDate.now().plusYears(2), false));
		toDoList.add(new Todo(++todosCount, "brian", "Learn DevOps", LocalDate.now().plusYears(3), false));
	}
	
	public List<Todo> findByUsername(String username){
		return toDoList;
	}
	
	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		toDoList.add(new Todo(++todosCount, username, description, targetDate, done));
	}
}
