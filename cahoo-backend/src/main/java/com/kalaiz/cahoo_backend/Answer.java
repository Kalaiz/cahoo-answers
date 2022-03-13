package com.kalaiz.cahoo_backend;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	 private boolean isBestAnswer;
	 private String answer;
	 @OneToOne
     private User answerer;
	 private int numberOfUpvotes;
	 private int numberOfDownvotes;
	 private int rating;
	private @Id  @GeneratedValue(strategy=GenerationType.AUTO) Long id;
	 
	protected Answer() {}
	
	public Answer(boolean isBestAnswer, String answer, User answerer, int numberOfUpvotes, int numberOfDownvotes,
			int rating) {
		this.isBestAnswer = isBestAnswer;
		this.answer = answer;
		this.answerer = answerer;
		this.numberOfUpvotes = numberOfUpvotes;
		this.numberOfDownvotes = numberOfDownvotes;
		this.rating = rating;
	}

	public User getAnswerer() {
		return answerer;
	}
	public void setAnswerer(User answerer) {
		this.answerer = answerer;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public boolean isBestAnswer() {
		return isBestAnswer;
	}
	public void setBestAnswer(boolean isBestAnswer) {
		this.isBestAnswer = isBestAnswer;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public int getNumberOfUpvotes() {
		return numberOfUpvotes;
	}
	public void setNumberOfUpvotes(int numberOfUpvotes) {
		this.numberOfUpvotes = numberOfUpvotes;
	}
	public int getNumberOfDownvotes() {
		return numberOfDownvotes;
	}
	public void setNumberOfDownvotes(int numberOfDownvotes) {
		this.numberOfDownvotes = numberOfDownvotes;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	 
}
