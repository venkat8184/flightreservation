package com.flight_reservation_app_2.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight_reservation_app_2.entities.Flight;
import com.flight_reservation_app_2.repositories.FlightRepository;

@Controller
public class FlightController {
	@Autowired
	private FlightRepository flightRepo;
	@RequestMapping("/findFlights")
  public String findFlights(@RequestParam("from")String from,@RequestParam("to")String to,
		  @RequestParam("depaturedate") @DateTimeFormat(pattern ="yyyy-MM-dd")Date depaturedate,ModelMap model) {
		List<Flight> findFlights= flightRepo.findFlights(from,to,depaturedate);
		model.addAttribute("findFlights", findFlights);
	  return "displayFlights";
  }
	@RequestMapping("/findById")
	public String find(@RequestParam("id")long id,Model model) {
		Optional<Flight> findById = flightRepo.findById(id);
		Flight flight = findById.get();
	
		model.addAttribute("flight", flight);
		return "reserveFlight";
	}
}
