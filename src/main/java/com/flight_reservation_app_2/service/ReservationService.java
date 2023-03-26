package com.flight_reservation_app_2.service;

import com.flight_reservation_app_2.dto.ReservationRequest;
import com.flight_reservation_app_2.entities.Reservation;

public interface ReservationService {
  Reservation bookFlight(ReservationRequest request);
}
