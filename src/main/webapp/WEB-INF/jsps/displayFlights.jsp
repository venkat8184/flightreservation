<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Flights</title>
</head>
<body>
<h2>Display the flights</h2>
<table border="1">
<tr>
<th>FlightNumber</th>
<th>OperationAirlines</th>
<th>DepartureCity</th>
<th>ArrivalCity</th>
<th>DepartureDate</th>
<th>DepartureTime</th>
<th>Select</th>
</tr>
<c:forEach var="findFlight" items="${findFlights}">
<tr><td>${findFlight.flightNumber}</td>
<td>${findFlight.operationAirlines}</td>
<td>${findFlight.departureCity}</td>
<td>${findFlight.arrivalCity}</td>
<td>${findFlight.departureDate}</td>
<td>${findFlight.depatureTime}</td>
<td><a href="findById?id=${findFlight.id}">select</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>