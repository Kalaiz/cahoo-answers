package com.kalaiz.cahoo_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kalaiz.cahoo_backend.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {

}
