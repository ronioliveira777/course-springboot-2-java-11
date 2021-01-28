package com.educandoeweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoeweb.course.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {
	
}
