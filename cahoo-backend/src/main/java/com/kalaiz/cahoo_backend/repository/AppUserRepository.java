package com.kalaiz.cahoo_backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.kalaiz.cahoo_backend.AppUser;

@Transactional(readOnly = true)

public interface AppUserRepository extends JpaRepository<AppUser, Long>{
	Optional<AppUser> findByEmail(String email);
}
