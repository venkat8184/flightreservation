package com.flight_reservation_app_2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight_reservation_app_2.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
