package com.kalaiz.cahoo_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kalaiz.cahoo_backend.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
