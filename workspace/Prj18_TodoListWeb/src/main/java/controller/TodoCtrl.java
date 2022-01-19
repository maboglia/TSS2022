package controller;

import java.util.ArrayList;

import model.Todo;

public class TodoCtrl {

	private ArrayList<Todo> todos;
	
	public TodoCtrl() {
		this.todos = new ArrayList<>();
	}
	
	public ArrayList<Todo> getTodos() {
		return todos;
	}
	
	//addTodo
	public void addTodo(Todo t) {
		this.todos.add(t);
	}
	public void addTodo(String s) {
		Todo t = new Todo(s);
		this.todos.add(t);
	}
	
	//completeTodo
	public void completeTodo(int pos) {
		if (this.todos.get(pos)!=null) {
			this.todos.get(pos).setDone(true);
		}
	}
	public void completeTodoById(int id) {
	
		for (Todo todo : todos) {
			if (todo.getId() == id)
				todo.setDone(true);
		}
	
	}
	
}
