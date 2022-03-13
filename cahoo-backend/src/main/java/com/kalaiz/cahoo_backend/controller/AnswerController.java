package com.kalaiz.cahoo_backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kalaiz.cahoo_backend.Answer;
import com.kalaiz.cahoo_backend.repository.AnswerRepository;

@RestController
public class AnswerController {

	private final AnswerRepository answerRepository;

	public AnswerController(AnswerRepository answerRepository) {
		this.answerRepository = answerRepository;
	}
	
	@GetMapping("answers/{questionId}")
	List<Answer> getAnswer(@PathVariable Long questionId){
//		TODO:
		return answerRepository.findAll();
	}

	
}
