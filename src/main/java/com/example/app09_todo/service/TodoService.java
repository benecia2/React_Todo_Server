package com.example.app09_todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app09_todo.model.Todo;
import com.example.app09_todo.repository.TodoRepository;

@Service
public class TodoService {
	@Autowired
	private TodoRepository todoRepository;
	
	//전송
	public Todo insert(Todo todo) {
		return todoRepository.save(todo);
	}
	
	//전체보기
	public List<Todo>list(){
		return todoRepository.findAll();
	}
	
	//삭제
	public void delete(Long num) {
		todoRepository.deleteById(num);
	}
}
