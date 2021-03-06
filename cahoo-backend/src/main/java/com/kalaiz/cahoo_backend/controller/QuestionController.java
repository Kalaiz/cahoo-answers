package com.kalaiz.cahoo_backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kalaiz.cahoo_backend.Question;
import com.kalaiz.cahoo_backend.repository.QuestionRepository;

@RestController
public class QuestionController {
private final QuestionRepository questionRepository;

QuestionController(QuestionRepository questionRepository) {
	this.questionRepository = questionRepository;
}

@CrossOrigin(origins ="http://localhost:4200/") // Allowing Front end computational resource (Client side) URL
@GetMapping("/api/recent-questions")
List<Question> recentQuestions(){
//	 TODO
	return questionRepository.findAll();
}


	
}
