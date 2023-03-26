package com.flight_reservation_app_2.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.flight_reservation_app_2.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {
     @Query("from Flight where departureCity=:departureCity and arrivalCity=:arrivalCity and departureDate=:departureDate")
	List<Flight> findFlights(@Param("departureCity")String from, @Param("arrivalCity")String to,@Param("departureDate") Date depaturedate);
}
