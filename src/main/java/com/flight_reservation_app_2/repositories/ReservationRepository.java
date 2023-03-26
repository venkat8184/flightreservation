package com.flight_reservation_app_2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight_reservation_app_2.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
