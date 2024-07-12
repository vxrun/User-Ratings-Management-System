package com.ms.userapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ms.userapi.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

	@Query("from user where email = :email")
	User getByEmail(@Param("email") String email);

}
