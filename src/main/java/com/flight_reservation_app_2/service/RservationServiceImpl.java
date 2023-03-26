package com.flight_reservation_app_2.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight_reservation_app_2.dto.ReservationRequest;
import com.flight_reservation_app_2.entities.Flight;
import com.flight_reservation_app_2.entities.Passenger;
import com.flight_reservation_app_2.entities.Reservation;
import com.flight_reservation_app_2.repositories.FlightRepository;
import com.flight_reservation_app_2.repositories.PassengerRepository;
import com.flight_reservation_app_2.repositories.ReservationRepository;
@Service
public class RservationServiceImpl implements ReservationService {
	@Autowired
	private ReservationRepository reservationRepo;
     @Autowired
     private PassengerRepository passengerRepo;
     @Autowired
     private FlightRepository flightRepo;
	@Override
	public Reservation bookFlight(ReservationRequest request) {
		Passenger passenger= new Passenger();
		passenger.setFirstName(request.getFirstName());
		passenger.setLastName(request.getLastName());
		passenger.setMiddleName(request.getMiddleName());
		passenger.setEmail(request.getEmail());
		passenger.setPhone(request.getPhone());
		passengerRepo.save(passenger);
		long id=request.getflightId();
		Optional<Flight> findById = flightRepo.findById(id);
		Flight flight = findById.get();
		Reservation reservation= new Reservation();
		reservation.setPassenger(passenger);
		reservation.setFlight(flight);
		reservation.setNumberOfBags(0);
		reservation.setCheckedIn(false);
		reservationRepo.save(reservation);
		return reservation;
	}

}
