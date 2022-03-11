package com.kalaiz.cahoo_backend;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Answer {
	 private boolean isBestAnswer;
	 private String answer;
//	 private User answerer;
	 private int numberOfUpvotes;
	 private int numberOfDownvotes;
	 private int rating;
		private @Id @GeneratedValue Long id;
	 
	 
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
