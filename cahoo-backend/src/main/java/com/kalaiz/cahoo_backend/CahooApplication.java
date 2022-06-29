package com.kalaiz.cahoo_backend;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.kalaiz.cahoo_backend.repository.AnswerRepository;
import com.kalaiz.cahoo_backend.repository.AppUserRepository;
import com.kalaiz.cahoo_backend.repository.QuestionRepository;


@SpringBootApplication
public class CahooApplication {

	private static final Logger LOG = LoggerFactory.getLogger(CahooApplication.class);

	@Autowired
	private AppUserRepository userRepository;

	@Autowired
	private AnswerRepository answerRepository;

	@Autowired
	private QuestionRepository questionRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CahooApplication.class, args);
	}



	@Bean
	InitializingBean populateDatabase() {
		return () -> {
			AppUser userOne = new AppUser("User one", null, null, null, null, 0, null, null);
			AppUser userTwo = new AppUser("User two", null, null, null, null, 0, null, null);
			AppUser userThree = new AppUser("User three", null, null, null, null, 0, null, null);
			userRepository.save(userOne);
			userRepository.save(userTwo);
			userRepository.save(userThree);
			userRepository.saveAll(Arrays.asList(userOne, userTwo, userThree));

			Answer answerOne = new Answer(false, "Answer one", userOne, 0, 0, 0);
			Answer answerTwo = new Answer(false, "Answer two", userOne, 0, 0, 0);
			Answer answerThree = new Answer(false, "Answer three", userOne, 0, 0, 0);
			answerRepository.saveAll(Arrays.asList(answerOne, answerTwo, answerThree));

			Question questionOne = new Question(false, "Question one", Arrays.asList(answerOne));
			Question questionTwo = new Question(false, "Question two", Arrays.asList(answerTwo));
			Question questionThree = new Question(false, "Question one", Arrays.asList(answerThree));
			questionRepository.saveAll(Arrays.asList(questionOne, questionTwo, questionThree));

			LOG.debug("Populated the database");

		};
	}

}
