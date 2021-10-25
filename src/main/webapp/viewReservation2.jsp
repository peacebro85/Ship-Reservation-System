<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Reservation details</h1>  

<style>  
table, th, td {  
    border: 1px solid black;  
    border-collapse: collapse;  
}  
th, td {  
    padding: 10px;  
}  
table#alter tr:nth-child(even) {  
    background-color: #eee;  
}  
table#alter tr:nth-child(odd) {  
    background-color: #fff;  
}  
table#alter th {  
    color: white;  
    background-color: gray;  
}  
body {
	background-image:
		url('https://www.marineinsight.com/wp-content/uploads/2019/08/Cruise-ships-1.png');
	height: 100%;
	background-repeat: no-repeat;
	background-size: 1366px 625px;
}
</style>  
<table border="1"  id="alter" width="100%" cellpadding="2">
  
<tr><th>ReservationId</th><th>ScheduleId</th><th>UserId</th><th>BookingDate</th><th>JourneyDate</th><th>NoofSeats</th><th>Total fare</th><th>BookingStatus</th><th>Make changes</th><th>Cancel ticket</th><th>Click</th></tr>  
    <c:forEach var="reservation" items="${list}">   
   <tr>  
   <td>${reservation.reservationId }</td>  
   <td>${reservation.scheduleId }</td>  
   <td>${reservation.userId }</td>  
   <td>${reservation.bookingDate }</td>
   <td>${reservation.journeyDate }</td>
   <td>${reservation.noOfSeats }</td> 
   <td>${reservation.totalFare }</td> 
   <td>${reservation.bookingStatus }</td>  
   <td><a href="editReservation/${reservation.reservationId }">Make changes</a></td>  
   <td><a href="deleteReservation/${reservation.reservationId }">Cancel ticket</a></td>
   <td><a href="Continueform"">Continue</a></td>  
   </tr>  
   </c:forEach> 
   </table>  
   <br/>  
   <a href="Reservationform" style="color:cyan;"><b>Booktickets</b></a><br><br>
   <a href="Customer.jsp" style="color:cyan;"><b>Customer Page</b></a>