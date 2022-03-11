package com.kalaiz.cahoo_backend;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnswerController {

	private final AnswerRepository answerRepository;

	public AnswerController(AnswerRepository answerRepository) {
		this.answerRepository = answerRepository;
	}
	
	@GetMapping("answers/{questionId}")
	List<Answer> getAnswer(@PathVariable Long questionId){
		return answerRepository.findAll();
	}

	
}
