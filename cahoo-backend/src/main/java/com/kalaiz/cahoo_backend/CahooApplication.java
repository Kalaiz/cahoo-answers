package com.kalaiz.cahoo_backend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.kalaiz.cahoo_backend.repository.AnswerRepository;
import com.kalaiz.cahoo_backend.repository.QuestionRepository;
import com.kalaiz.cahoo_backend.repository.UserRepository;

@SpringBootApplication
public class CahooApplication {

	private static final Logger LOG = LoggerFactory.getLogger(CahooApplication.class);

	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private AnswerRepository answerRepository;

	@Autowired
	private QuestionRepository questionRepository;

	public static void main(String[] args) {
		SpringApplication.run(CahooApplication.class, args);
	}

	@Bean
	InitializingBean sendDatabase() {
		return () -> {
		};
	}

}
