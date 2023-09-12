package com.example.app09_todo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Todo {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long num;
	private String subject;
	private String name;
	private String summary;
	private Date regdate;
	
	// 생성 시 현재 날짜와 시간 자동으로 설정
	@PrePersist
	public void onCreate() {
		regdate = new Date();
	}
}
