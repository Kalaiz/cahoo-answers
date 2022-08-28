package com.kalaiz.cahoo_backend;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question {
	private boolean isResolved;
	private String question;

	@OneToMany(orphanRemoval = true)
	private List<Answer> answers;

//	TODO: Create a dynamically modifying property: numberOfAnswers;
	public Question(boolean isResolved, String question, List<Answer> answers) {
		this.isResolved = isResolved;
		this.question = question;
		this.answers = answers;
	}

	private @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id;

	public boolean isResolved() {
		return isResolved;
	}

	protected Question() {
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

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

}
