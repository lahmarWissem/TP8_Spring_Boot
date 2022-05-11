package com.wissem.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wissem.produits.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}