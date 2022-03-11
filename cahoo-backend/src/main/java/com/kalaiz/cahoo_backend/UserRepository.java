package com.kalaiz.cahoo_backend;

import org.springframework.data.jpa.repository.JpaRepository;

interface UserRepository extends JpaRepository<User,Long> {

}
