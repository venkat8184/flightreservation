package com.flight_reservation_app_2.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
//this is entity
@Entity
public class Flight extends AbstarctEntity{
public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getOperationAirlines() {
		return operationAirlines;
	}
	public void setOperationAirlines(String operationAirlines) {
		this.operationAirlines = operationAirlines;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public Timestamp getDepatureTime() {
		return depatureTime;
	}
	public void setDepatureTime(Timestamp depattureTime) {
		this.depatureTime = depattureTime;
	}
private String flightNumber;
private String operationAirlines;
private String departureCity;
private String arrivalCity;
private Date departureDate;
private Timestamp depatureTime;
}
