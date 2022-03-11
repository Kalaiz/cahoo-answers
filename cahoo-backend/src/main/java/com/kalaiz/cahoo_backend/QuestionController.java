package com.kalaiz.cahoo_backend;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {
private final QuestionRepository questionRepository;

QuestionController(QuestionRepository questionRepository) {
	this.questionRepository = questionRepository;
}

@GetMapping("/recent-questions")
List<Question> recentQuestions(){
//	 TODO
	return questionRepository.findAll();
}


	
}
