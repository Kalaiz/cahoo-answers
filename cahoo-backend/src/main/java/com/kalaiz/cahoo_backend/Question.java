package com.kalaiz.cahoo_backend;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Question {
	private boolean isResolved;
	private String question;
//	private List<Answer> answers;
	private @Id @GeneratedValue Long id;
	
	public boolean isResolved() {
		return isResolved;
	}
	
	public void setResolved(boolean isResolved) {
		this.isResolved = isResolved;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
//	public List<Answer> getAnswers() {
//		return answers;
//	}
//	public void setAnswers(List<Answer> answers) {
//		this.answers = answers;
//	}

}
