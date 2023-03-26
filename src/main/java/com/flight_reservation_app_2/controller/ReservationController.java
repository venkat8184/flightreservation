package com.flight_reservation_app_2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flight_reservation_app_2.dto.ReservationRequest;
import com.flight_reservation_app_2.entities.Reservation;
import com.flight_reservation_app_2.service.ReservationService;

@Controller
public class ReservationController {
	@Autowired
	private ReservationService reservationService;
    @RequestMapping("/confirmReservation")
	public String completeReservation(ReservationRequest request,ModelMap model) {
    	Reservation reservation = reservationService.bookFlight(request);
    	model.addAttribute("reservation", reservation);
		return "confirmantionflight";
	}
}
