package com.flight_reservation_app_2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight_reservation_app_2.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
