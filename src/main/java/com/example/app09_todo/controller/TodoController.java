package com.example.app09_todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.app09_todo.model.Todo;
import com.example.app09_todo.service.TodoService;

@RestController
public class TodoController {
	@Autowired
	private TodoService todoService;
	
	//전송
	@PostMapping("todo/insert")
	public Todo insert(@RequestBody Todo todo ) {
		return todoService.insert(todo);
	}
	
	//전체보기
	@GetMapping("todo/list")
	public List<Todo>list(){
		return todoService.list();
	}
	
	//삭제
	@DeleteMapping("todo/delete/{num}")
	public void delete(@PathVariable Long num) {
		todoService.delete(num);
	}
}
