<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> flight details</h2>
FlightNumber:${flight.flightNumber}<br>
OperatingAirlines:${flight.operationAirlines}<br>
DepartureCity:${flight.departureCity}<br>
ArrivalCity:${flight.arrivalCity}<br>
<h2>Enter passenger Details</h2>
<form action="confirmReservation" method="post">
<pre>
<input type="hidden" name="flightId" value="${flight.id}">
FirstName:<input type="text" name="firstName">
LastName:<input type="text" name="lastName">
MiddleName:<input type="text" name="middleName">
Email:<input type="text" name="email">
phone:<input type="text" name="phone">
<h2>Enter the payment details</h2>
CardNumber:<input type="text" name="cardNumber">
CardHolderName:<input type="text" name="cardHolderName">
ExpiryDate:<input type="text" name="expiryDate">
Cvv:<input type="text" name="cvv"/>
<input type="submit" value="confirmReservation">
</pre>
</form>
</body>
</html>